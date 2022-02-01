package edi.exercicios.java.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import edi.exercicios.java.classes.Copo;

public class CopoMain
{
    public static void main(String[] args) throws IOException
    {
        Properties properties = new Properties();
        Copo copo = new Copo();
        FileInputStream fileInputStream = new FileInputStream("./src/main/resources/propriedades.properties");
        properties.load(fileInputStream);
        
        Boolean valor = Boolean.parseBoolean(properties.getProperty("copo.cheio"));
        
        copo.setCheio(valor);
        System.out.println(copo.mostrarCopo());
    }

}
