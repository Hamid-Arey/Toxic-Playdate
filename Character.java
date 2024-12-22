import java.util.Scanner;


public class Character {
  public String name;
  public String inventory[] = new String[10];
  public int health;

  
  // public String name() {
  //   Scanner in = new Scanner(System.in);

  //   System.out.print("Enter Your Name: ");
  //   String userName = in.next();
  //   return userName;
  // }

  // public String addInv() {
  //   String[] userInv = {"null"};
  //   return userInv[];
  // }
  //Character user = new Character(name(), addInv(), 100);
  

  public void characterInv() {    
    for (int x = 0; x < this.inventory.length; x++) {
      this.inventory[x] = "";
    }
  }
  
  public Character(String a, String b[], int c) {
    for(int x = 0;x<10;x++){
      b[x]= "0";
    }
    this.name = a;
    this.inventory = b;
    this.health = c;
  }
  public String[] getInv() {
      return inventory;
  }
  
  public int getHealth() {
    return health;
  }
  
  public static String printStrArr(String a[]) {
    String output = "";
    for (int x = 0; x < a.length; x++) {
      if (a[x].equals("0")) {
        output += ("Empty, ");
      } else {
        output += a[x] + ", ";
      }
    }
    return output;
  }

  public String printIntArr(int a[]) {
    String output = "";
    for(int x = 0; x < a.length; x++) {
      output += a[x] + " ";
    }
    return output;
  }

  public void printUser() {

    // Print Character Info
    System.out.println("--------------------------------------------------------------------");
    System.out.println("Character Info |             ");
    System.out.println("Name           | " + this.name);
    System.out.println("Inventory      | " + printStrArr(this.inventory));
    System.out.println("Health         | " + getHearts(this.health));
    System.out.println("--------------------------------------------------------------------");
  }

  public static String getHearts(int health) {
    String hearts = "";
    for (int i = 0; i < health; i += 20) {
      hearts += " ♥"; 
    }
    return hearts;
  }
}

/*
System.out.println("_/﹋\\_");
System.out.println("(҂`_´)");
System.out.println("<,︻╦╤─ ҉ - -");
System.out.println("_/﹋\\_\n");

System.out.println("_/﹋\\_");
System.out.println("(҂`_´)");
System.out.println("/|︻|\\ ");
System.out.println("_/﹋\\_\n");

System.out.println("_/﹋\\_");
System.out.println("(`_´҂)");
System.out.println("/|︻|\\ ");
System.out.println("_/﹋\\_\n");

System.out.println(" _/﹋\\_");
System.out.println("\\(`◡´҂)/");
System.out.println("  |︻| ");
System.out.println(" _/﹋\\_");
*/