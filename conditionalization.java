import java.util.Scanner;

public class conditionalization {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        //int nilai;
        

        //System.out.println("Masukkan nilai= ");
        //nilai = ns.nextInt();

        //if (nilai != 90) {
        //    System.out.println("Lulus");
            
        //} else {
        //    System.out.println("tidak lulus");
        //}

        int nilaiMTK;
        int nilaiInggris;
        int nilaiFisika;

        System.out.println("Mauskkan nilai MTK= ");
        nilaiMTK = ns.nextInt();

        System.out.println("Mauskkan nilai Inggris= ");
        nilaiInggris = ns.nextInt();

        System.out.println("Mauskkan nilai Fisika= ");
        nilaiFisika = ns.nextInt();

        if (nilaiMTK == 75 && nilaiInggris != 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak lulus lulus");
        }

        if (nilaiInggris > 90 || nilaiFisika < 75) {
            System.out.println("Cerdas");
        } else {
            System.out.println("KURANG belAJAR");
        }
        ns.close();
    }
}
