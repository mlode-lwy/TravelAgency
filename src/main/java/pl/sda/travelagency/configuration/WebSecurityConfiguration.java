package pl.sda.travelagency.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers("/trip").hasAnyAuthority("ROLE_USER","ROLE_ADMIN")
                .anyRequest()
                .permitAll()
/*
                .and()
                .formLogin()
*/
                .and()
                .formLogin().loginPage("/login")
                .usernameParameter("email")
                .passwordParameter("password")
                .loginProcessingUrl("login-process")      // to co w th:action
                .defaultSuccessUrl("/trip");
    }

    protected void configure(AuthenticationManagerBuilder managerBuilder) {
        
    }
}
