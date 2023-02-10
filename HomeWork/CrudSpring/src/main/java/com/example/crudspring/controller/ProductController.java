package com.example.crudspring.controller;

import com.example.crudspring.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@Controller
//@RequestMapping("/product")
public class ProductController {
    private static List<Product> products=new ArrayList<>();
    private static int ID=1;

    @GetMapping("/product")
    //@GetMapping("")
    public String addProduct(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "product";
    }
    @GetMapping("/product/all")
    public String products(Model model){
        model.addAttribute("products", products);
        return "all_products";
    }
    @PostMapping("/product")
    public String add(@ModelAttribute Product product){
        products.add(new Product(ID++,"Яблоки", 150, 600));
        products.add(new Product(ID++,"Бананы", 120, 885));
        products.add(new Product(ID++,"Апельсины", 160, 450));
        product.setId(ID++);
        products.add(product);
        //System.out.println(product);
        return "redirect:/product/all";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Product product){
        for (Product prod:products) {
            if (prod.getId()==product.getId()){
                int index = products.indexOf(prod);
                products.set(index, product);
                break;
            }
        }
        return "redirect:/product/all";

    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id){
        for (Product product:products) {
            if (product.getId()==id){
                products.remove(product);
                break;
            }
        }
        return "redirect:/product/all";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model){
        for (Product product:products) {
            if (product.getId()==id){
                model.addAttribute("product", product);
                break;
            }
        }
        return "update_product";
    }
}
