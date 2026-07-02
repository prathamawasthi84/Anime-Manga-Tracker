public class Anime extends Content implements Trackable{
    int current_episode;
    int total_episode;
    @Override
    public void updateStatus(Status newstatus){
        this.status=newstatus;
    }
    @Override
    public String getProgress(){
        return current_episode + "/" + total_episode + "/" + status;
    }
}
