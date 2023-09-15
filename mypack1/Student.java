package mypack1;

public class Student {
    private int roll;
    private String name;
    private String Fname;
    private String Mname;
    private String course;
    private String branch;
    private String sem;
    private String year;
    private int p;
    private int c;
    private int m;
    private int e;
    private int h;
    
    
    public Student(int roll, String name, String Fname, String Mname, String course, String branch, String sem, String year, int p, int c,int m,int e,int h)    {
          this.roll=roll;
          this.name=name;
          this.Fname=Fname;
          this.Mname=Mname;
          this.course=course;
          this.branch=branch;
          this.sem=sem;
          this.year=year;
          this.p=p;
          this.c=c;
          this.m=m;
          this.e=e;
          this.h=h;

    }

    public int getRoll()
    {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll=roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFName() {
        return Fname;
    }
    public void setFName(String Fname) {
        this.Fname=Fname;
    }

    public String getMName() {
        return Mname;
    }

    public void setMName(String Mname) {
        this.Mname = Mname;
    }

    public String getCourse() {
        return course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch){
        this.branch=branch;
    }
    
    public String getSem() {
        return sem;
    }

    public void setSem(String sem){
        this.sem=sem;
    }
    
    public String getYear(){
        return year;
    }
    
    public void setYear(String year){
        this.year=year;
    }
    
    public int getP(){
        return p;
    } 

    public void setP(int p){
        this.p=p;
    }

     public int getC(){
        return c;
    } 

    public void setC(int c){
        this.c=c;
    }

     public int getM(){
        return m;
    } 

    public void setM(int m){
        this.m=m;
    }

     public int getE(){
        return e;
    } 

    public void setE(int e){
        this.e=e;
    }

     public int getH(){
        return h;
    } 

    public void setH(int h){
        this.h=h;
    }
   
}