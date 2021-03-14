package com.luigi.servicio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.luigi.modelo.Pedidos;

@EnableJpaRepositories
@Repository
public interface IPedidos extends JpaRepository<Pedidos, Long> {

}
