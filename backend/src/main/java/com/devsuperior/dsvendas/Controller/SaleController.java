package com.devsuperior.dsvendas.Controller;

import com.devsuperior.dsvendas.DTO.SaleDto;
import com.devsuperior.dsvendas.DTO.SellerDto;
import com.devsuperior.dsvendas.Service.SaleService;
import com.devsuperior.dsvendas.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    public SaleController(SaleService sellerService) {
        this.saleService = sellerService;
    }

    @GetMapping
    public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
        Page<SaleDto> list = saleService.findAll(pageable);
        return ResponseEntity.ok(list);
    }

}
