package com.example.ecommerce.models;

import javax.persistence.*;

@Entity
public class Envio {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;
    private int numFrete;
    private String tipoFrete;
    private int precoFrete;
    private int numRegistro;

    @OneToOne
    @JoinColumn(name="pedido_id")
    private Pedido pedido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumFrete() {
        return numFrete;
    }

    public void setNumFrete(int numFrete) {
        this.numFrete = numFrete;
    }

    public String getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(String tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public int getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(int precoFrete) {
        this.precoFrete = precoFrete;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }


}
