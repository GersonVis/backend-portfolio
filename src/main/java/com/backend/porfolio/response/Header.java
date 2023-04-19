package com.backend.porfolio.response;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Header {
       HashMap<String, Object> header = new HashMap<String, Object>();
       /**  
        * @param type
        * @param code
        * @param num_registers
        * @param state
        */
       public Header(String type, String code, String num_registers, boolean state){
    	   header.put("type", type);
    	   header.put("code", code);
    	   header.put("size", num_registers);
    	   header.put("state", state);
       }
   
}
