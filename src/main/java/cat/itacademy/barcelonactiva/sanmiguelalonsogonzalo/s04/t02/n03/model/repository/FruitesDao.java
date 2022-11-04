package cat.itacademy.barcelonactiva.sanmiguelalonsogonzalo.s04.t02.n03.model.repository;

import cat.itacademy.barcelonactiva.sanmiguelalonsogonzalo.s04.t02.n03.model.domain.Fruita;
import org.springframework.data.mongodb.repository.MongoRepository;


//  FruitesDao nos permite Integer?
public interface FruitesDao extends MongoRepository<Fruita, String> {


}