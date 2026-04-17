public class tugas2 {
    public static void main(String[] args) {
        String data[][] = {{"NAMA", "ALAMAT", "\tTELEPON"},
                            {"ABDUL", "Kediri", "\t085646668991"},
                            {"KUSNO", "Trenggalek", "085646668992"},
                            {"PONIRAN", "Bojonegoro", "085646668999"}};
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b] + "\t\t");
            }
            System.out.print("\n");
        }
    }
}