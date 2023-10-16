
public class Bici {

    // ========== ATRIBUTOS ==========
    private String modeloBici;
    private String colorBici;
    private double velocidadMediaBici;



    // ========== MÉTODOS ==========
        // ----- CONSTRUCTOR -----
    public Bici(String modeloBici, String colorBici, double velocidadMediaBici) {
        this.modeloBici             = modeloBici;
        this.colorBici              = colorBici;
        this.velocidadMediaBici     = velocidadMediaBici;
    }



        // ----- CONSTRUCTOR VACÍO -----
    public Bici() {
    }



        // ----- GETTERS -----
    public String getModeloBici() {
        return modeloBici;
    }


    public String getColorBici() {
        return colorBici;
    }


    public double getVelocidadMediaBici() {
        return velocidadMediaBici;
    }



        // ----- ESTIMAR TIEMPO -----
    public double estimarTiempoBici() {
        return 169.5 / velocidadMediaBici;
    }



        // ----- IMPRIMIR TIEMPO -----
    public void imprimirTiempoEstimadoBici(String nombreUsuario) {
        double tiempoEstimado = estimarTiempoBici();
        System.out.println(     "Hola "             + nombreUsuario     + "! El tiempo de viaje aproximado para llegar a " +
                "Valdivia"          + " en la bici "            + getModeloBici() + " es de      : " +
                estimarTiempoBici() + " Minutos/Horas");
    }
}

