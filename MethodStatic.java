public class MethodStatic {
    public static String nama = "KARINA FITRIWULANDARI ILHAM";
    
    public static void cetakNama(){
	System.out.println("NAMA :"+nama);
    }
    public static void cetakUmur(int umur){
        System.out.println("UMUR :"+umur+" tahun");
    }
    public static void main(String[] args){
        cetakNama();
        cetakUmur(19);         
    }
}
