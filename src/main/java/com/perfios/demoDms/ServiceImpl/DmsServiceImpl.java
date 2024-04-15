package com.perfios.demoDms.ServiceImpl;


import com.perfios.demoDms.Service.DmsService;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class DmsServiceImpl implements DmsService {

    @Override
    public String uploadFile(MultipartFile file,String filePath) {
        return null;
    }
}
