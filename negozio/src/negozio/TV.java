package negozio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TV {
    private static final Logger logger = Logger.getLogger(TV.class.getName());
    private int canale;

    public void setCanale(int canale) {
        this.canale = canale;
    }

    public void stampaCanale() {
        try {
            File file = new File("log.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Canale: " + canale);
            bufferedWriter.newLine();
            bufferedWriter.close();
            logger.log(Level.INFO, "Nuovo canale impostato: {0}", canale);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Errore durante l'apertura del file di log", e);
        }
    }
}

