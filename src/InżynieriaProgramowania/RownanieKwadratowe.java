package InżynieriaProgramowania;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class RownanieKwadratowe{
    public static void main(String[]args){
        double a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.print("a=");
        a=scan.nextFloat();
        System.out.print("b=");
        b=scan.nextFloat();
        System.out.print("c=");
        c=scan.nextFloat();
        if(a==0)RownanieLiniowe(b,c);
        else{
            double delta;
            delta=b*b-4*a*c;
            if(delta<0)System.out.println("Brak rozwiązan.");
            else if(delta==0){
                double x;
                x=-b/(2*a);
                System.out.print("Jedno podwójne rozwiązanie x="+x+" .");
            } else{
                double x1,x2;
                x1=(-b+sqrt(delta))/(2*a);
                x2=(-b-sqrt(delta))/(2*a);
                System.out.println("x1="+x1+"  x2="+x2+" .");
            }
        }
    }
        static void RownanieLiniowe(double a,double b){
            if(a==0){
                if(b==0)System.out.println("Rownaie tozsamosciowe.");
                else System.out.println("Rownanie sprzeczne.");
            }
            else{
                double x;
                x=-b/a;
                System.out.print("Równanie liniowe, x="+x+" .");
            }
    }
}
