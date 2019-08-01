package br.senac.rn.introducaooo;

public class Conta {

    private String agencia;
    private String numero;
    private Double saldo = 0.0;
    private String titular;

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposita(Double valor) {
        saldo += valor;
    }

    public void saca(Double valor) {
        saldo -= valor;
    }

    public void transfere(Conta contaDestino, Double valor) {
        saca(valor);
        contaDestino.deposita(valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia='" + agencia + '\'' +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
