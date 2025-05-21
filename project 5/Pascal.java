class Pascal {
   public static int[] triangle(int n) {
      if (n == 1) {
         return new int[] { 1 }; } 
      else {
            int[] x = triangle(n - 1);
            int[] y = new int[n];
            y[0] = 1;
            y[n - 1] = 1;

            for (int i = 1; i < n - 1; i++) {
                y[i] = x[i - 1] + x[i];
            }

            return y;
        }
    }
}

