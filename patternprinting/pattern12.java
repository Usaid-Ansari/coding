public class pattern12 {
    public static void main(String[] args) {
        Traingle(9);
    }

    static void Traingle(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int space = n; space > i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}