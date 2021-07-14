package com.developer.api.service;

import com.developer.api.dao.DeveloperDao;
import com.developer.api.dao.model.Developer;
import com.developer.api.service.exception.DeveloperNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperService {

    private final DeveloperDao developerDao;

    public DeveloperService(DeveloperDao developerDao) {
        this.developerDao = developerDao;
    }

    public Developer findDeveloperById(Long developerId) {
        return developerDao.findById(developerId)
                .orElseThrow(
                        () -> new DeveloperNotFoundException(
                                String.format(
                                        "Developer not found by developer id [%s]",
                                        developerId
                                )
                        ));
    }

    public List<Developer> getAllDevelopers() {
        return developerDao.findAll();
    }

    public Developer createDeveloper(Developer developer) {
        return developerDao.save(developer);
    }

    public Developer updateDeveloper(Developer developer) {
        return developerDao.findById(developer.getId())
                .map((dev) -> {
                    dev.setName(developer.getName());
                    dev.setEmail(developer.getEmail());
                    return developerDao.save(dev);
                }).orElseGet(() -> developerDao.save(developer));
    }
}
