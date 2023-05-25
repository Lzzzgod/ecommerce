package com.example.ecommerce.repository;
import com.example.ecommerce.models.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("pagamentoRepository")

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}