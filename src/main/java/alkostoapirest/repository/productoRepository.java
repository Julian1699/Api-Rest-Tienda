package alkostoapirest.repository;

import alkostoapirest.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productoRepository extends JpaRepository<Producto, Integer> {

}
