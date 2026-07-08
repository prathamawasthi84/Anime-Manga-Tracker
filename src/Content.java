import java.time.LocalDateTime;

abstract class Content {
    private String name;
    private LocalDateTime startedOn;
    private Status status;
    private int totalTracked;
    public Content(){

    }
    public Content(String name,LocalDateTime startedOn,Status status){
        this.name=name;
        this.startedOn=startedOn;
        this.status=status;
        totalTracked++;
    }
    //Getters

    public String getName() {
        return name;
    }

    public LocalDateTime getStartedOn() {
        return startedOn;
    }

    public Status getStatus() {
        return status;
    }
    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void updateStatus(Status status) {
        this.status = status;
    }

    public void setStartedOn(LocalDateTime startedOn) {
        this.startedOn = startedOn;
    }
   public abstract void displayInfo();
}
