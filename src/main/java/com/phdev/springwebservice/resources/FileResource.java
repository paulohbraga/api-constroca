package com.phdev.springwebservice.resources;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.phdev.springwebservice.services.FileService;

@RestController
public class FileResource {

    @Autowired
    FileService fileService;

    @GetMapping("/upload")
    public String index() {
        return "upload";
    }

    @PostMapping("/uploadimageuser")
    public String uploadimageuser(@RequestParam("file") MultipartFile file) {

        fileService.uploadImageUser(file);
        return "Imagem salva com sucesso";
    }
    
    @PostMapping("/uploadimageproduct")
    public String uploadimageproduct(@RequestParam("file") MultipartFile file) {

        fileService.uploadImageProduct(file);


        return "Imagem salva com sucesso";
    }
    
    @PostMapping("/uploadftp")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) throws Exception {
    	
    	ChannelSftp sftp = connect();
		sftp.cd("/var/www/html/paulo/");
		sftp.put(file.getInputStream(), file.getOriginalFilename());
		disconnect(sftp);
 	    
 	    return "Imagem salva com sucesso";
    }
    
    
    public static ChannelSftp connect() throws Exception {
    	
    	String host = System.getenv("HOST");
    	String username = System.getenv("USERNAME");
    	String password = System.getenv("PASSWORD");
    	String port = System.getenv("PORT_HOST");

		JSch jsch = new JSch();
		Session sshSession = jsch.getSession(username, host, Integer.parseInt(port));

		sshSession.setPassword(password);
		Properties sshConfig = new Properties();
		sshConfig.put("StrictHostKeyChecking", "no");
		sshSession.setConfig(sshConfig);
		sshSession.connect(20000);

		Channel channel = sshSession.openChannel("sftp");
		channel.connect();

		return (ChannelSftp) channel;
	}

	public static void disconnect(ChannelSftp sftp) throws Exception {
		if (sftp != null) {
			if (sftp.isConnected()) {
				sftp.disconnect();
			} else if (sftp.isClosed()) {
			}
		}
	}
}