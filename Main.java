import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
  String name;
  String serialNumber;
  int price;

  public Inventory(String name, String serialNumber, int price){
    this.name = name;
    this.serialNumber = serialNumber;
    this.price = price;
  }
  public void print(){
    System.out.println(name + "," + serialNumber + "," + price);
  }
}

class Main {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Inventory> items = new ArrayList<>();
    int input = 0;
    while(input != 5){
      System.out.println("Press 1 to add an item.");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");
      input = scanner.nextInt();
      if(input == 1){
        String name;
        String serialNumber;
        int price;
        scanner.nextLine();
        System.out.println("Enter the name:");
        name = scanner.nextLine();
        System.out.println("Enter the serial number:");
        serialNumber = scanner.nextLine();
        System.out.println("Enter the value in dollars (whole number):");
        price = scanner.nextInt();
        Inventory item = new Inventory(name, serialNumber, price);
        items.add(item);
      }
      if(input == 2){
        String serialNumber;
        scanner.nextLine();
        System.out.println("Enter the serial number of the item to delete:");
        serialNumber = scanner.nextLine();
        for(int i = 0; i < items.size(); i++){
          if(items.get(i).serialNumber.equals(serialNumber)){
            items.remove(i);
          }
        }
      }
      if(input == 3){
        String serialNumber;
        scanner.nextLine();
        System.out.println("Enter the serial number of the item to change:");
        serialNumber = scanner.nextLine();
        for(int i = 0; i < items.size(); i++){
          if(items.get(i).serialNumber.equals(serialNumber)){
            System.out.println("Enter the new name:");
            items.get(i).name = scanner.nextLine();
            System.out.println("Enter the new value in dollars (whole number):");
            items.get(i).price = scanner.nextInt();
          }
        }
      }
      if(input == 4){
        for(int i = 0; i < items.size(); i++){
          items.get(i).print();
        }
      }
      if(input == 5){
        break;
      }
    }
	}
}