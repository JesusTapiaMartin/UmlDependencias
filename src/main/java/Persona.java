import java.util.Scanner;

public class Persona {

    // ========== ATRIBUTOS ==========
    private static String nombre;



    // ========== MÉTODOS ==========

    // ----- Constructor con parámetros -----
    public Persona(String nombre) {
        this.nombre = nombre;
    }



    // ----- Constructor vacío -----
    public Persona() {
    }



    // ----- Get nombre -----
    public String getNombre() {
        return nombre;
    }



    // ----- CREAR USUARIO -----
    public static Persona crearUsuario(){
        Scanner lector  = new Scanner(System.in);

        System.out.println("\n      ----- USUARIO ----- ");
        System.out.print  ("            Nombre  : ");
        String nombre   = lector.nextLine();

        Persona persona = new Persona(nombre);
        System.out.println("        Usuario creado correctamente... ");

        return persona;
    }




    // ----- MOSTRAR VEHÍCULOS -----
    public static void mostrarVehiculos() {
        Auto auto = new Auto("Kia Morning"          , "Blanco"          , 5         , 58.0  );
        Bici bici = new Bici("Trek Mountain Bike"   , "Verde"           , 20.0              );
        Moto moto = new Moto("Honda CBR"            , "Rojo"            , 120.0             );

        System.out.println("\n        ---------- Vehículos disponibles ----------");
        System.out.println( "\n         [1] Auto"   +
                "\n         Modelo              : "     + auto.getModeloAuto()          +
                "\n         Color               : "     + auto.getColorAuto()           +
                "\n         Plazas              : "     + auto.getPlazasAuto()          +
                "\n         Velocidad Media     : "     + auto.getVelocidadMediaAuto()  + "km/h");

        System.out.println( "\n         [2] Bici"    +
                "\n         Modelo              : " + bici.getModeloBici()              +
                "\n         Color               : " + bici.getColorBici()               +
                "\n         Velocidad Media     : " + bici.getVelocidadMediaBici()      + "km/h");


        System.out.println( "\n         [3] Moto"    +
                "\n         Modelo              : " + moto.getModeloMoto()              +
                "\n         Color               : " + moto.getColorMoto()               +
                "\n         Velocidad Media     : " + moto.getVelocidadMediaMoto()      + "km/h");
    }



    // ----- TIEMPO ESTIMADO -----
    public static void tiempoEstimado(){
        Auto auto = new Auto("Kia Morning"          , "Blanco"      , 5         , 58.0  );
        Bici bici = new Bici("Trek Mountain Bike"   , "Verde"       , 20.0              );
        Moto moto = new Moto("Honda CBR"            , "Rojo"        , 120.0             );

        System.out.println("\n        ---------- Tiempos estimados ----------");
        auto.imprimirTiempoEstimadoAuto(nombre);
        bici.imprimirTiempoEstimadoBici(nombre);
        moto.imprimirTiempoEstimadoMoto(nombre);
    }
}
