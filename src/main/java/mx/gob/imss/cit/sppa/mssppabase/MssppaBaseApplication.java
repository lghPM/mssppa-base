package mx.gob.imss.cit.sppa.mssppabase;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
//@EnableResourceServer
public class MssppaBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MssppaBaseApplication.class, args);
	}

	@PostConstruct
	public void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT-06:00"));
		// log.info("fechaSistema {}", new Date());
	}

//	@Bean
//	ModelMapper modelMapper() {
//		ModelMapper modelMapper = new ModelMapper();
//		modelMapper.getConfiguration().setAmbiguityIgnored(true);
//		return modelMapper;
//	}

	@Bean
	WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/mssppa-base/v1/**").allowedOrigins("*").allowedMethods("*");
			}
		};
	}
}
