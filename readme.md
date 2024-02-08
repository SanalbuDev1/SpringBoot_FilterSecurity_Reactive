## Filtros de seguridad reactivos

Para poder crear filtros de seguridad reactivos debemos utilizar la interfaz ~webfilter
esta interfaz se encargara de servir como un pipe que filtra el request, response
de nuestros servicios HTTP

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.8)

2024-02-07T21:10:50.055-05:00  INFO 21712 --- [  restartedMain] c.filtroseguridad.demo.DemoApplication   : Starting DemoApplication using Java 17.0.10 with PID 21712 (D:\Santiago\GITHUB\Java_General\filtrosseguridad\demo\target\classes started 
by USER in D:\Santiago\GITHUB\Java_General\filtrosseguridad\demo)
2024-02-07T21:10:50.062-05:00  INFO 21712 --- [  restartedMain] c.filtroseguridad.demo.DemoApplication   : No active profile set, falling back to 1 default profile: "default"
2024-02-07T21:10:50.169-05:00  INFO 21712 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2024-02-07T21:10:50.170-05:00  INFO 21712 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional 
web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2024-02-07T21:10:52.059-05:00  INFO 21712 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2024-02-07T21:10:52.322-05:00  INFO 21712 --- [  restartedMain] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port 8080
2024-02-07T21:10:52.339-05:00  INFO 21712 --- [  restartedMain] c.filtroseguridad.demo.DemoApplication   : Started DemoApplication in 2.793 seconds (process running for 3.733)
Filtro de seguridad
Servicio REST