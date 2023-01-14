
package com.spring02.demo.repository;

import com.spring02.demo.modelo.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository<Tecnologia, Long>{
    
}
