/**
 * 
 */
package mx.gob.imss.cit.sppa.mssppabase.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import mx.gob.imss.cit.sppa.mssppabase.model.entityDto.DelegacionDto;
import mx.gob.imss.cit.sppa.mssppabase.model.projection.CatalogoView;
import mx.gob.imss.cit.sppa.mssppabase.persistence.entity.Delegacion;

/**
 * 
 */
public interface BaseService {

	// evitar uso de generico por issue sonar
	ResponseEntity<List<CatalogoView>> getBasePrueba(Integer id);

	ResponseEntity<List<DelegacionDto>> getBasePruebaDto();

	ResponseEntity<List<Delegacion>> getBasePruebaEntidad();
}
