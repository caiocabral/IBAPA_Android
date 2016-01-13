package br.com.caio.ibapa;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

public class AgendaSemanaActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final List<String[]> agendaSemana = new LinkedList<String[]>();
        agendaSemana.add(new String[]{"13/12 (Domingo)", "DIA DA BÍBLIA, 9h.\nGRANDE CAMINHADA E CONCENTRAÇÃO PELO DIA DA BÍBLIA, 15h."});
        agendaSemana.add(new String[]{"14/12 (Segunda-feira)", "Culto De Gratidão pelo Ano letivo do Colégio CEMACO às 20h."});
        agendaSemana.add(new String[]{"15/12 (Terça-feira)", "Ensaio do Coro, 20h."});
        agendaSemana.add(new String[]{"16/12 (Quarta-feira)", "Sessão da MCA, às 16h.\nCulto de Oração, às 20h."});
        agendaSemana.add(new String[]{"17/12 (Quinta-feira)", "Reunião de Oração - 07h30min.\nCulto da Família no Lar de Osnir e Cida – 20h (Rua Antimônio, Lt. 19 Qd. 39. Tel: 2651-4946.)\nReunião de TODOS os envolvidos com a Música na igreja com o Pastor, às 20h."});
        agendaSemana.add(new String[]{"18/12 (Sexta-feira)", "Culto dos Aniversariantes do Semestre da MCA, às 19h, aqui na IBAPA."});
        agendaSemana.add(new String[]{"20/12 (Domingo)", "Reunião de Oração, 7h.\nMusical de Natal Infantil, às 9h.\nCULTO DE GRATIDÃO PELOS 21 ANOS DE POSSE PR. MAURO SANCHES, 19h."});

        setListAdapter(new ArrayAdapter<String[]>(this, android.R.layout.simple_list_item_2, android.R.id.text1, agendaSemana) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                String[] entry = agendaSemana.get(position);

                TextView text1 = (TextView) view.findViewById(android.R.id.text1);
                text1.setText(entry[0]);

                TextView text2 = (TextView) view.findViewById(android.R.id.text2);
                text2.setText(entry[1]);
                return view;
            }
        });
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object selected = this.getListAdapter().getItem(position);
        Toast.makeText(this, "Selecionado: " + selected, Toast.LENGTH_LONG).show();
    }
}