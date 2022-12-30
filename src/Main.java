import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] pele = new int[25];
        for (int i = 0; i < pele.length; i++) {
            pele[i] = random.nextInt(40 - 18) + 18;
            System.out.print(pele[i] + " ");


        }
        System.out.println();
       int[] ronaldo = new int[25];
       for (int i= 0; i < ronaldo.length; i++){
           ronaldo[i] = random.nextInt(40 -18) + 18;
           System.out.print(ronaldo[i] + " ");


        }
        System.out.println();
       int averageage = 0;
       for ( int i = 0; i < pele.length; i++){
           averageage += pele[i];
       }
        System.out.println();
       int averageage2 = 0;
       for ( int i = 0; i < ronaldo.length; i++){
           averageage2 += ronaldo[i];
       }
        System.out.println("averageage of the pele team" + " " +(double) averageage/ pele.length);

        System.out.println(" averageage of the ronaldo team" + " " + (double) averageage2/ ronaldo.length);


    }


}




