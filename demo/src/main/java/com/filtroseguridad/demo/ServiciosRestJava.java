package com.filtroseguridad.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ServiciosRestJava {

    @GetMapping("/hola")
    public Mono<String> sayHello() {
        System.out.println("Servicio REST");
        return Mono.just("hola");
    }

    @GetMapping("/adios")
    public Mono<String> sayGoodbye() {
        System.out.println("Servicio REST");
        return Mono.just("adios");
    }

}
