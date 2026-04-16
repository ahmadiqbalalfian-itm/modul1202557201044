package tugaspl1;
//kita pakai Scanne dulu, nanti baru ganti JOptionPane yaww
import java.util.Scanner;
public class TugasPL1 {
    public static void main(String[] args) {
        Scanner fira = new Scanner(System.in);
        int nilai[][] = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        //variabel untuk menyimpan total semua elemen dalam array nilai
        double total = 0; //kuncinya
        //variabel untuk menghitung jumlah angka/elemen array
        int putaran = 0; //the key
        //looping untuk memunculkan elemen array
        for (int a = 0; a < nilai.length; a++) {
            for (int b = 0; b < nilai[a].length; b++) {
                //menampilkan seluruh elemen
                
                System.out.print(nilai[a][b]+" ");
                //menjumlahkan semua elemen
                total += nilai[a][b];
                //menghitung banyaknya elemen
                putaran++;
            }
            System.out.print("\n");            
        }
        System.out.println("Jumlah Keseluruhan adalah\t: " + total + "\nRata-Ratanya adalah\t\t: " + total / putaran);
        
        /*menjumlahkan semua eleemnt yang mempunyai indeks ganjil
        Q apakah ngoding bareng bisa dilakukan realtime seperti canva, spreadsheet, doc dll?*/
        double totalg =0;
        for (int a = 0; a < nilai.length; a++) {
            for (int b = 0; b < nilai[a].length; b++) {
                //menjumlahkan elemen indeks ganjil
                if (b%2==1){
                    totalg += nilai[a][b];
                }
            }
        }
        System.out.println("Jumlah indeks ganjil adalah\t: "+totalg);  
        
        /*ini taruh bawah biar ngga error prosesnyaa
        lanjut mencari posisi index dengan JOptionPane!
        Kita masukkan pakai Scanner dulu
        keknya sih logikanya pakai looping ganfda kayak buat print*/
        System.out.println("Jika ada angka yang ingin diganti, masukkan satu angka\t:");
        int ganti = firanext.Int;
        
        

    }
}