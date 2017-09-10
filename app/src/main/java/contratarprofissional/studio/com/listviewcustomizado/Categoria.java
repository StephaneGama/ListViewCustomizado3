package contratarprofissional.studio.com.listviewcustomizado;

/**
 * Created by Notebook on 09/09/2017.
 */

public class Categoria {

    private String categoria;
    private String subcategoria;

    public Categoria (String categoria, String subcategoria) {
        this.categoria=categoria;
        this.subcategoria=subcategoria;

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }
}
