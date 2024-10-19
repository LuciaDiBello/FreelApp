package com.freeIapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.freeIapp.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
    List<Cliente> findByPartitaIva(String partitaIva);
}
