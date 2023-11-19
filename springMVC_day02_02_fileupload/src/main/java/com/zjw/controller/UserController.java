package com.zjw.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * @author 朱俊伟
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 不知道为什么，上传的list里面是空的。
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("fileUpload")
    public String fileUpload(HttpServletRequest request) throws Exception {
        //先获取到要上传的文件目录
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        System.out.println(path);
        //创建File对象，一会儿向该路径下上传文件
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
        //创建磁盘文件项工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload fileUpload = new ServletFileUpload(factory);
        //解析request对象
        List<FileItem> list = fileUpload.parseRequest(request);
        //遍历
        for(FileItem fileItem : list){
            //判断文件项是普通字段，还是上传的文件
            if (fileItem.isFormField()){

            }else {
                //上传文件项目
                //获取到上传文件的名称
                String fileName = fileItem.getName();
                //上传文件
                fileItem.write(new File(file,fileName));
                //删除临时文件
                fileItem.delete();
            }
        }

        return "success";
    }

    @RequestMapping("fileUpload2")
    public String fileUpload2(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("SpringMVC方式的文件上传。。。");
        //先获取到要上传的文件目录
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        System.out.println(path);
        //创建File对象，一会儿向该路径下上传文件
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
        //获取到文件上传的名字
        String fileName = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        fileName = uuid+"_"+fileName;
        //上传文件
        upload.transferTo(new File(file,fileName));
        return "success";
    }

    /**
     * 暂时不能上传中文名字文件，不知道为啥
     * @param upload
     * @return
     * @throws Exception
     */
    @RequestMapping("fileUpload3")
    public String fileUpload3(MultipartFile upload) throws Exception {
        System.out.println("跨服务器文件上传。。。");
        //先获取到要上传的文件目录
//        String path = "http://localhost:9090/2/img/";
        String path = "http://192.168.234.128:8080/2/img/";

        //获取到文件上传的名字
        String fileName = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        fileName = uuid+"_"+fileName;

        //向图片服务器上传文件
        //创建客户端对象
        Client client = Client.create();
        //连接图片服务器
        WebResource webResource = client.resource(path+fileName);
        //上传文件
        webResource.put(upload.getBytes());
//        webResource.post(upload.getBytes());
        return "success";
    }

}
