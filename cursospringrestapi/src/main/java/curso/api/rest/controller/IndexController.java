package curso.api.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController/*Arquitetura REST**/
@RequestMapping(value = "/usuario")
public class IndexController {
	
	
	/*Serviço restfull*/
	@GetMapping(value="/", produces ="application/json")
	public ResponseEntity init(@RequestParam (value="nome") String nome){
		
		System.out.println(""+nome);
		return new ResponseEntity("meu nome é:"+nome, HttpStatus.OK);
	}
	
	

}
