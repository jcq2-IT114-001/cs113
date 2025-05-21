import java.util.*;
public class Main{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.print("enter number: ");
      int x = scanner.nextInt();
      int[] array = new int[x + 1];
      Arrays.fill(array, 1);
      sieve(array);
      System.out.println("Prime numbers between 1-" + x + ":");
      display(array);
      System.out.println("Even numbers from 4-" + x + " and the two prime numbers that sum up to them:");
      goldbach(array, x);
   }
   private static void sieve(int[] array){
      int x = array.length - 1;
      array[0] = 0;
      array[1] = 0;
      for (int i = 2; i * i <= x; i++){
         if (array[i] == 1){
            for (int j = i * i; j <= x; j += i){
               array[j] = 0;
            }
         }
      }
   }
   private static void display(int[] array){
      for (int i = 0; i < array.length; i++){
         if (array[i] == 1) {
            System.out.print(i + " ");
         }
      }
      System.out.println();
   }
   private static void goldbach(int[] primes, int x){
      for (int i = 4; i <= x; i += 2){
         System.out.print(i + ":\t");
         findPrimes(i, primes);
      }
   }
   private static void findPrimes(int number, int[] primes){
      for (int i = 2; i <= number / 2; i++){
         if (primes[i] == 1 && primes[number - i] == 1){
            System.out.println(i + " " + (number - i));
            return;
         }
      }
   }
}
