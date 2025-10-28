import java.util.Scanner;

public class operasiSegitiga{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        //Deklarasi nilai dan rumus
        double alas;
        double sisiMiring1;
        double sisiMiring2;
        double tinggi;
        double luasSegitiga;
        double kelilingSegitiga;

        System.out.print("masukkan alas= ");
        alas= myObj.nextDouble();

        System.out.print("masukkan tinggi= ");
        tinggi= myObj.nextDouble();

        System.out.print("masukkan sisi2= ");
        sisiMiring1= myObj.nextDouble();

        System.out.print("masukkan sisi3= ");
        sisiMiring2= myObj.nextDouble();

        //Compute Luas
        luasSegitiga = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga:" + luasSegitiga);

        //Compute Keliling
        kelilingSegitiga = alas + sisiMiring1 + sisiMiring2;
        System.out.println("keliling Segitiga:" + kelilingSegitiga);
        myObj.close();

        
    }
}

