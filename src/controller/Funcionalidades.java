package controller;

import model.Entidades;

public class Funcionalidades {
    private Entidades entidade;

    public Funcionalidades(Entidades entidade){
        this.entidade = entidade;
    }

    //função que irá realizar a soma
    public void soma(){
        entidade.setResultadoCalculo(Double.parseDouble(entidade.getNumero1()) + Double.parseDouble(entidade.getNumero2()));
        if(entidade.getResultadoCalculo() % 1 != 0){
            double resultadoDecimal = (double) entidade.getResultadoCalculo();
            entidade.setResultado(String.valueOf(resultadoDecimal));
        }else{
            int resultadoInteiro = (int) entidade.getResultadoCalculo();
            entidade.setResultado(String.valueOf(resultadoInteiro));
        }
    }

    //função que irá realizar a subtração
    public void subtrai(){
        entidade.setResultadoCalculo(Double.parseDouble(entidade.getNumero1()) - Double.parseDouble(entidade.getNumero2()));
        if(entidade.getResultadoCalculo() % 1 != 0){
            double resultadoDecimal = (double) entidade.getResultadoCalculo();
            entidade.setResultado(String.valueOf(resultadoDecimal));
        }else{
            int resultadoInteiro = (int) entidade.getResultadoCalculo();
            entidade.setResultado(String.valueOf(resultadoInteiro));
        }
    }

    //função que irá realizar a multiplicação
    public void multiplica(){
        entidade.setResultadoCalculo(Double.parseDouble(entidade.getNumero1()) * Double.parseDouble(entidade.getNumero2()));
        if(entidade.getResultadoCalculo() % 1 != 0){
            double resultadoDecimal = (double) entidade.getResultadoCalculo();
            entidade.setResultado(String.valueOf(resultadoDecimal));
        }else{
            int resultadoInteiro = (int) entidade.getResultadoCalculo();
            entidade.setResultado(String.valueOf(resultadoInteiro));
        }
    }

    //função que irá realizar a divisão
    public void divide(){
        entidade.setResultadoCalculo(Double.parseDouble(entidade.getNumero1()) / Double.parseDouble(entidade.getNumero2()));
        if(entidade.getResultadoCalculo() % 1 != 0){
            double resultadoDecimal = (double) entidade.getResultadoCalculo();
            entidade.setResultado(String.valueOf(resultadoDecimal));
        }else{
            int resultadoInteiro = (int) entidade.getResultadoCalculo();
            entidade.setResultado(String.valueOf(resultadoInteiro));
        }
    }

    //função que irá realizar porcentagem de algum número digitado pelo usuário
    public void porcentagem(){
        if(entidade.getAvancN1().equals("%") && entidade.getOperacao().isEmpty()){
            entidade.setResultadoOperacao(Double.parseDouble(entidade.getNumero1()) / 100);
        }else if(entidade.getAvancN2().equals("%") && !entidade.getOperacao().isEmpty()){
            double n1 = Double.parseDouble(entidade.getNumero1());
            double n2 = Double.parseDouble(entidade.getNumero2());
            entidade.setResultadoOperacao(n1 * (n2 / 100));
        }

        if(entidade.getResultadoOperacao() % 1 != 0){
            double resultadoDecimal = (double) entidade.getResultadoOperacao();
            entidade.setResultado(String.valueOf(resultadoDecimal));
        }else{
            int resultadoInteiro = (int) entidade.getResultadoOperacao();
            entidade.setResultado(String.valueOf(resultadoInteiro));
        }
    }

