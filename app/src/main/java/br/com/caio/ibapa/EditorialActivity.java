package br.com.caio.ibapa;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class EditorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editorial2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarEditorial);
        toolbar.setTitle("EDITORIAL");
        setSupportActionBar(toolbar);

        TextView txvContentEditorial = (TextView) findViewById(R.id.txvContentEditorial);
        txvContentEditorial.setText("Dia da Bíblia\n“Lâmpada para os meus pés é a tua Palavra, e luz para o meu caminho”. (Salmos 119. 105).\n\nEssa deve ser a declaração de todos os cristãos diante da Bíblia, que é a revelação de Deus à humanidade e que, mesmo após mais de 20 séculos, continua viva e revelando aos homens a vontade perfeita e agradável do coração do Pai.\n A palavra Bíblia significa “livros”, e vem do grego (língua em que foi escrito o Novo Testamento) “tà Bíblia” – ou seja, livros sagrados. O plural justifica-se, já que a Bíblia não é um livro somente, mas uma biblioteca composta de 66 livros, sendo que 39 pertencem ao Antigo Testamento e 27 ao Novo Testamento. E HOJE celebra-se o seu dia.\n\nQual a origem do dia da Bíblia?\nO Dia da Bíblia surgiu em 1549, na Grã-Bretanha, quando o Bispo Cranmer, incluiu no livro de orações do Rei Eduardo VI um dia especial para que a população intercedesse em favor da leitura do Livro Sagrado.\nA data escolhida foi o segundo domingo do Advento – celebrado nos quatro domingos que antecedem o Natal. Foi assim que o segundo domingo de dezembro se tornou o Dia da Bíblia. No Brasil, o Dia da Bíblia passou a ser celebrado em 1850, com a chegada, da Europa e dos Estados Unidos, dos primeiros missionários evangélicos que aqui vieram semear a Palavra de Deus.\nDurante o período do Império, a liberdade religiosa aos cultos protestantes era muito restrita, o que impedia que se manifestassem publicamente. Por volta de 1880, esta situação foi se modificando e o movimento evangélico, juntamente com o Dia da Bíblia, se popularizando.\nPouco a pouco, as diversas denominações evangélicas institucionalizaram a tradição do Dia da Bíblia, que ganhou ainda mais força com a fundação da Sociedade Bíblica do Brasil, em junho de 1948. Em dezembro deste mesmo ano, houve uma das primeiras manifestações públicas do Dia da Bíblia, em São Paulo, no Monumento do Ipiranga.\nHoje, o dia dedicado às Escrituras Sagradas é comemorado em cerca de 60 países, sendo que em alguns, a data é celebrada no segundo Domingo de setembro, numa referência ao trabalho do tradutor Jerônimo, na Vulgata, conhecida tradução da Bíblia para o latim. As comemorações do segundo domingo de dezembro mobilizam, todos os anos, milhões de cristãos em todo o País.\nHá mais de 150 anos, o Dia da Bíblia, é celebrado com o objetivo de difundir e estimular a leitura da Palavra de Deus. A fundação da Sociedade Bíblica do Brasil, em 1948, contribuiu para que esta data fosse se popularizando cada vez mais. E, graças a esse trabalho, o Dia da Bíblia, passou a ser comemorado não só no segundo domingo de dezembro, mas também ao longo de toda a semana que antecede esta data. A Semana da Bíblia é dedicada a eventos variados que vão desde cultos até maratonas de leitura bíblica que mobilizam milhares de pessoas. \n*******************************************\nHOJE (13), às 15h, as Igrejas evangélicas estarão unidas em uma Caminhada pelas ruas do bairro para falar de Jesus, e terminaremos com uma Concentração Evangelística na rua Oscar Lopes (ao lado da Ass. de Deus do Pq. Alian), com a participação de Grupos de Louvor e Coreografia, e a mensagem da Palavra de Deus.\nPr. Mauro Sanches\n");
    }
}
