package com.bear.start.controller;

import com.bear.start.domain.Status;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 文件上传
 *
 * @author xiaoxiong
 * @date 2020/3/15
 */
@Controller
public class FileController {
    private static String FILEPATH = "E:\\";

    @RequestMapping(value = "/upload")
    @ResponseBody
    public Status uploadFile(@RequestParam(value = "upload_file")MultipartFile file, HttpServletRequest request){
        String fileName = file.getOriginalFilename();
        System.out.println("上传文件名字："+fileName);
        String userName = request.getParameter("userName");
        System.out.println("上传者名字"+userName);
        //.在名字中的索引位置
        int i = fileName.lastIndexOf(".");
        //从.开始截取（后缀名）
        String substring = fileName.substring(i);

        //生成一个uuid
        UUID uuid = UUID.randomUUID();
        fileName = uuid+substring;

        File dest = new File(FILEPATH + fileName);
        try {
            file.transferTo(dest);
            Status status = new Status("200",dest);
            return status;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Status("400",null,"error");
    }
}
