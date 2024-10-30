    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package codes;

    /**
     *
     * @author Eugênio
     */
    public class ContaAgua implements Pagavel {
        private int metrosCubicos;
        private double precoMatroCubico;

        public ContaAgua (int metrosCubicos, double precoMatroCubico) {
            setMetrosCubicos(metrosCubicos);
            setPrecoMatroCubico(precoMatroCubico);

        }

        public int getMetrosCubicos() {
            return metrosCubicos;
        }

        public void setMetrosCubicos(int metrosCubicos) {
            this.metrosCubicos = metrosCubicos;
        }

        public double getPrecoMatroCubico() {
            return precoMatroCubico;
        }

        public void setPrecoMatroCubico(double precoMatroCubico) {
            this.precoMatroCubico = precoMatroCubico;
        }

        @Override
        public double calcularValorPagar() {
            return metrosCubicos * precoMatroCubico;
        }


    }
