package com.example.ecommerce.models;

import javax.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;
    private int numProduto;
    private String nomeProduto;
    private String detalhesPedido;
    private int qtdProduto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumProduto() {
        return numProduto;
    }

    public void setNumProduto(int numProduto) {
        this.numProduto = numProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDetalhesPedido() {
        return detalhesPedido;
    }

    public void setDetalhesPedido(String detalhesPedido) {
        this.detalhesPedido = detalhesPedido;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "numProduto=" + numProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", detalhesPedido='" + detalhesPedido + '\'' +
                ", qtdProduto=" + qtdProduto +
                '}';
    }
}
