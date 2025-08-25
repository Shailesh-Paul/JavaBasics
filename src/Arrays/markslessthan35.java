package Arrays;

public class markslessthan35 {
    public static void main(String[] args) {
        int marks[]={10,20,30,40,50};
        int n=marks.length;
        for(int i=0;i<n-1;i++){
            if(marks[i]<35){
                System.out.println(i);
            }
        }
    }
}
