/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */

public class MainLista10 {
    
    protected Empresa empresa;
    
    public MainLista10 () {
        
        
        int op;
        do {            
            String opcao = JOptionPane.showInputDialog("Escolha\n"
                    + "1 - Incluir empresa\n"
                    + "2 - Incluir funcionário\n"
                    + "3 - Remover funcionários\n"
                    + "4 - Mostrar funcionários\n"
                    + "5 - Calcular total de custos com salarios");
            op = Integer.parseInt(opcao);
            
            switch (op) {
                case 1:
                    String nomeEmpresa = JOptionPane.showInputDialog("Informe o nome da empresa: ");
                    
                    empresa = new Empresa(nomeEmpresa);
                    
                    break;
                    
                case 2:
                    String nome = JOptionPane.showInputDialog("Informe o nome: ");
                    String salarioBaseString = JOptionPane.showInputDialog("Informe o salario base: ");
                    double salarioBase = Double.parseDouble(salarioBaseString);
                    String tipoFuncionarioString = JOptionPane.showInputDialog("Informe o tipo do funcionario\n"
                            + "1 - Programador\n"
                            + "2 - Vendedor\n");
                    int tipoFuncionario = Integer.parseInt(tipoFuncionarioString);
                    
                    if (tipoFuncionario == 1) {                       
                        Programador funcionario = new Programador(nome, salarioBase);
                        
                        String escolhaSeQuerIncluirLinguagemString = JOptionPane.showInputDialog("Deseja incluir linguagem?\n"
                                + "1 - Sim\n"
                                + "2 - Não");
                        int escolhaSeQuerIncluirLinguagem = Integer.parseInt(escolhaSeQuerIncluirLinguagemString);
                        
                        if (escolhaSeQuerIncluirLinguagem == 1) {
                                String linguagemEntrada = JOptionPane.showInputDialog("Informe a linguagem: ");
                                funcionario.inserirLinguagem(linguagemEntrada);
                                empresa.incluirFuncionario(funcionario);
                        } else {
                            empresa.incluirFuncionario(funcionario);
                        }
                               
                    } else if (tipoFuncionario == 2) {
                        String percentualComissaoString = JOptionPane.showInputDialog("Informe o percentual de comissão deste vendedor: ");
                        double percentualComissao = Double.parseDouble(percentualComissaoString);
                        
                        Vendedor funcionario = new Vendedor(nome, salarioBase, percentualComissao);
                        empresa.incluirFuncionario(funcionario);
                        
                        String escolhaSeQuerAdicionarVendaString = JOptionPane.showInputDialog("Deseja incluir venda?\n"
                                + "1 - Sim\n"
                                + "2 - Não");
                        int escolhaSeQuerAdicionarVenda = Integer.parseInt(escolhaSeQuerAdicionarVendaString);
                        
                        if (escolhaSeQuerAdicionarVenda == 1) {                               
                                String valorVendaString = JOptionPane.showInputDialog("Informe o valor da venda: ");
                                double valorVenda = Integer.parseInt(valorVendaString);
                                
                                Venda venda = new Venda(valorVenda);                               
                                funcionario.incluirVenda(venda);
     
                        }         
                    }
                    
                    break;
                    
                case 3:
                    String nomeDoFuncionarioQueDesejoRemover = JOptionPane.showInputDialog("Informe o nome do funcionario que desejas remover:");
                    Funcionario1 funcionarioRemover = null;
                    
                    for (Funcionario1 a : empresa.getFuncionarios()) {
                        if (a.getNome().equalsIgnoreCase(nomeDoFuncionarioQueDesejoRemover)) {
                            funcionarioRemover = a;
                            break;
                        }
                    }
                    
                    if (funcionarioRemover != null) {
                        empresa.removerFuncionario(funcionarioRemover);
                        JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado :(");
                    }
                    
                    break;
                    
                case 4:
                    String funcionariosListados = listarFuncionarios();
                    JOptionPane.showMessageDialog(null, funcionariosListados);
                    
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Total de custos com salário: R$" + empresa.cacularCustosSalarios());
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (op != 6);
        
    }//consturtor
    public static void main(String[] args) {
        MainLista10 mainLista10 = new MainLista10();
    }
    
    
    public String listarFuncionarios() {
    StringBuilder result = new StringBuilder();

    for (Funcionario1 a : empresa.getFuncionarios()) {
        result.append("Nome: ").append(a.getNome()).append("\n");
        result.append("Salário: R$").append(a.calcularSalario()).append("\n");

        if (a instanceof Programador) {
            Programador prog = (Programador) a;
            result.append("Linguagens: ").append(prog.getLinguagens()).append("\n");
        } else if (a instanceof Vendedor) {
            Vendedor vend = (Vendedor) a;
            result.append("Percentual de Comissão: ").append(vend.getPercentualComissao()).append("%\n");
        }

        result.append("-------------------------\n");
    }

    return result.toString();
}

    
}//classe
