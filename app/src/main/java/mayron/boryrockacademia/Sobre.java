package mayron.boryrockacademia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Jaciara on 15/12/2017.
 */

public class Sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
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
                Intent intentGym = new Intent(Sobre.this, InformacoesAcademia.class);
                startActivity(intentGym);
                break;
            case R.id.menuPersonal:
                Intent intentAvalie = new Intent(Sobre.this, Avalie.class);
                startActivity(intentAvalie);
                break;
            case R.id.menuAbout:
                Intent intentSobre = new Intent(Sobre.this, Sobre.class);
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
