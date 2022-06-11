import java.util.Scanner;

public class Juego
{
    private String nombre_juego;
    private String tipo;
    private String dificultad;

    //constructores
    public Juego()
    {
        //System.out.println( "Prueba de llamada a constructor sin parametros !" );
    }
    
    public Juego(String nombre_juego, String tipo, String dificultar)
    {
        this.nombre_juego = nombre_juego;
        this.tipo = tipo;
        this.dificultad = dificultad;
        //System.out.println( "Llamada a constructor con parametros de inicializacion !" );
    }
    
    //setters and getters
    //nombre del juego
    public void setNombreJuego(String nombre_juego)
    {
        this.nombre_juego = nombre_juego;
    }
    
    public String getNombreJuego()
    {
        return this.nombre_juego;
    }
    
    //tipo de juego
    public void setTipoJuego(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getTipoJuego()
    {
        return this.tipo;
    }
    
    //dificultad
    public void setDificultad(String dificultad)
    {
        this.dificultad = dificultad;
    }
    
    public String getDificultad()
    {
        return this.dificultad;
    }    

    public static void main( String[] args )
    {
        Scanner scannerObj = new Scanner(System.in);
        String nombrejuego;
        String tipojuego;
        String dificultad;

        System.out.println( "Ingrese el nombre del juego:" );
    	nombrejuego = scannerObj.nextLine();
    	
        System.out.println( "Ingrese el tipo de juego:" );
    	tipojuego = scannerObj.nextLine();
        
        System.out.println( "Ingrese el nivel de dificultad:" );
    	dificultad = scannerObj.nextLine();
        
        Juego objJuego1; //Instanciar la clase
        objJuego1 = new Juego(); //Inicializar la clase con el constructor sin parametros
        
        //setear valores leidos a las propiedades de la clase
        objJuego1.setNombreJuego(nombrejuego);
        objJuego1.setTipoJuego(tipojuego);
        objJuego1.setDificultad(dificultad);

        
        //presentar valores seteados
        System.out.println("Valores registrados en el primer objeto: " );
        System.out.println("Nombre del Juego: " + objJuego1.getNombreJuego() + " Tipo de juego: " + objJuego1.getTipoJuego() + " Dificultad: " + objJuego1.getDificultad());
        
        
        
        System.out.println( "Fin" );
    }    
    
}
    