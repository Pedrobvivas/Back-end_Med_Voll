package med.voll.api.medico;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
	
		@NotBlank
		String nome,
		
		@NotBlank
		@Email
		String email, 
		
		@NotBlank
		 String telefone,
		
		@NotBlank
		@Pattern(regexp = "\\d{4,6}")
		String crm, 
		
		@NotNull
		Especialidade especialidade,
		
		@NotNull
		@Valid
		DadosEndereco endereco) {
}
