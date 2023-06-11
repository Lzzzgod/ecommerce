package com.example.ecommerce.models;

import javax.persistence.*;

@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;
    private int numPedido;
    private String tipoPagamento;
    private float subtotal;
    private float precoFrete;
    private int numUsuario;

    @OneToOne
    @JoinColumn(name="itens_id")
    private Itens itens;

    @OneToOne(mappedBy = "pagamento")
    private Pedido pedido;

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

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(float precoFrete) {
        this.precoFrete = precoFrete;
    }

    public int getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(int numUsuario) {
        this.numUsuario = numUsuario;
    }

}
