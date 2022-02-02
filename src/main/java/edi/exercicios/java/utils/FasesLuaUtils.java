package edi.exercicios.java.utils;

import edi.exercicios.java.enums.FasesLuaEnums;

public class FasesLuaUtils
{
    public void getFasesLua(FasesLuaEnums fasesLuaEnums)
    {
        switch (fasesLuaEnums)
        {
        case NOVA:
            System.out.println("A fase da lua nova");
            break;

        case CRESCENTE:
            System.out.println("A fase da lua cescente");
            break;
            
        case CHEIA:
            System.out.println("A fase da lua cheia");
            break;
            
        case MINGUANTE:
            System.out.println("A fase da lua minguante");
            break;
            
        default:
            break;
        }

    }
}
