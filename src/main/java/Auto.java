
public class Auto {

    // ========== ATRIBUTOS ==========
    private String modeloAuto;
    private String colorAuto;
    private int plazasAuto;
    private double velocidadMediaAuto;



    // ========== MÉTODOS ==========
        // ----- CONSTRUCTOR -----
    public Auto(String modeloAuto, String colorAuto, int plazasAuto, double velocidadMediaAuto) {
        this.modeloAuto             = modeloAuto;
        this.colorAuto              = colorAuto;
        this.plazasAuto             = plazasAuto;
        this.velocidadMediaAuto     = velocidadMediaAuto;
    }



        // ----- CONSTRUCTOR VACÍO -----
    public Auto() {
    }



        // ----- GETTERS -----
    public String getModeloAuto() {
        return modeloAuto;
    }

    public String getColorAuto() {
        return colorAuto;
    }

    public int getPlazasAuto() {
        return plazasAuto;
    }

    public double getVelocidadMediaAuto() {
        return velocidadMediaAuto;
    }



        // ----- ESTIMAR TIEMPO -----
    public double estimarTiempoAuto() {
        return 169.5 / velocidadMediaAuto;
    }



        // ----- IMPRIMIR TIEMPO -----
    public void imprimirTiempoEstimadoAuto(String nombreUsuario) {
        double tiempoEstimado = estimarTiempoAuto();
        System.out.println(     "Hola "             + nombreUsuario+ "! El tiempo de viaje aproximado para llegar a " +
                "Valdivia"          + " en el auto "            + getModeloAuto() + " es de             : " +
                estimarTiempoAuto() + " Minutos/Horas");
    }
}

