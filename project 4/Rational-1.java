public class Rational extends Number implements Comparable<Rational>{
private int num;
private int den;
   public Rational(int num, int den) {
      this.num= num;
      this.den= den;
      reduce();
   }
   @Override
   public int intValue() {
      return (int) doubleValue();
   }
   @Override
   public long longValue() {
      return (long) doubleValue();
   }
   @Override
   public float floatValue() {
      return (float) doubleValue();
   }
   @Override
   public double doubleValue() {
      return num/ (double) den;
   }
   private void reduce() {
      int gcd = gcd(num, den);
      this.num = num/gcd;
      this.den = den / gcd;
   }
   private static int gcd(int x, int y) {
      if (y == 0)
         return Math.abs(x);
      else
         return gcd(y, x % y);
    }
   public int compareTo(Rational z) {
      return Double.compare(num/(double)den,z.num/(double)z.den);
   }
   public boolean equals(Object z) {
      if(this==z)return true;
      Rational rational = (Rational) z;
      return num==rational.num&&den==rational.den;
    }



   public Rational add(Rational x) {
      return new Rational(num*x.den+ x.num*den,den*x.den);
   }
   private Rational conjugate() {
      return new Rational(den,num);
   }
   public Rational div(Rational x) {
     return new Rational(num*x.den,den*x.num);
   }
   public Rational mul(Rational x) {
     return new Rational(num*x.num,den*x.den);
   }
   public Rational sub(Rational x) {
      return new Rational(num*x.den-x.num*den,den*x.den);
   }
   public String toString() {
      return "(" + num + " / " + den + ")";
   }
}
