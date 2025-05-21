import java.util.*;
public class sMain{
   private static double x;
   private static double y;
      public sMain(){
      }
   public static boolean Distance(double x, double y){
      double dis= Math.sqrt(((x-0.5) * (x-0.5)) + ((y-0.5) * (y-0.5)));
      return (dis<0.5);
      }
   public static double evPie(int times){
      Random ran = new Random(System.currentTimeMillis());
      int Inside=0;
      double PI=0;
      for (int i = 1; i <= times; i++){ 
         double x = (ran.nextDouble());
         double y = (ran.nextDouble());    
         if (Distance(x, y)){
            Inside++; 
         }  
      }    
      PI = 4.0 *((double) Inside/times);
      return PI;
      }
      }
class Testmain{
   public static void main (String[] args){
      Scanner sc = new Scanner (System.in);
      System.out.println("#: ");
      int times = sc.nextInt();
      sMain test= new sMain();
      System.out.println("pi approx to= "+ test.evPie(times));
      }
      }
