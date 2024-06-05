package MuhasebeDep;

public class MaasHesabi {
    public static void main(String[] args) {

        hesaplama(25);
    }

    private static void hesaplama(int calisilanGun) {
        int gunlukUcret=100;
        int extraGunlukPrim=1000;
        int primEsigi=25;
        int calisilanAydakiGunSayisi=30;
        //hocam bir ay 30 gün de olabilir, 31 gün de, 28 gün de olabilir.

        if (calisilanAydakiGunSayisi>=calisilanGun){
            int sonuc= calisilanGun>primEsigi ? (calisilanGun*gunlukUcret)+((calisilanGun-primEsigi)*extraGunlukPrim) : (calisilanGun*gunlukUcret);
            System.out.println(sonuc);
        }else {
            System.out.println("Çalışılan aydaki gün sayısı çalışılan günden büyük olamaz.");
        }



        }




    }
