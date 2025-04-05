package edu.tienda2.core2.persistance.repositories;

import edu.tienda2.core2.persistance.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductosRepository extends JpaRepository<ProductoEntity,Integer> {
List<ProductoEntity> findByPrecioLessThan(Double precio);

}
