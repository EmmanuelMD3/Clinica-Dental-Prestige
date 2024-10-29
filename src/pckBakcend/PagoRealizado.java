/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckBakcend;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author chemo
 */
public class PagoRealizado extends MetodoDePago implements Serializable
{
    private String numeroReferencia;
    private Date fechaPago;

    public PagoRealizado()
    {
    }

    public PagoRealizado(String numeroReferencia, Date fechaPago, String titular, String numTarjeta, String mes, int anio, int cvv)
    {
        super(titular, numTarjeta, mes, anio, cvv);
        this.numeroReferencia = numeroReferencia;
        this.fechaPago = fechaPago;
    }

   

    /**
     * @return the numeroReferencia
     */
    public String getNumeroReferencia()
    {
        return numeroReferencia;
    }

    /**
     * @param numeroReferencia the numeroReferencia to set
     */
    public void setNumeroReferencia(String numeroReferencia)
    {
        this.numeroReferencia = numeroReferencia;
    }

    /**
     * @return the fechaPago
     */
    public Date getFechaPago()
    {
        return fechaPago;
    }

    /**
     * @param fechaPago the fechaPago to set
     */
    public void setFechaPago(Date fechaPago)
    {
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString()
    {
        return super.toString() + "PagoRealizado{" + "numeroReferencia=" + numeroReferencia + ", fechaPago=" + fechaPago + '}';
    }  
}
