package com.backend.porfolio.response;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Header {
       HashMap<String, String> header = new HashMap<String, String>();
       public Header(String type, String code, String affected){
    	   header.put("type", type);
    	   header.put("code", code);
    	   header.put("affected", affected);
       }
       
}
