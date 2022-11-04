package cat.itacademy.barcelonactiva.sanmiguelalonsogonzalo.s04.t02.n03.model.services;

import cat.itacademy.barcelonactiva.sanmiguelalonsogonzalo.s04.t02.n03.model.domain.Fruita;
import java.util.List;

public interface IFruitesService {

    // Method showing all the records
    List<Fruita> getAll();

    // Method saving a record
    Fruita save(Fruita newFruita);

    // Method to delete a record
    void delete(String id);

    // Method returning a record requested
    Fruita getOne(String id) throws RuntimeException;


}