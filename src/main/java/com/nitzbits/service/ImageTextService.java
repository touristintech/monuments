package com.nitzbits.service;

import com.nitzbits.model.ImageTextModel;
import com.nitzbits.repository.ImageTextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageTextService {

    @Autowired
    private ImageTextRepository imageTextRepository;

    public List<ImageTextModel> findAllInService(){
        return imageTextRepository.findAll();
    }

    public void saveImgTxtInService(ImageTextModel imageTextModel) {
        imageTextRepository.save(imageTextModel);
    }

    public Optional<ImageTextModel> getOneImgTxt(Long id){
        return imageTextRepository.findById(id);
    }
}
