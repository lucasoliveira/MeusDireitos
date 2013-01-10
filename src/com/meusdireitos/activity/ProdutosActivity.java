package com.meusdireitos.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.meusdireitos.R;

public class ProdutosActivity extends Activity {

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_produtos);

		ListView listView = (ListView) findViewById(R.id.produtosListView);

		String[] servicos = new String[] { "Veículos", "Linha Branca", "Perecíveis" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.produtos_list, R.id.produtosTextView, servicos);

		listView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_produtos, menu);
		return true;
	}

}
