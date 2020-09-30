package com.phdev.springwebservice.services;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.phdev.springwebservice.exceptions.FileStorageException;

@Service
public class FileService {

    @Value("${upload.path}")
    public String uploadPath;


    
    public void uploadImageUser(MultipartFile file) {

        try {
            Path copyLocation = Paths
                .get(uploadPath + file.getOriginalFilename());
            System.out.println(copyLocation);
            System.out.println(uploadPath);
            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
            throw new FileStorageException("Could not store file " + file.getOriginalFilename()
                + ". Please try again!");
        }
    }
    
    public void uploadImageProduct(MultipartFile file) {

        try {
            Path copyLocation = Paths
                .get(uploadPath + file.getOriginalFilename());
            System.out.println(copyLocation);
            System.out.println(uploadPath);
            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
            throw new FileStorageException("Could not store file " + file.getOriginalFilename()
                + ". Please try again!");
        }
    }
}
