package com.perfios.demoDms.Service;

import com.perfios.demoDms.Model.FileModel;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface DmsService {
    String uploadFile(MultipartFile file, @RequestParam String fileYear, @RequestParam String bankName, @RequestParam String accountNo) throws IOException;
}
