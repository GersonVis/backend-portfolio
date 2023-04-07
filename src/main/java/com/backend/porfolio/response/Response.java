package com.backend.porfolio.response;

import java.util.HashMap;

public class Response {
	   HashMap<String, String> header = new HashMap<String, String>();
       public void setHeader(Header header) {
    	   this.header=header.getHeader();
       }
       public HashMap<String, String> getHeader() {
    	   return header;
       }
}
