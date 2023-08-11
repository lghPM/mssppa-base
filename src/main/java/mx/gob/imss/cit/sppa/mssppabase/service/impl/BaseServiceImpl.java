/**
 * 
 */
package mx.gob.imss.cit.sppa.mssppabase.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.gob.imss.cit.sppa.mssppabase.model.entityDto.DelegacionDto;
import mx.gob.imss.cit.sppa.mssppabase.model.projection.CatalogoView;
import mx.gob.imss.cit.sppa.mssppabase.persistence.entity.Delegacion;
import mx.gob.imss.cit.sppa.mssppabase.persistence.repository.DelegacionRepository;
import mx.gob.imss.cit.sppa.mssppabase.service.BaseService;

/**
 * 
 */
@Log4j2
@Service
public class BaseServiceImpl implements BaseService {

	@Autowired
	DelegacionRepository delegacionRepository;

	@Override
	public ResponseEntity<List<CatalogoView>> getBasePrueba(Integer id) {
		log.info("inicio getBasePrueba {}", id);
		List<CatalogoView> catalogosPrueba = Collections.emptyList();
		try {
			catalogosPrueba = delegacionRepository.findDelegacionView();
		} catch (Exception e) {
			log.error("Exception getBasePrueba", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(catalogosPrueba, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<DelegacionDto>> getBasePruebaDto() {
		List<DelegacionDto> delegacionDtos = Collections.emptyList();
		List<Delegacion> delegacion = Collections.emptyList();
		try {
			delegacion = delegacionRepository.findAll();
			delegacionDtos = null; // ObjectMapperUtils.mapAll(delegacion, DelegacionDto.class);
		} catch (Exception e) {
			log.error("Exception getBasePruebaDto", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(delegacionDtos, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Delegacion>> getBasePruebaEntidad() {
		List<Delegacion> delegacion = Collections.emptyList();
		try {
			delegacion = delegacionRepository.findAll();
		} catch (Exception e) {
			log.error("Exception getBasePruebaEntidad", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(delegacion, HttpStatus.OK);
	}

}
