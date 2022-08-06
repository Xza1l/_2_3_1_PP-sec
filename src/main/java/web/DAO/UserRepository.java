package web.DAO;

import org.springframework.stereotype.Repository;
import web.Model.User;

@Repository
public interface UserRepository {
    User getUserByName(String username);
}
