package mayron.boryrockacademia;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mayro on 14/11/2017.
 */

public class SampleAdapter extends BaseAdapter{

    private Context context;
    private List<Sample> list;

    //construtor
    public SampleAdapter(Context context, List<Sample> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {

        //Inicializa a view associada
        View v = LayoutInflater.from(context).inflate(R.layout.sample_list_iten, parent, false);

        //Acessa o Objeto
        final Sample sample = list.get(position);

        //Inicializa os objetos da view e seta os valores
        ImageView image = (ImageView)v.findViewById(R.id.ImgIcon);
        image.setImageResource(sample.getImageID());

        TextView Title = (TextView)v.findViewById(R.id.txtTitle);
        Title.setText(sample.getTitle());

        TextView Descricao = (TextView)v.findViewById(R.id.txtDescricacao);
        Descricao.setText(sample.getDescription());

        return v;
    }
}
