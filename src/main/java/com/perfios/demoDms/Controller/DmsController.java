package com.perfios.demoDms.Controller;

import com.perfios.demoDms.Service.DmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class DmsController {

    @Autowired
    DmsService dmsService;

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file")MultipartFile file, @RequestBody String filePath){
        dmsService.uploadFile()
        return "ok";
    }
}
