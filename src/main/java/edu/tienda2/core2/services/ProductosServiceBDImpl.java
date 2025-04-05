package edu.tienda2.core2.services;

import edu.tienda2.core2.domain.Producto;
import edu.tienda2.core2.persistance.entities.ProductoEntity;
import edu.tienda2.core2.persistance.repositories.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("BD")
@ConditionalOnProperty(
        value="productos.estrategia",
        havingValue = "EN_BD")
public class ProductosServiceBDImpl implements ProductoService{

    @Autowired
    private ProductosRepository productosRepository;

    @Override
    public List<Producto> getProductos() {

      // List<ProductoEntity>productoEntities= productosRepository.findAll();
        //return null;

        List<Producto> productos = productosRepository.findAll().stream().map(productoEntity ->{
   // List<Producto> productos = productosRepository.findByPrecioLessThan(900.0).stream().map(productoEntity ->{
            Producto producto = new Producto();
            producto.setId(productoEntity.getId());
            producto.setNombre(productoEntity.getNombre());
            producto.setPrecio(productoEntity.getPrecio());
            producto.setStock(productoEntity.getStock());
            return producto;

        }).collect(Collectors.toList());

        return productos;
    }

    @Override
    public void saveProducto(Producto producto) {
        //Mapeo de producto o ProductoEntity
        ProductoEntity productoEntity = new ProductoEntity();
        productoEntity .setNombre(producto.getNombre());
        productoEntity .setPrecio(producto.getPrecio());
        productoEntity .setStock(producto.getStock());

        //Persistencia
        productosRepository.save(productoEntity);
    }




    @Override
    public Producto getProducto(String n) {
        return null;
    }

    @Override
    public Producto altaProducto(Producto p) {
        return null;
    }

    @Override
    public Producto modificacionProducto(Producto p) {
        return null;
    }

    @Override
    public void deleteCliente(String n) {

    }
}
