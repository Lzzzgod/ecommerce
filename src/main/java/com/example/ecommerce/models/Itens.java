package com.example.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.*;

@Entity
public class Itens {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;
    private int numItem;
    private int numProduto;
    private String nomeProduto;
    private int quantidadeItem;
    private float precoUnidade;
    private float precoTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
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

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public float getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(float precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

}
