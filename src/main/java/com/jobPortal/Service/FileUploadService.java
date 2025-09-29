package com.jobPortal.Service;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.jobPortal.Security.CloudinaryConfig;

@Service 
public class FileUploadService {
  
	@Autowired
	private CloudinaryConfig cloudinaryConfig;
	
	@SuppressWarnings("unused")
	@Autowired
	private Cloudinary cloudinary;
	
	@SuppressWarnings("unchecked")
	public String uploadFile(MultipartFile file, String folder) throws IOException {
		try {
			Map<String, Object> uploadFile=cloudinaryConfig.cloudinary().uploader().upload(file.getBytes(),ObjectUtils.asMap("folder",folder));
			return (String) uploadFile.get("secure_url");
		}
		catch(IOException e) {
			e.printStackTrace();
			//throw new RuntimeException("Failed to upload the files",e);
		}
		return null;
	}
}

