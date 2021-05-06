package com.devsuperior.dsvendas.Service;

import com.devsuperior.dsvendas.DTO.SaleDto;
import com.devsuperior.dsvendas.DTO.SellerDto;
import com.devsuperior.dsvendas.Repositories.SaleRepository;
import com.devsuperior.dsvendas.Repositories.SellerRepository;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.entities.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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
}
