public class Automovel {
    private String placa;
    private long rg;
    private Categoria categoria;

    //Construtores
    public Automovel(){}

    public Automovel(String placa, long rg, Categoria categoria){
        this.setPlaca(placa);
        this.setRg(rg);
        this.setCategoria(categoria);
    }

    //Metodos de acesso
    public void setPlaca (String placa){
        this.placa = placa;
    }

    public void setRg (long rg){
        this.rg = rg;
    }

    public void setCategoria (Categoria categoria){
        this.categoria = categoria;
    }

    public String getPlaca(){
        return this.placa;
    }

    public long getRg(){
        return this.rg;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }

    
}