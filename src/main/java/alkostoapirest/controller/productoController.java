package alkostoapirest.controller;

import alkostoapirest.entity.Producto;
import alkostoapirest.service.productoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/producto")
public class productoController {
    private final productoService productoService;
    public productoController(alkostoapirest.service.productoService productoService) {
        this.productoService = productoService;
    }
    @GetMapping
    public List<Producto> listarProductos (){
        return productoService.getAllProducts();
    }
    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto){
        return productoService.saveProduct(producto);
    }
    @PutMapping("/act/{id}")
    public Producto actualizarProducto(@PathVariable int id, @RequestBody Producto producto){
        return productoService.updateProduct(id, producto);
    }
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable int id){
        productoService.deleteProduct(id);
    }

}
