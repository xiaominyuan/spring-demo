package com.yxm.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UploadServlet extends HttpServlet {
    private static final long serialVerssionUID=1L;
    private static final String upload_directory="upload";
    private static final int memory_threshold=1024*1024*30;
    private static final int max_file_size=1024*1024*400;
    private static final int max_request_size=1024*1024*500;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=(String) req.getSession().getAttribute("userName");
        if (!ServletFileUpload.isMultipartContent(req)){
            PrintWriter writer=resp.getWriter();
            writer.println("error:表单必须包括enctype=multipart/form-data");
            writer.flush();
            return;
        }
        DiskFileItemFactory factory=new DiskFileItemFactory();
        factory.setSizeThreshold(memory_threshold);
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
        ServletFileUpload upload=new ServletFileUpload(factory);
        upload.setFileSizeMax(max_file_size);
        upload.setSizeMax(max_request_size);
        String path="";
        String dizhi=File.separator+upload_directory;
        dizhi.replace("\\","/");
        String path3="/static/userHead_Top"+dizhi;
        String uploadPath=path+path3;
        File uploadDir=new File(uploadPath);
        if (!uploadDir.exists()){
            uploadDir.mkdir();
        }
        try {
            List<FileItem> formitems=upload.parseRequest(req);
            if (formitems!=null&&formitems.size()>0){
                for (FileItem fileItem:formitems){
                    ProDto dto=new ProDto();
                    req.getSession().setAttribute("dto",dto);
                    if (!fileItem.isFormField()){
                        String fileName=new File(fileItem.getName()).getName();
                        String reg="[\u4e00-\u9fa5]";
                        Pattern pattern=Pattern.compile(reg);
                        Matcher matcher=pattern.matcher(fileName);
                        fileName= matcher.replaceAll("");

                        String filePath=uploadPath+File.separator+fileName;
                        filePath=filePath.replace("\\","/");
                        String wuuu=path3+"/"+fileName;
                        req.getSession().setAttribute("wuuu",wuuu);
                        File storefile=new File(filePath);
                        InputStream in=fileItem.getInputStream();
                        OutputStream out=new FileOutputStream(storefile);
                        long max=fileItem.getSize();
                        long other=max;
                        int len=0;
                        byte[] b=new byte[300];
                        dto.setFileName("fileName");
                        dto.setMax(max);

                    }
                }
            }
        }catch (Exception ex){

        }
    }
}
