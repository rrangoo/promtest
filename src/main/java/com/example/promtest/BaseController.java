package com.example.promtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bazhov N.S.
 */
@RestController
public class BaseController {
    @GetMapping
    public String endpoint(){
        return "hello world";
    }
}
