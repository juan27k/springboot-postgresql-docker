package edu.tienda2.core2.services;

import edu.tienda2.core2.domain.Producto;

import java.util.List;

public interface ProductoService {
    public List<Producto> getProductos();
    public void saveProducto(Producto producto);

    public Producto getProducto(String n);
    public Producto altaProducto (Producto p);
    public Producto modificacionProducto (Producto p);
    public void deleteCliente(String n);

}
