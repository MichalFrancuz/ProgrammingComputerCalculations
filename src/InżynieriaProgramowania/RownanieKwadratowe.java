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
        System.out.println(Delta.OblicznieDelty(a,b,c));
        if(a==0)RownanieLiniowe(b,c);
        else{

            if(Delta.OblicznieDelty(a,b,c)<0){
                int liczbaPier=0;
                System.out.println("Brak rozwiązan.");
            }
            else if(Delta.OblicznieDelty(a,b,c)==0){
                int liczbaPier=1;
                double x;
                x=-b/(2*a);
                System.out.print("Jedno podwójne rozwiązanie x="+x+" .");
            } else{
                int liczbaPier=2;
                double x1,x2;
                x1=(-b+sqrt(Delta.OblicznieDelty(a,b,c)))/(2*a);
                x2=(-b-sqrt(Delta.OblicznieDelty(a,b,c)))/(2*a);
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
class Delta{
    static double OblicznieDelty(double a, double b, double c){
        double delta=b*b-4*a*c;
        int pierwiastki;
        if(delta>0)pierwiastki=2;
        if(delta==0)pierwiastki=1;
        if(delta<0)pierwiastki=0;
        return delta;
    }
}
//powiazanie delty ze zmiennymi do obliczenia wynikow pierwiastkow z testem array. Jakby klasa robocza wyluskajaca w zmiennej liczbe pierwiastkow w zaleznosci od
//pobranych zmiennych od uzytkownika do obliczenia tych pierwiatkow, dzieki temu bede mial klase zalezana ktora wyluska potrzebne informacje do testow.
