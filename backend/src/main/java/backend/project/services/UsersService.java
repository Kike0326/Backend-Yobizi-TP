package backend.project.services;

import backend.project.entities.Users;
import java.util.List;

public interface UsersService {
    public Users createUser(Users user);
    public void deleteUser(Users user);
    public List<Users> getAllUsers();

}
