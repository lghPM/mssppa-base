package mx.gob.imss.cit.sppa.mssppabase.model.mapper;

import java.util.List;

import mx.gob.imss.cit.sppa.mssppabase.model.entityDto.DelegacionDto;
import mx.gob.imss.cit.sppa.mssppabase.persistence.entity.Delegacion;

//@Mapper(componentModel = "spring")
public interface DelegacionMapper {
	
	//DelegacionMapper INSTANCE = Mappers.getMapper(DelegacionMapper.class);

	Delegacion toEntity(DelegacionDto dto);

	DelegacionDto toDto(Delegacion entity);

	List<DelegacionDto> toLstDto(List<Delegacion> entity);

	List<Delegacion> toLstEntity(List<DelegacionDto> dto);
	

}
