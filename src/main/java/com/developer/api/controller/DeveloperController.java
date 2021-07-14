package com.developer.api.controller;

import com.developer.api.dao.model.Developer;
import com.developer.api.service.DeveloperService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/developer")
public class DeveloperController {
    private DeveloperService developerService;

    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @GetMapping("/getById/{id}")
    public Developer findDeveloperById(@PathVariable Long id) {
        return developerService.findDeveloperById(id);
    }

    @GetMapping("/getAll")
    public List<Developer> getAllDevelopers() {
        return developerService.getAllDevelopers();
    }

    @PostMapping("/createDeveloper")
    public Developer createDeveloper(@RequestBody Developer developer) {
        return developerService.createDeveloper(developer);
    }

    @PutMapping("/updateDeveloper")
    public Developer updateDeveloper(@RequestBody Developer developer) {
        return developerService.updateDeveloper(developer);
    }
}
