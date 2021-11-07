package com.shaprj.test.recruitment.recruitment.config.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain


@Configuration
class SecurityConfiguration {

    @Bean
    fun springSecurityFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain {
        // Disable default security.
//        http.httpBasic().disable()
//        http.formLogin().disable()
        http.csrf().disable()
//        http.logout().disable()
//
        http.authorizeExchange().anyExchange().permitAll()
        return http.build()
    }
}