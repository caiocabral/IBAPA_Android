package br.com.caio.ibapa;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BulletinsListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] bulletins = new String[]{
                "Boletim 20/12/2015",
                "Boletim 13/12/2015",
                "Boletim 06/12/2015",
                "Boletim 29/11/2015",
                "Boletim 22/11/2015",
                "Boletim 15/11/2015",
                "Boletim 08/11/2015",
                "Boletim 01/11/2015"
        };

        ArrayAdapter<String> adapterBulletins = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, bulletins);
        setListAdapter(adapterBulletins);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object selected = this.getListAdapter().getItem(position);
        Toast.makeText(this, "Selecionado: " + selected, Toast.LENGTH_LONG).show();
        Bundle bundleParameters = new Bundle();
        bundleParameters.putString("boletimDate", selected.toString());

        Intent IntBulletimMenuActivity = new Intent(this, BulletinsMenuActivity.class);
        IntBulletimMenuActivity.putExtras(bundleParameters);
        startActivity(IntBulletimMenuActivity);
    }
}