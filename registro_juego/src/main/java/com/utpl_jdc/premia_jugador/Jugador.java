import java.util.Scanner;

public class Jugador
{
    private String nombre;
    private String apellido;
    private String nickname;
    private int edad;
    private String genero; //masculino o femenino
    
    //constructores
    public Jugador()
    {
        //System.out.println( "Prueba de llamada a constructor sin parametros !" );
    }
    
    public Jugador(String nombre, String apellido, String nickname, int edad, String genero)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickname = nickname;
        this.edad = edad;
        this.genero = genero;
        //System.out.println( "Llamada a constructor con parametros de inicializacion !" );
    }
    
    //setters and getters
    //nombre
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    //apellido
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    //nick
    public void setNickName(String nickname)
    {
        this.nickname = nickname;
    }
    
    public String getNickName()
    {
        return this.nickname;
    }    
    
    //edad
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    public int getEdad()
    {
        return this.edad;
    }  
    
    //genero
    public void setGenero(String genero)
    {
        this.genero = genero;
    }
    
    public String getGenero()
    {
        return this.genero;
    } 
    
    
    public static void main( String[] args )
    {
        Scanner scannerObj = new Scanner(System.in);
        String nombre;
        String apellido;
        String nickname;
        String genero;
        int edad;
        
        System.out.println( "Ingrese el nombre del jugador:" );
    	nombre = scannerObj.nextLine();
    	
        System.out.println( "Ingrese el apellido del jugador:" );
    	apellido = scannerObj.nextLine();
        
        System.out.println( "Ingrese el nickname:" );
    	nickname = scannerObj.nextLine();
        
        System.out.println( "Ingrese el genero del jugador:" );
    	genero = scannerObj.nextLine();
    	
        System.out.println( "Ingrese la edada del jugador:" );
    	edad = scannerObj.nextInt();
    	
        Jugador objJugador1; //Instanciar la clase
        objJugador1 = new Jugador(); //Inicializar la clase con el constructor sin parametros
        
        //setear valores leidos a las propiedades de la clase
        objJugador1.setNombre(nombre);
        objJugador1.setApellido(apellido);
        objJugador1.setNickName(nickname);
        objJugador1.setGenero(genero);
        objJugador1.setEdad(edad);
        
        //presentar valores seteados
        System.out.println("Valores registrados en el primer objeto: " );
        System.out.println("Nombre: " + objJugador1.getNombre() + " Apellido: " + objJugador1.getApellido() + " NickName: " + objJugador1.getNickName() + " Edad: " + objJugador1.getEdad() + " Genero: " + objJugador1.getGenero()  );
        
        Jugador objJugador2; //nuevo objeto tipo jugador
        objJugador2 = new Jugador("Paul", "Casco", "PCASCO", 38, "Masculino"); //Instanciar objeto mediante constructor con parametros estaticos
        
        
        //presentar valores seteados en el segundo objeto
        System.out.println("Valores registrados en el segundo objeto: " );
        System.out.println("Nombre: " + objJugador2.getNombre() + " Apellido: " + objJugador2.getApellido() + " NickName: " + objJugador2.getNickName() + " Edad: " + objJugador2.getEdad() + " Genero: " + objJugador2.getGenero());
                            
        
        System.out.println( "Fin" );
    }    
    
}
    