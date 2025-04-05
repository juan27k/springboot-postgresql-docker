package edu.tienda2.core2.persistance.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;
@Entity(name="productos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoEntity {

    //definimos identificador unico para la conexion con la base de datos
    @Id
    //indica estrategia con la q la bd generara ese id unico,esta e sla mas usual en postgres
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nombre;
    private Double precio;
    private Integer stock;


}
