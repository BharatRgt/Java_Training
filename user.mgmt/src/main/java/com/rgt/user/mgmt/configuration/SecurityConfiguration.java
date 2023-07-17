//package com.rgt.user.mgmt.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .csrf(csrf -> csrf.disable())
//            .authorizeHttpRequests((authorizeHttpRequest) -> authorizeHttpRequest
//    				.requestMatchers("/api/admin/**").hasRole("ADMIN")
//    				.requestMatchers("/api/users/**").hasAnyRole("ADMIN","USER")
//    				.anyRequest().authenticated())
//            .formLogin(formLogin -> 
//                formLogin
//                    .permitAll()
//                    .loginPage("/login")
//                    //.loginProcessingUrl("/login")
//                    .defaultSuccessUrl("/api/users")
//                    .usernameParameter("bharat")
//                    .passwordParameter("bharat")
//            );
//
//        return http.build();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager();
//        PasswordEncoder passwordEncoder = passwordEncoder();
//
//        UserDetails bharatUser = User.builder()
//            .username("bharat")
//            .password(passwordEncoder.encode("bharat"))
//            .roles("ADMIN")
//            .build();
//
//        inMemoryUserDetailsManager.createUser(bharatUser);
//        return inMemoryUserDetailsManager;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
