package rama.coderhouse.real.state.project.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private double price;

    @Column(name = "stock", nullable = false)
    private int stock;

    @ManyToMany
    @JoinTable(
            name = "Invoice_details",
            joinColumns = @JoinColumn(name = "invoice_id")
            , inverseJoinColumns = @JoinColumn(name = "Client_id")
    )







}

