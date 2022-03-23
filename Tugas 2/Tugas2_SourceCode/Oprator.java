// NIM : 13020200268
//NAMA : Nuhaeda
// HARI/TANGGAL :Senin, 21 Maret 2022
// WAKTU : 04.38 PM


/* Contoh pengoperasian variabel bertype dasar */
public class Oprator {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
boolean Bool1, Bool2, TF ; int i,j, hsl ;
float x,y,res;
/* algoritma */
System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");

Bool1 = true;
Bool2 = false;
TF = Bool1 && Bool2 ; /* Boolean AND */
System.out.print("\n TRUE/FALSE FOR BOOLEAN AND : "+TF);
TF = Bool1 || Bool2 ; /* Boolean OR */
System.out.print("\n TRUE/FALSE FOR BOOLEAN OR  : "+TF);
TF = ! Bool1 ; /* NOT */
System.out.print("\n TRUE/FALSE FOR BOOLEAN NOT : "+TF);
TF = Bool1 ^Bool2; /* XOR */
System.out.print("\n TRUE/FALSE FOR BOOLEAN XOR : "+TF);

System.out.print("\n operasi numerik");
i = 5; 
j = 2 ;
hsl = i+j; 
System.out.print("\n Hasil : "+hsl);
hsl = i - j;
System.out.print("\n Hasil : "+hsl);
hsl = i / j;
System.out.print("\n Hasil : "+hsl);
hsl = i * j;
System.out.print("\n Hasil : "+hsl);
hsl = i /j ; /* pembagian bulat */
System.out.print("\n Hasil : "+hsl);
hsl = i%j ; /* sisa. modulo */
System.out.print("\n Hasil : "+hsl);

System.out.print("\n operasi numerik");
x = 5 ;
y = 5 ;
res = x + y;
System.out.print("\n RESULT : "+res);
res = x - y; 
System.out.print("\n RESULT: "+res);
res = x / y; 
System.out.print("\n RESULT : "+res);
res = x *y;
System.out.print("\n HRESULT : \t"+res);

System.out.print("\n operasi relasional numerik");
TF = (i==j); 
System.out.print("\n TRUE/FALSE : "+TF);
TF = (i!=j);
System.out.print("\n TRUE/FALSE : "+TF);
TF = (i < j); 
System.out.print("\n TRUE/FALSE : "+TF);
TF = (i > j); 
System.out.print("\n TRUE/FALSE : "+TF);
TF = (i <= j); 
System.out.print("\n TRUE/FALSE : "+TF);
TF =(i >= j);
System.out.print("\n TRUE/FALSE : \t"+TF);

System.out.print("\n operasi relasional numerik"); 
TF = (x != y);
System.out.print("\n TRUE/FALSE : "+TF);
TF = (x < y); 
System.out.print("\n TRUE/FALSE : "+TF);
TF = (x > y); 
System.out.print("\n TRUE/FALSE : "+TF);
TF = (x <= y); 
System.out.print("\n TRUE/FALSE : "+TF);
TF = (x >= y);
System.out.print("\n TRUE/FALSE : "+TF);
}
}