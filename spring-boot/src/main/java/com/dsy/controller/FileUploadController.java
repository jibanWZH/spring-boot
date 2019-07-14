package com.dsy.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
//SpringBoot文件上传
@RestController
public class FileUploadController {
  @RequestMapping("/fileUploadController")
  public Map<String,Object> fileUpload(MultipartFile fileName) throws IOException {
    System.out.println(fileName.getOriginalFilename());
    fileName.transferTo(new File("E:/"+fileName.getOriginalFilename()));
      Map<String,Object> map = new HashMap<>();
      map.put("msg","上传成功");
    return map;
  }
}
