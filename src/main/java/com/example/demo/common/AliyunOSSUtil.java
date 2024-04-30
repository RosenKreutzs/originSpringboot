package com.example.demo.common;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 阿里云OSS上传,下载, 删除文件工具类
 *
 */

public class AliyunOSSUtil {
    public void FileUp(String locationFile) {
        try {String dirMain="C:\\Users\\chell\\Desktop\\springboot_vue_book\\";
            // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
            //查看自己阿里云bucket概览中的地域节点
            String endpoint = "oss-cn-chengdu.aliyuncs.com";
            // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
            String accessKeyId = "LTAI5tMfJTKZn8TzjNZkkk12";
            String accessKeySecret = "EqM6o09dAVt21OxRkG2j5qAMB30wHU";

            // 创建OSSClient实例。
            OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

            String rootFilePath=dirMain+"springboot\\src\\main\\resources\\files\\"+locationFile;
            // 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
            InputStream inputStream = new FileInputStream(rootFilePath);
            // 依次填写Bucket名称（例如examplebucket）和Object完整路径（例如exampledir/exampleobject.txt）。Object完整路径中不能包含Bucket名称。
            ossClient.putObject("2023519tryoss", locationFile, inputStream);

            // 关闭OSSClient。
            ossClient.shutdown();
            System.out.println("对象存储上传成功");
        }catch ( FileNotFoundException e
        ){ System.out.println("文件未找到");}
    }
}