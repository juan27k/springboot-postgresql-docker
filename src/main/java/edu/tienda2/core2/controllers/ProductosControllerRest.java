package edu.tienda2.core2.controllers;


import edu.tienda2.core2.domain.Producto;
import edu.tienda2.core2.services.ProductoService;
import edu.tienda2.core2.services.ProductosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/productos")
public class ProductosControllerRest {

    //instancio java puro la clase de servicio para obrener productos en endpoint
    @Autowired
    @Lazy
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> getProductos() {
        //Recuperamos la lista de productos del servicio
        List<Producto> productos = productoService.getProductos();

        //retornamos lista productos del servicio
        return ResponseEntity.ok(productos);

    }


    @PostMapping
    public ResponseEntity<?> altaProducto(@RequestBody Producto producto) {
    productoService.saveProducto(producto);

    //Obteniendo URL de servicio.
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(producto.getId())
                .toUri();
       return ResponseEntity.created(location).body(producto);
    }





    @GetMapping("{nombre}")
    public Producto getProducto(@PathVariable String nombre) {
        //al usar stream es mas ligera que en el caos anterior
        return productoService.getProducto(nombre);
    }


   @PutMapping
    public Producto modificacionProducto(@RequestBody Producto producto){
       return productoService.modificacionProducto(producto);

    }

   @DeleteMapping ("/{nombre}")
    public void deleteCliente(@PathVariable String nombre){
     productoService.deleteCliente(nombre);
    }




}
