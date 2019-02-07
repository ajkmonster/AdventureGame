
import java.util.Scanner;
public class AdventureGame {
    private static String decision;
    public static void main(String[] args){
    welcomeMessage();
    promptMessage();
    }
    public static void welcomeMessage(){
        System.out.println("WELCOME TO VICTOR'S LITTLE ADVENTURE!");
        System.out.println("Try to survive till the end. Quit anytime by entering "+"\"q\"");
        System.out.println("\n");
    }
    public static void promptMessage(){
        System.out.println("We start out in a huge mansion that is haunted by the ghosts of witches. Would you like to go "
                + "\"upstairs\"" +"\n"+" or to the "+ "\"kitchen\""+"?");
        input();
        if (decision.equalsIgnoreCase("upstairs")){
            upstairs();
        } else if (decision.equalsIgnoreCase("kitchen")){
            kitchen();
        } else if (decision.equalsIgnoreCase("q")){
            exitMessage();
        } else {
            System.out.println("Wrong input! Please try again.");
            promptMessage();
        }
    }
    public static void exitMessage(){
        System.out.println("Thank you for playing!");
    }
    public static void kitchen(){
        System.out.println("As you are entering you see a refrigerator that is enveloping the room in vanilla vapors."+"\n"
                +"You also see a cabinet designed with an elaborate pentagram."+"\n"+"You can open the "+
                "\"refrigerator\""+" or look in the "+"\"cabinet\""+".");
        input();
        if(decision.equalsIgnoreCase("refrigerator")){
            System.out.println("You found a wonderful smelling vanilla cake. Do you eat the cake? ("+"\"Yes\""+ " or "+"\"no\""+")?");
            input();
            if(decision.equalsIgnoreCase("yes")){
                System.out.println("As you eat the cake you become extremely nauseous.");
                System.out.println("You die from the curse the witches put on the cake.");
            } else if (decision.equalsIgnoreCase("no")){
                System.out.println("You live because temptation doesn't affect you. You survived the cursed cake!");
            }else if (decision.equalsIgnoreCase("q")){
                exitMessage();
            } else {
                System.out.println("Not an answer. Please try again.");
                kitchen();
            }
        } else if (decision.equalsIgnoreCase("cabinet")){
            System.out.println("You discover a book that teaches you the ability to control time.");
            System.out.println("Do you "+"\"go to the past\""+" or "+ "\"go to the future\""+"" );
            input();
            if (decision.equalsIgnoreCase("go to the past")){
                System.out.println("You become a millionaire and meet the love of your life.");
            } else if (decision.equals("go to the future")) {
                System.out.println("You get killed by robots and no one remembers who you are.");
            }else if (decision.equalsIgnoreCase("q")){
                exitMessage();
            } else {
                System.out.println("Not an answer. Please try again.");
                kitchen();
            }
        }else if (decision.equalsIgnoreCase("q")){
            exitMessage();
        } else {
            System.out.println("Not an answer. Please try again.");
            kitchen();
        }
    }
    public static void upstairs(){
        System.out.println("While you walk up you see a bedroom that is emitting a strange sound."+"\n"
                +"You also see a bathroom with what seems like blood splatter around."+"\n"
                +"You can enter the "+"\"bathroom\""+"or the "+"\"bedroom\""+".");
        input();
        if (decision.equalsIgnoreCase("bathroom")){
            bathroom();
        } else if (decision.equalsIgnoreCase("bedroom")){
            bedroom();
        }else if (decision.equalsIgnoreCase("q")){
            exitMessage();
        } else {
            System.out.println("Not an answer. Please try again.");
            upstairs();
        }
    }
    public static void bedroom(){
        System.out.println("Inside you see a dragon's head and to your right you see bandages.");
        System.out.println("Would you like to "+"\"touch the dragon's head\"" +" or "+"\"take the bandages\""+ "?");
        input();
        if(decision.equalsIgnoreCase("touch the dragon's head")){
            System.out.println("The dragon's eyes open and stare at you.");
            System.out.println("Do you want "+"\"stare back\""+" or "+"\"bow down\""+"?");
            input();
            if (decision.equalsIgnoreCase("stare back")){
                System.out.println("The dragon glares at you, then awakens and eats you alive. You are dead.");
            } else if (decision.equalsIgnoreCase("bow down")){
                System.out.println("Your obedience saves you. THe dragon closes its' eyes. You survive.");
            }else if (decision.equalsIgnoreCase("q")){
                exitMessage();
            } else {
                System.out.println("Not an answer. Please try again.");
                bedroom();
            }
        } else if (decision.equalsIgnoreCase("take the bandages")){
            System.out.println("The bandages become alive and start wrapping themselves around you");
            System.out.println("Do you "+"\"scream\""+" or "+"\"struggle out\"");
            input();
            if (decision.equalsIgnoreCase("scream")){
                System.out.println("Your screams are heard by the witches and their ghosts persist to make the bandages wrap tighter.");
                System.out.println("You are dead.");
            } else if(decision.equalsIgnoreCase("struggle out")){
                System.out.println("The bandages wrap even tighter. The constriction causes you to hallucinate.");
                System.out.println("You can't think nor breathe. You are dead.");
            }else if (decision.equalsIgnoreCase("q")){
                exitMessage();
            } else {
                System.out.println("Not an answer. Please try again.");
                bedroom();
            }
        }else if (decision.equalsIgnoreCase("q")){
            exitMessage();
        } else {
            System.out.println("Not an answer. Please try again.");
            bedroom();
        }
    }
    public static void bathroom() {
        System.out.println("You see the supposed blood, but is just red wax splattered around.");
        System.out.println("You hear shuffling behind the curtain.");
        System.out.println("Do you " + "\"open the curtain\"" + " or " + "\"run\"" + "?");
        input();
        switch (decision) {
            case "open the curtain":
                System.out.println("You encounter a bat that transforms into a vampire");
                System.out.println("The vampire asks if he can take your blood.");
                System.out.println("Do you let him let him take your blood? (" + "\"yes\"" + " or " + "\"no\"" + ")");
                input();
                switch (decision) {
                    case "yes":
                        System.out.println("He takes your blood and you become a vampire.");
                        System.out.println("You survive I guess?? haha. Enjoy your blood thirst.");
                        break;
                    case "no":
                        System.out.println("He looks at you with anger and takes it by force.");
                        System.out.println("He drains the blood out of you. You are dead.");
                        break;
                    case "q":
                        exitMessage();
                        break;
                    default:
                        System.out.println("Not an answer. Please try again.");
                        bathroom();
                        break;
                }
                break;
            case "run":
                System.out.println("You reach the front door.");
                System.out.println("Do you really want to leave? ("+"\"yes\""+" or "+"\"no\""+")");
                input();
                switch (decision){
                    case "yes":
                        System.out.println("You open the doors and you are free.");
                        System.out.println("You survive.");
                        break;
                    case "no":
                        System.out.println("The house shudders and howls. It screams "+"\"You are not welcomed here\""+".");
                        System.out.println("A gust of wind blows the door open and ushers you out.");
                        System.out.println("You survive.");
                        break;
                    case "q":
                        exitMessage();
                        break;
                    default:
                        System.out.println("Not an answer.Please try again.");
                        bathroom();
                        break;
                }
                break;
            case "q":
                exitMessage();
                break;
            default:
                System.out.println("Not an answer.Please try again.");
                bathroom();
                break;
        }
    }
    public static void input(){
        Scanner choice = new Scanner(System.in);
        System.out.print("> ");
        decision = choice.nextLine();
        decision.toLowerCase();
    }
}
