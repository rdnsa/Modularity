public class Main {
    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 5;

        int hasil = MathOperations.jumlah(angka1, angka2);
        int selisih = MathOperations.perbedaan(angka1, angka2);

        System.out.println("hasil dari angka1 dan angka2: " + hasil);
        System.out.println("selisih dari angka1 dan angka2: " + selisih);
    }
}
