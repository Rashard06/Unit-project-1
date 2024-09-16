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
      String noun4 = input.nextLine();
      System.out.print("Enter a number ");
      String noun5 = input.nextLine();
      System.out.print("Enter a number ");
      String age = input.nextLine();
      System.out.print("How many brothers do you have ");
      int number = input.nextInt();
      System.out.print("Enter true or false ");
      boolean tf= input.nextBoolean();
      System.out.print("Enter a number ");
      int number1 = input.nextInt();
      System.out.print("Enter a decimal number ");
      double decimal_number = input.nextDouble();
      System.out.println("Today was the " + number + " week of school. I was doing well until my " + pet + "attacked my "+ gaurdian + " .This was a shock when I got home and gound. I had to rush to the " + noun3 + "The doctor then asked what is your " + gaurdian + "age and your age. I responded by stating my age as " + number1 + "and my" + gaurdian + " age as " + age + ". The docter then measured my " + gaurdian + "and said her weight was" + decimal_number + "The docter asked us a couple of true false questions "); 
      
}
    
}
