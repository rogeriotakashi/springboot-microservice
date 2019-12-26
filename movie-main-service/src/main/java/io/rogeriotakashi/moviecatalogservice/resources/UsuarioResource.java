package io.rogeriotakashi.moviecatalogservice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.rogeriotakashi.moviecatalogservice.domain.UsuarioDTO;
import io.rogeriotakashi.moviecatalogservice.services.UsuarioServiceFeign;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioServiceFeign usuarioService;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> getAllUsuarios(){
		return new ResponseEntity<>(usuarioService.getAllUsuarios(), HttpStatus.OK);
	}
	
	
	
	
}
