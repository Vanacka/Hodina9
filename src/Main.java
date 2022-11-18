import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        File f = new File("z:/");
        //prida do pole Polozky jen typu JedenSoubor
        ArrayList<JedenSoubor> arr = new ArrayList<>();

        // prida z urciteho souboru polozky/soubory do arraylistu
        for (String jmeno : f.list()) {
            arr.add(new JedenSoubor(jmeno));
        }

        //seradi polozky v arraylistu
        Collections.sort(arr);

        //vypise arraylist ve kterem jsou zapsane
        // vsechny "nazvy polozek" z naseho souboru
        for (JedenSoubor j : arr) {
            System.out.println((j.jmeno));
        }
    }
}