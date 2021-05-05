package com.devsuperior.dsvendas.Service;

import com.devsuperior.dsvendas.DTO.SellerDto;
import com.devsuperior.dsvendas.Repositories.SellerRepository;
import com.devsuperior.dsvendas.entities.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    public List<SellerDto> findAll() {
        List<Seller> result = sellerRepository.findAll();
        return result.stream().map(x-> new SellerDto(x)).collect(Collectors.toList());
    }
}
