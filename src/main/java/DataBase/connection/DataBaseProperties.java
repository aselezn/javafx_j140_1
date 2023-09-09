package DataBase.connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataBaseProperties extends Properties {

    private static DataBaseProperties dbp;
    private DataBaseProperties() {
        try (InputStream input = new FileInputStream("resources/application.properties")) {
            load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DataBaseProperties get() {
        if (dbp == null) {
            dbp = new DataBaseProperties();
        }
        return dbp;
    }
}
