import java.util.ArrayList;
import java.util.Scanner;

public class DartController {

     //arraylist to store customers,games,employees in array
    ArrayList<Customer> customers = new ArrayList<Customer>();
    ArrayList<Game> games = new ArrayList<Game>();
    ArrayList<Employee> employees = new ArrayList<Employee>();

    //method for string input
    public String stringInput(String Message){
        Scanner input = new Scanner (System.in);
        System.out.println(Message);
        String userInput = input.nextLine();
        return userInput;
    }

    //method for integer input
    public int intInput(String Message) {
        Scanner input = new Scanner(System.in);
        System.out.println(Message);
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;
    }

    //method for main menu
    public void  mainMenu(){
        System.out.println("Main Menu");
        System.out.println("Welcome to DART, your good old game rental system. The competition has no steam to keep up! ");
        System.out.println("Please specify your role by entering one of the options given:");
        System.out.println("1. Enter “M” for Manager");
        System.out.println("2. Enter “E” for Employee");
        System.out.println("3. Enter “C” for Customer");
        System.out.println("4. Enter “X” to exit system");
    }

    //method for manager menu
    public void  managerMenu() {
        System.out.println("Manager Screen - Type one of the options below:");
        System.out.println("1. Add an employee");
        System.out.println("2. Remove an employee");
        System.out.println("3. View all employees");
        System.out.println("4. Return to Main Menu");
    }

//method for employee menu

    public void  employeeMenu() {
        System.out.println("Employee Screen - Type one of the options below:");
        System.out.println("1. Register a game");
        System.out.println("2. Remove a game");
        System.out.println("3. Register a customer");
        System.out.println("4. Remove a customer");
        System.out.println("5. Show total rent profit");
        System.out.println("6. View all games");
        System.out.println("7. View all customers");
        System.out.println("8. Return to Main Menu");
    }

//method for customer menu
    public void  customerMenu() {
        System.out.println(" Customer Screen - Type one of the options below:");
        System.out.println("1. Rent a game");
        System.out.println("2. Return a game");
        System.out.println("3. View all games");
        System.out.println("4. Return to Main Menu");
    }

    //method for main
    public void DartMain(){
        mainMenu();
        String input =  stringInput("");
        while(!input.equals("X")){
            switch (input){
                case "M":{
                    String password = stringInput("Please enter password");
                    if(password.equals("admin1234")){
                        managerMenu();
                        Manager m = new Manager(); //create obj for class manager to use its related method
                        int option = intInput("");
                        if(option ==1) {
                            int Id = intInput("Please enter the id of the new employee");
                            String name = stringInput ("Please enter the name of the new employee");
                            String address = stringInput ("Please enter the address of the new employee");
                            int birthYear = intInput("Please enter the birth year of the new employee");
                            int salary = intInput("Please enter the salary of the new employee");
                            Employee e = new Employee(Id ,name ,address,birthYear,salary); //creating obj of class employee to access its constructor
                            m.addEmployee(e,employees); //using addEmployee method from manager class

                        }
                        else if(option ==2){
                            int ID = intInput("Enter the ID of employee you want to remove:");
                            m.removeEmployee(ID,employees);
                        }
                        else if (option == 3){
                            m.viewAllEmployee(employees);
                        }
                        else {
                        }
                        break;
                    }
                }
                case "E":{
                    String password = stringInput("Please enter password");
                    if(password.equals("password123")) {
                        employeeMenu();
                        Employee e = new Employee();
                        int option = intInput("");
                        if (option == 1) {

                            int Id = intInput("Please enter the id of the new game");
                            String title = stringInput("Please enter the name of the new game");
                            String genre = stringInput("Please enter the genre of the new game");
                            int dailyRent = intInput("Please enter the daily rent of the new game");
                            Game a = new Game(Id, title, genre, dailyRent);
                            e.addGame(a, games);
                        }
                        else if (option == 2) {
                            int ID = intInput("Enter the ID of game you want to remove:");
                            e.removeGame(ID, games);
                        }
                        else if (option == 3) {
                            int id = intInput("Please enter the id of the new customer");
                            String name = stringInput("Please enter the name of the new customer");
                            Customer c = new Customer(name, id);
                            e.addCustomer(c, customers);
                        }
                        else if (option == 4) {
                            int ID = intInput("Enter the ID of customer you want to remove:");
                            e.removeCustomer(ID, customers);
                        }
                        else if (option == 5) {

                        }
                        else if (option == 6) {
                            e.viewAllGames(games);
                        }
                        else if (option == 7) {
                            e.viewAllCustomers(customers);
                        }
                        else {

                        }
                        break;
                    }
                }
                case "C":{
                    customerMenu();
                    Customer c = new Customer();
                    int option = intInput("");
                    if(option ==1) {
                        int id = intInput("Please enter the id of the game you wish to rent");
                        for(int i = 0;i<games.size();i++){
                            if(games.get(i).getID() == id){
                                int days= intInput("How many days do you want the game to rent for");
                                c.rentGame(games.get(i),days);
                            }
                        }
                    }
                    else if(option ==2){
                        int id = intInput("Please enter the id of the game you wish to return");
                        for(int i = 0;i<games.size();i++){
                            if(games.get(i).getID() == id){
                                c.returnGame(games.get(i));
                            }
                        }
                    }
                    else{
                        c.viewAllGames(games);
                    }
                    break;
                }
            }
            mainMenu();
            input = stringInput("");
        }
       //creating new reference of type customer= create obj of type customer using (constructor+parameter)
        Customer customer1  = new Customer();
        //creating reference of type Employee = create obj type Employee using (constructor + parameter)
        Employee employee1 = new Employee();
        //creating reference of type Game = create obj type Game using (constructor +parameter)
        Game superMario = new Game();

    }

    public static void main(String[] args) {

        DartController obj = new DartController();
        obj.DartMain();
    }
}