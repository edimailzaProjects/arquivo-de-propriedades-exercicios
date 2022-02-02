package edi.exercicios.java.enums;

public enum FasesLuaEnums
{
    NOVA(1), CRESCENTE(2), CHEIA(3), MINGUANTE(4);
    
    private int fases;
    
    private FasesLuaEnums(int fases)
    {
        this.fases = fases;
    }
    
    public int getFases()
    {
        return this.fases;
    }
    
    
}
