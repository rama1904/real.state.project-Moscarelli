package rama.coderhouse.real.state.project.entities;

import jakarta.persistence.*;
import lombok.Data;

package com.project.realstate.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "invoice_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvoiceDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private Double monto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id") // nombre de la columna que va en la tabla invoice_details
    private Invoice invoice;
}


