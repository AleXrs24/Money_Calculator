package mock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Currency;
import model.ExchangeRate;

public class ExchangeRateLoader implements persistence.ExchangeRateLoader{
    private FileReader reader;
    private String line = "";
    private String[] aux = new String[2];
    private double inRate;
    private double outRate;
    
    @Override
    public ExchangeRate load(Currency in, Currency out) {
        try {
            reader = new FileReader("C:\\Users\\aaleXrs24\\Desktop\\list.csv");
            BufferedReader br = new BufferedReader(reader);
            line = br.readLine();
            while(line != null){
                aux = line.split(";");
                
                if(aux[0].equals(in.getName())){
                    inRate = Double.parseDouble(aux[1]);
                }
                if(aux[0].equals(out.getName())){
                    outRate = Double.parseDouble(aux[1]);
                }
                line = br.readLine();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ExchangeRateLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ExchangeRate(in, out, inRate/outRate);
    }   
}