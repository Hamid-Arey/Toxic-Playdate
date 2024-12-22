public class Rooms {
  String name, objects[];
  int doors[/* n, e, s, w */];
  //Stories
// Kitchen 
  //System.out.println("You are now in the kitchen, you look around hoping to find a snack. In the fridge instead of food you find food shaped toys. You remember them from your childhood they are called shopkins. You find no food. You hear a loud thud from the fridge you open it, but there were just the little miniature shopkins. You blink and BAM the shopkins come to life and trap you. The chocolate milk one says “SOLVE THIS PUZZLE AND WE SHALL LET YOU PASS");

  
//Toy Workshop
  //System.out.println("You now head to the toy makers workshop. Your a little nervous, a little jumpy after just seeing the toys come to life. You have seen toy story but who knew it was gonna come to life. You look through the toy makers things hoping to find a key but instead you find a little robot. You pick it up and drop it accidently. the robot turns into A KILLER ROBOT. WITH ITS DARK RED EYES IT SAYS “YOU HAVE MET YOUR MATCH UNLESS YOU WANT TO MEET YOUR MAKER GUESS A NUMBER BETWEEN 1 and 10, IF YOU GUESS THE SAME NUMBER AS ME YOU CAN LIVE, YOU HAVE 3 TRIES JUST BECAUSE YOUR A LITTLE WEAKLING HAHAHAHAH.");

  
//Bed rooms
  //System.out.println("You head to the toy makers bedroom hoping he has a spare key lying around or a open window. Anything that could help you escape. After being attacked by shopkins and almost evisorated by a Killer Robot you arent feeling to shabby. The toy makers room seemed very normal, for a guy that had living toys he had a very normal room. A little to normal….. THUD the room door shuts behind you the dolls on the Toy makers dresser block the door and say “Do youuuu wannnna have a playyyydate” you say “I just want you leave this wretched house” the dolls respond “to leave this room you must beat us in mastermind.");

  //main room
  //System.out.println("You head back down stairs you had a genius idea maybe the backdoor is open and you can escape through their. You sprint to the back door and immediately your hopes are shattered. All the toys are barracading the back door they all say in unison “WE WON’T LET OUR NEW FRIEND LEAVE YOU WILL BE ONE OF US ONE OF US ONE OF US”. Your mind thinks of the worst would you become a toy forever ruled and bullied by the others. You decide you won’t let this happen. You speak “I don’t want to be one of you what must I do for you to let me leave.” The toys ponder and respond “beat us at our favourite game hangman.” You accept the challenge the toys add “If you win you can leave BUT if we win you will stay here forever tis the day we get tired of your annoyance and want your presence gone.” They get a rope and hang you off the light in a noose YOU MUST WIN");

  
  //Creating the rooms of the house with the doors and the objects in the rooms
  String[] foyerStr = {null};
  Rooms foyer = new Rooms("Foyer", foyerStr);

  String[] manRoomStr = {null};
  Rooms mainRoom = new Rooms("Main Room", manRoomStr);

  String[] diningRoomStr = {null};
  Rooms diningRoom = new Rooms("Dining Room", diningRoomStr);

  String[] kitchenStr = {null};
  Rooms kitchen = new Rooms("Kitchen", kitchenStr);

  String[] livingRoomStr = {null};
  Rooms livingRoom = new Rooms("Living Room", livingRoomStr);

  String[] ballRoomStr = {null};
  Rooms ballRoom = new Rooms("Ball Room", ballRoomStr);

  String[] greenHouseStr = {null};
  Rooms greenHouse = new Rooms("Green House", greenHouseStr);

  
  public Rooms(String a, String c[]) {
    this.name = a;
    this.objects = c;
  }

  public String printStrArr(String a[]) {
    String output = "";
    for(int x = 0; x < a.length; x++) {
      output += a[x] + " ";
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
  
  public void printRooms() {

    // Print Room Info
    System.out.println("-------------------------------------------------");
    System.out.println("Room Info    |             ");
    System.out.println("Name         | " + this.name);
    System.out.println("Doors        | " + printIntArr(this.doors));
    System.out.println("Objects      | " + printStrArr(this.objects));
    System.out.println("-------------------------------------------------");
  }
}