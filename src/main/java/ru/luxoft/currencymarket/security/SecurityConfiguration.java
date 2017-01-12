package ru.luxoft.currencymarket.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.PersistentTokenBasedRememberMeServices;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

/**
 * Created by xxoTk on 011 11.01.17.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    @Qualifier("customUserDetailsService")
    UserDetailsService userDetailsService;


    @Autowired
    PersistentTokenRepository tokenRepository;

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
        auth.authenticationProvider(authenticationProvider());
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //todo testing
//        http.authorizeRequests().and().formLogin().loginPage("/login")
//                .loginProcessingUrl("/login").usernameParameter("id").passwordParameter("password").and()
//                .rememberMe().rememberMeParameter("remember-me").tokenRepository(tokenRepository)
//                .tokenValiditySeconds(86400).and().csrf().and().exceptionHandling().accessDeniedPage("/Access_Denied");


//    defaultSuccessUrl("/", false), установка второго параметра (alwaysUse) в false говорит Spring Security
//  что в случае успешной авторизации можно перенаправить пользователя на ту страничку, с которой он пришел на страницу аутентификации.

        http.authorizeRequests()
                .and()
                .formLogin()
                .loginPage("/login")
                .and()
                .formLogin()
                .defaultSuccessUrl("/", false);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService);
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }

    @Bean
    public PersistentTokenBasedRememberMeServices getPersistentTokenBasedRememberMeServices() {
        PersistentTokenBasedRememberMeServices tokenBasedservice = new PersistentTokenBasedRememberMeServices(
                "remember-me", userDetailsService, tokenRepository);
        return tokenBasedservice;
    }

    @Bean
    public AuthenticationTrustResolver getAuthenticationTrustResolver() {
        return new AuthenticationTrustResolverImpl();
    }

}
