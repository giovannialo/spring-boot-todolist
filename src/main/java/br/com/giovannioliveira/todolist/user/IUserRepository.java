package br.com.giovannioliveira.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    // Com o Spring Data, é possível criar um método para ser utilizado na consulta de dados apenas informando
    // o tipo de returno + nome do método + atributo que deseja procurar.
    UserModel findByUsername(String username);
}
