import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

public class Employee {

    int id;
    String name;
    String address;
    int birthday;
    int salary;

    Employee(){

    }
    //constructor
    public Employee(int id, String name, String address, int birthday, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //method
    public void addCustomer (Customer newcustomer, ArrayList<Customer> customers){
        customers.add(newcustomer);
        System.out.println("New customer has been added");
    }


    //method
    public void removeCustomer (int id , ArrayList<Customer> customers ) {

        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                customers.remove(customers.get(i));
                System.out.println("Customer with ID " + id + " removed");
                return;
            }
            System.out.println("Customer with the id not found");
        }
    }




    //method
    public void addGame (Game newgame, ArrayList<Game> games){
        games.add(newgame);
        System.out.println("The game is added");
    }

    //method
    public void removeGame (int id , ArrayList<Game> gameArrayList){
        for (int i = 0; i < gameArrayList.size(); i++) {
            if (gameArrayList.get(i).getID() == id) {
                gameArrayList.remove(gameArrayList.get(i));
                System.out.println("Game with ID " + id + " removed");
                return;
            }
            System.out.println("Game with the id not found");
        }


    }



    //method
    public void viewAllGames (ArrayList<Game> games){
        for (int i = 0; i < games.size(); i++) {
            System.out.println(games.get(i).toString());
        }

    }

    //method
    public void viewAllCustomers (ArrayList<Customer> customers){
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).toString());
        }


    }



    public String toString (){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String employeestring = this.id + ":" + this.name + "-" + this.birthday + "(" + (year-this.birthday) +") :"+ this.salary+ "SEK";
        return employeestring;
    }

}
