public class App {
    public static void main(String[] args) throws Exception {
        // Membuat biodata diri dengan menggunakan println(),print()printf()
        String nama= "iyan";
        int umur= 18;
        String alamat = "pamboang";
        String prodi= "teknik  informatika";

        // Membuat biodata diri dengan menggunakan println()
        System.out.println (nama);
        System.out.println(umur);
        System.out.println(alamat);
        System.out.println(prodi);

        //Membuat biodata diri dengan menggunakan print()
        System.out.print(nama);
        System.out.print(umur);
        System.out.print(alamat);
        System.out.print(prodi);

        //Membuat biodata diri dengan menggunakan printf()
        System.out.printf("Nama: %s%n", nama);
        System.out.printf("Umur: %d%n", umur);
        System.out.printf("Alamat: %s%n", alamat);
        System.out.printf("Prodi: %s%n", prodi);
        
     }
}
