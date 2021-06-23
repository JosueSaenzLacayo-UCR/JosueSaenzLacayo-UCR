import javax.swing.JOptionPane;
//import javax.swing.ImageIcon;
/**
 * Es el Tablero del juego.
 * Esta es la interfaz del juego, presenta una forma de introducir .
 * @author Josue Saenz
 * @version 26-5-2021
 */
public class Interfaz extends JOptionPane
{
    private final String TITULO;
    //private final ImageIcon IMAGEN;

    public Interfaz(String elTitulo) //String nombreArchivoImagen)
    {
        TITULO = elTitulo;
        //IMAGEN = new ImageIcon(this.getClass().getResource(nombreArchivoImagen));

    }
    /**
     * funcion para mostrar un mensaje que busquemos colocar
     * @param string Mensaje a mostrar
     */
    public void decirMensaje(String elMensaje)
    {
        Interfaz.showMessageDialog(null, elMensaje, TITULO, PLAIN_MESSAGE, null);
    }
    /**
     * toma string verifica que sea un numero 
     * @param String a solicitar para introducir datos
     * @retunr retorna el numero colocado como string 
     */

    public int solicitarNumero(String elMensaje)
    {
        String resultado;
        resultado = Interfaz.showInputDialog(null, elMensaje, TITULO, PLAIN_MESSAGE);
        int resultado2 = 0;

        //int resultado2 = Integer.parseInt(resultado);
        if(!resultado.isEmpty() ){
            try{
                resultado2 = Integer.parseInt(resultado);

            }catch(Exception error){
                this.decirMensaje("Digite lo solicitado por favor");
            }
            return resultado2;
        }else{
            Interfaz.showMessageDialog(null, "Adios");
            return -1;
        }

    }

    public int solicitarNumeroTarea2(String elMensaje, String resultado)
    {
        int resultado2 = 0;

        //int resultado2 = Integer.parseInt(resultado);
        if(!resultado.isEmpty() ){
            try{
                resultado2 = Integer.parseInt(resultado);

            }catch(Exception error){
                //this.decirMensaje("Digite lo solicitado por favor");
                resultado2 =-1;
            }
            return resultado2;
        }else{
            Interfaz.showMessageDialog(null, "Adios");
            return -1;
        }

    }
    /**
     * solicita string y lo retorna esto para los parametros de las funciones del juego
     * @param String elMensaje que el usuario enviara como string unicamente
     * @return el String colocado
     */
    public String solicitarEntrada(String elMensaje)
    {
        String resultado;
        resultado = Interfaz.showInputDialog(null, elMensaje, TITULO, PLAIN_MESSAGE);
        return resultado;
    }
    /**
     * solicita una serie de strings para colocarlos como opciones en un menu y un string
     * para dar un mensaje al usuario de la aplicacion
     * @param arreglo de string para mostrar las opciones a dar al usuario y string elMensaje para
     * introducir un mensaje a mostrar
     * @return ratorna resultado de la opcion seleccionada del arreglo de string dado
     */
    public int pedirOpcion(String[] lasOpciones, String elMensaje)
    {
        int resultado;
        resultado = Interfaz.showOptionDialog(null, elMensaje, TITULO, DEFAULT_OPTION, PLAIN_MESSAGE, null, lasOpciones, null);
        return resultado;
    }
}
