import java.util.Scanner;
 
class Main {
 public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   //scanner
   System.out.println("What is your first name?");
   String name = scan.next();
   //variable for name based off of user input
   System.out.println("What is the time in military time?");
   int time = scan.nextInt();
   //variable for name based off of user input
   System.out.println("What is the temperature number?");
   int temperature = scan.nextInt();
   //variable for name based off of user input
   System.out.println("What is todays number date?");
   int dayNumber = scan.nextInt();
   //variable for name based off of user input
   System.out.println("What is the number date of which you last exercised?");
   int dayNumberLastExercised = scan.nextInt();
   //variable for name based off of user input
   System.out.println("Answer in true or false, you feel like biking.");
   boolean fealLikeBikeing = scan.nextBoolean();
   //variable for name based off of user input
   System.out.println("Answer in true or false, you feel like skating.");
   boolean fealLikeSkateing = scan.nextBoolean();
   //variable for name based off of user input
   System.out.println("Answer in true or false, it is sunny.");
   boolean sunny = scan.nextBoolean();
   //variable for name based off of user input
   int timeFeelLikeExercising = 7;
   // my variable
   System.out.print(name);
 
     if (temperature < 90 && sunny == true)
      //made if based of of the temperature
     {
     System.out.print(" go outside and");
     //wrote line of code that tells you to go outside if its sunny and below 90
     }else{
     System.out.print(" stay inside to exercise and,");
     // else statement that tells you to stay inside if if statement values don't match
          }
       if (fealLikeBikeing == true || fealLikeSkateing == true )
       //made if statement that uses that prints "don't grab your bike or you skateboard if your inside but if your outside grab one" based on if you want to bike or if you want to skete
       {
       System.out.print(" don't grab your bike or you skateboard if your inside but if your outside grab one .");
       }else{
       System.out.print(" don't grab anything.");
       // else statement that tells you not to grab anything
            }
         System.out.print(" You should exercise for ");
           while (timeFeelLikeExercising < 20)
           {
           timeFeelLikeExercising++;
           }
           System.out.print(timeFeelLikeExercising + " minutes. ");
             if ( dayNumberLastExercised != dayNumber - 1  )
             //made if statement that tells you to walk for an extra 10 minutes if you didn't walk yesterday.
             {
             System.out.print(" However, since you didn't exercise yesterday exercise for an extra 10 minutes.");
             }else{
             System.out.println("");
             // else statement that prints nothing if you did exercise yesterday
                  }
               System.out.print(" You should also sprint for ");
               {
               for(int sprint = 1; sprint <= 3; sprint++)
               {
               System.out.print(sprint);
               }
               System.out.println(" seconds.");
               }    
               // for loop that tells you to run for 123 seconds                
  }
}

  