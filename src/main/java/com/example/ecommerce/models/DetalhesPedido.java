package com.example.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DetalhesPedido {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;
    private int numPedido;
    private int nunProduto;
    private String nomeProduto;
    private int qtdProduto;
    private float precoUnidade;
    private float subtotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getNunProduto() {
        return nunProduto;
    }

    public void setNunProduto(int nunProduto) {
        this.nunProduto = nunProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public float getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(float precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }


}
