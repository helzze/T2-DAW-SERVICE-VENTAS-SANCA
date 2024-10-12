package daw.t2.sanca.t2_service_ventas.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ventas")
public class VentasController {

    // Simulación de un historial de ventas en memoria
    private final Map<Long, String> historialVentas = new HashMap<>();

    @PostMapping("/registrar")
    public String registrarVenta(@RequestParam Long clienteId, @RequestParam String producto) {
        String registro = "Venta registrada: Producto - " + producto;
        historialVentas.put(clienteId, registro);
        return registro;
    }

    @GetMapping("/historial/{clienteId}")
    public String obtenerHistorialVentas(@PathVariable Long clienteId) {
        return historialVentas.getOrDefault(clienteId, "No hay ventas registradas para este cliente.");
    }
}
