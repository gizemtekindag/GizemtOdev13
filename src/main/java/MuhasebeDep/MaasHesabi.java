package MuhasebeDep;

public class MaasHesabi {
    public static void main(String[] args) {

        Employee gizem = new Employee();
        gizem.calistigiGun=25;
        gizem.name="Gizem;";
        
        hesaplama(gizem);

        
    }

    private static void hesaplama(Employee i) {
        int gunlukUcret=100;
        int extraGunlukPrim=1000;
        int primEsigi=25;
        int calisilanAydakiGunSayisi=30;
        //hocam bir ay 30 gün de olabilir, 31 gün de, 28 gün de olabilir.

        if (calisilanAydakiGunSayisi>=i.calistigiGun){
            int sonuc= i.calistigiGun>primEsigi ? (i.calistigiGun*gunlukUcret)+((i.calistigiGun-primEsigi)*extraGunlukPrim) : (i.calistigiGun*gunlukUcret);
            System.out.println(sonuc);
        }else {
            System.out.println("Çalışılan aydaki gün sayısı çalışılan günden büyük olamaz.");
        }



        }




    }
