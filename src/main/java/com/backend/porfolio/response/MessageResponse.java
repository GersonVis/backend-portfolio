package com.backend.porfolio.response;

import java.util.List;

import com.backend.porfolio.model.Message;

import ch.qos.logback.core.model.Model;
import lombok.Data;

@Data
public class MessageResponse {
      List<Model> data;
}
