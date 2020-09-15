package tacos.data;

//JPA 추가
import org.springframework.data.repository.CrudRepository;
import tacos.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{
	//Order save(Order order);
}
