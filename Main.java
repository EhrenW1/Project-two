class Main {
  public static void main(String[] args) {
 int time = 1400;
 int tempurature = 80;
 boolean fealLikeBikeing = true;
 boolean fealLikeSkateing = true; 
 boolean sunny = true;
 boolean rainy = false;
 boolean tired = false;
 boolean walking = false;
 // Inserted variables for later
 // these variables include time, tenourature, if its sunny,rainy, and if your walking or biking.
   if (tempurature < 90 && sunny == true)
   //made if statment for id birthday is eaqual to todays date
   {
     System.out.print("Go out side and");
     //wrote line of code that tells you to go outside if its sunny and below 90
    }else{
     System.out.print("Stay inside");
     // else stament that tells you to stay inside if if statment values dont match
   }
      if (fealLikeBikeing == true || fealLikeSkateing == true )
   //made if statment that uses that prints "Grab your bike or you skatboard" based on if you want to bike or if you want to skete
   {
     System.out.print(" grab your bike or you skatboard.");
     }else{
     System.out.print(" dont grab anything.");
     // else stament that tells you not to grab anything
   }
   }
  }