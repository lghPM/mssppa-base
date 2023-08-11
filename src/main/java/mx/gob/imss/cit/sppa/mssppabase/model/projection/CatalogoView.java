package mx.gob.imss.cit.sppa.mssppabase.model.projection;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author
 *
 */
@JsonPropertyOrder({ "id", "descripcion" })
public interface CatalogoView {

	Integer getId();

	String getDescripcion();

}