package com.perfios.demoDms.ServiceImpl;


import com.perfios.demoDms.Model.FileModel;
import com.perfios.demoDms.Service.DmsService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Component
public class DmsServiceImpl implements DmsService {

    @Override
    public String uploadFile(MultipartFile file, @RequestParam String fileYear, @RequestParam String bankName, @RequestParam String accountNo) throws IOException {
        long fileSize = file.getSize();
        String fileName = file.getOriginalFilename(), extension = file.getContentType();
        if(!file.isEmpty() && fileSize <= 268435456){
            String homePath = System.getProperty("user.home");
            String localPath = homePath + "/Desktop/" + fileYear + "/" + bankName +  "/" + accountNo;

//            code to create directory if it doesnt exist
            File directory = new File(localPath);
            directory.mkdirs();

            file.transferTo(new File(localPath + "/" + fileName));

            return  fileName + " uploaded successfully";
        }
        else if(!file.isEmpty() && fileSize > 268435456){
            return "work in progress for larger files";
        }
        return "please select a file to upload";
    }

}
