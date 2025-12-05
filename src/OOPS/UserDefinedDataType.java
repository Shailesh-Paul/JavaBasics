package OOPS;

import java.util.Scanner;

public class UserDefinedDataType {
    public static class Student{
        String  name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     Student s1= new Student();

     s1.name="Shailesh";
     s1.rno=116;
     s1.cgpa=8;


     Student s2=new Student();

     s2.name="Shailesh2";
     s2.rno=117;
     s2.cgpa=8.12;

        System.out.println();
    }
}
