import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Zelf {

    public String result = String.valueOf(RandomNummer());

    public int RandomNummer() {
        Random rand = new Random();
        return (rand.nextInt(1,2)*10);
    }

    public boolean JaOfNee(String letter) {
        String string = "Hallo";
        return string.contains(letter);
    }

    public int Square(int nummer) {
        return (int) Math.round(Math.pow(nummer, 2));
    }

    public String WoordFlip(String woord) {
        String achterstevoren = "";
        for (int i=woord.length()-1; i>=0; i--){
            achterstevoren += woord.charAt(i);
        }
        return achterstevoren;
    }

    public String NummerFlip(){
        return WoordFlip(result);
    }
}
