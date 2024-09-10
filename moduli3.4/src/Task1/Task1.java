package Task1;
import java.net.*;
import java.io.*;

public class Task1 {
    public static void main(String[] args) {

        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }


        try{
            boolean header = true;
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);
            String line;
            float summa = 0;
            int arvot = 0;

            while ((line = reader.readLine()) != null) {
                if (header) {
                    header = false;
                } else {
                    String[] columns = line.split(";");
                    String paivamaara = columns[0].split(" ")[0];
                    if(paivamaara.equals("01.01.2023")){
                        String value = columns[1].replace(",", ".");
                        float temp = Float.parseFloat(value);
                        summa += temp;
                        arvot++;
                    }
                }
            }
            System.out.println("Lämpötilan keskiarvo on " + summa/arvot);


        } catch (IOException e) {
            System.err.println(e);
        }
    }
}