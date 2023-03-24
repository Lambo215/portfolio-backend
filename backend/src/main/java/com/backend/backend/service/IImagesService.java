package com.backend.backend.service;

import java.util.List;

import com.backend.backend.model.Images;

public interface IImagesService {

    public List<Images> getImages();

    public void saveImages(Images education);

    public void deleteImages(Long id);
}
