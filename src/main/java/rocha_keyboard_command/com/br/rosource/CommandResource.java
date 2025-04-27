package rocha_keyboard_command.com.br.rosource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("v1/api/Commands")
@Tag(name = "Command", description = "Operações relacionadas a Comano de teclado")
public class CommandResource {

	// CATEGORY
	@GetMapping("/category")
	@Operation(summary = "Obter lista de Comandos", description = "Retorna lista de comandos")
	public List<String> getAllCategories() {
		List<String> listreturn = new ArrayList<>();
		listreturn.add("hello");
		return listreturn;
	}

}
