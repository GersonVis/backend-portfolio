package com.backend.porfolio.response;
import java.util.HashMap;
import java.util.ArrayList;

public class ResponseRest {
	private ArrayList<HashMap<String, String>> metadata = new ArrayList<HashMap<String, String>>();
    
	
	public ArrayList<HashMap<String, String>> getMetadata(){
		return metadata;
	}
	
	public void setMetadata(String type, String code, String date) {
		
		//aquí creamos la cabecera de la respuesta de la consulta
		// para la api
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("type", type);
		map.put("code", code);
		map.put("date", date);
		
		metadata.add(map);
	}
}
