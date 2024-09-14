package com.nitzbits.controller;

import com.nitzbits.model.ImageTextModel;
import com.nitzbits.repository.ImageTextRepository;
import com.nitzbits.service.ImageTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("imgText")
public class ImageTextController {

//    private byte[] bytes;

    @Autowired
    private ImageTextService imageTextService;

    @GetMapping("/data")
    public List<ImageTextModel> getImageTexts(){
        return imageTextService.findAllInService();
    }


//    @PostMapping("/upload")
//    public void uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
//        this.bytes = file.getBytes();
//    }

    @PostMapping("/add")
    public void createImageText(@RequestBody ImageTextModel imageTextModel) throws IOException {
        imageTextService.saveImgTxtInService(imageTextModel);
//        this.bytes = null;
    }

    @GetMapping("/show-data/{id}")
    public Optional<ImageTextModel> getOneImageTextData(@PathVariable Long id){
        return imageTextService.getOneImgTxt(id);
    }


}
