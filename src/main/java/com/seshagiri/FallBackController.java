package com.seshagiri;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class FallBackController {

    @GetMapping("/orders-fallback")
    public String ordersFallback(){
        return "Order Fall Back";
    }

    @GetMapping("/products-fallback")
    public String ProductsFallback(){
        return "Product Fall Back";
    }
    
}
