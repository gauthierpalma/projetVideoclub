package formation.sopra.videoClub.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	// @Autowired
	// private CustomUserDetailService userDetailsService;
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/film/list").permitAll();
		http.authorizeRequests().antMatchers("/adherent/**").authenticated().and().formLogin().loginPage("/login")
				.failureForwardUrl("login?error=true").and().logout().logoutSuccessUrl("/film/list");
	}

@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
	//	auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
	
	}


@Bean
protected PasswordEncoder getPasswordEncoder() {
	return new BCryptPasswordEncoder();
}

}
