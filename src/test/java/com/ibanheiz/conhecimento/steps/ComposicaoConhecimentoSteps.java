package com.ibanheiz.conhecimento.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.ibanheiz.conhecimento.ComposicaoConhecimento;
import com.ibanheiz.parameters.NotaFiscalMock;
import com.ibanheiz.utils.TestUtils;

public class ComposicaoConhecimentoSteps {

	private ComposicaoConhecimento composicaoConhecimento;

	@BeforeStories
	public void inicializar() {
		composicaoConhecimento = new ComposicaoConhecimento();
	}
	
	@Given("uma nova composição de CT-e")
	public void inicadaComposicaoCte() {
		composicaoConhecimento.iniciar();
	}

	@When("um usuário entra com duas notas fiscais com os mesmos parâmetros: $notasFiscais")
	public void composicaoDeDuasNotasFiscais(List<NotaFiscalMock> listaNotafiscal) {
		for (NotaFiscalMock notaFiscal : listaNotafiscal) {
			composicaoConhecimento.adicionarNotaFiscalNaComposicao(TestUtils.converterMockNotaFiscal(notaFiscal));
		}
	}

	@Then("somente $quantidade pré-conhecimento deve ser composto")
	public void somenteUmPreConhecimentoComposto(@Named("quantidade") int quantidade) {
		assertEquals(quantidade, composicaoConhecimento.getListaConhecimento().size());
	}

}
