/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecucion;
import Gestion.GestionReportes1;
import Personas.*;
import Vehiculos.*;
import Interfaz_Admin.login;
/**
 *
 * @author sebas
 */
public class Main {
     
    public static void main(String[] args) {
        // Un admin para loguearse
        Administrador admin = new Administrador(
            "10101010", "Juan", "Perez", "Lopez", 
            "Av. Siempre Viva 123", "999888777", "juan@admin.com", 
            "admin", "loco" // Usuario y contraseña del código
        );
        
        // Un vendedor para probar ventas
        Vendedor vend = new Vendedor(
            "20202020", "Maria", "Gomez", "Ruiz", 
            "Calle Falsa 123", "987654321", "maria@ventas.com", 
            "vend", "12345" // Usuario y contraseña del código
        );
        
        GestionReportes1.agregarEmpleado(admin);
        GestionReportes1.agregarEmpleado(vend);

        // --- 2. PRECARGAR CLIENTES ---
        Cliente cliente1 = new Cliente(
            "40404040", "Carlos", "Sainz", "Vazquez", 
            "Madrid 456", "911222333", "carlos@f1.com"
        );
        GestionReportes1.agregarClientes(cliente1);

        // --- 3. PRECARGAR VEHÍCULOS ---
        // Importante: El estado debe ser DISPONIBLE para que aparezca en cotizaciones
        Sedan auto1 = new Sedan(
            "V001", "TOYOTA", "Corolla", "Rojo", 
            2024, 25000.0
        );
        
        Suv auto2 = new Suv(
            "V002", "HONDA", "CR-V", "Negro", 
            2023, 32000.0
        );

        GestionReportes1.agregarVehiculos(auto1);
        GestionReportes1.agregarVehiculos(auto2);

        // --- 4. LANZAR LA APLICACIÓN ---
        System.out.println("Sistema inicializado con datos de prueba...");
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }
}
    

