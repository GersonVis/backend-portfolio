package com.backend.porfolio.dao;
import com.backend.porfolio.model.Message;
import com.backend.porfolio.model.UsuarioP;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
public interface IUsuarioDao {
     List<UsuarioP> getUsuarios();
     void delete(Long id);
}
