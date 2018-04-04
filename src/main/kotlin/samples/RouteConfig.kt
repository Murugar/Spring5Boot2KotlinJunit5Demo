package samples

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class RouteConfig {

    @Bean
    fun routes() = router {
        GET("/greetings", { _ -> ServerResponse.ok().body(BodyInserters.fromObject("Welcome Spring Boot Kotlin!")) })
    }
    
}