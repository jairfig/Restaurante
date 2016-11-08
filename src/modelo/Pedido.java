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
public class Pedido {
    
    private Integer codigo;
    private Garcom garcom;
    private Mesa mesa;
    private List<ItemCardapio> consumacao = new ArrayList<>();

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the garcom
     */
    public Garcom getGarcom() {
        return garcom;
    }

    /**
     * @param garcom the garcom to set
     */
    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    /**
     * @return the mesa
     */
    public Mesa getMesa() {
        return mesa;
    }

    /**
     * @param mesa the mesa to set
     */
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    /**
     * @return the consumacao
     */
    public List<ItemCardapio> getConsumacao() {
        return consumacao;
    }

    /**
     * @param consumacao the consumacao to set
     */
    public void setConsumacao(List<ItemCardapio> consumacao) {
        this.consumacao = consumacao;
    }

    @Override
    public String toString() {
        return this.codigo + "\n" + this.garcom + "\n" + this.mesa + "\n" + this.consumacao.toString() + "\n";
    }
    
    
    
}

