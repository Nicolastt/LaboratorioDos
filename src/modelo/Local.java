package modelo;


public class Local {
    private String empleadoDelMes;
    private final Bicicleta[] inventarioBicicletas;
    private Vendedor[] inventarioVendedores;

    private int numeroCascosDisponibles = 10;
    private int numeroCandadosDisponibles = 30;
    private int max;
    public int contadorVentas;
    public int contadorBicicletas;

    public Local() {
        this.empleadoDelMes = "";
        this.inventarioBicicletas = new Bicicleta[5];
        this.inventarioVendedores = new Vendedor[3];
        this.contadorVentas = 0;
    }

    public void premiacion() {
        System.out.println("El empleado del mes fue " + empleadoDelMes + " con " + this.max + " ventas");
    }

    public void venderCasco() {
        --numeroCascosDisponibles;
    }

    public void venderCandado() {
        --numeroCandadosDisponibles;
    }

    public void addBicicleta(Bicicleta bicicleta) {
        // Como ocupamos arreglos vamos a tener un límite.
        if (contadorBicicletas < inventarioBicicletas.length) { // Si aún no llega al límite
            inventarioBicicletas[contadorBicicletas] = bicicleta; // Guarda la bicicleta en el inventario en la posición = contadorBicicletas.
            contadorBicicletas++;
        } else {
            System.out.println("¡Ha alcanzado el límite de bicicletas para la tienda!");
        }
    }

    public void quitarBicicleta(Bicicleta bicicleta) {
        for (int i = 0; i < inventarioBicicletas.length-1; i++) {
            if (bicicleta == inventarioBicicletas[i]) {
                inventarioBicicletas[i] = null;
                contadorBicicletas--;
                return;
            }
        }
    }
    public void quitarBicicleta2(Bicicleta bicicleta) {
        for (int i = 0; i < contadorBicicletas; i++) {
            if (bicicleta == inventarioBicicletas[i]) {
                // Desplazar los elementos hacia la izquierda, sobrescribiendo la bicicleta a eliminar
                for (int j = i; j < contadorBicicletas - 1; j++) {
                    inventarioBicicletas[j] = inventarioBicicletas[j + 1];
                }
                inventarioBicicletas[contadorBicicletas - 1] = null; // Establecer el último elemento como nulo
                contadorBicicletas--;
                break;
            }
        }
    }


    public void mostrarBicicletas() {
        for (int i = 0; i < inventarioBicicletas.length; i++) {
            if (inventarioBicicletas[i] != null){
                System.out.println(inventarioBicicletas[i].impBicicletas());
            }
        }
    }

}
