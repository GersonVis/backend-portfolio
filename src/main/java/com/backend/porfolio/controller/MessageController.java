package com.backend.porfolio.controller;

import java.io.IOError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.porfolio.dao.IMessageDao;
import com.backend.porfolio.model.Message;
import com.backend.porfolio.model.Model;
import com.backend.porfolio.model.Recivido;
import com.backend.porfolio.response.Header;
import com.backend.porfolio.response.MessageResponseRest;
import com.backend.porfolio.response.Response;
import com.local.inventory.model.Product;
import com.local.inventory.response.ProductResponse;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@RestController
public class MessageController {
    @Autowired
    private IMessageDao messageDao;
    
    @RequestMapping(value="messages", method= RequestMethod.GET)
    public List<Model> getMessages(){
    	return messageDao.getMessages();
    }
    
    @RequestMapping(value="prueba", method = RequestMethod.GET)
    public ResponseEntity<MessageResponseRest> prueba(){
    	MessageResponseRest consulta=new MessageResponseRest();
    	consulta.setHeader(new Header("consulta", "00", "-1"));
    	consulta.setData(messageDao.getMessages());
    	return new ResponseEntity<MessageResponseRest>(consulta, HttpStatus.ACCEPTED);
    }
    
    @PostMapping("message/insert")
    public ResponseEntity<Response> insert(@RequestBody Message message){
    	Response respuesta = new Response();
    	respuesta.getData().add(message);
    	respuesta.setHeader(new Header("insert", "00", "1"));
    	try {
    		messageDao.insert(message);
    		
    	}catch(IOError e) {
    		return new ResponseEntity<Response>(respuesta, HttpStatus.ACCEPTED);
    	}
    	
    	//if(messageDao.insert(message)) {
    		respuesta.setHeader(new Header("insert", "-1", "0"));	
    //	}
    	return new ResponseEntity<Response>(respuesta, HttpStatus.ACCEPTED);
    }
}


/*
class Response{
	private ArrayList<HashMap<String, String>> informacionConsulta = new ArrayList<HashMap<String, String>>();

	public ArrayList<HashMap<String, String>> getInformacionConsulta() {
		return informacionConsulta;
	}

	public void setgetInformacionConsulta(String type, String code, String date) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("type", type);
		map.put("code", code);
		map.put("date", date);
		map.put("datedddd", date);
		//agregamos el diccionario al metadato
		informacionConsulta.add(map);
	}
	
}


@Getter
@Setter
class MessageRestImp{
	public String getHola() {
		return "hola";
	}
	
}

*/




