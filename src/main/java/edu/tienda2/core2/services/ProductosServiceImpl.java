package edu.tienda2.core2.services;

import edu.tienda2.core2.domain.Producto;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Lazy
@Service("MEMORY")
@ConditionalOnProperty(value="productos.estrategia",
havingValue = "EN_MEMORIA")
public class ProductosServiceImpl implements ProductoService{

    private List<Producto> productos = new ArrayList<>(Arrays.asList(
            new Producto(1, "Smart TV", 9000.0, 3),
            new Producto(2, "Pc Notebook", 15000.0, 10),
            new Producto(3, "Tablet", 8000.0, 5),
            new Producto(4, "Smartphone", 15000.0, 10)

    ));

    public ProductosServiceImpl(){
        System.out.println("Se esta construyendo un objeto de la clase ProductosServiceImpl.");
    }




    public List<Producto> getProductos(){
        return productos;
    }

    @Override
    public void saveProducto(Producto producto) {

    }


    public Producto getProducto(String nombre) {
        //al usar stream es mas ligera que en el caos anterior
        return productos.stream().
                filter(cliente -> cliente.getNombre().equalsIgnoreCase(nombre)).
                findFirst().orElseThrow();
    }
    public Producto altaProducto(Producto producto) {
        productos.add(producto);
        return producto;
    }
    public Producto modificacionProducto(Producto producto){
        Producto productoEncontrado = productos.stream().
                filter(cli -> cli.getNombre().equalsIgnoreCase(producto.getNombre())).
                findFirst().orElseThrow();
        productoEncontrado.setPrecio(producto.getPrecio());
        return productoEncontrado;
    }
    public void deleteCliente( String nombre){
        Producto  productoEncontrado = productos.stream().
                filter(pro -> pro.getNombre().equalsIgnoreCase(nombre)).
                findFirst().orElseThrow();
        productos.remove(productoEncontrado);
    }




}
