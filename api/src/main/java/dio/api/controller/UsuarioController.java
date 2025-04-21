package dio.api.controller;

import dio.api.model.Usuario;
import dio.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.findAll();

    }
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.FindByUsername(username);
    }
    @DeleteMapping("/users/{id}")
    public void delete(Integer id){
        repository.deleteById(id);
    }
    @PostMapping()
        public void postUser(@RequestBody Usuario usuario){
            repository.save(usuario);
    }
    @PutMapping ()
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }


}
