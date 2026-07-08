import java.time.LocalDateTime;

public class Anime extends Content{
   private int totalEpisodes;
   private int currentEpisode;
   private int currentSeason;
   public Anime(){

   }
   public Anime(String name, LocalDateTime startedOn, Status status, int totalEpisodes, int currentEpisode, int currentSeason){
       super(name,startedOn,status);
       this.totalEpisodes=totalEpisodes;
       this.currentEpisode=currentEpisode;
       this.currentSeason=currentSeason;
   }
   //Getters

    public int getCurrentEpisode() {
        return currentEpisode;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public int getCurrentSeason() {
        return currentSeason;
    }
    //Setters


    public void setCurrentEpisode(int currentEpisode) {
        this.currentEpisode = currentEpisode;
    }

    public void setCurrentSeason(int currentSeason) {
        this.currentSeason = currentSeason;
    }

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    @Override
    public void displayInfo(){
        System.out.println("Anime:" + getName());
        System.out.println("StartedOn:" + getStartedOn());
        System.out.println("Status:" + getStatus());
        System.out.println("Episodes:" + getCurrentEpisode() + "/" +getTotalEpisodes());
        System.out.println("Season:" +getCurrentSeason());
   }
}