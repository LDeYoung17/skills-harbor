package dev.skillsharbor.repos;

import dev.skillsharbor.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Component // please read this class/interface and use it to make beans
@Repository // stereotype saying this class is used to save data
//<entity,type of the Primary Key>
public interface UsersRepo extends CrudRepository<Users,Integer> {

    // Spring Data abstract methods
    // You can define extra methods for your Repo
    // Spring Data will auto create the implementation for it
    // Must follow spring data naming conventions for abstract methods
    Set<Book> findBooksByBookCondition(int condition);
    Set<Book> findBooksByAuthorLike(String name);
    Set<Book> findBooksByBookConditionBetween(int lower,int higher);

    // findEntityByFieldCondition

}