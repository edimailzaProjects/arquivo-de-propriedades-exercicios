package edi.exercicios.java.classes;

public class Copo
{
    private boolean cheio;

    public boolean isCheio()
    {
        return cheio;
    }

    public void setCheio(boolean cheio)
    {
        this.cheio = cheio;
    }

    public String mostrarCopo()
    {
        if (isCheio())
        {
            return "O copo est� cheio.";
        }
        else
            return "O copo est� vazio.";
    }
}
