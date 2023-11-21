package med.voll.api.paciente;

import javax.validation.Valid;

import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
	    Long id,
	    String nome,
	    String telefone,
	    @Valid DadosEndereco endereco
	) {
	}
