public class Professor extends Pessoa{
    private int siape;
    private String departamento;
    private String area;

    //Contrutores
    public Professor(){
        super();
    }

    public Professor(String nome, String email, long celular, int siape, String departamento, String area){
        super(nome, email, celular);
        this.siape = siape;
        this.departamento = departamento;
        this.area = area;
    }

    //Metodos de acesso set
    public void setSiape(int siape){
        this.siape = siape;
    }
    public void setDepartamento(String departamento){
        this.departamento =  departamento;
    }
    public void setArea (String area){
        this.area = area;
    }

    //Metodos de acesso get
    public int getSiape (){
        return this.siape;
    }
    public String getDepartamento(){
        return this.departamento;
    }
    public String getArea(){
        return this.area;
    }
}