import java.util.Scanner;
import mypack1.Student;
import mypack1.StudentProcessor;

 class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentProcessor processor = new StudentProcessor();

        System.out.println("Enter how many values you want to enter");
        
        int n=scanner.nextInt();

        Student[] std = new Student[n];
        
        processor.Input(std);
        
        processor.processStudents(std);
    }
}
