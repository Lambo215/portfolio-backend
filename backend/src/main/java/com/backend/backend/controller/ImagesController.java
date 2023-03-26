package com.backend.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.model.Images;
import com.backend.backend.service.IImagesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ImagesController {

    @Autowired
    private IImagesService imgServ;

    @PostMapping("/new/image")
    public void addImage(@RequestBody Images images) {
        imgServ.saveImages(images);
    }

    @GetMapping("/view/images")
    @ResponseBody
    public List<Images> getImages() {
        return imgServ.getImages();
    }

    @DeleteMapping("/delete/images/{id}")
    public void deleteImages(@PathVariable Long id) {
        imgServ.deleteImages(id);
    }

}
