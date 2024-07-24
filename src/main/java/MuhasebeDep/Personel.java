package MuhasebeDep;

public class Personel {

    public String ad;
    public String soyad;
    public Departmant departman;
    int calistigiGun;

    public Personel(String ad, String soyad, Departmant departman, int calistigiGun){
        this.ad= ad;
        this.soyad= soyad;
        this.departman= departman;
        this.calistigiGun = calistigiGun;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getCalistigiGun() {
        return calistigiGun;
    }

    public void setCalistigiGun(int calistigiGun) {
        this.calistigiGun = calistigiGun;
    }

    public Departmant getDepartman() {
        return departman;
    }

    public void setDepartman(Departmant departman) {
        this.departman = departman;
    }
}
