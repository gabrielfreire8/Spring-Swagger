package dio.api.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    private Contact contato() {
        return new Contact()
                .name("Seu nome")
                .url("http://www.seusite.com.br")
                .email("voce@seusite.com.br");
    }

    private Info informacoesApi() {
        return new Info()
                .title("Title - REST API")
                .description("API exemplo de uso SpringBoot")
                .version("1.0")
                .termsOfService("Termo de uso: Open Source")
                .license(new License()
                        .name("Licença - Sua empresa")
                        .url("http://www.seusite.com.br"))
                .contact(this.contato());
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(this.informacoesApi());
    }
}