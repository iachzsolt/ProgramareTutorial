package ObiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TelefonTest {

    @Test
    public void MetodaTest(){
        //Facem primul obiect de tipul telefon

        List <String> CaracteristiciSamsung = Arrays.asList("Ecran: 2px", "Procesor: Snapdragon 860", "Ram: 4GB");
        Telefon Samsung = new Telefon("Samsung", "Galaxy S22", 2021, "Android", CaracteristiciSamsung);
        Samsung.VechimeTelefon();
        Samsung.DiscountTelefon(15.0);

        List <String> CaracteristiciIphone = Arrays.asList("Ecran: 2px", "Procesor: Apple", "Ram: 3GB", "Spatiu de stocare: 64GB");
        Telefon Iphone = new Telefon("Iphone", "7", 2016, "IOS", CaracteristiciIphone);
        Iphone.VechimeTelefon();
        Iphone.PretTelefon();

        List <String> CaracteristiciHuawei = Arrays.asList("Ecran: 2px", "Procesor: Huawei", "Ram: 8GB", "Spatiu de stocare: 128GB");
        Telefon Huawei = new Telefon("Huawei", "P20", 2012, "Android", CaracteristiciIphone, 2055.5);
        Huawei.VechimeTelefon();
        Huawei.PretTelefon();
        Huawei.DiscountTelefon(10.0);
    }
}
