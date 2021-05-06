package com.devsuperior.dsvendas.Service;

import com.devsuperior.dsvendas.DTO.SaleDto;
import com.devsuperior.dsvendas.DTO.SaleSuccessDto;
import com.devsuperior.dsvendas.DTO.SaleSumDto;
import com.devsuperior.dsvendas.Repositories.SaleRepository;
import com.devsuperior.dsvendas.Repositories.SellerRepository;
import com.devsuperior.dsvendas.entities.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SellerRepository sellerRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Transactional(readOnly = true)
    public Page<SaleDto> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(x-> new SaleDto(x));
    }
    @Transactional(readOnly = true)
    public List<SaleSumDto> amountGroupedBySeller(){
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDto> successGroupedBySeller(){
        return saleRepository.successGroupedBySeller();
    }
}
