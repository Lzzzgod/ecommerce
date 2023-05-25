package com.example.ecommerce.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;
    private int numPedido;
    private Date dataCriacao;
    private Date dataFrete;
    private String nomeCliente;
    private String numCliente;
    private String status;
    private int numFrete;

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

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataFrete() {
        return dataFrete;
    }

    public void setDataFrete(Date dataFrete) {
        this.dataFrete = dataFrete;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumFrete() {
        return numFrete;
    }

    public void setNumFrete(int numFrete) {
        this.numFrete = numFrete;
    }


}
