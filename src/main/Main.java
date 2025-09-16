package main;


import quindiofresh.PedidoBuilder;
import quindiofresh.Pedido;
import quindiofresh.Producto;
import quindiofresh.Cliente;
import quindiofresh.MiniMercado;
import interfaces.Envio;
import interfaces.envioFactory;
import Factoy.envioEstandarFactory;
import Factoy.envioExpressFactory;

import java.util.ArrayList;
import quindiofresh.CatalogoProductos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiniMercado mercado = MiniMercado.getInstance();
        mercado.agregarProducto(new Producto("123", "plátano", 2000));
        mercado.agregarProducto(new Producto("321", "cafe", 15000));
        mercado.agregarProducto(new Producto("456", "manzana", 2500));

        System.out.println("Bienvenido");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Email: ");
        String email = sc.nextLine();
        
        System.out.print("Tel: ");
        String tel = sc.nextLine();
        
    Cliente cliente = new Cliente(nombre, email, tel);
        mercado.agregarCliente(cliente);

        System.out.println("Catálogo:");
        ArrayList<Producto> listaCatalogo = mercado.getCatalogo();
        for (int i = 0; i < listaCatalogo.size(); i++) {
            System.out.println((i+1) + ". " + listaCatalogo.get(i));
        }
        ArrayList<Producto> productosPedido = new ArrayList<>();
        System.out.println("elija productos (enter vacio para terminar):");
        String linea = sc.nextLine();
        while (!linea.isEmpty()) {
            int op = linea.charAt(0) - '0';
            if (op > 0 && op <= listaCatalogo.size()) {
                productosPedido.add(listaCatalogo.get(op-1));
            }
            linea = sc.nextLine();
        }

        System.out.print("dirección: opcional");
        String direccion = sc.nextLine();

        System.out.print("notas: opcional");
        String notas = sc.nextLine();

        System.out.print("descuento: opcional");
        String descuento = sc.nextLine();

            PedidoBuilder builder = new PedidoBuilder()
                .Cliente(cliente)
                .direccionEnvio(direccion)
                .notasEspeciales(notas)
                .codigoDescuento(descuento);
            for (Producto p : productosPedido) {
                builder.agregarProducto(p);
            }
            Pedido pedidoFinal = builder.build();

        System.out.println("pago: 1. tarjeta  2.  PSE");
        int pago = sc.nextInt();
        String metodoPago = (pago == 1)?"pse":"nequi";
        
        System.out.println("envío: 1. estandar  2. express");
        int envioSel = sc.nextInt();
        envioFactory factory = (envioSel == 2) ? new envioExpressFactory() : new envioEstandarFactory();
        
        System.out.println("notificación: 1. sms  2. email");
        int notif = sc.nextInt();
        String canal = (notif == 1)?"SMS":"Email";

        Envio envio = factory.crearEnvio();
        System.out.println("Pedido creado:");
        System.out.println(pedidoFinal.getProductos());
        
        envio.Enviar();
        
        System.out.println("pago: " + metodoPago);
        System.out.println("notificación: " + canal);
        System.out.println("fin de la compra");
    } 
}