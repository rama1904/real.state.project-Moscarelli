package rama.coderhouse.real.state.project.repositories;

import com.project.realstate.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario.
}
