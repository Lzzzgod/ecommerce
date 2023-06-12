package com.example.ecommerce.controller;

import com.example.ecommerce.models.*;
import com.example.ecommerce.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SpringBdRestController {

        //CLIENTE
        @Autowired
        ClienteService clienteService;


        @RequestMapping(value = "/clientes", method = RequestMethod.GET)
        public List<Cliente> getAllClientes() {
            return clienteService.getAllClientes();
        }


        @RequestMapping(value = "/clientes/{id}", method = RequestMethod.GET)
        public Optional<Cliente> getAllClientes(@PathVariable Integer id) {
            return clienteService.getClienteById(id);
        }


        @RequestMapping(value = "/clientes", method = RequestMethod.POST)
        public void addCliente(@RequestBody Cliente cliente) {
            clienteService.insertCliente(cliente);
        }


        @RequestMapping(value = "/clientes", method = RequestMethod.PUT)
        public void updateCliente(@RequestBody Cliente cliente) {
            clienteService.updateCliente(cliente);
        }


        @RequestMapping(value = "/clientes/{id}", method = RequestMethod.DELETE)
        public void deleteClienteById(@PathVariable Integer id) {
            clienteService.deleteClienteById(id);
        }


        @RequestMapping(value = "/clientes", method = RequestMethod.DELETE)
        public void deleteClienteAllClientes() {
            clienteService.deleteAllClientes();
        }



        //DETALHES PEDIDO
        @Autowired
        DetalhesPedidoService detalhesPedidoService;

        @RequestMapping(value = "/detalhespedido", method = RequestMethod.GET)
        public List<DetalhesPedido> getAllDetalhesPedido() {
            return detalhesPedidoService.getAllDetalhesPedido();
        }

        @RequestMapping(value = "/detalhespedido/{id}", method = RequestMethod.GET)
        public Optional<DetalhesPedido> getAllDetalhesPedido(@PathVariable Integer id) {
            return detalhesPedidoService.getDetalhesPedidoById(id);
        }

        @RequestMapping(value = "/detalhespedido", method = RequestMethod.POST)
        public void addDetalhesPedido(@RequestBody DetalhesPedido detalhesPedido) {
            detalhesPedidoService.insertDetalhesPedido(detalhesPedido);
        }

        @RequestMapping(value = "/detalhespedido", method = RequestMethod.PUT)
        public void updateDetalhesPedido(@RequestBody DetalhesPedido detalhesPedido) {
            detalhesPedidoService.updateDetalhesPedido(detalhesPedido);
        }

        @RequestMapping(value = "/detalhespedido/{id}", method = RequestMethod.DELETE)
        public void deleteDetalhesPedidoById(@PathVariable Integer id) {
            detalhesPedidoService.deleteDetalhesPedidoById(id);
        }

        @RequestMapping(value = "/detalhespedido", method = RequestMethod.DELETE)
        public void deleteAllDetalhesPedido() {
            detalhesPedidoService.deleteAllDetalhesPedido();
        }

        //ENVIO
        @Autowired
        EnvioService envioService;

        @RequestMapping(value = "/envios", method = RequestMethod.GET)
        public List<Envio> get() {
            return envioService.getAllEnvios();
        }

        @RequestMapping(value = "/envios/{id}", method = RequestMethod.GET)
        public Optional<Envio> getAllEnviosById(@PathVariable Integer id) {
            return envioService.getEnvioById(id);
        }

        @RequestMapping(value = "/envios", method = RequestMethod.POST)
        public void addEnvio(@RequestBody Envio envio) {
            envioService.insertEnvio(envio);
        }

        @RequestMapping(value = "/envios", method = RequestMethod.PUT)
        public void updateEnvio(@RequestBody Envio envio) {
            envioService.updateEnvio(envio);
        }

        @RequestMapping(value = "/envios/{id}", method = RequestMethod.DELETE)
        public void deleteEnviosById(@PathVariable Integer id) {
            envioService.deleteEnvioById(id);
        }

        @RequestMapping(value = "/envios", method = RequestMethod.DELETE)
        public void deleteAllEnvios() {
            envioService.deleteAllEnvios();
        }

        //ITENS
        @Autowired
        ItensService itensService;

        @RequestMapping(value = "/itens", method = RequestMethod.GET)
        public List<Itens> getItens() {
            return itensService.getAllItens();
        }

        @RequestMapping(value = "/itens/{id}", method = RequestMethod.GET)
        public Optional<Itens> getAllItensById(@PathVariable Integer id) {
            return itensService.getItensById(id);
        }

        @RequestMapping(value = "/itens", method = RequestMethod.POST)
        public void addItens(@RequestBody Itens itens) {
            itensService.insertItens(itens);
        }

        @RequestMapping(value = "/itens", method = RequestMethod.PUT)
        public void updateIten(@RequestBody Itens itens) {
            itensService.updateItens(itens);
        }

        @RequestMapping(value = "/itens/{id}", method = RequestMethod.DELETE)
        public void deleteItenById(@PathVariable Integer id) {
            itensService.deleteItensById(id);
        }

        @RequestMapping(value = "/itens", method = RequestMethod.DELETE)
        public void deleteAllItens() {
            itensService.deleteAllItens();
        }

        //PAGAMENTO
        @Autowired
        PagamentoService pagamentoService;

        @RequestMapping(value = "/pagamentos", method = RequestMethod.GET)
        public List<Pagamento> getPagamento() {
            return pagamentoService.getAllPagamento();
        }

        @RequestMapping(value = "/pagamentos/{id}", method = RequestMethod.GET)
        public Optional<Pagamento> getAllPagamentoById(@PathVariable Integer id) {
            return pagamentoService.getPagamentoById(id);
        }

        @RequestMapping(value = "/pagamentos", method = RequestMethod.POST)
        public void addPagamento(@RequestBody Pagamento pagamento) {
            pagamentoService.insertPagamento(pagamento);
        }

        @RequestMapping(value = "/pagamentos", method = RequestMethod.PUT)
        public void updatePagamento(@RequestBody Pagamento pagamento) {
            pagamentoService.updatePagamento(pagamento);
        }

        @RequestMapping(value = "/pagamentos/{id}", method = RequestMethod.DELETE)
        public void deletePagamentoById(@PathVariable Integer id) {
            pagamentoService.deletePagamentoById(id);
        }

        @RequestMapping(value = "/pagamentos", method = RequestMethod.DELETE)
        public void deleteAllPagamento() {
            pagamentoService.deleteAllPagamento();
        }

        //PEDIDO
        @Autowired
        PedidoService pedidoService;

        @RequestMapping(value = "/pedidos", method = RequestMethod.GET)
        public List<Pedido> getPedidos() {
            return pedidoService.getAllPedidos();
        }

        @RequestMapping(value = "/pedidos/{id}", method = RequestMethod.GET)
        public Optional<Pedido> getAllpedidosById(@PathVariable Integer id) {
            return pedidoService.getPedidoById(id);
        }

        @RequestMapping(value = "/pedidos", method = RequestMethod.POST)
        public void addPagamento(@RequestBody Pedido pedido) {
            pedidoService.insertPedido(pedido);
        }

        @RequestMapping(value = "/pedidos", method = RequestMethod.PUT)
        public void updatePagamento(@RequestBody Pedido pedido) {
            pedidoService.updatePedido(pedido);
        }

        @RequestMapping(value = "/pedidos/{id}", method = RequestMethod.DELETE)
        public void deletePedidoById(@PathVariable Integer id) {
            pedidoService.deletePedidoById(id);
        }

        @RequestMapping(value = "/pedidos", method = RequestMethod.DELETE)
        public void deleteAllPedidos() {
            pedidoService.deleteAllPedidos();
        }

        //PRODUTO
        @Autowired
        ProdutoService produtoService;

        @RequestMapping(value = "/produtos", method = RequestMethod.GET)
        public List<Produto> getProdutos() {
            return produtoService.getAllProduto();
        }

        @RequestMapping(value = "/produtos/{id}", method = RequestMethod.GET)
        public Optional<Produto> getAllProdutosById(@PathVariable Integer id) {
            return produtoService.getProdutoById(id);
        }

        @RequestMapping(value = "/produtos", method = RequestMethod.POST)
        public void addProduto(@RequestBody Produto produto) {
            produtoService.insertProduto(produto);
        }

        @RequestMapping(value = "/produtos", method = RequestMethod.PUT)
        public void updatePagamento(@RequestBody Produto produto) {
            produtoService.updateProduto(produto);
        }

        @RequestMapping(value = "/produtos/{id}", method = RequestMethod.DELETE)
        public void deleteProdutoById(@PathVariable Integer id) {
            produtoService.deleteProdutoById(id);
        }

        @RequestMapping(value = "/produtos", method = RequestMethod.DELETE)
        public void deleteAllProdutos() {
            produtoService.deleteAllProduto();
        }

        //USUARIOS
        @Autowired
        UsuarioService usuarioService;

        @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
        public List<Usuario> getUsuarios() {
            return usuarioService.getAllUsuarios();
        }

        @RequestMapping(value = "/usuarios/{id}", method = RequestMethod.GET)
        public Optional<Usuario> getAllUsuariosById(@PathVariable Integer id) {
            return usuarioService.getUsuarioById(id);
        }

        @RequestMapping(value = "/usuarios", method = RequestMethod.POST)
        public void addUsuarios(@RequestBody Usuario usuario) {
            usuarioService.insertUsuario(usuario);
        }

        @RequestMapping(value = "/usuarios", method = RequestMethod.PUT)
        public void updateUsuarios(@RequestBody Usuario usuario) {
            usuarioService.updateUsuario(usuario);
        }

        @RequestMapping(value = "/usuarios/{id}", method = RequestMethod.DELETE)
        public void deleteUsuariosById(@PathVariable Integer id) {
            usuarioService.deleteUsuarioById(id);
        }

        @RequestMapping(value = "/usuarios", method = RequestMethod.DELETE)
        public void deleteAllUsuarios() {
            usuarioService.deleteAllUsuarios();
        }

}

