package Strings;

public class passingStringToMethod {
    public static void change(String x){
        x="Shail";
    }

//    pass by values;

    public static void main(String[] args) {
        String x= "Shailesh";
        change(x);
        System.out.println(x);
    }
}
