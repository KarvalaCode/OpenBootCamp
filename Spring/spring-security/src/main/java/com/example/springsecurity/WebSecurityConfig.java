package com.example.springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.security.web.firewall.StrictHttpFirewall;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    //Confirgurar Spring security cambiando los permisos
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authz) -> authz
                        .requestMatchers("/hola/**").permitAll()
                        .requestMatchers("/user/**").hasRole("USER")
                        .anyRequest().authenticated()
                )
                .formLogin(withDefaults())
                .httpBasic(withDefaults());
        return http.build();
    }

    //codifica el password
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //Crear usuario/s específico/s en memoria (lo mejor seria hacerlo en una base de datos)
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager()
    {
//        UserDetails user = User.withUsername("user").password(passwordEncoder().encode("password")).roles("USER").build();

        List<UserDetails> userList = new ArrayList<>();
        userList.add(User.withUsername("user").password(passwordEncoder().encode("password"))
                .roles("USER").build());
        userList.add(User.withUsername("admin").password(passwordEncoder().encode("password"))
                .roles("ADMIN", "USER").build());

        return new InMemoryUserDetailsManager(userList);
    }


    }













