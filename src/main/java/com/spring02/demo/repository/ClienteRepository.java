
package com.spring02.demo.repository;

import com.spring02.demo.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
