package com.backend.porfolio.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.backend.porfolio.model.Message;
import com.backend.porfolio.model.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {
	   HashMap<String, String> header = new HashMap<String, String>();
	  
	//   List<Object> data=new ArrayList<>();
	   
       public void setHeader(Header header) {
    	   this.header=header.getHeader();
       }
       public HashMap<String, String> getHeader() {
    	   return header;
       }
}
