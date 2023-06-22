package tests;

import modelo.Vendedor;
import modelo.Local;
import modelo.Freno;
import modelo.Llanta;
import modelo.Cambio;
import modelo.Bicicleta;
import modelo.Cliente;

public class Main {
    public static void main(String[] args) {

        // Creamos vendedores
        Vendedor listaVendedores[] = new Vendedor[3];
        Vendedor vendedor1 = new Vendedor("Alan Josue", " 1728");
        listaVendedores[1] = new Vendedor("Miguel Merino", "1485");
        listaVendedores[2] = new Vendedor("Lenin Velasquez", "1620");

        // Creación de los clientes.
        Cliente[] listaClientes = new Cliente[3];
        Cliente cliente1 = new Cliente("Martín Posso", "La Vicentina", "0992680061", 3000);
        listaClientes[1] = new Cliente("Ricardo Villarreal", "La Merced", "0972680061", 100);
        listaClientes[2] = new Cliente("Nicole Herrera", "Cumbayá", "0982680061", 1500);

        // Creamos partes de bicicletas
        Freno freno = new Freno("Frenos automáticos");
        Freno freno2 = new Freno("Frenos de tambor");
        Freno freno3 = new Freno("Frenos de discos");

        Llanta ll1 = new Llanta("Maxxis", "Caucho");
        Llanta ll2 = new Llanta("Vittoria", "Fibra de carbono");

        Cambio camb1 = new Cambio(4, "Automático");
        Cambio camb2 = new Cambio(3, "Manual");

        // Creamos bicicletas
        Bicicleta listaBicicletas[] = new Bicicleta[3];
        Bicicleta cicla1 = new Bicicleta(ll1, freno, camb1, "Marathon", "bmx", "Rojo", 654);
        Bicicleta cicla2 = new Bicicleta(ll2, freno2, camb2, "Timberland", "Montañera", "Verde", 1200);
        Bicicleta cicla3 = new Bicicleta(ll2, freno3, camb1, "Kao", "Montañera", "Azul", 1350);
        Bicicleta cicla4 = new Bicicleta(ll1, freno, camb1, "Marathon", "bmx", "Rojo", 654);
        Bicicleta cicla5 = new Bicicleta(ll2, freno2, camb2, "Timberland", "Montañera", "Verde", 1200);
        Bicicleta cicla6 = new Bicicleta(ll2, freno3, camb1, "Kao", "Montañera", "Azul", 1350);

        // Local donde estarán almacenados las bicicletas y la lista de trabajadores
        Local localQuito = new Local();
        localQuito.addBicicleta(cicla1);
        localQuito.addBicicleta(cicla2);
        localQuito.addBicicleta(cicla3);


        localQuito.mostrarBicicletas();
        System.out.println("************************************************************");
        localQuito.quitarBicicleta2(cicla2);
        localQuito.mostrarBicicletas();
        System.out.println("************************************************************");

        localQuito.addBicicleta(cicla4);
        localQuito.addBicicleta(cicla5);
        localQuito.addBicicleta(cicla6);
        localQuito.mostrarBicicletas();

        System.out.println("************************************************************");
        cliente1.comprarCasco(localQuito, vendedor1);
        System.out.println(cliente1.getEfectivo());
        cliente1.comprarCandado(localQuito,vendedor1);
        System.out.println(cliente1.getEfectivo());


        //localQuito.mostrarEmpleados(); //muestra lista de empleados
        //localQuito.mostrarBicicletas(); //muestra lista de bicicletas

        //cl1.verificarSiEsPosibleComprar(bici1, localQuito, vendedor1);

        //localQuito.mostrarBicicletas();
        //cl1.mostrarCompras();

        //localQuito.mostrarEmpleados();
        //localQuito.mejorEmpleado();
        //localQuito.premiacion();


    }
}