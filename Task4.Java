import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        int comp = new Scanner(System.in).nextInt();
        int [] sqrtwo = new int [31];
        boolean coll = false;
        for (int i = 0; i < sqrtwo.length; i++) {
            sqrtwo[i] = (int) Math.pow (2, i);

            if(comp == sqrtwo[i]){
                coll = true;
            }
        }
        System.out.println(coll);
    }
}
