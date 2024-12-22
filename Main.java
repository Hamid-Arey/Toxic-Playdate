import java.util.Scanner;
import java.time.chrono.ChronoPeriod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static Character user;
    public static int score = 0;

    public static void main(String[] args) {
        // tutorial();
        // String intro = intro();
        // if(!intro.equals("true")) {
        //     death(intro);
        //     return;
        // }
        // String entrance = entrance();
        // if(!entrance.equals("true")) {
        //     if(entrance.equals("leave")) {
        //         leave(user.name + " was a bad guesser.");
        //     }
        //     death(entrance);
        //     return;
        // }
        String kitchen = kitchen();
        if(!kitchen.equals("true")) {
            if(kitchen.equals("leave")) {
                leave(user.name + " was scared of tiny groceries.");
            }
            death(kitchen);
            return;
        }
        String workshop = workshop();
        if(!workshop.equals("true")) {
            death(workshop);
            return;
        }

        robotConversation();
    }

    public static void tutorial() {
        print("Welcome to Toxic Playdate\n\n");
        System.out.print("Press c to continue: ");
        String firstEnter = in.nextLine();
        while (!firstEnter.equals("c")) {
            if (firstEnter.equals("C")) {
                System.out.print("HOLD IT RIGHT THERE BUSTER, remember that this game is case sensitive. Make sure all inputs are in lower case except if told otherwise.\nPress c to continue:");
                firstEnter = in.nextLine();
            } else {
                System.out.print("Press c to continue: ");
                firstEnter = in.nextLine();
            }
        }

        print("Good, now try opening your inventory by typing i.");
        System.out.print("Enter i: ");
        String secondEnter = in.nextLine();
        while (!secondEnter.equals("i")) {
            if (secondEnter.equals("I")) {
                System.out.print("HOLD IT RIGHT THERE BUSTER, remember that this game is case sensitive. Make sure all inputs are in lower case except if told otherwise.\nPress i to continue: ");
                secondEnter = in.nextLine();
            } else {
                System.out.print("Press i to continue: ");
                secondEnter = in.nextLine();
            }
        }
        String[] inv = new String[10];
        for(int x = 0; x < inv.length; x++) {
            inv[x] = "Empty ";
        }
        System.out.println("________________________________");
        System.out.println("Inventory: " + Arrays.toString(inv));
        System.out.println("________________________________");
        print("This is your inventory. It is currently empty because you haven't picked up any objects.");

        print("Now try seeing your health. Enter h");
        System.out.print("Enter Letter: ");
        String thirdEnter = in.nextLine();
        while (!thirdEnter.equals("h")) {
            if (thirdEnter.equals("H")) {
                System.out.print("HOLD IT RIGHT THERE BUSTER, remember that this game is case sensitive. Make sure all inputs are in lower case except if told otherwise.\nPress h to continue: ");
                thirdEnter = in.nextLine();
            } else {
                System.out.print("Press h to continue: ");
                thirdEnter = in.nextLine();
            }
        }
        System.out.println("\n\n________________________________");
        System.out.println("Health: " + "♡ ♡ ♡ ♡ ♡");
        System.out.println("________________________________");

        print("This is your health, every time you fail a challenge you lose one heart, if you lose all 5 hearts you die and have to restart the game.");
        print("Using any of the two shortcuts (i, and h) at any point throughout the game will show your inventory and health respectively. ");
        print("Now if you're ready to continue onto the game enter the continue letter.");

        System.out.print("Enter Letter: ");
        String fourthEnter = in.nextLine();
        while (!fourthEnter.equals("c")) {
            if (fourthEnter.equals("C")) {
                System.out.print("HOLD IT RIGHT THERE BUSTER, remember that this game is case sensitive. Make sure all inputs are in lower case except if told otherwise.\nPress c to continue: ");
                fourthEnter = in.nextLine();
            } else {
                System.out.print("The continue letter is c: ");
                fourthEnter = in.nextLine();
            }
        }
        System.out.println("\n\n\n\n");
    }

    public static String intro() {
        print("You walk into the office today feeling drowsy, you woke up on the wrong side of the bed. The construction next door did not help at all. You enter your building looking at your sign above \"City Exterminators\" and think to yourself, Maybe it's time to retire. You trudge on reluctantly and sit down at your desk, open up your computer, and get back to your dismal job.");

        System.out.print("Enter Password: ");
        String fake = in.next();
        in.nextLine(); // Clear the newline character from the buffer
        System.out.print("\n\nIncorrect\nHint: Your password is your name\n");
        System.out.print("Enter Password: ");
        String userName = in.nextLine();
        String[] userInv = new String[10];
        user = new Character(userName, userInv, 100); // Initialize user
        print("Good Morning " + user.name);
        user.printUser();
        System.out.println("{This is your Character Info and can be accessed by clicking x}\n{Hints are given in between curly brackets so make sure to look out for them}\n\n");


        print("*RING RING RING*");
        print("Your phone rings");
        boolean condition = false;
        while (!condition) {
            String ring = choice("Pick up the phone", "Let it ring", "Decline the call", "Throw phone at the wall");
            if (ring.equals("a")) {
                print("You picked up the phone.");
                condition = true;
            } else if (ring.equals("b")) {
                print("You decide to let the phone ring.");
                print("*RING RING RING*");
                print("It rings again");
            } else if (ring.equals("c")) {
                print("You decline the call and continue on with your work.");
                print("A couple minutes later it starts to ring again.");
            } else if (ring.equals("d")) {
                print("You grab the phone and throw it as hard as you can at the wall.");
                print("BANG");
                print("It comes back and hits you square in the head.");
                return "Lost a fight to a phone.";
            }
        }

        print("A childish elderly voice starts speaking on the phone.");
        print("Client: Hello, I need you to come to 321 toy story road and get rid of some pesky roadents that have infested my house.\n");
        condition = false;
        while (!condition) {
            String ring = choice("Agree and hang up", "Decline and hang up", "slam the phone down", "Ask for double salary");
            if (ring.equals("a")) {
                condition = true;
            } else if (ring.equals("b")) {
                print("You decline and hang up");
                print("*RING RING RING*");
                print("It rings again");
                print("Client: Hey, Come on I'm giving you good money.");
            } else if (ring.equals("c")) {
                print("You slam the phone down and try and continue on with your work.");
                print("A couple minutes later it starts to ring again.");
                print("*RING RING RING*");
                print("You pick up the phone.");
                print("Client: Hey, Come on I'm giving you good money.");
            } else if (ring.equals("d")) {
                print("You: Hey, if you double my rate I'll be there in 10 minutes.");
                print("Client: Fine, I'll see you in 10 minutes.");
            }
        }

        print("You hang up the phone and get your gear.");
        user.inventory[0] = "Bug-away Vacume";
        print(user.inventory[0] + " and " + user.inventory[9]);
        print("{Try typing i to see your inventory}");
        String fifthEnter = in.nextLine();
        while(!fifthEnter.equals("i")) {
            print("{Try typing i to see your inventory}");
            fifthEnter = in.nextLine();
        }
        System.out.println("_________________________________________________");
        System.out.println("Inventory: " + printStrArr(user.inventory));
        System.out.println("_________________________________________________");

        print("You head outside and hop into your '98 beetle and race down the street tawards the clients house.");
        return "true";
    }

    public static String entrance() {
        System.out.println("\n\n");
        print("You arrive at the house and step out of your car to see a massive mansion");
        print("You walk up the driveway confused as the front yard is littered with childrens toys. Dolls, toy cars, blocks, and balls cover the grass.");
        print("You climb the stairs and are faced with a massive pair of french doors. Replacing the handel is a small keypad with buttons 1 through 10. ");
        print("*krakle krakle* A small intercom comes to life");
        print("Client: Hello " + user.name + " I've been waiting for you. I'm not currently home so you're going to have to guess the combination to the keypad to get in.");
        print("Client: Don't wory though, it's only one number between 1 and 10. Good Luck.\n");
        
        boolean condition = false;
        while (!condition) {
            String choice = choice("Try guessing the number", "Try kicking down the door", "Tell the client to just open the door", "Leave");;
            if (choice.equals("a")) {
                condition = true;
            } else if (choice.equals("b")) {
                print("You decide to try and kick down the door.");
                print("You take a couple steps back and then run full speed at the door. You jump and kick it in the air.");
                print("You hurt yourself. You lost one heart.");
                user.health -= 20;
            } else if (choice.equals("c")) {
                print("You talk into the intercom.");
                print("You: Hey, could you just come out and open the door.");
                print("Client: Firstly, I said I'm not home. Secondly, I am paying you double so I will make you do whatever I want.");
            } else if (choice.equals("d")) {
                print("You turn around to walk away and head home.");
                print("You head back down the drive way and hop into your '98 beatle.");
                print("You turn on Abbey Road and drive back headerd tawards your office");
                return "leave";
            }
        }
        numGame();
        return "true";
    }

    public static String kitchen() {
        String reTurn = "true";
        print("You step through the door and are greeted with an extremly dirty kitchen. Dishes, pots, pans, and cutlery are littered throughout the whole room. And the stench is horrible. And all the lights are off like the power is off.");
        print("You begin setting up your bug vacume to start the search for the rodents in the house. YOu put the vacume on the ground and click the start up button. It takes a bit to get up and running so you do alittle bit of exploring.");
        print("You step up to the counter and find a HUGE knife.");

        String choice = choice2("Pick up the knife", "Leave it");
        if(choice.equals("a")) {
            add("Knife");
        }

        print("You look across the dark room and notice the only running apliance is the fridge operating with a low hum");
        print("You walk up to it and hear some noises on the inside and get worried so you grab your rodent vacume and open the fridge.");
        print("The door opens with a woosh of cold air and as your eye adjust to the bright lights you see small little groceries moving. YOu think back to those little toys you used to play with as a kid. Shopkins.");
        choice = choice("Reach in to grab one", "Close the frige and leave the kitchen", "Suck them up into the rodent vacume", "Close the fridge and leave the house");
        if(choice.equals("a")) {
            print("You reach into the fridge to grab one.");
            print("Suddenly they all attack you and pin you down on the ground.");
            String ans = randEquat();
            if(ans.equals("dead")) {
                return "Lost a fight to some minature groceries.";
            }
        } else if(choice.equals("b")) {
            print("You slam the fridge door and decide that today is not the day. You walk away and find a door leading to a work shop.");
        } else if(choice.equals("c")) {
            print("You turn on your vacume and suck up all of the little groceries and leave the room feeling you avoided a lot of problems.");
        } else if(choice.equals("d")) {
            return "leave";
        }
        return "true";
    }

    public static String workshop() {
        print("The room is dark and cold. You feel a chill run down your spine as you step into the workshop. Outlines of tools and machines are barely visible in the dim light, creating an ominous feeling. You find yourself in front of a large workbench covered with various tools and mechanical parts.");

        String choice = choice2("Investigate the workbench", "Look around the room");
        if(choice.equals("a")) {
            print("You approach the workbench and notice a peculiar device that seems to be half-assembled. It's unlike anything you've seen before.");
            print("As you examine the device, you accidentally trigger a hidden mechanism, and a drawer pops open, revealing a strange, key like object.");

            choice = choice2("Take the object", "Leave it");
            if(choice.equals("a")) {
                add("Robot Key");
                print("You carefully take the object and put it in your bag, wondering what it could be used for.");
            } else {
                print("You decide not to take the object and close the drawer.");
            }
        } else if(choice.equals("b")) {
            print("You decide to explore the rest of the room. As you walk around, you notice a large cabinet in the corner.");
            print("The cabinet is locked, but it looks like it could be opened with the right tool or combination.");

            choice = choice2("Try to pick the lock", "Look for a key or clue");
            if(choice.equals("a")) {
                print("You find a set of lockpicking tools on the workbench and decide to give it a try.");
                boolean success = mastermind();
                if(!success) {
                    return "Lost a fight to a lock";
                }
                print("After a few tense moments, you manage to pick the lock and open the cabinet.");
                print("Inside, you find that it is infact empty and that it is actually a doorway into another room.");
            } else {
                print("You look around the workshop for any clues or keys that might help you open the cabinet.");
                print("You can't find any keys anywhere. But you accadentaly fall into the cabinet, it falls over and reviels a doorway.");
            }
        }

        print("You move on through the mysterious door.");
        return "true";
    }

    public static String mysteriousRoom() {
        print("You step through the doorway revealed by the fallen cabinet and find yourself in a mysterious, dimly lit room. The air is thick with dust, and you can barely make out the shapes of various machines and contraptions.");

        String choice = choice2("Investigate the machines", "Look around the room");
        if(choice.equals("a")) {
            print("You approach one of the larger machines and notice it's a robot, dormant and covered in cobwebs. As you brush off the cobwebs, the robot suddenly whirs to life.");
            print("It preceeds to swiftly grab you and wrap a nooce around your neck while also tying your hands and feet together.");
            print("\"Welcome, human,\" it says in a mechanical voice. \"To proceed, you must win a game of hangman.\"");
            
            boolean success =  ();
            if(!success) {
                return "Lost to a robot in a game of hangman";
            } 
            print("\"Congratulations, you have passed the test,\" the robot says as it powers down, leaving you to explore further.");

            choice = choice2("Examine the robot", "Move to the other side of the room");
            if(choice.equals("a")) {
                print("You examine the now inactive robot and find a keycard in a hidden compartment.");
                add("Keycard");
            } else {
                print("You decide to leave the robot and move to the other side of the room.");
            }
        } else if(choice.equals("b")) {
            print("You decide to explore the rest of the room. As you walk around, you notice a lock picking tool ontop of a desk in the corner.");
            choice = choice2("Pick up tool", "Leave it");
            if(choice.equals("a")) {
                print("You picked up the tool");
                add("Lock Picker");
            } else {
                print("You decided you didn't need it.");
            }

            choice = choice2("Try to pick the lock", "Look for a key or clue");
            if(choice.equals("a")) {
                print("You find a set of lockpicking tools nearby and decide to give it a try.");
                
                print("After a few tense moments, you manage to pick the lock and open the box.");
                print("Inside, you find a keycard.");
                add("Keycard");
            } else {
                print("You look around the room and can't find any clues.");
                choice = choice2("Break the box open", "Leave the box");
                if(choice.equals("a")) {
                    int num = (int)(2 * Math.random() +1);
                    if(num == 1) {
                        print("The box succesfully broke open and you found a keycard inside");
                        add("keycard");
                    } else {
                        print("You tried breaking the box but it stayed in-tact and hit you in the leg.");
                        print("You lost a heart");
                        user.health -= 20;
                    }
                }
            }
        }

        print("Exhausted from your adventur you continue to move towards the exit of the mysterious room hopeing an exit would be close by.");
        return "true";
    }

    public static void robotConversation() {
        print("You step through the doorway revealed by the fallen cabinet and find yourself in a mysterious, dimly lit room. The air is thick with dust, and you can barely make out the shapes of various machines and contraptions.");
        print("As you walk further in, you notice a small toy robot sitting on a shelf. You pick it up, and to your surprise, it powers on and begins to speak.");

        print("\"Hello, human!\" the toy robot chirps. \"I am ToyBot. How can I assist you today?\"");

        String choice = choice2("Ask about the robots", "Ask about Dr. Evanston");
        if (choice.equals("a")) {
            print("You ask the toy robot why there are so many robots in the house.");
            print("ToyBot's eyes blink as it processes your question. \"The robots were created by the master of the house, Dr. Evanston. He was a brilliant inventor, but he lived alone. He created us to help with various tasks and to keep him company.\"");

            choice = choice2("Ask why the robots are hostile", "Ask more about the tasks");
            if (choice.equals("a")) {
                print("You ask ToyBot why the robots are trying to kill you.");
                print("ToyBot's voice drops to a more serious tone. \"After Dr. Evanston's passing, some of the robots' programming became corrupted. Without maintenance, their primary directives became confused, and they started seeing any intruder as a threat. They are trying to protect the house as they were originally programmed to do, but their logic circuits are damaged.\"");

                choice = choice2("Ask about fixing the robots", "Ask about escaping the house");
                if (choice.equals("a")) {
                    print("You ask if there's a way to fix the robots.");
                    print("\"Yes,\" ToyBot responds. \"There is a main control panel in the basement that can reset their programming and restore them to their original functions. You'll need this keycard to access it.\"");
                    add("Keycard");
                } else {
                    print("You ask ToyBot how to safely escape the house.");
                    print("\"If you avoid the main corridors and stick to the service tunnels, you should be able to bypass most of the hostile robots,\" ToyBot advises. \"But be careful, some of the tunnels are unstable.\"");
                }
            } else {
                print("You ask ToyBot to tell you more about the robots' tasks.");
                print("\"Each robot in this house has a unique purpose,\" ToyBot explains. \"Some are for cleaning, some for cooking, and others for companionship. Dr. Evanston wanted to create a perfect, self-sustaining environment where machines could do all the work and keep him entertained.\"");
            }
        } else {
            print("You ask ToyBot to tell you more about Dr. Evanston.");
            print("\"Dr. Evanston was always tinkering and inventing,\" ToyBot explains. \"He was fascinated by the idea of creating life from machines. He created us to help with various tasks and to keep him company.\"");

            choice = choice2("Ask why Dr. Evanston called you", "Ask about the state of the house");
            if (choice.equals("a")) {
                print("You ask ToyBot why Dr. Evanston called you, an exterminator.");
                print("\"In his final days, Dr. Evanston noticed an infestation of rodents in the house,\" ToyBot replies. \"He was too weak to deal with it himself, so he called for an exterminator. Unfortunately, he passed away before you arrived, and the robots, in their corrupted state, didn't recognize your purpose.\"");

                choice = choice2("Ask how to complete the extermination", "Ask about Dr. Evanston's last days");
                if (choice.equals("a")) {
                    print("You ask ToyBot how to complete the extermination task.");
                    print("\"You can still carry out Dr. Evanston's last wish by clearing the house of rodents,\" ToyBot says. \"The main control panel in the basement has a system that can help you track and eliminate them. Use this keycard to access it.\"");
                    add("Keycard");
                } else {
                    print("You ask ToyBot to tell you more about Dr. Evanston's last days.");
                    print("\"Dr. Evanston spent his final days in his study, working on one last invention,\" ToyBot recalls. \"He was determined to perfect a robot that could independently maintain the entire house. But his health failed him before he could complete it.\"");
                }
            } else {
                print("You ask ToyBot why the house is now in such a state of disrepair.");
                print("\"Sadly, Dr. Evanston passed away several years ago,\" ToyBot says with a hint of sadness in its mechanical voice. \"Without his maintenance and guidance, many of the robots have fallen into disrepair or become inactive. The house has slowly deteriorated without anyone to look after it.\"");
            }
        }

        print("You thank ToyBot for the information and decide to take the keycard and proceed with your next steps.");
        print("With the keycard in hand, you head to the basement, using it to unlock the main control panel. After some effort, you manage to reset the robots' programming, restoring their original functions.");
        print("The hostile robots immediately stop their aggressive behavior and return to their designated tasks, cleaning and repairing the house.");
        print("You take a deep breath, realizing that you have fulfilled Dr. Evanston's last wish. The house starts to come back to life, now under the care of the properly functioning robots.");
        print("Feeling a sense of accomplishment, you decide it's time to leave. As you exit the house, ToyBot's voice echoes a final farewell: \"Thank you, human. You have saved our home.\"");
        print("You step out into the daylight, knowing that the house and its inhabitants are safe once more. Your job is done.");

        print("THE END");
    }



    public static void add(String input) {
        for(int x = 0; x < user.inventory.length; x++) {
            if(x == 9){
                print("Inventory is full.");
            } else if(user.inventory[x].equals("0")) {
                user.inventory[x] = input;
                print(input + " was added to inventory.");
                break;
            }
        }
    }

    public static void leave(String reason) {
        print(user.name + " left the house and retired to live on hapily ever after wihtout any bugs ever again.");
        print("Reason: " + reason);
        printFast("████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        printFast("█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░████░░░░░░░░░░░░░░█░░░░░░██░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░███");
        printFast("█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░████░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀░░███");
        printFast("█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░████░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░▄▀░░███");
        printFast("█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░░░░░▄▀░░█░░▄▀░░████████████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░████░░▄▀░░███");
        printFast("█░░▄▀░░█████████░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░▄▀░░███");
        printFast("█░░▄▀░░██░░░░░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀░░███");
        printFast("█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░░░░░██░░▄▀░░█░░▄▀░░░░░░░░░░████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░░░███");
        printFast("█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀░░████████████░░▄▀░░██░░▄▀░░█░░▄▀▄▀░░▄▀▄▀░░█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█████");
        printFast("█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀░░░░░░░░░░████░░▄▀░░░░░░▄▀░░█░░░░▄▀▄▀▄▀░░░░█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░░░░░█");
        printFast("█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░████░░▄▀▄▀▄▀▄▀▄▀░░███░░░░▄▀░░░░███░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀▄▀▄▀░░█");
        printFast("█░░░░░░░░░░░░░░█░░░░░░██░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░████░░░░░░░░░░░░░░█████░░░░░░█████░░░░░░░░░░░░░░█░░░░░░██░░░░░░░░░░█");
        printFast("████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        print("At least you didn't die ¯\\_(ツ)_/¯");
    }

    public static String printStrArr(String a[]) {
        String output = "";
        for (int x = 0; x < a.length; x++) {
            if (a[x].equals("0")) {
                output += ("slot " + (x + 1) + ": ");
            } else {
                output += a[x] + ", ";
            }
        }
        return output;
    }

    public static void death(String cause) {
        print("\n\n" + user.name + " has died.");
        print("Cause of death: " + cause);
        printFast("████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        printFast("█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░████░░░░░░░░░░░░░░█░░░░░░██░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░███");
        printFast("█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░████░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀░░███");
        printFast("█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░████░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░▄▀░░███");
        printFast("█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░░░░░▄▀░░█░░▄▀░░████████████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░████░░▄▀░░███");
        printFast("█░░▄▀░░█████████░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░▄▀░░███");
        printFast("█░░▄▀░░██░░░░░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀░░███");
        printFast("█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░░░░░██░░▄▀░░█░░▄▀░░░░░░░░░░████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░░░███");
        printFast("█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀░░████████████░░▄▀░░██░░▄▀░░█░░▄▀▄▀░░▄▀▄▀░░█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█████");
        printFast("█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀░░░░░░░░░░████░░▄▀░░░░░░▄▀░░█░░░░▄▀▄▀▄▀░░░░█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░░░░░█");
        printFast("█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░████░░▄▀▄▀▄▀▄▀▄▀░░███░░░░▄▀░░░░███░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀▄▀▄▀░░█");
        printFast("█░░░░░░░░░░░░░░█░░░░░░██░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░████░░░░░░░░░░░░░░█████░░░░░░█████░░░░░░░░░░░░░░█░░░░░░██░░░░░░░░░░█");
        printFast("████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        print("r.i.p.");
    }

    public static String choice(String a, String b, String c, String d) {
        print("Options:");
        print("a) " + a);
        print("b) " + b);
        print("c) " + c);
        print("d) " + d);
        System.out.print("Choice: ");
        String choice = in.nextLine().trim().toLowerCase();
        while (!choice.equalsIgnoreCase("a") && !choice.equalsIgnoreCase("b") && !choice.equalsIgnoreCase("c") && !choice.equalsIgnoreCase("d")) {
            if (choice.equals("i")) {
                System.out.println("________________________________");
                System.out.println("Inventory: " + Arrays.toString(user.getInv()));
                System.out.println("________________________________");
                System.out.print("Choice: ");
                choice = in.nextLine().trim().toLowerCase();
            } else if (choice.equals("h")) {
                System.out.println("________________________________");
                System.out.println("Health: " + getHearts(user.getHealth()));
                System.out.println("________________________________");
                System.out.print("Choice: ");
                choice = in.nextLine().trim().toLowerCase();
            } else if (choice.equals("x")) {
                user.printUser();
                choice = in.nextLine().trim().toLowerCase();
            }
            print("Please choose one of the four options");
            System.out.print("Choice: ");
            choice = in.nextLine().trim().toLowerCase();
        }
        return choice;
    }
    public static String choice3(String a, String b, String c) {
        print("Options:");
        print("a) " + a);
        print("b) " + b);
        print("c) " + c);
        System.out.print("Choice: ");
        String choice = in.nextLine().trim().toLowerCase();
        while (!choice.equalsIgnoreCase("a") && !choice.equalsIgnoreCase("b") && !choice.equalsIgnoreCase("c")) {
            if (choice.equals("i")) {
                System.out.println("________________________________");
                System.out.println("Inventory: " + Arrays.toString(user.getInv()));
                System.out.println("________________________________");
                System.out.print("Choice: ");
                choice = in.nextLine().trim().toLowerCase();
            } else if (choice.equals("h")) {
                System.out.println("________________________________");
                System.out.println("Health: " + getHearts(user.getHealth()));
                System.out.println("________________________________");
                System.out.print("Choice: ");
                choice = in.nextLine().trim().toLowerCase();
            } else if (choice.equals("x")) {
                user.printUser();
                choice = in.nextLine().trim().toLowerCase();
            }
            print("Please choose one of the four options");
            System.out.print("Choice: ");
            choice = in.nextLine().trim().toLowerCase();
        }
        return choice;
    }

    public static String choice2(String a, String b) {
        print("Options:");
        print("a) " + a);
        print("b) " + b);
        System.out.print("Choice: ");
        String choice = in.nextLine().trim().toLowerCase();
        while (!choice.equalsIgnoreCase("a") && !choice.equalsIgnoreCase("b")) {
            if (choice.equals("i")) {
                System.out.println("________________________________");
                System.out.println("Inventory: " + Arrays.toString(user.getInv()));
                System.out.println("________________________________");
                System.out.print("Choice: ");
                choice = in.nextLine().trim().toLowerCase();
            } else if (choice.equals("h")) {
                System.out.println("________________________________");
                System.out.println("Health: " + getHearts(user.getHealth()));
                System.out.println("________________________________");
                System.out.print("Choice: ");
                choice = in.nextLine().trim().toLowerCase();
            } else if (choice.equals("x")) {
                user.printUser();
                choice = in.nextLine().trim().toLowerCase();
            }
            print("Please choose one of the four options");
            System.out.print("Choice: ");
            choice = in.nextLine().trim().toLowerCase();
        }
        return choice;
    }

    public static String getHearts(int health) {
        String hearts = "";
        for (int i = 0; i < health; i += 20) {
            hearts += " ♥";
        }
        for(int j = 100; j > health; j -= 20) {
            hearts +=" ♡";
        }
        return hearts;
    }

    public static void print(String text) {
        // for (int i = 0; i < text.length(); i++) {
        //     System.out.printf("%c", text.charAt(i));
        //     try {
        //         Thread.sleep(50); // 0.05s pause between characters
        //     } catch (InterruptedException ex) {
        //         Thread.currentThread().interrupt();
        //     }
        // }
        System.out.println(text);
    }

    public static void printFast(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
            try {
                Thread.sleep(5); // 0.01s pause between characters
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public static void printSlow(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
            try {
                Thread.sleep(100); // 0.01s pause between characters
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public static void wordle() {
        Scanner scanner = new Scanner(System.in);

        // Select a secret word
        String secretWord = selectSecretWord();
        int wordLength = secretWord.length();

        print("To go through the door guess the " + wordLength + "-letter word to move on to the next door.");
        print("You have 6 attempts to get the right answer.");
        print("In the feedback line a dash means the letter is not in the word, a + means the letter is in the word but in the wrong position, and if your guess is correct in the right position it will be shown.");

        int attempts = 0;
        boolean isGuessed = false;

        while (attempts < 6 && !isGuessed) {
            System.out.print("Enter Attempt #" + (attempts + 1) + ": ");
            String guess = scanner.nextLine().toLowerCase();

            if (guess.equals(secretWord)) {
                System.out.println("Congratulations! You guessed the word \"" + secretWord + "\".");
                isGuessed = true;
            } else if(!guess.matches(".*[a-z].*")) { 
                System.out.println("Make sure your guess only includes letters.\n");
            } else if(guess.length() != 5) {
                System.out.println("Make sure your guess is 5 letters long.\n");
            }else {
                String feedback = generateFeedback(secretWord, guess);
                System.out.println("Feedback: " + feedback + "\n");
                attempts++;
            }
        }

        if (!isGuessed) {
            System.out.println("Sorry, you've run out of attempts. The word was \"" + secretWord + "\".");
        }

        scanner.close();
    }

    // Method to select a secret word
    public static String selectSecretWord() {
        String[] words = {
            "apple", "grape", "peach", "lemon", "mango", "bread", "pizza", "chips", "salsa", 
            "fries", "toast", "salad", "pasta", "sauce", "curry", "steak", "roast", "bacon", 
            "hammy", "trout", "melon", "onion", "sushi", "sugar", "syrup", "bunty", "cream", 
            "cider", "juice", "water", "winey", "table", "chair", "paper", "brush", "smile", 
            "happy", "laugh", "teeth", "beach", "tiger", "cheer", "jelly", "dance", "sunny", 
            "cloud", "candy", "frost", "shoes", "boots", "glove", "watch", "clock", "heart", 
            "knife", "plate", "spoon", "forks", "glass", "dress", "skirt", "pants", "short", 
            "shirt", "gowns", "towel", "sleep", "dream", "night", "light", "black", "white", 
            "green", "bluey", "redye", "beige", "brown", "beamy", "soury", "crush", "tasty", 
            "spicy", "sweet", "salty", "crisp", "fresh", "fizzy", "funky", "chill", "breez", 
            "beers", "drunk", "party", "disco", "music", "funky", "swing", "jazzy", "poppy", 
            "heavy", "metal", "rocky", "softy", "class", "honey", "cigar", "bills", "money", 
            "coins", "bonds", "check", "cards", "bliss", "money", "brisk", "vigor", "puppy", 
            "kitty", "horse", "bunny", "panda", "zebra", "whale", "shark", "crane", "doves", 
            "ducks", "geese", "swans", "finch", "robin", "perch", "salmo", "cobia", "coddy", 
            "hakee", "trout", "bream", "shads", "snaps", "coral", "shale", "stone", "pebby", 
            "marble", "brick", "slate", "basal", "clayl", "quartz", "sandy", "terra"};

        Random rand = new Random();
        return words[rand.nextInt(words.length)];
    }

    // Method to generate feedback for the guess
    public static String generateFeedback(String secretWord, String guess) {
        StringBuilder feedback = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            char secretChar = secretWord.charAt(i);
            char guessChar = guess.charAt(i);
            if (secretChar == guessChar) {
                feedback.append(secretChar);
            } else if (secretWord.indexOf(guessChar) != -1) {
                feedback.append("+");
            } else {
                feedback.append("-");
            }
        }
        return feedback.toString();
    }

    public static boolean hangman() {
        // List of words to choose from
        String[] words = { "java", "programming", "hangman", "computer", "game" };
        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];
        char[] wordArray = wordToGuess.toCharArray();
        char[] displayWord = new char[wordArray.length];
        Arrays.fill(displayWord, '_');
        char[] wrongGuesses = new char[26]; // Assuming a maximum of 26 wrong guesses (one for each letter)
        int wrongGuessCount = 0;
        int attemptsLeft = 6; // Number of incorrect guesses allowed
        Scanner scanner = new Scanner(System.in);

        print("YOu have 6 chances to get all the letters in the word to free yourself, or else");
        printSlow("YOU");
        printSlow("WILL");
        printSlow("HANG");

        boolean wordGuessed = false;

        while (attemptsLeft != 0 && !wordGuessed) {
            System.out.println("\nWord to guess: " + new String(displayWord));
            System.out.print("Wrong guesses: ");
            for (int i = 0; i < wrongGuessCount; i++) {
                System.out.print(wrongGuesses[i] + ", ");
            }
            System.out.println();
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Guess a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            boolean alreadyGuessed = false;
            for (int i = 0; i < wrongGuessCount; i++) {
                if (wrongGuesses[i] == guess) {
                    alreadyGuessed = true;
                    break;
                }
            }
            for (char c : displayWord) {
                if (c == guess) {
                    alreadyGuessed = true;
                    break;
                }
            }

            if (alreadyGuessed) {
                System.out.println("You've already guessed that letter. Try again.");
                continue;
            }

            boolean correctGuess = false;
            for (int i = 0; i < wordArray.length; i++) {
                if (wordArray[i] == guess) {
                    displayWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                wrongGuesses[wrongGuessCount] = guess;
                wrongGuessCount++;
                attemptsLeft--;
            }

            wordGuessed = new String(displayWord).equals(wordToGuess);
        }

        if (wordGuessed) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean mastermind() {
        // Makes the answer array
        int[] answer = new int[4];
        for (int x = 0; x < 4; x++) {
            answer[x] = rand();
        }
        print("To open this lock you need to enter a four digit code consisting of colors.");
        print("When entering a code write the first letter of the color only, Ex. gpyb is green, purple, yellow, blue. \n");
        print("You have 10 attempts before the lock locks you out and you cant open the cubord");
        print("On the board, and 'x' means that you got a color correct and in the right position, a 'o' means you guessed a collor correct but in the wrong position.");
        print("The order of the x0's do not corrspond with the order of the colors");
        print("Finally, if you don't get the right combination in 10 tries you have 5 more but everytime you get it wrong after you lose 1 heart. If you lose all hearts you die.");

        // Makes the user input array
        int[][] userIn = new int[15][4];
        String[][] board = new String[15][2];
        boolean reTurn = false;

        for (int r = 0; r < 10; r++) {
            if(r > 10) {
                user.health -= 20;
                if(user.health == 0) {
                    return false;
                }
            }
            System.out.print("Enter Code: ");
            String temp = in.nextLine().toLowerCase();
            System.out.println("-------------");

            // Fill in userIn array
            for (int c = 0; c < 4; c++) {
                userIn[r][c] = toNum(temp.substring(c, c + 1));
            }

            // Change the string to numbers
            int inputCode = arrayToInt(userIn[r]);

            // Fill in board
            board[r][0] = temp;
            board[r][1] = simdif(answer, userIn[r]);

            // Compare
            if (inputCode == arrayToInt(answer)) {
                System.out.println("YOU WIN!");
                return true; // End the game if the answer is correct
            } else {
                // Printing the board
                System.out.println("Current Board: ");

                for (int b = 0; b <= r; b++) {
                    System.out.println(board[b][0] + " | " + board[b][1]);
                }
                System.out.println("-------------\n");
            }
        }
        System.out.println(Arrays.toString(answer));
        for(int x = 0; x < answer.length; x++) {
            System.out.print(toStr(answer[x]));
        }
        return reTurn;
    }

    // Generate a random number between 1 and 6
    public static int rand() {
        return (int) (Math.random() * 6) + 1;
    }

    // Convert color code string to number
    public static int toNum(String code) {
        switch (code.toLowerCase()) {
            case "b":
                return 1; // Blue
            case "g":
                return 2; // Green
            case "o":
                return 3; // Orange
            case "p":
                return 4; // Purple
            case "r":
                return 5; // Red
            case "y":
                return 6; // Yellow
            default:
                return -1; // Invalid input
        }
    }
    public static String toStr(int code) {
        switch (code) {
            case 1:
                return "b"; // Blue
            case 2:
                return "g"; // Green
            case 3:
                return "o"; // Orange
            case 4:
                return "p"; // Purple
            case 5:
                return "r"; // Red
            case 6:
                return "y"; // Yellow
            default:
                return "invalid"; // Invalid input
        }
    }


    // Convert an array of integers to a single integer
    public static int arrayToInt(int[] array) {
        int result = 0;
        for (int num : array) {
            result = result * 10 + num;
        }
        return result;
    }

    // Convert int array to string line
    public static String stringifyInt(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        return sb.toString();
    }

    public static String simdif(int[] answe, int[] userI) {
        String xo = "";
        String answer = stringifyInt(answe);
        String userIn = stringifyInt(userI);

        for (int n = 0; n < 4; n++) {
            if (answer.substring(n, n + 1).equals(userIn.substring(n, n + 1))) {
                xo += "x";
            } else if (userIn.contains(answer.substring(n, n + 1))) {
                xo += "o";
            } else {
                xo += "";
            }
        }

        return xo;
    }

    public static void numGame() {
        int rand = (int) (10 * Math.random() + 1); // Generate random number
        int num;

        do {
          System.out.print("Enter Your Guess: ");
          String numIn = in.nextLine();

          if (numIn.matches("[0-9]+")) { // Check if input contains only digits
            num = Integer.parseInt(numIn);
            if (num >= 1 && num <= 10) {
              print("Valid Input: " + num);
              if (num == rand) {
                print("Congratulations, you guessed correctly. Move on through the door.");
                return; // Exit the method if guess is correct
              } else {
                print("Sorry, your guess was incorrect. Try Again");
              }
            } else {
              print("Invalid Input: " + num);
              print("Number is not between 1 and 10.");
            }
          } else {
            //print("Invalid Input: " + num);
            print("Please enter only numbers.");
          }
        } while (true); // Keep looping until correct guess is made
    }

    public static String randEquat() {
        print("They tie you down on your back to the floor of the dirty kitchen. You count 50 but know they are definatly many many more around you. Each of them a different grocery, cheese, milk, tomato, butter, etc.");
        print("The milk jumps on your chest and speaks to you in a high pitched robotic voice.");
        System.out.println("Milk: \033[3mHello, you people are making our prices so high. That no good.\033[0m");
        System.out.println("Milk: \033[3mDo you think that we want to rot on the store shelfs. NO WE DON'T. My poor friends rotting, curdeling, and expiring on your store shelfs. For that we will KILL YOU.\033[0m");
        String choice = choice2("Beg them to not kill you", "Call their bluff");
        if(choice.equals("b")) {
            print("You think their lieing and laugh in their face");
            print("You: Your too small to kill me.");
            print("BANG");
            return "dead";
        }

        print("You plead with the groceries to let you live hoping they understand.");
        print("You: Please, I'm just an exterminator I don't have any issue with you.");
        print("Milk: \033[3mYou know what, here if your able to calculate the price of these groceries you can go.\033[0m");
        int[] arrNum = new int[5];

        for (int x = 0; x < 5; x++) {
            if(x != 3){
                arrNum[x] = (int) (10 * Math.random() + 1);
            } else {
                arrNum[x] = (int) (5 * Math.random() + 1);
            }
        }

        print("Milk: \033[3mIf I use a cupon on a carton of eggs worth $" + arrNum[1] + " and remove $" + arrNum[2] + " then raise it to the power of " + arrNum[3] + " because everyone loves eggs. Then I add bread worth $" + arrNum[0] + " and also add some salt worth $" + arrNum[4] + " what is the total of my groceries.\033[0m");

        print("\nEquation: " + arrNum[0] + "+" + "(" + arrNum[1] + "-" + arrNum[2] + ")^" + arrNum[3] + "+" + arrNum[4]);

        int answer = (int) (arrNum[0] + Math.pow((arrNum[1] - arrNum[2]), arrNum[3]) + arrNum[4]);

        for(int x = 0; x < 3; x ++) {
            System.out.print("Enter Your Guess: ");
            String numIn = in.nextLine();

            if (numIn.matches("-?\\d+")) { // Check if input contains only digits
                int num = Integer.parseInt(numIn);
                if (num == answer) {
                    print("Milk: \033[3mHumph, you guessed correctly. You can leave. Un-tie him boys\033[0m");
                    return "alive"; // Exit the method if guess is correct
                } else {
                    print("Milk: \033[3mSorry, your guess was incorrect. You have" + x + " tries left.\033[0m");
                }
            } else {
                // print("Invalid Input: " + num);
                print("Please enter only numbers.");
            }
        }
        print("Milk: \033[3mYou know our deal too bad for you.\033[0m");
        death("Lost a fight to some minature groceries.");
        return "dead";
    }
}
