package edu.tienda2.core2.services;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.tienda2.core2.domain.Producto;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Primary
@Service("JSON")
@ConditionalOnProperty(value="productos.estrategia",
        havingValue = "EN_JSON")
public class ProductosServiceJSONImpl implements ProductoService{
    @Override
    public List<Producto> getProductos() {
        List<Producto> productos;
        try{
            productos = new ObjectMapper().readValue(this.getClass().getResourceAsStream("/productos.json"),
                    new TypeReference<List<Producto>>() {});
            return productos;

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveProducto(Producto producto) {

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
