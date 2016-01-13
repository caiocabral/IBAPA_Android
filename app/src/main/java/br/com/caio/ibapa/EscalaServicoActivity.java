package br.com.caio.ibapa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class EscalaServicoActivity extends Activity {

    TableLayout table = null;
    int posititon = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escala_servico_activity2);

        table = (TableLayout) findViewById(R.id.table);

        addMinisterio("Sono técnica", "Holden", "Caio");
        addMinisterio("Projeção", "Maíse", "Tiago");
        addMinisterio("Recepcionistas", "Jorge, Regina / Vera David, Elaine Cristina", "Isabela, Joyce / Larissa, Marcele");
        addMinisterio("Diácono", "Marcos Aurélio", "Cleudeir Moreth");
        addMinisterio("Berçário", "Cida, Fátima", "Elaine B., Nilvanda");
        addMinisterio("Regente", "André Morais", "Josué");
        addMinisterio("Segurança Pátio", "Nancildo", "Jarbas");
        addMinisterio("Segurança Estac.", "Nancildo", "Aldo");
        addMinisterio("Cantina", "Marlene, Maria Hilda, Marizette", "Lita, Vita, Jovenília");
        addMinisterio("Culto Infantil", "Larissa, Thainá, Bianca, Raimundo, Yago, Tia Ana", "Marcele, Joyce, Adriana, Margarida, Danilo, Tia Ana");
    }

    private void addMinisterio(String nomeMinisterio, String escalaAtual, String escalaProximo) {
        TableRow row = new TableRow(this);
        TextView textView = new TextView(this);
        textView.setText(nomeMinisterio);
        row.addView(textView);
        row.setGravity(Gravity.CENTER);
        row.setPadding(0, 15, 0, 0);

        table.addView(row, posititon);
        posititon++;

        addEscala(escalaAtual, escalaProximo);
    }

    private void addEscala(String escalaAtual, String escalaProximo) {
        TableRow rowMain = new TableRow(this);

        TableLayout tableLayout = new TableLayout(this);

        TableRow row = new TableRow(this);
        TextView textView = new TextView(this);
        textView.setText("HOJE");
        row.addView(textView);
        TableRow.LayoutParams params = new TableRow.LayoutParams();
        params.width = TableRow.LayoutParams.WRAP_CONTENT;
        row.setLayoutParams(params);
        tableLayout.addView(row);

        row = new TableRow(this);
        textView = new TextView(this);
        textView.setText("PRÓXIMO");
        row.addView(textView);
        params = new TableRow.LayoutParams();
        params.width = TableRow.LayoutParams.WRAP_CONTENT;
        row.setLayoutParams(params);
        tableLayout.addView(row);

        rowMain.addView(tableLayout);

        tableLayout = new TableLayout(this);

        row = new TableRow(this);
        textView = new TextView(this);
        textView.setText(escalaAtual);
        row.addView(textView);
        tableLayout.addView(row);

        row = new TableRow(this);
        textView = new TextView(this);
        textView.setText(escalaProximo);
        row.addView(textView);
        tableLayout.addView(row);

        rowMain.addView(tableLayout);

        table.addView(rowMain, posititon);
        posititon++;
    }


//    private void addViewToGridLayout(View view, int row, int column, int rowSpan, int columnSpan) {
//        GridLayoutManager.LayoutParams params = new GridLayoutManager.LayoutParams(
//                GridLayoutManager.LayoutParams.WRAP_CONTENT,
//                GridLayoutManager.LayoutParams.WRAP_CONTENT
//        );
////        params.width = GridLayout.LayoutParams.WRAP_CONTENT;
////        params.height = GridLayout.LayoutParams.WRAP_CONTENT;
//        params.span
//        params.columnSpec = GridLayout.spec(column, columnSpan);
//        params.rowSpec = GridLayout.spec(row, rowSpan);
//
//        gridLayout.addView(view, params);
//    }
}