package com.confin.confinbackendapi.controller;

import com.confin.confinbackendapi.model.Model;
import com.confin.confinbackendapi.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {

    @Autowired
    private ModelRepository modelRepository;

    public ModelController(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @PostMapping("/")
    public Model add(@RequestBody Model model) {
        System.out.println(model.getName());
        return modelRepository.save(model);
    }
}
