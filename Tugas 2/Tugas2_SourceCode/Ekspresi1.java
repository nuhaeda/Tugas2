// NIM : 13020200268
//NAMA : Nuhaeda
// HARI/TANGGAL :Senin, 21 Maret 2022
// WAKTU : 04.04 PM

/* pembagian integer, casting */
public class Ekspresi1 {

public static void main(String[] args) {

int x = 1; int y = 2; float fx; float fy;

/* ALGORITMA */
System.out.print ("x/y (format integer) = "+ x/y);
System.out.print ("\nx/y (format float) = "+ x/y);

/* supaya hasilnya tidak nol */
fx=x;
fy=y;
System.out.print ("\nx/y (format integer) = "+ fx/fy);
System.out.print ("\nx/y (format float) = "+ fx/fy);

/* casting */
System.out.print ("\nfloat(x)/float(y) (format integer) = "+
(float)x/(float)y);
System.out.print ("\nfloat(x)/float(y) (format float) = "+
(float)x/(float)y);

x = 10; y = 3;
System.out.print ("\nx/y (format integer) = "+ x/y);
System.out.print ("\nx/y (format float) = "+ x/y);
}
}