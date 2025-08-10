import java.util.Scanner;

public class USERINPUT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();


        System.out.println("What is your gpa: ");
        double gpa = scanner.nextDouble();
        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);

        if(isStudent){
            System.out.println("You are enrolled in classes");
        }
        else{
            System.out.println("You are NOT enrolled in classes");
        }

        scanner.close();
    }
}


//public class RectangleArea {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter width: ");
//        double width = scanner.nextDouble();
//
//        System.out.print("Enter height: ");
//        double height = scanner.nextDouble();
//
//        double area = width * height;
//        System.out.println("Area: " + area + " cm²");
//
//        scanner.close();
//    }
//}


