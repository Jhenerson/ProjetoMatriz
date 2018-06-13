/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author jhenerson
 */
public class Matrizes {

    private int qtdLinhas = 0;
    private int qtdColunas = 0;
    int[][] matriz = null;

    public Matrizes(int linhas, int colunas) throws Exception {
        if (linhas <= 0 || colunas <= 0) {
            throw new Exception("Não pode ser menor ou igual a 0");
        }
        matriz = new int[linhas][colunas];
        this.qtdLinhas = linhas;
        this.qtdColunas = colunas;
    }

    public int getLinhas() {
        return qtdLinhas;
    }

    public int getColunas() {
        return qtdColunas;
    }

    public int getElemento(int linhas, int colunas) throws Exception {
        if (linhas < 0 || linhas >= this.qtdLinhas) {
            throw new Exception("Fora do intervalo válido");
        }
        if (colunas < 0 || colunas >= this.qtdColunas) {
            throw new Exception("Fora do intervalo válido");
        }
        return matriz[linhas][colunas];
    }

    public void setElemento(int linhas, int colunas, int elemento) throws Exception {
        if (linhas < 0 || linhas >= this.qtdLinhas) {
            throw new Exception("Fora do intervalo válido");
        }
        if (colunas < 0 || colunas >= this.qtdColunas) {
            throw new Exception("Fora do intervalo válido");
        }
        matriz[linhas][colunas] = elemento;
    }

    public String getMatriz() {
        String saida = "";
        for (int l = 0; l < qtdLinhas; l++) {
            for (int c = 0; c < qtdColunas; c++) {
                saida += matriz[l][c] + "  ";
            }
            saida += "\n";
        }
        return saida;
    }

    public Matrizes adicionar(Matrizes matriz) throws Exception {
        if (this.qtdLinhas != matriz.qtdLinhas || this.qtdColunas != matriz.qtdColunas) {
            throw new Exception("As matrizes não são da mesma ordem");
        }

        Matrizes aux = new Matrizes(this.qtdLinhas, this.qtdColunas);
        for (int l = 0; l < this.qtdLinhas; l++) {
            for (int c = 0; c < this.qtdColunas; c++) {
                int elemento = this.getElemento(l, c) + matriz.getElemento(l, c);
                aux.setElemento(l, c, elemento);
            }
        }
        return aux;
    }

    public Matrizes subtrair(Matrizes matriz) throws Exception {
        if (this.qtdLinhas != matriz.qtdLinhas || this.qtdColunas != matriz.qtdColunas) {
            throw new Exception("As matrizes não são da mesma ordem");
        }
        Matrizes aux = new Matrizes(this.qtdLinhas, this.qtdColunas);
        for (int l = 0; l < qtdLinhas; l++) {
            for (int c = 0; c < qtdColunas; c++) {
                int elemento = this.getElemento(l, c) - matriz.getElemento(l, c);
                aux.setElemento(l, c, elemento);
            }
        }
        return aux;
    }

    public Matrizes transpor() throws Exception {
        if (qtdLinhas <= 0) {
            throw new Exception("atenção");
        }
        Matrizes aux = new Matrizes(this.qtdColunas, this.qtdLinhas);
        for (int l = 0; l < this.qtdLinhas; l++) {
            for (int c = 0; c < this.qtdColunas; c++) {
                int elemento = this.getElemento(l, c);
                aux.setElemento(c, l, elemento);
            }
        }
        return aux;
    }

    public Matrizes multiplicar(Matrizes matriz) throws Exception {
        if (this.qtdColunas != matriz.qtdLinhas) {
            throw new Exception("Quantidade de colunas da Matriz A é diferente da quantidade de linhas da Matriz B");
        }
        Matrizes aux = new Matrizes(this.qtdLinhas, matriz.qtdColunas);
        int[][] result = new int[this.qtdLinhas][matriz.qtdColunas];
        for (int l = 0; l < this.qtdLinhas; l++) {
            for (int c = 0; c < matriz.qtdColunas; c++) {
                for (int i = 0; i < this.qtdColunas; i++) {
                    result[l][c] += this.getElemento(l, i) * matriz.getElemento(i, c);
                    aux.setElemento(l, c, result[l][c]);
                }
            }
        }
        return aux;
    }

