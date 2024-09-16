import java.util.Scanner;
public class Main{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in) ;
      System.out.print("Enter a animal");
      String pet = input.nextLine();
      System.out.print("Enter a parent ex: Mom or Dad ");
      String gaurdian = input.nextLine();
      System.out.print("Enter a name of building ");
      String noun3 = input.nextLine();
      System.out.print("Enter a number ");
      int homework = input.nextInt();
      System.out.print("Enter a number ");
      int days = input.nextInt();
      System.out.print("Enter a number of someones age ");
      int age = input.nextInt();
      System.out.print("How many brothers do you have ");
      int number = input.nextInt();
      System.out.print("Enter true or false ");
      boolean tf= input.nextBoolean();
      System.out.print("Enter your age ");
      int number1 = input.nextInt();
      System.out.print("Enter a decimal number ");
      double decimal_number = input.nextDouble();
      System.out.println("Today was the " + number + "th week of school. I was doing well until a " + pet + " attacked my " + gaurdian + ". This was a shock when I got home and gound. I had to rush to the " + noun3 + " The doctor then asked what is your " + gaurdian + " age and your age. I responded by saying my age was " + number1 + " and my " + gaurdian + " age was " + age +". The docter then measured my " + gaurdian + " and said there weight was " + decimal_number + "lb The docter asked us a couple of true false questions. I answer " + tf + " for all the questions. After that we left and went home. " + days + " days later everyone was fine. I now have to catch up on " + homework + " missing assignments from school."); 
      
}
    
}
