class Main {
  public static void main(String[] args) {
 int time = 1400;
 int tempurature = 80;
 boolean fealLikeBikeing = false;
 boolean fealLikeSkateing = false; 
 boolean sunny = true;
 boolean rainy = false;
 boolean tired = false;
 boolean walking = false;
 int dayNumber = 15;
 int dayNumberLastWalked = 14;
 int timeFeelLikeWalking = 7;
 // Inserted variables for later
 // these variables include time, tenourature, if its sunny,rainy, and if your walking or biking.
      if (tempurature < 90 && sunny == true)
   //made if statment for id birthday is eaqual to todays date
   {
     System.out.print("Go out side and");
     //wrote line of code that tells you to go outside if its sunny and below 90
   }else{
     System.out.print("Stay inside to walk and");
     // else stament that tells you to stay inside if if statment values dont match
        }
    if (fealLikeBikeing == true || fealLikeSkateing == true )
   //made if statment that uses that prints "Grab your bike or you skatboard" based on if you want to bike or if you want to skete
   {
     System.out.print(" dont grab your bike or you skatboard if your inside but if your outside grab them .");
   }else{
     System.out.print(" dont grab anything.");
     // else stament that tells you not to grab anything
        }
        System.out.print(" You should walk for ");
              while (timeFeelLikeWalking < 20)
{
   timeFeelLikeWalking++; 
}
System.out.print(timeFeelLikeWalking + " minutes. ");
     if ( dayNumberLastWalked != dayNumber - 1  )
   //made if statment that tells you to walk for an extra 10 minutes if you didnt walk yesterday.
     {
     System.out.print(" However, since you didnt walk yesterday Walk for an extra 10 minutes.");
     }else{
    System.out.println("");
     // else stament that prints nothing if you did exercise yesterday
     }
     System.out.print("You should also sprint for ");
        {
     for(int sprint = 1; sprint <= 3; sprint++)
     {
        System.out.print(sprint);
   }
   System.out.print("seconds.");
  }
 }
}
  