// NIM : 13020200268
//NAMA : Nuhaeda
// HARI/TANGGAL :Senin, 21 Maret 2022
// WAKTU : 04.59 PM

import java.util.Scanner;
public class waktu { 
public static void main(String[] args) {

int detikSekarang, menitSekarang, jamSekarang;
Scanner input = new Scanner(System.in); 
int totaljam, totalmenit, totaldetik; 
System.out.print("Berapa total detik yang ingin anda konversikan : ");
 totaldetik = input.nextInt(); 

detikSekarang = totaldetik%60;
totalmenit    = totaldetik/60;
menitSekarang = totalmenit%60; 
totaljam      = totalmenit/60;
jamSekarang   = totaljam%24; 
System.out.println("Konversi dari : "+totaldetik+" detik, Adalah : "); 
System.out.println(totaljam+" jam, "+totalmenit+" menit, "+totaldetik+" detik");
System.out.println("Jam saat ini :"+jamSekarang+", Menit saat ini :" +menitSekarang+ ", Detik Saat Ini:"+detikSekarang);
 }
 }