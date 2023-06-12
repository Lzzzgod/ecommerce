package com.example.ecommerce.controller;

import com.example.ecommerce.models.*;
import com.example.ecommerce.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class SpringBdController {

    @Controller
    public class ClienteController {

        @Autowired
        ClienteService clienteService;
        @RequestMapping(value = "view/clientes", method = RequestMethod.GET)
        public ModelAndView getIndex(@ModelAttribute("message") final String message,
                                     @ModelAttribute("error") final String error) {

            ModelAndView mav = new ModelAndView("main");
            mav.addObject("listClientes", clienteService.getAllClientes());
            mav.addObject("message", message);
            mav.addObject("error", error);
            return mav;

        }
        @RequestMapping(value = "view/read", method = RequestMethod.GET)
        public ModelAndView read() {
            return new ModelAndView("read", "listClientes", clienteService.getAllClientes());
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.GET)

        public ModelAndView insert() {
            ModelAndView mav = new ModelAndView("insert");
            mav.addObject("cliente", new Cliente());
            return mav;
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.POST)

        public String submitInsert(@ModelAttribute("cliente")Cliente cliente,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                clienteService.insertCliente(cliente);
                redirectAttributes.addFlashAttribute("message", "Cliente inserido!");
            }
            return "redirect:/view/clientes";

        }
        @RequestMapping(value = "view/update", method = RequestMethod.GET)

        public ModelAndView update(Integer id) {
            ModelAndView mav = new ModelAndView("update");
            mav.addObject("cliente", clienteService.getClienteById(id).get());
            return mav;

        }

        @RequestMapping(value = "view/update", method = RequestMethod.POST)

        public String submitUpdate(@ModelAttribute("clientes")Cliente cliente,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {
            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                clienteService.updateCliente(cliente);
                redirectAttributes.addFlashAttribute("message", "Cliente atualizado!");
            }

            return "redirect:/view/clientes";
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.GET)

        public ModelAndView delete(Integer id) {
            ModelAndView mav = new ModelAndView("delete");
            mav.addObject("cliente", clienteService.getClienteById(id).get());
            return mav;
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.POST)
        public String submitDelete(@ModelAttribute("cliente")Cliente cliente,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                clienteService.deleteClienteById(cliente.getId());
                redirectAttributes.addFlashAttribute("message", "Cliente Excluido!");
            }
            return "redirect:/view/clientes";
        }
    }
    public class DetalhesPedidoController {

        @Autowired
        DetalhesPedidoService detalhesPedidoService;
        @RequestMapping(value = "view/detalhespedido", method = RequestMethod.GET)
        public ModelAndView getIndex(@ModelAttribute("message") final String message,
                                     @ModelAttribute("error") final String error) {

            ModelAndView mav = new ModelAndView("main");
            mav.addObject("listDetalhesPedido", detalhesPedidoService.getAllDetalhesPedido());
            mav.addObject("message", message);
            mav.addObject("error", error);
            return mav;

        }
        @RequestMapping(value = "view/read", method = RequestMethod.GET)
        public ModelAndView read() {
            return new ModelAndView("read", "listDetalhesPedido", detalhesPedidoService.getAllDetalhesPedido());
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.GET)

        public ModelAndView insert() {
            ModelAndView mav = new ModelAndView("insert");
            mav.addObject("detalhespedido", new Cliente());
            return mav;
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.POST)

        public String submitInsert(@ModelAttribute("detalhespedido")DetalhesPedido detalhesPedido,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                detalhesPedidoService.insertDetalhesPedido(detalhesPedido);
                redirectAttributes.addFlashAttribute("message", "Detalhe inserido!");
            }
            return "redirect:/view/detalhespedido";

        }
        @RequestMapping(value = "view/update", method = RequestMethod.GET)

        public ModelAndView update(Integer id) {
            ModelAndView mav = new ModelAndView("update");
            mav.addObject("cliente", detalhesPedidoService.getDetalhesPedidoById(id).get());
            return mav;

        }

        @RequestMapping(value = "view/update", method = RequestMethod.POST)

        public String submitUpdate(@ModelAttribute("detalhespedido")DetalhesPedido detalhesPedido,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {
            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                detalhesPedidoService.updateDetalhesPedido(detalhesPedido);
                redirectAttributes.addFlashAttribute("message", "Detalhe atualizado!");
            }

            return "redirect:/view/detalhespedido";
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.GET)

        public ModelAndView delete(Integer id) {
            ModelAndView mav = new ModelAndView("delete");
            mav.addObject("detalhespedido", detalhesPedidoService.getDetalhesPedidoById(id).get());
            return mav;
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.POST)
        public String submitDelete(@ModelAttribute("detalhespedido")DetalhesPedido detalhesPedido,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                detalhesPedidoService.deleteDetalhesPedidoById(detalhesPedido.getId());
                redirectAttributes.addFlashAttribute("message", "Detalhe Excluido!");
            }
            return "redirect:/view/detalhespedido";
        }
    }
    public class EnvioController {

        @Autowired
        EnvioService envioService;
        @RequestMapping(value = "view/envios", method = RequestMethod.GET)
        public ModelAndView getIndex(@ModelAttribute("message") final String message,
                                     @ModelAttribute("error") final String error) {

            ModelAndView mav = new ModelAndView("main");
            mav.addObject("listEnvios", envioService.getAllEnvios());
            mav.addObject("message", message);
            mav.addObject("error", error);
            return mav;

        }
        @RequestMapping(value = "view/read", method = RequestMethod.GET)
        public ModelAndView read() {
            return new ModelAndView("read", "listEnvios", envioService.getAllEnvios());
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.GET)

        public ModelAndView insert() {
            ModelAndView mav = new ModelAndView("insert");
            mav.addObject("envios", new Envio());
            return mav;
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.POST)

        public String submitInsert(@ModelAttribute("envio")Envio envio,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                envioService.insertEnvio(envio);
                redirectAttributes.addFlashAttribute("message", "Envio inserido!");
            }
            return "redirect:/view/envios";

        }
        @RequestMapping(value = "view/update", method = RequestMethod.GET)

        public ModelAndView update(Integer id) {
            ModelAndView mav = new ModelAndView("update");
            mav.addObject("envio", envioService.getEnvioById(id).get());
            return mav;

        }

        @RequestMapping(value = "view/update", method = RequestMethod.POST)

        public String submitUpdate(@ModelAttribute("envio")Envio envio,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {
            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                envioService.updateEnvio(envio);
                redirectAttributes.addFlashAttribute("message", "Envio atualizado!");
            }

            return "redirect:/view/envios";
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.GET)

        public ModelAndView delete(Integer id) {
            ModelAndView mav = new ModelAndView("delete");
            mav.addObject("envio", envioService.getEnvioById(id).get());
            return mav;
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.POST)
        public String submitDelete(@ModelAttribute("envio")Envio envio,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                envioService.deleteEnvioById(envio.getId());
                redirectAttributes.addFlashAttribute("message", "Envio Excluido!");
            }
            return "redirect:/view/envios";
        }
    }
    public class ItenController {

        @Autowired
        ItensService itensService;
        @RequestMapping(value = "view/itens", method = RequestMethod.GET)
        public ModelAndView getIndex(@ModelAttribute("message") final String message,
                                     @ModelAttribute("error") final String error) {

            ModelAndView mav = new ModelAndView("main");
            mav.addObject("listItens", itensService.getAllItens());
            mav.addObject("message", message);
            mav.addObject("error", error);
            return mav;

        }
        @RequestMapping(value = "view/read", method = RequestMethod.GET)
        public ModelAndView read() {
            return new ModelAndView("read", "listItens", itensService.getAllItens());
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.GET)

        public ModelAndView insert() {
            ModelAndView mav = new ModelAndView("insert");
            mav.addObject("itens", new Itens());
            return mav;
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.POST)

        public String submitInsert(@ModelAttribute("itens")Itens itens,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                itensService.insertItens(itens);
                redirectAttributes.addFlashAttribute("message", "Item inserido!");
            }
            return "redirect:/view/itens";

        }
        @RequestMapping(value = "view/update", method = RequestMethod.GET)

        public ModelAndView update(Integer id) {
            ModelAndView mav = new ModelAndView("update");
            mav.addObject("iten", itensService.getItensById(id).get());
            return mav;

        }

        @RequestMapping(value = "view/update", method = RequestMethod.POST)

        public String submitUpdate(@ModelAttribute("iten")Itens itens,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {
            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                itensService.updateItens(itens);
                redirectAttributes.addFlashAttribute("message", "Item atualizado!");
            }

            return "redirect:/view/itens";
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.GET)

        public ModelAndView delete(Integer id) {
            ModelAndView mav = new ModelAndView("delete");
            mav.addObject("itens", itensService.getItensById(id).get());
            return mav;
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.POST)
        public String submitDelete(@ModelAttribute("itens")Itens itens,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                itensService.deleteItensById(itens.getId());
                redirectAttributes.addFlashAttribute("message", "Item Excluido!");
            }
            return "redirect:/view/itens";
        }
    }
    public class PagamentoController {

        @Autowired
        PagamentoService pagamentoService;
        @RequestMapping(value = "view/pagamentos", method = RequestMethod.GET)
        public ModelAndView getIndex(@ModelAttribute("message") final String message,
                                     @ModelAttribute("error") final String error) {

            ModelAndView mav = new ModelAndView("main");
            mav.addObject("listPagamentos", pagamentoService.getAllPagamento());
            mav.addObject("message", message);
            mav.addObject("error", error);
            return mav;

        }
        @RequestMapping(value = "view/read", method = RequestMethod.GET)
        public ModelAndView read() {
            return new ModelAndView("read", "listPagamento", pagamentoService.getAllPagamento());
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.GET)

        public ModelAndView insert() {
            ModelAndView mav = new ModelAndView("insert");
            mav.addObject("pagamento", new Pagamento());
            return mav;
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.POST)

        public String submitInsert(@ModelAttribute("pagamento")Pagamento pagamento,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                pagamentoService.insertPagamento(pagamento);
                redirectAttributes.addFlashAttribute("message", "Pagamento inserido!");
            }
            return "redirect:/view/pagamentos";

        }
        @RequestMapping(value = "view/update", method = RequestMethod.GET)

        public ModelAndView update(Integer id) {
            ModelAndView mav = new ModelAndView("update");
            mav.addObject("pagamento", pagamentoService.getPagamentoById(id).get());
            return mav;

        }

        @RequestMapping(value = "view/update", method = RequestMethod.POST)

        public String submitUpdate(@ModelAttribute("pagamentos")Pagamento pagamento,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {
            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                pagamentoService.updatePagamento(pagamento);
                redirectAttributes.addFlashAttribute("message", "Pagamento atualizado!");
            }

            return "redirect:/view/pagamentos";
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.GET)

        public ModelAndView delete(Integer id) {
            ModelAndView mav = new ModelAndView("delete");
            mav.addObject("pagamentos", pagamentoService.getPagamentoById(id).get());
            return mav;
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.POST)
        public String submitDelete(@ModelAttribute("pagamento")Pagamento pagamento,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                pagamentoService.deletePagamentoById(pagamento.getId());
                redirectAttributes.addFlashAttribute("message", "Pagamento Excluido!");
            }
            return "redirect:/view/pagamentos";
        }
    }
    public class PedidoController {

        @Autowired
        PedidoService pedidoService;
        @RequestMapping(value = "view/pedidos", method = RequestMethod.GET)
        public ModelAndView getIndex(@ModelAttribute("message") final String message,
                                     @ModelAttribute("error") final String error) {

            ModelAndView mav = new ModelAndView("main");
            mav.addObject("listPedido", pedidoService.getAllPedidos());
            mav.addObject("message", message);
            mav.addObject("error", error);
            return mav;

        }
        @RequestMapping(value = "view/read", method = RequestMethod.GET)
        public ModelAndView read() {
            return new ModelAndView("read", "listPedidos", pedidoService.getAllPedidos());
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.GET)

        public ModelAndView insert() {
            ModelAndView mav = new ModelAndView("insert");
            mav.addObject("pedido", new Pedido());
            return mav;
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.POST)

        public String submitInsert(@ModelAttribute("pedido")Pedido pedido,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                pedidoService.insertPedido(pedido);
                redirectAttributes.addFlashAttribute("message", "Pedido inserido!");
            }
            return "redirect:/view/pedidos";

        }
        @RequestMapping(value = "view/update", method = RequestMethod.GET)

        public ModelAndView update(Integer id) {
            ModelAndView mav = new ModelAndView("update");
            mav.addObject("pedidos", pedidoService.getPedidoById(id).get());
            return mav;

        }

        @RequestMapping(value = "view/update", method = RequestMethod.POST)

        public String submitUpdate(@ModelAttribute("pedidos")Pedido pedido,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {
            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                pedidoService.updatePedido(pedido);
                redirectAttributes.addFlashAttribute("message", "Pedido atualizado!");
            }

            return "redirect:/view/pedidos";
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.GET)

        public ModelAndView delete(Integer id) {
            ModelAndView mav = new ModelAndView("delete");
            mav.addObject("pedidos", pedidoService.getPedidoById(id).get());
            return mav;
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.POST)
        public String submitDelete(@ModelAttribute("pedidos")Pedido pedido,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                pedidoService.deletePedidoById(pedido.getId());
                redirectAttributes.addFlashAttribute("message", "Pedido Excluido!");
            }
            return "redirect:/view/pedidos";
        }
    }
    public class ProdutoController {

        @Autowired
        ProdutoService produtoService;
        @RequestMapping(value = "view/produtos", method = RequestMethod.GET)
        public ModelAndView getIndex(@ModelAttribute("message") final String message,
                                     @ModelAttribute("error") final String error) {

            ModelAndView mav = new ModelAndView("main");
            mav.addObject("listProdutos", produtoService.getAllProduto());
            mav.addObject("message", message);
            mav.addObject("error", error);
            return mav;

        }
        @RequestMapping(value = "view/read", method = RequestMethod.GET)
        public ModelAndView read() {
            return new ModelAndView("read", "listProdutos", produtoService.getAllProduto());
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.GET)

        public ModelAndView insert() {
            ModelAndView mav = new ModelAndView("insert");
            mav.addObject("produto", new Produto());
            return mav;
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.POST)

        public String submitInsert(@ModelAttribute("produto")Produto produto,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                produtoService.insertProduto(produto);
                redirectAttributes.addFlashAttribute("message", "produto inserido!");
            }
            return "redirect:/view/produtos";

        }
        @RequestMapping(value = "view/update", method = RequestMethod.GET)

        public ModelAndView update(Integer id) {
            ModelAndView mav = new ModelAndView("update");
            mav.addObject("produtos", produtoService.getProdutoById(id).get());
            return mav;

        }

        @RequestMapping(value = "view/update", method = RequestMethod.POST)

        public String submitUpdate(@ModelAttribute("produtos")Produto produto,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {
            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                produtoService.updateProduto(produto);
                redirectAttributes.addFlashAttribute("message", "produto atualizado!");
            }

            return "redirect:/view/produtos";
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.GET)

        public ModelAndView delete(Integer id) {
            ModelAndView mav = new ModelAndView("delete");
            mav.addObject("produtos", produtoService.getProdutoById(id).get());
            return mav;
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.POST)
        public String submitDelete(@ModelAttribute("produtos")Produto produto,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                produtoService.deleteProdutoById(produto.getId());
                redirectAttributes.addFlashAttribute("message", "Produto Excluido!");
            }
            return "redirect:/view/produtos";
        }
    }
    public class UsuarioController {

        @Autowired
        UsuarioService usuarioService;
        @RequestMapping(value = "view/usuarios", method = RequestMethod.GET)
        public ModelAndView getIndex(@ModelAttribute("message") final String message,
                                     @ModelAttribute("error") final String error) {

            ModelAndView mav = new ModelAndView("main");
            mav.addObject("listUsuarios", usuarioService.getAllUsuarios());
            mav.addObject("message", message);
            mav.addObject("error", error);
            return mav;

        }
        @RequestMapping(value = "view/read", method = RequestMethod.GET)
        public ModelAndView read() {
            return new ModelAndView("read", "listUsuarios", usuarioService.getAllUsuarios());
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.GET)

        public ModelAndView insert() {
            ModelAndView mav = new ModelAndView("insert");
            mav.addObject("usuario", new Usuario());
            return mav;
        }
        @RequestMapping(value = "view/insert", method = RequestMethod.POST)

        public String submitInsert(@ModelAttribute("usuario")Usuario usuario,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                usuarioService.insertUsuario(usuario);
                redirectAttributes.addFlashAttribute("message", "Usuario inserido!");
            }
            return "redirect:/view/usuarios";

        }
        @RequestMapping(value = "view/update", method = RequestMethod.GET)

        public ModelAndView update(Integer id) {
            ModelAndView mav = new ModelAndView("update");
            mav.addObject("usuarios", usuarioService.getUsuarioById(id).get());
            return mav;

        }

        @RequestMapping(value = "view/update", method = RequestMethod.POST)

        public String submitUpdate(@ModelAttribute("usuarios")Usuario usuario,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {
            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                usuarioService.updateUsuario(usuario);
                redirectAttributes.addFlashAttribute("message", "Usuario atualizado!");
            }

            return "redirect:/view/usuarios";
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.GET)

        public ModelAndView delete(Integer id) {
            ModelAndView mav = new ModelAndView("delete");
            mav.addObject("usuarios", usuarioService.getUsuarioById(id).get());
            return mav;
        }
        @RequestMapping(value = "view/delete", method = RequestMethod.POST)
        public String submitDelete(@ModelAttribute("usuarios")Usuario usuario,
                                   BindingResult result,
                                   ModelMap model,
                                   RedirectAttributes redirectAttributes) {

            if (result.hasErrors()) {
                redirectAttributes.addFlashAttribute("error", "Houve um erro!");
            } else {
                usuarioService.deleteUsuarioById(usuario.getId());
                redirectAttributes.addFlashAttribute("message", "Usuario Excluido!");
            }
            return "redirect:/view/usuarios";
        }
    }



}
