package com.example.matheusekaique.crud_conjunto;

/**
 * Created by mathe on 15/10/2017.
 */

public class Conjunto {
    private int andar;
    private double tamanho;
    private int salas;
    private double valor;
    private String observacao;
    private int situacao;

    public Conjunto()
    {
        setAndar(0);
        setTamanho(0.0);
        setSalas(0);
        setValor(0.0);
        setObservacao("");
        setSituacao(0);
    }

    public Conjunto(int andar, double tamanho, int salas, double valor, String observacao, int situacao)
    {
        setAndar(andar);
        setTamanho(tamanho);
        setSalas(salas);
        setValor(valor);
        setObservacao(observacao);
        setSituacao(situacao);
    }

    public void setAndar(int andar)
    {
        this.andar = andar;
    }

    public void setTamanho(double tamanho)
    {
        this.tamanho = tamanho;
    }

    public void setSalas(int salas)
    {
        this.salas = salas;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public void setObservacao(String observacao)
    {
        this.observacao = observacao;
    }

    public void setSituacao(int situacao)
    {
        this.situacao = situacao;
    }

    public int getAndar()
    {
        return andar;
    }

    public double getTamanho()
    {
        return tamanho;
    }

    public int getSalas()
    {
        return salas;
    }

    public double getValor()
    {
        return valor;
    }

    public String getObservacao()
    {
        return observacao;
    }

    public int getSituacao()
    {
        return situacao;
    }
}
