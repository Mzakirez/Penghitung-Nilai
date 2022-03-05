import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        String lagi = "Y";
        while(lagi.equals("Y"))
        {

    Scanner inp = new Scanner (System.in);
        System.out.print("Masukkan Nilai Teori");
        int teori = inp.nextInt();
        System.out.println("NILAI TEORI : " + teori);
        System.out.println("Masukkan Nilai Praktek");
        int praktek = inp.nextInt();
        System.out.println("NILAI PRAKTEK : " + praktek);
    
        int ratarata = (teori+praktek)/2;
        System.out.println("RATA-RATA NILAI: " + ratarata);
        
        if (ratarata > 80){
            System.out.println("SKOR TERAKHIR ANDA ADALAH A");
        
        }
        else if (ratarata > 60){
            System.out.println("SKOR TERAKHIR ANDA ADALAH B");
        }
        else if (ratarata > 40){
            System.out.println("SKOR TERAKHIR ANDA ADALAH C");
        }
        else if(ratarata < 20){
            System.out.println("SKOR TERAKHIR ANDA ADALAH D");
        }
        System.out.println("Ulangi?");
        Scanner x  = new Scanner(System.in);
        lagi = x.nextLine().toUpperCase();
        }
    }
}
