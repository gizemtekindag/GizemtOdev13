package com.example;

import MuhasebeDep.Departmant;
import MuhasebeDep.MaasHesabi;
import MuhasebeDep.Personel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MuhasebeTest {
    @Test
    public void testMaasHesapla(){
    Departmant dep1 = new Departmant("dep1");
    Personel p1 = new Personel("Gizem","Gunal",dep1,28);
        MaasHesabi m = new MaasHesabi();
    int beklenenMaas= (25*100)+(3*1000);
    int gercekMaas= m.hesaplama(p1);

        Assert.assertEquals(gercekMaas,beklenenMaas, "Maaş hesabı doğru değil.");

    }

    @DataProvider(name = "personelData")
    public Object[][] personelData(){
        Departmant dep1 = new Departmant("dep1");
        Departmant dep2= new Departmant("dep2");

        return new Object[][]{
                {new Personel("Gokhan","Gunal",dep2,30)},
                {new Personel("Kubra","Kose",dep1,29)},
                {new Personel("Berat","Ak",dep1,20)},
                {new Personel("Ensar","Sarı",dep1,23)},
        };
    }

    @Test(dataProvider = "personelData")
    public void testwithDataProvider(Personel p, int beklenenMaas ){
        MaasHesabi m = new MaasHesabi();
        int gercekMaas = m.hesaplama(p);
        Assert.assertEquals(gercekMaas,beklenenMaas, "Maaş hesaplaması doğru değil");
    }

}
