package StoreStart.dao;

import StoreStart.entity.User;
import java.util.List;

public interface UserDAO {
    void save(User user);
    User findById(Long id);
    List<User> findAll();
    User findByUsername(String username);
}
