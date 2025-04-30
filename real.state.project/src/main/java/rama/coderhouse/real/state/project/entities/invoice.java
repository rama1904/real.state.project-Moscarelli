package rama.coderhouse.real.state.project.entities;


package com.project.realstate.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "invoices")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private String description;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<InvoiceDetails> detalles = new ArrayList<>();

    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}



}
