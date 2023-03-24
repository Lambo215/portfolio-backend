package com.backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.model.Images;
import com.backend.backend.repository.ImagesRepository;

@Service
public class ImagesService implements IImagesService {

    @Autowired
    public ImagesRepository imgRepo;

    @Override
    public List<Images> getImages() {
        return imgRepo.findAll();
    }

    @Override
    public void saveImages(Images images) {
        imgRepo.save(images);

    }

    @Override
    public void deleteImages(Long id) {
        imgRepo.deleteById(id);

    }

}
