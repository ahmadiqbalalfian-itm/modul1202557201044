package tugaspl1;
//langsung pakai JOptionPane je lahh
import javax.swing.JOptionPane;
public class TugasPL1 {
    public static void main(String[] args) {
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
        System.out.println("Jumlah Keseluruhan adalah\t\t: " + total + "\nRata-Ratanya adalah\t\t\t: " + total / putaran);  
        
        /*ini taruh bawah biar ngga error prosesnyaa
        lanjut mencari posisi index dengan JOptionPane!
        keknya sih logikanya pakai looping ganfda kayak buat print*/
        String elemen = JOptionPane.showInputDialog("Masukkan elemen yang ingin diganti\t: ");
        int ganti= Integer.parseInt(elemen);        
        /*variabel untuk mengantisipasi indeks tidak ditemukan
        Kita manfaatkan variabel putaran, kita ganti 0 dulu
        setelah itu kita taruh di putaran kedua, and...
        masukkan ganti*/
        putaran=0;
        String indeks = "";
        for(int i=0;i<nilai.length;i++){
            for(int f=0;f<nilai[i].length;f++){
                if (nilai[i][f]==ganti){
                    indeks += "["+i+"]["+f+"], ";//ternyata bisa ygy, tak kra cuman angka aja yang bisa
                    putaran++;
                }
            }
        }
        if(putaran>1){//ini mengecek jika ada posisi yang ditemukan
            JOptionPane.showMessageDialog(null,"Elemen "+ganti+" berada pada indeks:\n"+indeks);
            //masukkan angka baru untuk pengganti
            String angka = JOptionPane.showInputDialog("Mau diganti dengan angka berapa?");
            int baru = Integer.parseInt(angka);
            
            //lanjut untuk mengganti elemennya, sementara gini sih, pakai looping ganda lagi
            for (int i = 0; i < nilai.length; i++) {
                for (int f = 0; f < nilai[i].length; f++) {
                    if (nilai[i][f] == ganti) {
                        nilai [i][f]=baru;
                    }
                }
            } 
            //nah kemudian memunculkan lagi tuh hasil yang baru
            for (int i = 0; i < nilai.length; i++) {
                for (int f = 0; f < nilai[i].length; f++) {
                    System.out.print(nilai[i][f]+" ");
                }
                System.out.print("\n");
            } 
        } else{
            JOptionPane.showMessageDialog(null,"Elemen "+ganti+" tidak ditemukan pada Array","ELEMEN TIDAK DITEMUKAN", JOptionPane.ERROR_MESSAGE);
        }
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
        System.out.println("Jumlah indeks ganjil adalah\t\t: "+totalg);
    }
}