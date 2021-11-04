package io.github.lcseferreira.clientes.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

// ENTIDADE
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column
    private LocalDate dataCadastro;
}
