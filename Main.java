import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your first name?");
    String name= scan.next();

    System.out.println("What is the time in military time?");
    int time= scan.nextInt();

    System.out.println("What is the tempurate number?");
    int tempurature= scan.nextInt();

    System.out.println("What is todays number date?");
    int dayNumber= scan.nextInt();

    System.out.println("What is the number date of which you lst exercised?");
    int dayNumberLastExercised= scan.nextInt();

    System.out.println("Answer in true or false, you feel like biking.");
    boolean fealLikeBikeing= scan.nextBoolean();

    System.out.println("Answer in true or false, you feel like skating.");
    boolean fealLikeSkateing= scan.nextBoolean();

    System.out.println("Answer in true or false, it is sunny.");
    boolean sunny = scan.nextBoolean();
    int timeFeelLikeExercising = 7;
    System.out.print(name);

      if (tempurature < 90 && sunny == true)
       //made if statment for id birthday is eaqual to todays date
      {
      System.out.print(" go out side and");
      //wrote line of code that tells you to go outside if its sunny and below 90
      }else{
      System.out.print(" stay inside to exersise and,");
      // else stament that tells you to stay inside if if statment values dont match
           }
        if (fealLikeBikeing == true || fealLikeSkateing == true )
        //made if statment that uses that prints "Grab your bike or you skatboard" based on if you want to bike or if you want to skete
        {
        System.out.print(" dont grab your bike or you skatboard if your inside but if your outside grab one .");
        }else{
        System.out.print(" dont grab anything.");
        // else stament that tells you not to grab anything
             }
        System.out.print(" You should exercise for ");
          while (timeFeelLikeExercising < 20)
          {
          timeFeelLikeExercising++; 
          }
          System.out.print(timeFeelLikeExercising + " minutes. ");
            if ( dayNumberLastExercised != dayNumber - 1  )
            //made if statment that tells you to walk for an extra 10 minutes if you didnt walk yesterday.
            {
            System.out.print(" However, since you didnt exercise yesterday exercise for an extra 10 minutes.");
            }else{
            System.out.println("");
            // else stament that prints nothing if you did exercise yesterday
                 }
              System.out.print(" You should also sprint for ");
              {
              for(int sprint = 1; sprint <= 3; sprint++)
              {
              System.out.print(sprint);
              }
                System.out.println(" seconds.");
              }                  
 }
}
  