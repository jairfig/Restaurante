/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jjcfigueiredo
 */
public class Restaurante {
    
    private List<ItemCardapio> cardapio = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();
    private List<Mesa> mesas = new ArrayList<>();
    private List<Garcom> garcons = new ArrayList<>();

    public Restaurante() {
        Mesa mesa = new Mesa();
        mesa.setCodigo(1);
        mesa.setCapacidade(4);
        mesas.add(mesa);
    }

    public List<ItemCardapio> getCardapio() {
        return cardapio;
    }

    public void setCardapio(List<ItemCardapio> cardapio) {
        this.cardapio = cardapio;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }

    public List<Garcom> getGarcons() {
        return garcons;
    }

    public void setGarcons(List<Garcom> garcons) {
        this.garcons = garcons;
    }
        
}


