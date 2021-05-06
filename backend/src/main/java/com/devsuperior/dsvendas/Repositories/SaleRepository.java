package com.devsuperior.dsvendas.Repositories;

import com.devsuperior.dsvendas.DTO.SaleSuccessDto;
import com.devsuperior.dsvendas.DTO.SaleSumDto;
import com.devsuperior.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    @Query("SELECT new com.devsuperior.dsvendas.DTO.SaleSumDto(obj.seller, sum(obj.amount))"
            + " from Sale as obj group by obj.seller")
    List<SaleSumDto> amountGroupedBySeller();

    @Query("SELECT new com.devsuperior.dsvendas.DTO.SaleSuccessDto(obj.seller, sum(obj.visited), sum(obj.deals))"
            + " from Sale as obj group by obj.seller")
    List<SaleSuccessDto> successGroupedBySeller();
}
