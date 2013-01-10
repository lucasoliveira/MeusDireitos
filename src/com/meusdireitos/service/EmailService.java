/**
 * 
 */
package com.meusdireitos.service;

import android.content.Intent;

/**
 * @author lucasoliveira
 * 
 */
public class EmailService {

	/**
	 * Enviar email.
	 * 
	 * @param mensagem
	 *            the mensagem
	 */
	public Intent enviarEmail(final String mensagem) {

		Intent itEmail = new Intent(Intent.ACTION_SEND);
		itEmail.setType("plain/text");
		itEmail.putExtra(Intent.EXTRA_SUBJECT, "Contato - MeusDireitos");
		itEmail.putExtra(Intent.EXTRA_TEXT, mensagem);
		itEmail.putExtra(Intent.EXTRA_EMAIL, "lucas.loliveira@hotmail.com");

		return itEmail;

	}

}
