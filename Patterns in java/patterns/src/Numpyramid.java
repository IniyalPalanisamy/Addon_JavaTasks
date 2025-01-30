public class Numpyramid {
    public static void main(String[] args) {
        int n = 5;  

        for (int i = 0; i < n; i++) {
            
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            
            for (int j = 1; j <= 2 * i + 1; j++) {
             
                if (j <= i + 1) {
                    System.out.print(j);
                } else {
                    System.out.print(2 * i + 2 - j);
                }
            }

            System.out.println();
        }
    }
}
