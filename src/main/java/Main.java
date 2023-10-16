import java.util.Scanner;

public class Main {

    // ========== MAIN ==========
    public static void main(String[] args) {
        Persona.crearUsuario();
        menu();
    }


    // ========== MENU ==========

    public static void menu() {
        Scanner lector = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n==============================");
            System.out.println("        Estimación tiempo      ");
            System.out.println("         Temuco-Valdivia       ");
            System.out.println("============================== ");
            System.out.println("        [1] Vehículos          ");
            System.out.println("        [2] Estimar tiempo     ");
            System.out.println("        [3] Salir              ");
            System.out.println("============================== ");
            System.out.print  ("    Opción: ");
            opcion = lector.nextLine();
            System.out.println("==============================");

            switch (opcion){
                case "1":
                    Persona.mostrarVehiculos();
                    break;


                case "2":
                    Persona.tiempoEstimado();
                    break;


                case "3":
                    System.out.println("    Hasta luego... ");
                    break;


                default:
                    System.out.println("    Ingrese una opción válida... ");
            }
        }while(!opcion.equals("3"));
    }
}