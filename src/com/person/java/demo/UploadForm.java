package com.person.java.demo;

import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class UploadForm {

	public static void main(String[] args) {
		try{
		CloseableHttpClient httpClient = HttpClients.createDefault();

		File file = new File("Resume.doc");
		HttpPost post = new HttpPost("http://cvu.zanox.com/rest/upload/cv");
	//	HttpPost post = new HttpPost("http://www.google.com");
		FileBody fileBody = new FileBody(file, ContentType.DEFAULT_BINARY);
		StringBody firstname = new StringBody("Sapan", ContentType.MULTIPART_FORM_DATA);
		StringBody lastname = new StringBody("Saxena", ContentType.MULTIPART_FORM_DATA);
		//
		StringBody email = new StringBody("sapan.aries@gmail.com", ContentType.MULTIPART_FORM_DATA);
		StringBody jobtitle = new StringBody("Software Engineer", ContentType.MULTIPART_FORM_DATA);
		StringBody source = new StringBody("LinkedIn", ContentType.MULTIPART_FORM_DATA);

		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		builder.addPart("file", fileBody);
		builder.addPart("firstname", firstname);
		builder.addPart("lastname", lastname);
		builder.addPart("email", email);
		builder.addPart("jobtitle", email);
		builder.addPart("source", email);
		HttpEntity entity = builder.build();
		//
		post.setEntity(entity);
		
		HttpResponse response = httpClient.execute(post);
		System.out.println(response);
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
