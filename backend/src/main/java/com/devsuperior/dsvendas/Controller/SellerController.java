package com.devsuperior.dsvendas.Controller;

import com.devsuperior.dsvendas.DTO.SellerDto;
import com.devsuperior.dsvendas.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
    @Autowired
    private SellerService sellerService;

    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @GetMapping
    public ResponseEntity<List<SellerDto>> findAll(){
        List<SellerDto> list = sellerService.findAll();
        return ResponseEntity.ok(list);
    }

}
