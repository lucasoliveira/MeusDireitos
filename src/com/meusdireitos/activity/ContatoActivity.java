/*
 * 
 */
package com.meusdireitos.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

import com.meusdireitos.R;
import com.meusdireitos.service.EmailService;

/**
 * The Class ContatoActivity.
 */
public class ContatoActivity extends Activity {

	/** The email service. */
	private EmailService emailService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contato);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 */
	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_contato, menu);
		return true;
	}

	/**
	 * Enviar email.
	 * 
	 * @param view
	 *            the view
	 */
	public void enviarEmail(final View view) {

		EditText mensagem = (EditText) findViewById(R.id.email);

		Intent email = emailService.enviarEmail(mensagem.getText().toString());

		startActivity(Intent.createChooser(email, "Escolha a App para envio do e-mail..."));
	}

}
