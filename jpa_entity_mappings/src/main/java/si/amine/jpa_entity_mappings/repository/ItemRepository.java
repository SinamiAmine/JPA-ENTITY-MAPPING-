package si.amine.jpa_entity_mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import si.amine.jpa_entity_mappings.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
}
