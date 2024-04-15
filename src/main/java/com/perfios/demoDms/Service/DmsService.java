package com.perfios.demoDms.Service;

import com.perfios.demoDms.ServiceImpl.DmsServiceImpl;
import org.springframework.web.multipart.MultipartFile;

public interface DmsService {
    String uploadFile(MultipartFile file, String filePath);
}
