package com.perfios.demoDms.Controller;

import com.perfios.demoDms.Model.FileModel;
import com.perfios.demoDms.Service.DmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class DmsController {

    @Autowired
    DmsService dmsService;

    @PostMapping("/upload")
    public String uploadFileToLocal(@RequestParam("file")MultipartFile file, @RequestParam String fileYear, @RequestParam String bankName, @RequestParam String accountNo) throws IOException {
        return dmsService.uploadFile(file,fileYear, bankName, accountNo);
    }

//    @GetMapping("/download")

}
