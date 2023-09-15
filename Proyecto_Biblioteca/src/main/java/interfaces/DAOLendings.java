package interfaces;

import models.Books;
import models.Lendings;
import models.Users;
import java.util.List;

public interface DAOLendings {
    public void registrar(Lendings lending) throws Exception;
    public void modificar(Lendings lending) throws Exception;
    public Lendings getLending(Users user, Books book) throws Exception;
    // public void eliminar(Lendings user) throws Exception;
    public List<Lendings> listar() throws Exception;
}
