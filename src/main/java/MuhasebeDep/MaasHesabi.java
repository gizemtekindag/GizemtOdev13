package MuhasebeDep;

public class MaasHesabi {
    public int hesaplama(Personel i) {

        int sonuc= i.calistigiGun>25 ? (i.calistigiGun*100)+((i.calistigiGun-25)*1000) : (i.calistigiGun*100);
        return sonuc;

    }






    }
