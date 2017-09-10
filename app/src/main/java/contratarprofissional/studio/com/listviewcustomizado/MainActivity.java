package contratarprofissional.studio.com.listviewcustomizado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.lvCategoria);
        final ArrayList<Categoria> categorias = adicionarCategorias();
        ArrayAdapter adapter = new CategoriaAdapter(this, categorias);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                intent.putExtra("categoria", categorias.get(i).getCategoria());


                startActivity(intent);
            }
                });
    }

    private ArrayList <Categoria> adicionarCategorias(){
        ArrayList <Categoria> categorias = new ArrayList<Categoria>();
        Categoria e =  new Categoria ("AULAS","Dança");
        categorias.add(e);
        e = new Categoria("EVENTOS","Decoração");
        categorias.add(e);
        e = new Categoria("ASSISTÊNCIA TÉCNICA","Celular");
        categorias.add(e);
        e = new Categoria("REFORMAS","Arquiteto");
        categorias.add(e);
        e = new Categoria("SERVIÇOS DOMÉSTICOS","Babá");
        categorias.add(e);
        e = new Categoria("DESIGN E TECNOLOGIA","WebDesing");
        categorias.add(e);

        return categorias;

    }


}
