package mayron.boryrockacademia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menuGym:
                Intent intentGym = new Intent(MainActivity.this, InformacoesAcademia.class);
                startActivity(intentGym);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.fade_in);

                break;
            case R.id.menuPersonal:
                Intent intentAvalie = new Intent(MainActivity.this, Avalie.class);
                startActivity(intentAvalie);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.fade_out);

                break;
            case R.id.menuAbout:
                Intent intentSobre = new Intent(MainActivity.this, Sobre.class);
                startActivity(intentSobre);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.fade_out);
                break;
            default:
                Toast.makeText(this, "Nenhum item selecionado", Toast.LENGTH_SHORT).show();
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Sample> lst = new ArrayList<>();
        lst.add(new Sample(R.drawable.iconexercicios, "Exercícios", "Acompanhe a sua ficha"));
        lst.add(new Sample(R.drawable.iconeavaliacao, "Avaliação", "Acompanhe sua Avaliação Física"));
        lst.add(new Sample(R.drawable.iconrelatorio, "Relatório", "Acompanhe a metodologia proposta"));


        //Intent intent = new Intent(this, Activity02.class);


        SampleAdapter adapter = new SampleAdapter(this, lst);

        ListView listView = (ListView)findViewById(R.id.lvItens);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intenteExercicios = new Intent(MainActivity.this, Exercicios.class);
                        startActivity(intenteExercicios);
                       // overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_in);
                        break;
                    case 1:
                        Intent intentAvaliacao = new Intent(MainActivity.this, Avaliacao.class);
                        startActivity(intentAvaliacao);
                        //overridePendingTransition(android.R.anim.slide_out_right,android.R.anim.slide_in_left);
                        break;
                    case 2:
                        Intent intentRelatorio = new Intent(MainActivity.this, Relatorio.class);
                        startActivity(intentRelatorio);
                        //overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_in);
                        break;
                }
            }
        });
    }
}
