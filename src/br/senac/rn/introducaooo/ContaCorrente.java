package br.senac.rn.introducaooo;

public class ContaCorrente extends Conta {

    private Double taxa;

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + super.toString() + "}";
    }

}
