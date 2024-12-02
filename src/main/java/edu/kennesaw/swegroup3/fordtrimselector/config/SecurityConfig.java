package edu.kennesaw.swegroup3.fordtrimselector.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    private final corsConfigurationSource corsConfigurationSource;

    public SecurityConfig (corsConfigurationSource corsConfigurationSource){
        this.corsConfigurationSource = corsConfigurationSource;
    }
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.cors(core ->cors.configurationSource(corsConfigurationSource))
        .authorizeHttpRequests( auth -> {
            auth.requestMatchers("/").permitAll();
            auth.requestMatchers("/api/v1/vehicles/**").permitAll();
            auth.requestMatchers("/api/v1/users/**").permitAll();
            auth.anyRequest()
                    .authenticated();
                })
                .oauth2Login(withDefaults())
                .formLogin(withDefaults());
        return http.build();
    }
}