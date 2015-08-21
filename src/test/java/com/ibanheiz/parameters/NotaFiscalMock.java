package com.ibanheiz.parameters;

import org.jbehave.core.annotations.AsParameters;
import org.jbehave.core.annotations.Parameter;

@AsParameters
public class NotaFiscalMock {

	@Parameter(name = "NUMERO")
	private Integer numero;

	@Parameter(name = "CLIENTE")
	private String cliente;

	@Parameter(name = "DESTINATARIO")
	private String destinatario;

	@Parameter(name = "DATA_ENTREGA")
	private String dataEntrega;

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the destinatario
	 */
	public String getDestinatario() {
		return destinatario;
	}

	/**
	 * @param destinatario the destinatario to set
	 */
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	/**
	 * @return the dataEntrega
	 */
	public String getDataEntrega() {
		return dataEntrega;
	}

	/**
	 * @param dataEntrega the dataEntrega to set
	 */
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

}
