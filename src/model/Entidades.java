package model;

//criação das variáveis de números, operações e resultados
public class Entidades {
    private String numero1 = "";
    private String numero2 = "";
    private String resultado;
    private String operacao = "";
    private boolean limpa = false;
    private double resultadoCalculo;
    private boolean inteiro;
    private double resultadoOperacao;
    private String avancN1 = "";
    private String avancN2 = "";
    private boolean raiz1;
    private boolean raiz2;
    private boolean porcentagem; //ALTERAR FUNÇÕES DE PORCENTAGEM!!
    private String resultadoRaiz;

    public Entidades(){

    }

    public Entidades(String numero1, String numero2, String resultado, String operacao, boolean limpa, double resultadoCalculo, boolean inteiro, double resultadoOperacao, String avancN1, String avancN2, boolean raiz1, boolean raiz2, boolean porcentagem, String resultadoRaiz){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
        this.operacao = operacao;
        this.limpa = limpa;
        this.resultadoCalculo = resultadoCalculo;
        this.inteiro = inteiro;
        this.resultadoOperacao = resultadoOperacao;
        this.avancN1 = avancN1;
        this.avancN2 = avancN2;
        this.raiz1 = raiz1;
        this.raiz2 = raiz2;
        this.porcentagem = porcentagem;
        this.resultadoRaiz = resultadoRaiz;
    }

    public String getNumero1(){
        return numero1;
    }

    public void setNumero1(String numero1){
        this.numero1 = numero1;
    }

    public String getNumero2(){
        return numero2;
    }

    public void setNumero2(String numero2){
        this.numero2 = numero2;
    }

    public String getResultado(){
        return resultado;
    }

    public void setResultado(String resultado){
        this.resultado = resultado;
    }

    public String getOperacao(){
        return operacao;
    }

    public void setOperacao(String operacao){
        this.operacao = operacao;
    }

    public boolean getLimpa(){
        return limpa;
    }

    public void setLimpa(boolean limpa){
        this.limpa = limpa;
    }

    public double getResultadoCalculo(){
        return resultadoCalculo;
    }

    public void setResultadoCalculo(double resultadoCalculo){
        this.resultadoCalculo = resultadoCalculo;
    }

    public boolean getInteiro(){
        return inteiro;
    }

    public void setInteiro(boolean inteiro){
        this.inteiro = inteiro;
    }

    public double getResultadoOperacao(){
        return resultadoOperacao;
    }

    public void setResultadoOperacao(double resultadoOperacao){
        this.resultadoOperacao = resultadoOperacao;
    }

    public String getAvancN1(){
        return avancN1;
    }

    public void setAvancN1(String avancN1){
        this.avancN1 = avancN1;
    }

    public String getAvancN2(){
        return avancN2;
    }

    public void setAvancN2(String avancN2){
        this.avancN2 = avancN2;
    }

    public boolean getRaiz1(){
        return raiz1;
    }

    public void setRaiz(boolean raiz1){
        this.raiz1 = raiz1;
    }

    public boolean getRaiz2(){
        return raiz2;
    }

    public void setRaiz2(boolean raiz2){
        this.raiz2 = raiz2;
    }

    public boolean getPorcentagem(){
        return porcentagem;
    }

    public void setPorcentagem(boolean porcentagem){
        this.porcentagem = porcentagem;
    }

    public String getResultadoRaiz(){
        return resultadoRaiz;
    }

    public void setResultadoRaiz(String resultadoRaiz){
        this.resultadoRaiz = resultadoRaiz;
    }
}