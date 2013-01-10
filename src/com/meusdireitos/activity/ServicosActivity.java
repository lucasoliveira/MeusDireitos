package com.meusdireitos.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.meusdireitos.R;

public class ServicosActivity extends Activity {

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_servicos);

		ListView listView = (ListView) findViewById(R.id.servicosListView);

		String[] servicos = new String[] { "Bar", "Operadoras", "Varejo" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.servicos_list, R.id.servicosTextView, servicos);

		listView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_servicos, menu);
		return true;
	}

}
