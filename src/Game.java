public class Game {

    int ID;
    String title;
    String genre;
    int dailyRent;
    String rentStatus;

    public Game(){

    }

    //constructor
    public Game(int ID, String title, String genre, int dailyRent) {
        this.ID = ID;
        this.title = title;
        this.genre = genre;
        this.dailyRent = dailyRent;
        this.rentStatus = "available";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(int dailyRent) {
        this.dailyRent = dailyRent;
    }

    public String getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(String rentStatus) {
        this.rentStatus = rentStatus;
    }

    public String toString(){

        String gameString = this.ID + ":" +this.title+"("+this.genre+")."+this.dailyRent+". Status: "+this.rentStatus;

        return gameString;
    }
}
