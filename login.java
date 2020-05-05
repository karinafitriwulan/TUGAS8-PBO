public class login{
String nama;
String nim;
void isiData ( String nama,String nim) {

this.nama=nama;
this.nim=nim;

}
public static void main ( String [ ] args){

login mahasiswa = new login ( );
mahasiswa.isiData ("KARINA","0137");
System.out.println( "Nama : "+ mahasiswa.nama);
System.out.println( "Nim : " + mahasiswa.nim);

}

}
