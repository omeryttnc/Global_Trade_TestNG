package Emrullah.Tests.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReaderE {
    //create a properties instance. Data

    private static Properties properties;

    static {
        String path = "emrullah.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Create a method to Read
    //This method will get the KEY and return the VALUE
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
    public static void main(String []args){
        System.out.println(properties.getProperty("url"));
    }
}

