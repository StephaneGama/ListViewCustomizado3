package contratarprofissional.studio.com.listviewcustomizado;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class CategoriaAdapter extends ArrayAdapter<Categoria>{

    private final Context context;
    private final ArrayList<Categoria> elementos;

    public CategoriaAdapter(Context context, ArrayList<Categoria> elementos){
        super(context, R.layout.linha, elementos);
        this.context = context;
        this.elementos=elementos;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha, parent, false);

        TextView nomeCategoria = (TextView) rowView.findViewById(R.id.categoria);
        TextView subcategoria = (TextView) rowView.findViewById(R.id.subcategoria);

        nomeCategoria.setText(elementos.get(position).getCategoria());
        subcategoria.setText(elementos.get(position).getSubcategoria());

        return rowView;


    }
}
