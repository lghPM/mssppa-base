package mx.gob.imss.cit.sppa.mssppabase.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.gob.imss.cit.sppa.mssppabase.model.projection.CatalogoView;
import mx.gob.imss.cit.sppa.mssppabase.persistence.entity.Delegacion;

public interface DelegacionRepository extends JpaRepository<Delegacion, Integer> {

	<T> T findByRefAbreviacion(String refAbreviacion, Class<T> type);

	@Query("SELECT del.id as id , del.desDelegacion as descripcion FROM Delegacion del WHERE del.fecBaja IS NULL ")
	List<CatalogoView> findDelegacionView();

}
