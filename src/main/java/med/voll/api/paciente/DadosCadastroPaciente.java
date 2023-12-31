package med.voll.api.paciente;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(@NotBlank String nome,
		
		@NotBlank
		@Email
		String email,
		
		@NotBlank
		String telefone, 
		
		@NotBlank 
		@Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}") 
		String cpf,
		
		@NotNull
		@Valid
		DadosEndereco endereco) {
}
