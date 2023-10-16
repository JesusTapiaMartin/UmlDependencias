
public class Moto {

    // ========== ATRIBUTOS ==========
    private String modeloMoto;
    private String colorMoto;
    private double velocidadMediaMoto;



    // ========== MÉTODOS ==========
        // ----- CONSTRUCTOR -----

    public Moto(String modeloMoto, String colorMoto, double velocidadMediaMoto) {
        this.modeloMoto                 = modeloMoto;
        this.colorMoto                  = colorMoto;
        this.velocidadMediaMoto         = velocidadMediaMoto;
    }


        // ----- CONSTRUCTOR VACÍO -----
    public Moto() {
    }



        // ----- GETTERS -----
    public String getModeloMoto() {
        return modeloMoto;
    }


    public String getColorMoto() {
        return colorMoto;
    }


    public double getVelocidadMediaMoto() {
        return velocidadMediaMoto;
    }



        // ----- ESTIMAR TIEMPO -----
    public double estimarTiempoMoto() {
        return 169.5 / velocidadMediaMoto;
    }



        // ----- IMPRIMIR TIEMPO -----
    public void imprimirTiempoEstimadoMoto(String nombreUsuario) {
        double tiempoEstimado = estimarTiempoMoto();
        System.out.println(     "Hola "             + nombreUsuario     + "! El tiempo de viaje aproximado para llegar a " +
                "Valdivia"          + " en la moto "            + getModeloMoto() + " es de               : " +
                estimarTiempoMoto() + " Minutos/Horas");
    }
}

