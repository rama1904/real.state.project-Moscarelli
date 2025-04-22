package rama.coderhouse.real.state.project.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table (name = "client")
public class client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

@Column(name = "name", nullable = false)
    private String name;

@Column(name = "lastname", nullable = false)
    private String lastname;

@Column (name = "dni", nullable = false, unique = true)
    private String dni;

@ManyToMany (mappedBy = "clients",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<invoice> invoices;

<fetch, cascade, mappedBy> OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<invoice_details> invoice_details;
@ManyToMany (mappedBy = "clients")

}
