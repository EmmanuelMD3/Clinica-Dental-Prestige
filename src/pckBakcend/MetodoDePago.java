/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckBakcend;

import java.io.Serializable;

/**
 *
 * @author chemo
 */
public class MetodoDePago implements Serializable
{
    private String titular;
    private String numTarjeta;
    private String mes;
    private int anio;
    private int cvv;

    public MetodoDePago()
    {
    }
    
    public MetodoDePago(String titular, String numTarjeta, String mes, int anio, int cvv)
    {
        this.titular = titular;
        this.numTarjeta = numTarjeta;
        this.mes = mes;
        this.anio = anio;
        this.cvv = cvv;
    }

    /**
     * @return the titular
     */
    public String getTitular()
    {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular)
    {
        this.titular = titular;
    }

    /**
     * @return the numTarjeta
     */
    public String getNumTarjeta()
    {
        return numTarjeta;
    }

    /**
     * @param numTarjeta the numTarjeta to set
     */
    public void setNumTarjeta(String numTarjeta)
    {
        this.numTarjeta = numTarjeta;
    }

    /**
     * @return the mes
     */
    public String getMes()
    {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes)
    {
        this.mes = mes;
    }

    /**
     * @return the anio
     */
    public int getAnio()
    {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    /**
     * @return the cvv
     */
    public int getCvv()
    {
        return cvv;
    }

    /**
     * @param cvv the cvv to set
     */
    public void setCvv(int cvv)
    {
        this.cvv = cvv;
    }


    @Override
    public String toString()
    {
        return "MetodoDePago{" + ", titular=" + titular + ", numTarjeta=" + numTarjeta + ", mes=" + mes + ", anio=" + anio + ", cvv=" + cvv + '}';
    }
    
}
