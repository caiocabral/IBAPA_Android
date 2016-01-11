package br.com.caio.ibapa;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BulletinsMenuActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent params = getIntent();
        Bundle bundle = params.getExtras();
        String val = bundle.getString("boletimDate");

        Toast.makeText(this, "Selecionado: " + val, Toast.LENGTH_LONG).show();

        String[] bulletins = new String[]{"Editorial", "Agenda da semana", "Escala de servico"};

        ArrayAdapter<String> adapterBulletins = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, bulletins);
        setListAdapter(adapterBulletins);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object selected = this.getListAdapter().getItem(position);
        Toast.makeText(this, position + ". Selecionado: " + selected, Toast.LENGTH_LONG).show();

        switch (position) {
            case 0:
                startActivity(new Intent(this, EditorialActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, AgendaSemanaActivity.class));
                break;
            case 2:
                startActivity(new Intent(this, EscalaServicoActivity.class));
                break;
        }
    }
}