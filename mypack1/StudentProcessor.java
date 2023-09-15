package mypack1;

import java.util.Scanner;

public class StudentProcessor {

    Scanner scanner=new Scanner(System.in);
    
    public void processStudents(Student[] std) {
        
        
        for (Student ob : std) {
            System.out.println("___________________________________________________________________________________________");
            System.out.println("                                       DAVV-INDORE                                         ");
            System.out.println("                                                                                           ");
            System.out.println("  Roll no.: " + ob.getRoll() +"    \t  \t  \t  \t  \t       "+"Course  : " + ob.getCourse() );
            System.out.println("  Name    : " + ob.getName() +"    \t  \t  \t  \t  \t       "+"Branch  : " + ob.getBranch() );
            System.out.println("  FName   : " + ob.getFName()+"    \t  \t  \t  \t  \t       "+"Semester: " + ob.getSem()    );
            System.out.println("  MName   : " + ob.getMName()+"    \t  \t  \t  \t  \t       "+"Year    : " + ob.getYear()   );
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("  Sub-Code          Sub-Name          Min-Marks          Max-Marks          Obtain-Marks   ");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("  cse-501           Physics              33                70                 "+ ob.getP()  );
            System.out.println("  cse-502           Chemistry            33                70                 "+ ob.getC()  );
            System.out.println("  cse-503           Maths                33                70                 "+ ob.getM()  );
            System.out.println("  cse-504           English              33                70                 "+ ob.getE()  );
            System.out.println("  cse-505           Hindi                33                70                 "+ ob.getH()  );
            System.out.println("___________________________________________________________________________________________");        
            
        }
    }
    public void Input(Student[] std) {

         for (int i = 0; i < std.length; i++) {
            System.out.println("Enter details for Students " + (i + 1) + ":");

            System.out.print("Roll: ");
            int roll=scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Father name: ");
            String Fname = scanner.nextLine();
            
            System.out.print("Mother name: ");
            String Mname = scanner.nextLine();
            
            System.out.print("Course: ");
            String course = scanner.nextLine();

            System.out.print("Branch: ");
            String branch = scanner.nextLine();

            System.out.print("Semester: ");
            String sem =scanner.nextLine();

            System.out.println("Year: ");
            String year=scanner.nextLine();

            System.out.print("Physics: ");
            int p=scanner.nextInt(); 

            System.out.print("Chemistry: ");
            int c=scanner.nextInt();

            System.out.print("Maths: ");
            int m=scanner.nextInt(); 

            System.out.print("English: ");
            int e=scanner.nextInt();

            System.out.print("Hindi: ");
            int h=scanner.nextInt();       

            std[i] = new Student(roll, name, Fname, Mname, course, branch, sem, year, p, c, m, e, h);
        }
        
    }
}