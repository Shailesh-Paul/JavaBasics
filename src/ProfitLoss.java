import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the cost price of item");
        int cp= scanner.nextInt();

        System.out.println("Enter the selling price" );
        int sp= scanner.nextInt();

        if(sp>cp){
            System.out.println("Profit"+ (sp-cp));
        }else   if (cp>sp) {
            System.out.println("Loss"+ (cp-sp));

        }  if (cp==sp) {
            System.out.println("Neither Profit Nor Loss");
        }

    }
}
