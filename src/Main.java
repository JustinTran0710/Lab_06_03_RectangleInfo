import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        //Declarations
        int length = 0;
        int width = 0;
        String trash ="";
        double perimeter;
        double diagonal;

        System.out.print("What is the length?");
        if (in.hasNextInt())
        {
            length = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Your Input is invalid, Try again.");
            System.exit(0);
        }
        System.out.println("What is the width?");

        if (in.hasNextInt())
        {
            width = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Your Input is invalid, Try again.");
            System.exit(0);
        }

        perimeter = (length * 2) + (width * 2);
        diagonal = Math.sqrt((length*length) + (width*width));

        System.out.println("The Perimeter of your rectangle is "+perimeter);
        System.out.println("The diagonal of your right triangle is "+diagonal+" long");
    }


}