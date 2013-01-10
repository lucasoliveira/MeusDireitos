/*
 * 
 */
package com.meusdireitos.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.meusdireitos.R;

/**
 * The Class MainActivity.
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	/**
	 * Go to servicos.
	 * 
	 * @param v
	 *            the v
	 */
	public void goToServicos(final View v) {

		Intent intent = new Intent();
		intent = new Intent(MainActivity.this, ServicosActivity.class);
		startActivity(intent);
	}

	/**
	 * Go to produtos.
	 * 
	 * @param v
	 *            the v
	 */
	public void goToProdutos(final View v) {

		Intent intent = new Intent();
		intent = new Intent(MainActivity.this, ProdutosActivity.class);
		startActivity(intent);
	}

	/**
	 * Go to contato.
	 * 
	 * @param v
	 *            the v
	 */
	public void goToContato(final View v) {

		Intent intent = new Intent();
		intent = new Intent(MainActivity.this, ContatoActivity.class);
		startActivity(intent);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 */

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