    //função que irá devolver a raiz quadrada de um número digitado pelo usuário
    public void raiz(){
       /* if(entidade.getAvancN1().equals("√")){
            entidade.setResultadoCalculo(Math.sqrt(Double.parseDouble(entidade.getNumero1())));
        }else if(entidade.getAvancN2().equals("√")){
            entidade.setResultadoCalculo(Math.sqrt(Double.parseDouble(entidade.getNumero2())));
        }

        if(entidade.getResultadoCalculo() % 1 != 0){
            double resultadoDecimal = (double) entidade.getResultadoCalculo();
            entidade.setResultado(String.valueOf(resultadoDecimal));
        }else{
            int resultadoInteiro = (int) entidade.getResultadoCalculo();
            enti(dade.setResultado(String.valueOf(resultadoInteiro));
        }*/

        if(entidade.getRaiz1() && entidade.getRaiz2()){
            if(entidade.getOperacao().isEmpty()){
               entidade.setResultadoCalculo(Math.sqrt(Double.parseDouble(entidade.getNumero1())));
            }else{
                entidade.setResultadoCalculo(Math.sqrt(Double.parseDouble(entidade.getNumero2())));
            }
        }

        if(entidade.getResultadoCalculo() % 1 != 0){
            double resultadoDecimal = (double) entidade.getResultadoCalculo();
            entidade.setResultadoRaiz(String.valueOf(resultadoDecimal));
        }else{
            int resultadoInteiro = (int) entidade.getResultadoCalculo();
            entidade.setResultadoRaiz(String.valueOf(resultadoInteiro));
        }
    }

    public void operaRaiz(){ //COLOCAR AS OPERAÇÕES DENTRO DAS VERIFICAÇÕES DAS RAÍZES (NO CASO VER SE COMPENSA OU SE DA NA MESMA REPETIÇÃO)
        if(!entidade.getOperacao().isEmpty()){
            if(entidade.getRaiz1() && entidade.getRaiz2()){
                if(entidade.getOperacao().equals("+")){
                    entidade.setResultadoCalculo(Math.sqrt(Double.parseDouble(entidade.getNumero1())) + Math.sqrt(Double.parseDouble(entidade.getNumero2())));
                }else if(entidade.getOperacao().equals("-")){
                    entidade.setResultadoCalculo(Math.sqrt(Double.parseDouble(entidade.getNumero1())) - Math.sqrt(Double.parseDouble(entidade.getNumero2())));
                }else if(entidade.getOperacao().equals("*")){
                    entidade.setResultadoCalculo(Math.sqrt(Double.parseDouble(entidade.getNumero1())) * Math.sqrt(Double.parseDouble(entidade.getNumero2())));
                }else if(entidade.getOperacao().equals("/")){
                    entidade.setResultadoCalculo(Math.sqrt(Double.parseDouble(entidade.getNumero1())) / Math.sqrt(Double.parseDouble(entidade.getNumero2())));
                }
            }else if(entidade.getRaiz1() && !entidade.getRaiz2()){
                if(entidade.getOperacao().equals("+")){
                    entidade.setResultadoCalculo(Math.sqrt(Double.parseDouble(entidade.getNumero1())) + Double.parseDouble(entidade.getNumero2()));
                }else if(entidade.getOperacao().equals("-")){
                    entidade.setResultadoCalculo(Math.sqrt(Double.parseDouble(entidade.getNumero1())) - Double.parseDouble(entidade.getNumero2()));
                }else if(entidade.getOperacao().equals("*")){
                    entidade.setResultadoCalculo(Math.sqrt(Double.parseDouble(entidade.getNumero1())) * Double.parseDouble(entidade.getNumero2()));
                }else if(entidade.getOperacao().equals("/")){
                    entidade.setResultadoCalculo(Math.sqrt(Double.parseDouble(entidade.getNumero1())) / Double.parseDouble(entidade.getNumero2()));
                }
            }else if(!entidade.getRaiz1() && entidade.getRaiz2()){
                if(entidade.getOperacao().equals("+")){
                    entidade.setResultadoCalculo(Double.parseDouble(entidade.getNumero1()) + Math.sqrt(Double.parseDouble(entidade.getNumero2())));
                }else if(entidade.getOperacao().equals("-")){
                    entidade.setResultadoCalculo(Double.parseDouble(entidade.getNumero1()) - Math.sqrt(Double.parseDouble(entidade.getNumero2())));
                }else if(entidade.getOperacao().equals("*")){
                    entidade.setResultadoCalculo(Double.parseDouble(entidade.getNumero1()) * Math.sqrt(Double.parseDouble(entidade.getNumero2())));
                }else if(entidade.getOperacao().equals("/")){
                    entidade.setResultadoCalculo(Double.parseDouble(entidade.getNumero1()) / Math.sqrt(Double.parseDouble(entidade.getNumero2())));
                }
            }
        }
    }
}