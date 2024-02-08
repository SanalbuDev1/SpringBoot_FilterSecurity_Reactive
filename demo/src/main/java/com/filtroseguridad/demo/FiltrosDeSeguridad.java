package com.filtroseguridad.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

@Component
public class FiltrosDeSeguridad implements WebFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        System.out.println("Filtro de seguridad");
        exchange.getResponse().getHeaders().add("Strict-Transport-Security", "max-age=31536000 ; includeSubDomains");
        exchange.getResponse().getHeaders().add("Content-Security-Policy", "default-src 'self'");
        return chain.filter(exchange);
    }

}
