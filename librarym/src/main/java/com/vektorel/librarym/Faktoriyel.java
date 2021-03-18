package com.vektorel.librarym;

public class Faktoriyel {
    public static int faktoriyel_hesapla(int sayi){
        int sonuc=1;
        for(int i=1;i<=sayi;i++){
            sonuc*=i;
        }
        return sonuc;
    }
}
