package rocha_keyboard_command.com.br.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("API Rocha Keyboard Command").version("1.0.0")
				.description("Documentação da API usando SpringDoc OpenAPI")
				.contact(new Contact().name("Alex Rocha").email("alexrochadealbuquqerque@gmail.com"))
				.license(new License().name("Apache 2.0").url("https://springdoc.org")));
	}

}
