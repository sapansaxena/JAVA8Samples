package com.person.java.demo;

import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class UploadCV {

	public static void main(String[] args) {
		try{
		CloseableHttpClient httpClient = HttpClients.createDefault();

		HttpPost post = new HttpPost("");
		File file = new File("files.txt");
		String firstname = "Sapan";
		String lastname = "Saxena";
		//
		String email = "sapan.aries@gmail.com";
		String jobtitle = "Software Engineer";
		String source = "LinkedIn";
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		builder.addBinaryBody("file", file, ContentType.DEFAULT_BINARY, "Resume.doc");
		builder.addTextBody("firstname", firstname, ContentType.DEFAULT_BINARY);
		builder.addTextBody("lastname", lastname, ContentType.DEFAULT_BINARY);
		builder.addTextBody("email", email, ContentType.DEFAULT_BINARY);
		builder.addTextBody("jobtitle", jobtitle, ContentType.DEFAULT_BINARY);
		builder.addTextBody("source", source, ContentType.DEFAULT_BINARY);
		// 
		HttpEntity entity = builder.build();
		post.setEntity(entity);
		HttpResponse response = httpClient.execute(post);
		System.out.println(response);
	}catch(Exception e){
		System.out.println(e);
	}
	}
}
