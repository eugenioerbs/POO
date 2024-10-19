    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package codes;

    import java.util.ArrayList;

    /**
     *
     * @author everbs
     */

    public class Vendedor extends Funcionario1 {
        private double percentualComissao;
        private ArrayList<Venda> vendas;

        public Vendedor (String nome, double salarioBase, double percentualComissao) {
            super(nome, salarioBase);
            setPercentualComissao(percentualComissao);
            vendas = new ArrayList<>();

        }//CONSTRUTOR


        public double getPercentualComissao() {
            return percentualComissao;
        }

        public void setPercentualComissao(double percentualComissao) {
            if (percentualComissao <= 0) {
                throw new IllegalArgumentException("Não pode ser negativo");
            }
            this.percentualComissao = percentualComissao;
        }

        public void incluirVenda (Venda v) {
            if (v == null){
                throw new IllegalArgumentException("Venda nao informada");
            }
            vendas.add(v);
        }

        public ArrayList<Venda> getVendas() {
            return vendas;
        }
        
    
        @Override
        public double calcularSalario () {
          double valorTotalVenda = 0;

          for (Venda a: vendas) {
              valorTotalVenda += a.getValor();
          }
          return getSalarioBase() + (valorTotalVenda * (percentualComissao / 100));
        }


    }//CLASSE
