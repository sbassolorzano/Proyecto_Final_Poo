package Vehiculos;

import java.util.ArrayList;
import java.util.List;

public class GestionVehiculo {

    private List<Vehiculo> lista = new ArrayList<>();

    public List<Vehiculo> getListaVehiculos() {
        return lista;
    }

    // ---------- REGISTRAR ----------
    public boolean registrar(Vehiculo v) {
        // No permitir códigos duplicados
        for (Vehiculo x : lista) {
            if (x.getCodigo().equalsIgnoreCase(v.getCodigo())) {
                return false;
            }
        }
        lista.add(v);
        return true;
    }

    // ---------- ACTUALIZAR ----------
    public boolean actualizar(Vehiculo v) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equalsIgnoreCase(v.getCodigo())) {
                lista.set(i, v);   // Reemplaza el vehículo entero
                return true;
            }
        }
        return false;
    }

    // ---------- ELIMINAR ----------
    public boolean eliminar(String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                lista.remove(i);
                return true;
            }
        }
        return false;
    }
}
