package mayron.boryrockacademia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class Avalie extends AppCompatActivity {
    TextView hugo, debora, gustavo;
    RatingBar rt1, rt2, rt3;
    Button btnAvaliePersonal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avalie);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        hugo = (TextView)findViewById(R.id.textAvalie1);
        debora = (TextView)findViewById(R.id.textAvalie2);
        gustavo = (TextView)findViewById(R.id.textAvalie3);

        btnAvaliePersonal = (Button)findViewById(R.id.btnAvaliePersonal);
        btnAvaliePersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Avalie.this, "Avaliação Realizada", Toast.LENGTH_SHORT).show();
            }
        });

        rt1 = (RatingBar)findViewById(R.id.ratingBar1);
        rt2 = (RatingBar)findViewById(R.id.ratingBar2);
        rt3 = (RatingBar)findViewById(R.id.ratingBar3);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menuGym:
                Intent intentGym = new Intent(Avalie.this, InformacoesAcademia.class);
                startActivity(intentGym);
                break;
            case R.id.menuPersonal:
                Intent intentAvalie = new Intent(Avalie.this, Avalie.class);
                startActivity(intentAvalie);
                break;
            case R.id.menuAbout:
                Intent intentSobre = new Intent(Avalie.this, Sobre.class);
                startActivity(intentSobre);
                break;
            default:break;
        }

        switch (item.getItemId()) {
            case android.R.id.home:  //ID do seu botão (gerado automaticamente pelo android, usando como está, deve funcionar
                startActivity(new Intent(this, MainActivity.class));  //O efeito ao ser pressionado do botão (no caso abre a activity)
                finishAffinity();  //Método para matar a activity e não deixa-lá indexada na pilhagem
                break;
            default:break;
        }

        return true;
    }

}
