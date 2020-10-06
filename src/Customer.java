import java.util.ArrayList;

public class Customer {

    int id;
    String name;

    Customer(){

    }
    //constructor
    public Customer(String name, int id) {

        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //method
    public void rentGame (Game game, int days){
        if(game.getRentStatus()=="available"){
            game.setRentStatus("not available");
            int rent = game.getDailyRent()*days;
            System.out.println("You have rented the game. The rent is "+rent);
        }
        else{
            System.out.println("The game you want to rent is not available");
        }
    }

    //method
    public void returnGame (Game game){
        game.setRentStatus("available");
        System.out.println("You have successfully returned the game");
    }

    //method
    public void viewAllGames (ArrayList<Game> games){
            for(int i=0;i<games.size();i++){
                System.out.println(games.get(i).toString());
            }
    }

 public String toString (){
        String customerString = this.id+" : "+this.name;
        return customerString;

    }

}
