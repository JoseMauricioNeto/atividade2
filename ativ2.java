public class Aluno{
 private String nome;
    private int id;
    private double media;
    protected double nota1,nota2;
    private String passou;
    public Aluno(String nome,int id, double nota1,double nota2){
    this.nome=nome;
    this.id=id;
    this.nota1=nota1;
    this.nota2=nota2;
    calculamedia();
    }
    private void calculamedia(){
    media = (nota1+nota2)/2;
     System.out.println(media);
    }
    public void passou(){
    if(media > 7.0) {  
    this.passou="true"; 
} else {  
   this.passou="false";  
}  
}
}

public class Disciplina{
 public String Aluno;
 public int alunos;
 public String aluno;
 public String nome;
 public int id;
 public int posicao;
 public double mediaN1;
 public double nota1;
 public double mediaN2;
 public double nota2;
    public void main(String[] args){
 Aluno[] alunos = new Aluno[10];
  }
   public void adicionaAluno(String nome, int id,int posicao){
    this.nome=nome;
    this.id=id;
    this.posicao=posicao;
    }
    public void mediaN1(){
    mediaN1 = nota1;
     System.out.println(mediaN1);
    }
    public void mediaN2(){
    mediaN2 = nota2;
     System.out.println(mediaN1);
    }
}

