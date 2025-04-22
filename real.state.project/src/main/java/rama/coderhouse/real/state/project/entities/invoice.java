package rama.coderhouse.real.state.project.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "invoice")
public class invoice {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "STREET_NAME", nullable = false)
    private String streetName;
    @Column(name = "CITY", nullable = false)
    private String city;
    @Column(name = "number", nullable = false)
    private int number;
    @ManyToOne(fetch = FetchType.LAZY)
    private client client;


}
