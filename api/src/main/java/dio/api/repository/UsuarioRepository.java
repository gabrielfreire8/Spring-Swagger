package dio.api.repository;

import dio.api.handler.BusinessException;
import dio.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if (usuario.getLogin()==null){
            throw new BusinessException("O campo login é obrigatorio");
        }
        if(usuario.getId()==null)
            System.out.println("Save - recebendo o usuario repository");
        else
            System.out.println("Update - recebendo o usuario repository");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("Delete/id - recebendo o id"));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("List - listando os usuarios");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Gabriel" , "Password"));
        usuarios.add(new Usuario("Jack", "|Senha"));
        return usuarios;
    }

    public Usuario FindById(Integer id){
        System.out.println(String.format("Find/id - recebendo"));
        return new Usuario("Gabriel", "Password");
    }

    public Usuario FindByUsername(String username){
        System.out.println(String.format("Find/username - recebendo"));
        return new Usuario("Gabriel", "Password");
    }


}
