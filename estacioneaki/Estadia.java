public class Estadia{
    private Automovel automovel;
    private int horas;
    private float valor;

    //construtores
    public Estadia(){}

    public Estadia(Automovel automovel, int horas){
      this.setAutomovel(automovel);
      this.setHoras(horas);  
    }

    //Metodos de acesso
    public void setHoras(int horas){
        this.horas = horas;
    }

    public int getHoras(){
        return this.horas;
    }

    public void setAutomovel(Automovel automovel){
        this.automovel = automovel;
    }

    public Automovel getAutomovel(){
        return this.automovel;
    }

    public float calcularEstadia(){
        float categoriaValor = automovel.getCategoria().getValor();
        return valor = categoriaValor * this.horas; 
    }
}