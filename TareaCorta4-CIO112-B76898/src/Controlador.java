public class Controlador 
{
    private Interfaz laInterfaz;
    private MetodosRecursivosEIteratvos metodosCalculeros;
    private final String [] OPTIONS = {"Salir","Calcular factorial recursivamente",
     "Calcular factorial iterativamente","Calcular Binario recursivamente", "Calcular Binario iterativamente", 
     "Calcular exponencial de un número"};
    private final String [] OPTIONS2 ={"Salir","Calcular factorial recursivamente"};
    private final String [] OPTIONS3 ={"Salir","Calcular factorial iterativamente"};
    private final String [] OPTIONS4 ={"Salir","Calcular Binario recursivamente"};
    private final String [] OPTIONS5 ={"Salir","Calcular Binario iterativamente"};
    private final String [] OPTIONS6 ={"Salir","Calcular exponencial de un numero"};
    private final String MENSAJE = "Seleccione que desea hacer";

    public Controlador()
    {
        laInterfaz = new Interfaz ("Tarea 4 XD");//, NOMBRE_ARCHIVO_IMAGEN);
        metodosCalculeros = new MetodosRecursivosEIteratvos();
    }
    /**
     * funcion para seleccionar en el menu lo que se va a ejecutar
     */
    public void iniciar()
    {
        int choose;

        do{
            choose = laInterfaz.pedirOpcion(OPTIONS, MENSAJE);
            switch(choose)
            {
                case 1:
                this.calcularFactorial1();
                break;

                case 2:
                this.calcularFactorial2();
                break;

                case 3:
                this.calcularBinario1();
                break;

                case 4:
                this.calcularBinario2();
                break;

                case 5:
                this.calcularExponencial();
                break;

                default:

                laInterfaz.decirMensaje("Adios y gracias por jugar");
                break;

            }
        }while(choose > 0);
    }
    
    public void calcularFactorial1()
    {
        int seleccion;
        do{
            seleccion = laInterfaz.pedirOpcion(OPTIONS2, MENSAJE);
            switch(seleccion)
            {
                case 1:
                metodosCalculeros.setNumero();
                int n=metodosCalculeros.getNumero();
                String str=Long.toString(metodosCalculeros.calcularFactorialRecursivo(n));
                laInterfaz.decirMensaje(str);
                break;

                default:

                laInterfaz.decirMensaje("Adios, de vuelta al menu");
                break;

            }
        }while(seleccion > 0);
    }

    public void calcularFactorial2()
    {
        int seleccion;
        do{
            seleccion = laInterfaz.pedirOpcion(OPTIONS3, MENSAJE);
            switch(seleccion)
            {
                case 1:
                metodosCalculeros.setNumero();
                int n=metodosCalculeros.getNumero();
                String str=Long.toString(metodosCalculeros.calcularFactorialIterar(n));
                laInterfaz.decirMensaje(str);
                break;

                default:

                laInterfaz.decirMensaje("Adios, de vuelta al menu");
                break;

            }
        }while(seleccion > 0);
    }

    public void calcularBinario1()
    {
        int seleccion;
        do{
            seleccion = laInterfaz.pedirOpcion(OPTIONS4, MENSAJE);
            switch(seleccion)
            {
                case 1:
                metodosCalculeros.setNumero();
                int n=metodosCalculeros.getNumero();
                String str=Long.toString(metodosCalculeros.convertirBinarioRecursivo(n));
                laInterfaz.decirMensaje(str);
                break;

                default:

                laInterfaz.decirMensaje("Adios, de vuelta al menu");
                break;

            }
        }while(seleccion > 0);
    }

    public void calcularBinario2()
    {
        int seleccion;
        do{
            seleccion = laInterfaz.pedirOpcion(OPTIONS5, MENSAJE);
            switch(seleccion)
            {
                case 1:
                metodosCalculeros.setNumero();
                int n=metodosCalculeros.getNumero();
                laInterfaz.decirMensaje(metodosCalculeros.convertirBinarioIterar(n));
                break;

                default:

                laInterfaz.decirMensaje("Adios, de vuelta al menu");
                break;

            }
        }while(seleccion > 0);
    }

    public void calcularExponencial()
    {
        int seleccion;
        do{
            seleccion = laInterfaz.pedirOpcion(OPTIONS6, MENSAJE);
            switch(seleccion)
            {
                case 1:
                metodosCalculeros.setNumero();
                int n=metodosCalculeros.getNumero();
                metodosCalculeros.setExponencial();
                int p=metodosCalculeros.getExponente();
                String str=Long.toString(metodosCalculeros.calcularExponencial(n,p));
                laInterfaz.decirMensaje(str);
                break;

                default:

                laInterfaz.decirMensaje("Adios, de vuelta al menu");
                break;

            }
        }while(seleccion > 0);
    }
}
