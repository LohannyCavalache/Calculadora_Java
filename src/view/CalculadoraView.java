package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Entidades;
import controller.Funcionalidades;

public class CalculadoraView extends Application {
    @Override
    public void start(Stage stage){
        GridPane root = new GridPane();

        //Criação de visor
        TextField visor = new TextField();

        //Criação de botões
        Button btnC = new Button("C");
        Button btnDel = new Button("⌫");
        Button btnPorcento = new Button("%");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btnDivide = new Button("/");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btnMultiplica = new Button("*");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btnSubtrai = new Button("-");
        Button btn0 = new Button("0");
        Button btnCalcula = new Button("=");
        Button btnVirgula = new Button(".");
        Button btnSoma = new Button("+");
        Button btnRaiz = new Button("√");

        //Adiciona os botões e o visor
        root.add(btnC, 0, 1);
        root.add(btnDel, 1, 1);
        root.add(btnPorcento, 2, 1);
        root.add(btnRaiz, 3, 1);
        root.add(btn7, 0, 2);
        root.add(btn8, 1, 2);
        root.add(btn9, 2, 2);
        root.add(btnDivide, 3, 2);
        root.add(btn4, 0, 3);
        root.add(btn5, 1, 3);
        root.add(btn6, 2, 3);
        root.add(btnMultiplica, 3, 3);
        root.add(btn1, 0, 4);
        root.add(btn2, 1, 4);
        root.add(btn3, 2, 4);
        root.add(btnSubtrai, 3, 4);
        root.add(btn0, 0, 5);
        root.add(btnCalcula, 1, 5);
        root.add(btnVirgula, 2, 5);
        root.add(btnSoma, 3, 5);
        root.add(visor, 0, 0, 4, 1);

        //Definição de tamanho da janela
        stage.setMinWidth(400);
        stage.setMaxWidth(400);

        stage.setMinHeight(600);
        stage.setMaxHeight(600);

        //Definição de tamanhos para botões e visor
        btnC.setPrefSize(100, 100);
        btnDel.setPrefSize(100, 100);
        btnPorcento.setPrefSize(100, 100);
        btnRaiz.setPrefSize(100, 100);
        btn7.setPrefSize(100, 100);
        btn8.setPrefSize(100, 100);
        btn9.setPrefSize(100, 100);
        btnDivide.setPrefSize(100, 100);
        btn4.setPrefSize(100, 100);
        btn5.setPrefSize(100, 100);
        btn6.setPrefSize(100, 100);
        btnMultiplica.setPrefSize(100, 100);
        btn1.setPrefSize(100, 100);
        btn2.setPrefSize(100, 100);
        btn3.setPrefSize(100, 100);
        btnSubtrai.setPrefSize(100, 100);
        btn0.setPrefSize(100, 100);
        btnCalcula.setPrefSize(100, 100);
        btnVirgula.setPrefSize(100, 100);
        btnSoma.setPrefSize(100, 100);
        visor.setPrefSize(400, 80);

        //Define tamanho da fonte
        btnC.setFont(new Font(20));
        btnDel.setFont(new Font(20));
        btnPorcento.setFont(new Font(20));
        btnRaiz.setFont(new Font(20));
        btn7.setFont(new Font(20));
        btn8.setFont(new Font(20));
        btn9.setFont(new Font(20));
        btnDivide.setFont(new Font(20));
        btn4.setFont(new Font(20));
        btn5.setFont(new Font(20));
        btn6.setFont(new Font(20));
        btnMultiplica.setFont(new Font(20));
        btn1.setFont(new Font(20));
        btn2.setFont(new Font(20));
        btn3.setFont(new Font(20));
        btnSubtrai.setFont(new Font(20));
        btn0.setFont(new Font(20));
        btnCalcula.setFont(new Font(20));
        btnVirgula.setFont(new Font(20));
        btnSoma.setFont(new Font(20));
        visor.setFont(new Font(25));

        Entidades entidade = new Entidades();
        Funcionalidades funcionalidade = new Funcionalidades(entidade);

        //chamada dos botões do teclado numérico da aplicação implementando os dados nas variáveis
        btn7.setOnAction(e -> {
            if(entidade.getOperacao().isEmpty()){
                entidade.setNumero1(entidade.getNumero1() + btn7.getText());
            }else{
                entidade.setNumero2(entidade.getNumero2() + btn7.getText());
            }
            visor.appendText("7");
        });

        btn8.setOnAction(e -> {
            if(entidade.getOperacao().isEmpty()){
                entidade.setNumero1(entidade.getNumero1() + btn8.getText());
            }else{
                entidade.setNumero2(entidade.getNumero2() + btn8.getText());
            }
            visor.appendText("8");
        });

        btn9.setOnAction(e -> {
            if(entidade.getOperacao().isEmpty()){
                entidade.setNumero1(entidade.getNumero1() + btn9.getText());
            }else{
                entidade.setNumero2(entidade.getNumero2() + btn9.getText());
            }
            visor.appendText("9");
        });

        btn4.setOnAction(e -> {
            if(entidade.getOperacao().isEmpty()){
                entidade.setNumero1(entidade.getNumero1() + btn4.getText());
            }else{
                entidade.setNumero2(entidade.getNumero2() + btn4.getText());
            }
            visor.appendText("4");
        });

        btn5.setOnAction(e -> {
            if(entidade.getOperacao().isEmpty()){
                entidade.setNumero1(entidade.getNumero1() + btn5.getText());
            }else{
                entidade.setNumero2(entidade.getNumero2() + btn5.getText());
            }
            visor.appendText("5");
        });

        btn6.setOnAction(e -> {
            if(entidade.getOperacao().isEmpty()){
                entidade.setNumero1(entidade.getNumero1() + btn6.getText());
            }else{
                entidade.setNumero2(entidade.getNumero2() + btn6.getText());
            }
            visor.appendText("6");
        });

        btn1.setOnAction(e -> {
            if(entidade.getOperacao().isEmpty()){
                entidade.setNumero1(entidade.getNumero1() + btn1.getText());
            }else{
                entidade.setNumero2(entidade.getNumero2() + btn1.getText());
            }
            visor.appendText("1");
        });

        btn2.setOnAction(e -> {
            if(entidade.getOperacao().isEmpty()){
                entidade.setNumero1(entidade.getNumero1() + btn2.getText());
            }else{
                entidade.setNumero2(entidade.getNumero2() + btn2.getText());
            }
            visor.appendText("2");
        });

        btn3.setOnAction(e -> {
            if(entidade.getOperacao().isEmpty()){
                entidade.setNumero1(entidade.getNumero1() + btn3.getText());
            }else{
                entidade.setNumero2(entidade.getNumero2() + btn3.getText());
            }
            visor.appendText("3");
        });

        btn0.setOnAction(e -> {
            if(entidade.getOperacao().isEmpty()){
                entidade.setNumero1(entidade.getNumero1() + btn0.getText());
            }else{
                entidade.setNumero2(entidade.getNumero2() + btn0.getText());
            }
            visor.appendText("0");
        });

        btnDivide.setOnAction(e -> {
            entidade.setOperacao(btnDivide.getText());
            visor.appendText("÷");
        });

        btnMultiplica.setOnAction(e -> {
            entidade.setOperacao(btnMultiplica.getText());
            visor.appendText("×");
        });

        btnSubtrai.setOnAction(e -> {
            entidade.setOperacao(btnSubtrai.getText());
            visor.appendText("-");
        });

        btnSoma.setOnAction(e -> {
            entidade.setOperacao(btnSoma.getText());
            visor.appendText("+");
        });

        btnC.setOnAction(e -> {
            entidade.setLimpa(true);
        });

        //chamada do botão que pegará todos os dados e funções e realizar mostrando o resultado no visor da calculadora
        btnCalcula.setOnAction(e -> {
            if(entidade.getOperacao().equals("+")){
                funcionalidade.soma();
            }else if(entidade.getOperacao().equals("-")){
                funcionalidade.subtrai();
            }else if(entidade.getOperacao().equals("*")){
                funcionalidade.multiplica();
            }else if(entidade.getOperacao().equals("/")){
                funcionalidade.divide();
            }else if(visor.getText().contains("√")){
                funcionalidade.raiz();
            }

            visor.appendText("=" + entidade.getResultado());
        });

        //botão que irá limpar todas as variáveis e o visor
        btnC.setOnAction(e -> {
            entidade.setNumero1("");
            entidade.setNumero2("");
            entidade.setOperacao("");
            entidade.setResultado("");
            entidade.setResultadoCalculo(0);

            visor.setText("");
        });

        btnVirgula.setOnAction(e -> {
            if(entidade.getOperacao().isEmpty()){
                entidade.setNumero1(entidade.getNumero1() + btnVirgula.getText());
            }else{
                entidade.setNumero2(entidade.getNumero2() + btnVirgula.getText());
            }
            visor.appendText(".");
        });

        //botao onde deleta um item quando digitado errado
        btnDel.setOnAction(e -> {
            if (entidade.getOperacao().isEmpty()){
                String numero = entidade.getNumero1();

                if (!numero.isEmpty()){
                    numero = numero.substring(0, numero.length() - 1);
                    entidade.setNumero1(numero);
                    visor.setText(visor.getText().substring(0, visor.getText().length() - 1));
                }
            }else{
                String numero = entidade.getNumero2();

                if (!numero.isEmpty()){
                    numero = numero.substring(0, numero.length() - 1);
                    entidade.setNumero2(numero);
                    visor.setText(visor.getText().substring(0, visor.getText().length() - 1));
                }
            }
            String texto = visor.getText();
        });

        //botão onde chama a função de porcentagem e mostra no visor o resultado
        btnPorcento.setOnAction(e -> {
            if(entidade.getOperacao().isEmpty()){
                entidade.setAvancN1(btnPorcento.getText());
            }else{
                entidade.setAvancN2(btnPorcento.getText());
            }

            funcionalidade.porcentagem();

            if(entidade.getOperacao().isEmpty()){
                entidade.setNumero1(entidade.getResultado());
                visor.appendText("%");
            }else{
                entidade.setNumero2(entidade.getResultado());
                visor.appendText("%");
            }

            if(entidade.getAvancN1().equals("%")){
                visor.setText(visor.getText().replace(entidade.getNumero1(), String.valueOf(entidade.getResultadoOperacao())));
            }else if(entidade.getAvancN2().equals("%")){
                visor.setText(visor.getText().replace(entidade.getNumero2(), String.valueOf(entidade.getResultadoOperacao())));
            }
        });

        //botão onde chama a função da raiz quadrada
        btnRaiz.setOnAction(e ->{
            /*if (entidade.getOperacao().isEmpty()) {
                entidade.setAvancN1(btnRaiz.getText());
            }else{
                entidade.setAvancN2(btnRaiz.getText());
            }*/

            entidade.setRaiz(true);

            visor.appendText("√");
        });

        Scene scene = new Scene(root, 300, 400);

        stage.setScene(scene);

        stage.show();
    }
}
