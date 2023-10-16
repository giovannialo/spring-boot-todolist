package br.com.giovannioliveira.todolist.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

// @Data pertence ao pacote "lombok" e serve para adicionar os métodos getters e setters
// Para adicionar somente os getters, usa-se @Getter e, para setters, usa-se @Setter.
// Se quiser adicionar para atributos específicos, essa annotation deve ser adicionada acima da declaração do atributo.
@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    // Para escolher um nome diferente da coluna que vai ser criada no banco de dados
    // usa-se @Column(name = "nomeDaColuna")
    @Column(unique = true)
    private String name;
    private String username;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
