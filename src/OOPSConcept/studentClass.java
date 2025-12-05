package OOPSConcept;

public class studentClass {
    public static class Student{
//        Creating a new data type

        String name;
        int rlno;
        double percent;


    }


    public static void main(String[] args) {
            Student x= new Student();
            x.name="Raghav";
            x.name="Shailesh";
            x.rlno= 116;
            x.percent=98.2;

//            printing details of student
        System.out.println(x.name + x.percent +x.rlno);

        Student s=new Student();
    }
}
