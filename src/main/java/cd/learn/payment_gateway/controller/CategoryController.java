package cd.learn.payment_gateway.controller;

import cd.learn.payment_gateway.model.Category;
import cd.learn.payment_gateway.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategory(){
            return new ResponseEntity<List<Category>>(categoryService.getAll(),HttpStatus.OK)  ;
    }
}
