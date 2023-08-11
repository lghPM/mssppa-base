package mx.gob.imss.cit.sppa.mssppabase.security;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//
//@Configuration
public class ResourceServerConfiguration { //extends ResourceServerConfigurerAdapter {

//	@Value("${authorization.signingKey}")
//	private String signingKey;
//
//
//	@Autowired
//	private DefaultTokenServices tokenServices;
//
//	@Bean
//	public JwtAccessTokenConverter tokenConverter() {
//		JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
//		jwtAccessTokenConverter.setSigningKey(signingKey);
//		return jwtAccessTokenConverter;
//	}
//
//	@Bean
//	public TokenStore tokenStore(JwtAccessTokenConverter tokenConverter) {
//		return new JwtTokenStore(tokenConverter);
//	}
//
//	@Bean
//	DefaultTokenServices tokenServices(TokenStore tokenStore, JwtAccessTokenConverter tokenConverter) {
//		DefaultTokenServices tokenServices = new DefaultTokenServices();
//		tokenServices.setTokenStore(tokenStore);
//		tokenServices.setTokenEnhancer(tokenConverter);
//		return tokenServices;
//	}
//
//	@Override
//	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//		resources.tokenServices(tokenServices);
//	}
//	@Override
//	public void configure(HttpSecurity http) throws Exception {
//		http
//			.authorizeRequests().requestMatchers("/actuator/**").permitAll().
//		and()
//			.authorizeRequests().requestMatchers("/**").authenticated();
//	}
//	@Override
//	public void configure(HttpSecurity http) throws Exception {
//		http
//			.authorizeRequests().antMatchers("/mssiprepa-presentancion-pagos/actuator/**").permitAll().
//		and()
//			.authorizeRequests().antMatchers("/api/Version/core/**").permitAll().
//		and()
//			.authorizeRequests().antMatchers("/**").authenticated();
//	}
}