    public Matrizes multiplicarK(int num) throws Exception {
        if (num == 0) {
            throw new Exception("Favor informar número maior que 0");
        }
        Matrizes aux = new Matrizes(qtdLinhas, qtdColunas);
        for (int l = 0; l < qtdLinhas; l++) {
            for (int c = 0; c < qtdColunas; c++) {
                int elemento = matriz[l][c] * num;
                aux.setElemento(l, c, elemento);
            }
        }
        return aux;
    }

    public Matrizes calcularPotencia(int expoente) throws Exception {
        if (this.qtdLinhas != this.qtdColunas) {
            throw new Exception("Favor informar matriz quadrada para calcular.");
        }
        if (expoente < 0) {
            throw new Exception("O expoente não pode ser menor que 0.");
        }

        Matrizes aux = new Matrizes(this.qtdLinhas, this.qtdColunas);        
        for (int i = 0; i < this.qtdLinhas; i++) {
            for (int j = 0; j < this.qtdColunas; j++) {
                aux.matriz[i][j] = this.matriz[i][j];
            }
        }
        if(expoente == 0){
            for (int i = 0; i < this.qtdLinhas; i++) {
                for (int j = 0; j < this.qtdColunas; j++) {
                    if(i==j){
                        aux.setElemento(i, j, 1);
                    }else{
                        aux.setElemento(i, j, 0);
                    }
                    
                }
                
            }
        }

        for (int i = 1; i < expoente; i++) {

            aux = aux.multiplicar(this);

        }

        return aux;
    }    
    public boolean eSimetrica() throws Exception {
        if (this.qtdLinhas != this.qtdColunas) {
            return false;
        } else {
            for (int i = 0; i < qtdLinhas; i++) {
                for (int j = 0; j < qtdColunas; j++) {
                    if (this.getElemento(i, j) != this.getElemento(j, i)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean eIdentidade() throws Exception {
        if (this.qtdLinhas != this.qtdColunas) {
            return false;
        } else {
            for (int i = 0; i < qtdLinhas; i++) {
                for (int j = 0; j < qtdColunas; j++) {
                    if ((i == j && this.getElemento(i, j) != 1)) {
                        return false;
                    }
                    if (i != j && this.getElemento(i, j) != 0) {
                        return false;
                    }

                }
            }
        }
        return true;
    }

    public boolean eTriSup() throws Exception {
        if (this.qtdLinhas != this.qtdColunas) {
            return false;
        } else {
            for (int i = 0; i < qtdLinhas; i++) {
                for (int j = 0; j < qtdColunas; j++) {
                    if (i > j && this.getElemento(i, j) != 0) {
                        return false;
                    }

                }
            }
            return true;
        }
    }

    public boolean eTriInf() throws Exception {
        if (this.qtdLinhas != this.qtdColunas) {
            return false;
        }
        for (int i = 0; i < qtdLinhas; i++) {
            for (int j = 0; j < qtdColunas; j++) {
                if (i < j && this.getElemento(i, j) != 0) {
                    return false;

                }

            }
        }
        return true;

    }

    public boolean eIgual(Matrizes matriz) throws Exception {
        if (this.qtdLinhas != matriz.qtdLinhas || this.qtdColunas != matriz.qtdColunas) {
            return false;
        }
        for (int l = 0; l < this.qtdLinhas; l++) {
            for (int c = 0; c < this.qtdColunas; c++) {
                if (this.getElemento(l, c) != matriz.getElemento(l, c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean eDiferente(Matrizes matriz) throws Exception {
        if (this.qtdLinhas != matriz.qtdLinhas || this.qtdColunas != matriz.qtdColunas) {
            return true;
        }
        for (int l = 0; l < this.qtdLinhas; l++) {
            for (int c = 0; c < this.qtdColunas; c++) {
                if (this.getElemento(l, c) != matriz.getElemento(l, c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean eOrtogonal() throws Exception {
        if (this.qtdLinhas != this.qtdColunas) {
            return false;
        }
        return this.multiplicar(this.transpor()).eIdentidade();
    }

    public boolean ePermutacao() throws Exception {
        if (this.qtdLinhas != this.qtdColunas) {
            return false;
        }
        int soma = 0;
        int soma1 = 0;
        for (int i = 0; i < qtdLinhas; i++) {
            soma = 0;
            soma1 = 0;
            for (int j = 0; j < qtdColunas; j++) {
                if (this.matriz[i][j] != 0 && this.matriz[i][j] != 1) {
                    return false;
                }
                soma += this.matriz[i][j];
                soma1 += this.matriz[j][i];
                if (soma > 1) {
                    return false;
                }
                if (soma1 > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
