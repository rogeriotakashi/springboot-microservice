package io.rogeriotakashi.moviecatalogservice.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.rogeriotakashi.moviecatalogservice.domain.UsuarioDTO;

@FeignClient(value = "usuario-service")
public interface UsuarioServiceFeign {

	@RequestMapping(method = RequestMethod.GET, value = "/api/usuarios/")
	List<UsuarioDTO> getAllUsuarios();
}
