package cd.learn.payment_gateway.repository;

import cd.learn.payment_gateway.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {

    List<Category> findAll();
}
