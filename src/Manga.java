import java.time.LocalDateTime;

public class Manga extends Content
{
private int current_chapter;
private int total_chapters;
private int volume;
public Manga() {
}
public Manga(String name, LocalDateTime startedOn,Status status ,int current_chapter,int total_chapters,int volume){
    super(name,startedOn,status);
    this.current_chapter=current_chapter;
    this.total_chapters=total_chapters;
    this.volume=volume;
}
//Getters

    public int getCurrent_chapter() {
        return current_chapter;
    }

    public int getTotal_chapters() {
        return total_chapters;
    }

    public int getVolume() {
        return volume;
    }
//Setters

    public void setCurrent_chapter(int current_chapter) {
        this.current_chapter = current_chapter;
    }

    public void setTotal_chapters(int total_chapters) {
        this.total_chapters = total_chapters;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void displayInfo(){
        System.out.println("Manga:" + getName());
        System.out.println("StartedOn:" + getStartedOn());
        System.out.println("Status:" + getStatus());
        System.out.println("Chapters:" + getCurrent_chapter() + "/" + getTotal_chapters());
        System.out.println("Volume:" + getVolume());
}
}
