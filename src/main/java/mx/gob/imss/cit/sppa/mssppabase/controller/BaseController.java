/**
 * 
 */
package mx.gob.imss.cit.sppa.mssppabase.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import mx.gob.imss.cit.sppa.mssppabase.service.BaseService;

/**
 * 
 */
@Log4j2
@RestController
@RequestMapping("/base")
@RequiredArgsConstructor
public class BaseController {

	private final BaseService baseService;

	@GetMapping("/hola")
	public ResponseEntity<?> prueba(@RequestParam(required = false) Integer test) {
		log.info("prueba param{} ", test);
		return baseService.getBasePrueba(1);
	}

	@GetMapping("/hola2")
	public ResponseEntity<?> pruebaDto() {
		log.info("prueba pruebaDto");
		return baseService.getBasePruebaDto();
	}

	@GetMapping("/hola3")
	public ResponseEntity<?> pruebaEntidad() {
		log.info("prueba param");
		return baseService.getBasePruebaEntidad();
	}
}
