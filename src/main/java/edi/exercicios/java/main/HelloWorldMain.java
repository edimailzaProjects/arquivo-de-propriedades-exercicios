package edi.exercicios.java.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HelloWorldMain
{
    //private static final String ARQUIVO_PROPRIEDADES ="propriedades.properties";
    
    public static void main(String[] args) throws IOException
    {
        Properties properties = new Properties();
        
        
        FileInputStream inputStream = new FileInputStream("./src/main/resources/propriedades.properties");
        properties.load(inputStream);
        
        System.out.println(properties.getProperty("ola.mundo"));
    }
}
