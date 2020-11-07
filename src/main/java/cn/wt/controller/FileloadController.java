package cn.wt.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("/fileUpload")
@Controller
public class FileloadController {

    @RequestMapping(value = "/upload1", method = RequestMethod.POST)
    public String upload(@RequestParam("img") MultipartFile file, @RequestParam("username") String username, Model model) throws IOException {
        System.out.println(username);
        System.out.println("文件名字:" + file.getName());
        file.transferTo(new File("D:\\" + file.getOriginalFilename()));
        model.addAttribute("msg", "文件上传成功");
        return "forward:/index.jsp";
    }
}
