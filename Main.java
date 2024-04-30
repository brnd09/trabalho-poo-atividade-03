import javax.swing.*;
import java.awt.*;

public class Main {
    // Define o plano de fundo para os diálogos do JOptionPane

    public static void setCustomBackgroundColor(Color color) {
        UIManager.put("OptionPane.background", color);
        UIManager.put("Panel.background", color);
    }

    public static void main(String[] args) {

        // Define o plano de fundo para os diálogos do JOptionPane
        Color verde = new Color(16, 113, 16);
        setCustomBackgroundColor(verde);

        Filme filme1 = new Filme(1, "O Homem do Norte", "Ação", 137);
        Filme filme2 = new Filme(2, "Escola do Rock", "Comédia", 108);
        Filme filme3 = new Filme(3, "Amor a Toda Prova", "Comédia Romântica", 118);

        Ator ator1 = new Ator(1, "Amleth", "Alexander Skarsgård", filme1);
        Ator ator2 = new Ator(2, "Rainha Gudrun", "Nicole Kidman", filme1);
        Ator ator3 = new Ator(3, "Olga", "Anya Taylor-Joy", filme1);
        Ator ator4 = new Ator(4, "Dewey Finn", "Jack Black", filme2);
        Ator ator5 = new Ator(5, "Rosalie Mullins", "Joan Cusack", filme2);
        Ator ator6 = new Ator(6, "Zack Mooneyham", "Joey Gaydos Jr.", filme2);
        Ator ator7 = new Ator(7, "Cal Weaver", "Steve Carell", filme3);
        Ator ator8 = new Ator(8, "Hannah", "Emma Stone", filme3);
        Ator ator9 = new Ator(9, "Jacob Palmer", "Ryan Gosling", filme3);

        Sala sala1 = new Sala(1, 100, "LED", "Sala 1");
        Sala sala2 = new Sala(2, 200, "LED", "Sala 2");
        Sala sala3 = new Sala(3, 275, "LED", "Sala 3");
        Sala sala4 = new Sala(4, 100, "Tecido", "Sala 4");
        Sala sala5 = new Sala(5, 200, "Tecido", "Sala 5");
        Sala sala6 = new Sala(6, 275, "Tecido", "Sala 6");

        Sessao sessao11 = new Sessao(1, filme1, sala1, "20:00");
        Sessao sessao12 = new Sessao(2, filme1, sala2, "21:00");
        Sessao sessao13 = new Sessao(3, filme1, sala3, "22:00");

        Sessao sessao21 = new Sessao(4, filme2, sala3, "15:00");
        Sessao sessao22 = new Sessao(5, filme2, sala2, "17:00");
        Sessao sessao23 = new Sessao(6, filme2, sala1, "19:00");

        Sessao sessao31 = new Sessao(7, filme3, sala4, "19:00");
        Sessao sessao32 = new Sessao(8, filme3, sala5, "19:30");
        Sessao sessao33 = new Sessao(9, filme3, sala6, "21:00");

        // Saudação inicial
        InOut.MsgSemIcone("Seja Bem-vindo!", "Olá! Escolha um filme para ver as opções de horários.");

        // Escolha do filme
        int pick1 = InOut.leInt("Insira o número do filme desejado: \n1. O Homem do Norte\n2. Escola do Rock\n3. Amor a Toda Prova");

        if (pick1 == 1) {
            InOut.MsgSemIcone("Boa escolha", "Aqui estão os dados sobre o filme" + filme1);
            int pick2 = InOut.leInt("Escolha uma sessão:\n1. Sessão às 20:00\n2. Sessão às 21:00\n3. Sessão às 22:00");

            if (pick2 == 1) {
                InOut.MsgSemIcone("Sessão escolhida", "A sessão escolhida foi: " + sessao11);
                InOut.MsgSemIcone("Atores", "Esses são os atores principais do filme: " + ator1 + ", " + ator2 + " e " + ator3);
                InOut.MsgSemIcone("Bom filme", "Bom filme!");
            } else if (pick2 == 2) {
                InOut.MsgSemIcone("Sessão escolhida", "A sessão escolhida foi: " + sessao12);
                InOut.MsgSemIcone("Atores", "Esses são os atores principais do filme: " + ator1 + ", " + ator2 + " e " + ator3);
                InOut.MsgSemIcone("Bom filme", "Bom filme!");
            } else if (pick2 == 3) {
                InOut.MsgSemIcone("Sessão escolhida", "A sessão escolhida foi: " + sessao13);
                InOut.MsgSemIcone("Atores", "Esses são os atores principais do filme: " + ator1 + ", " + ator2 + " e " + ator3);
                InOut.MsgSemIcone("Bom filme", "Bom filme!");
            }
        } else if (pick1 == 2) {
            InOut.MsgSemIcone("Boa escolha", "Aqui estão os dados sobre o filme" + filme2);
            int pick2 = InOut.leInt("Escolha uma sessão:\n1. Sessão às 15:00\n2. Sessão às 17:00\n3. Sessão às 19:00");

            if (pick2 == 1) {
                InOut.MsgSemIcone("Sessão escolhida", "A sessão escolhida foi: " + sessao21);
                InOut.MsgSemIcone("Atores", "Esses são os atores principais do filme: " + ator4 + ", " + ator5 + ", " + ator6);
                InOut.MsgSemIcone("Bom filme", "Bom filme!");
            } else if (pick2 == 2) {
                InOut.MsgSemIcone("Sessão escolhida", "A sessão escolhida foi: " + sessao22);
                InOut.MsgSemIcone("Atores", "Esses são os atores principais do filme: " + ator4 + ", " + ator5 + ", " + ator6);
                InOut.MsgSemIcone("Bom filme", "Bom filme!");
            } else if (pick2 == 3) {
                InOut.MsgSemIcone("Sessão escolhida", "A sessão escolhida foi: " + sessao23);
                InOut.MsgSemIcone("Atores", "Esses são os atores principais do filme: " + ator4 + ", " + ator5 + ", " + ator6);
                InOut.MsgSemIcone("Bom filme", "Bom filme!");
            }
        } else if (pick1 == 3) {
            InOut.MsgSemIcone("Boa escolha", "Aqui estão os dados sobre o filme" + filme3);
            int pick2 = InOut.leInt("Escolha uma sessão:\n1. Sessão às 19:00\n2. Sessão às 19:30\n3. Sessão às 21:00");

            if (pick2 == 1) {
                InOut.MsgSemIcone("Sessão escolhida", "A sessão escolhida foi: " + sessao31);
                InOut.MsgSemIcone("Atores", "Esses são os atores principais do filme: " + ator7 + ", " + ator8 + ", " + ator9);
                InOut.MsgSemIcone("Bom filme", "Bom filme!");
            } else if (pick2 == 2) {
                InOut.MsgSemIcone("Sessão escolhida", "A sessão escolhida foi: " + sessao32);
                InOut.MsgSemIcone("Atores", "Esses são os atores principais do filme: " + ator7 + ", " + ator8 + ", " + ator9);
                InOut.MsgSemIcone("Bom filme", "Bom filme!");
            } else if (pick2 == 3) {
                InOut.MsgSemIcone("Sessão escolhida", "A sessão escolhida foi: " + sessao33);
                InOut.MsgSemIcone("Atores", "Esses são os atores principais do filme: " + ator7 + ", " + ator8 + ", " + ator9);
                InOut.MsgSemIcone("Bom filme", "Bom filme!");
            }
        }
    }
}
