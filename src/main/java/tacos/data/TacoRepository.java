package tacos.data;

//JPA 추가
import org.springframework.data.repository.CrudRepository;
import tacos.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long>{
	//Taco save(Taco design);
}
