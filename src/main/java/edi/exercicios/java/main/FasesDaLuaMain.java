package edi.exercicios.java.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import edi.exercicios.java.enums.FasesLuaEnums;
import edi.exercicios.java.utils.FasesLuaUtils;

public class FasesDaLuaMain
{
    public static void main(String[] args) throws IOException
    {
        
        FasesLuaUtils fasesLuaUtils = new FasesLuaUtils();
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("./src/main/resources/propriedades.properties");
        properties.load(fileInputStream);
        
        FasesLuaEnums fase = FasesLuaEnums.valueOf(properties.getProperty("fases.lua"));
        //properties.getProperty("fases.lua");
        
        
        fasesLuaUtils.getFasesLua(fase);
    }
}
