package com.topacademy.springcrud.controller;

//import ch.qos.logback.core.model.Model;
import com.topacademy.springcrud.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/product")
public class ProductController {

    public static List<Product> products=new ArrayList();

    @GetMapping("/product")
    //@GetMapping("")
    //@RequestMapping(value = "", method = RequestMethod.GET)
    public String addProduct(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "product";
    }
    @GetMapping("/product/all")
    public String products(Model model){
        products.add(new Product("dd", 2, 6));
        System.out.println(products.get(0));
        System.out.println("products.get(0)");
        model.addAttribute("product1", products);
        return "all_products";
    }
    @PostMapping("/product")
    public String add(@ModelAttribute Product product){
        //products.add(product);
        //products.add(new Product("dd", 2, 6));
        //System.out.println(product);
        return "redirect: /product/all";

    }

}
