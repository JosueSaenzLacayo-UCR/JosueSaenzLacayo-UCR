import java.lang.*;
import java.io.*;
import java.util.*;

public class MetodosRecursivosEIteratvos 
{
    private int numero;
    private int exponente;
    private Interfaz interfaz;

    public MetodosRecursivosEIteratvos()
    {
        numero=0;
        exponente=0;
        interfaz=new Interfaz("Tarea Corta 4");
    }

    public void setNumero()
    {
        numero=interfaz.solicitarNumero("Digite un número");
    }

    public int getNumero()
    {
        return numero;
    }

    public void setExponencial()
    {
        exponente=interfaz.solicitarNumero("Digite exponente a calcular");
    }

    public int getExponente()
    {
        return exponente;
    }

    public long calcularFactorialRecursivo(int n)
    {

        if(n==0)
        {
            return 1;

        }else{
            return n*calcularFactorialRecursivo(n-1);
        }
    }

    public long calcularFactorialIterar(int n)
    {

        int inicio = 1;
        for (int i = 1; i <= n; i++)
        {
            inicio *= i;
        }
        return inicio;
    }

    public long convertirBinarioRecursivo(int n)
    {
        if(n==0)
        {
            return 0;
        }else{
            return n%2+10*convertirBinarioRecursivo(n/2);
        }
    }

    public String convertirBinarioIterar(int n)
    {
        StringBuilder binario = new StringBuilder();
        String binarioNum = "";
        while(0<n)
        {
            binarioNum +=n%2;
            n/=2;
        }
        binario.append(binarioNum);
        return binario.reverse().toString();
    }

    public long calcularExponencial(int n, int exp)
    {
        if (exp == 0)
        {
            return 1;
        }
        else
        {
            return n * calcularExponencial(n,exp-1);
        }
    }

}
