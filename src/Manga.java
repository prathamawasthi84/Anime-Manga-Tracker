public class Manga extends Content implements Trackable{
    int current_chapter;
    int total_chapters;
    @Override
    public void updateStatus(Status status){
        this.status=status;
    }

    @Override
    public String getProgress() {
        return current_chapter + "/" + total_chapters + "/" + status;
    }
}
