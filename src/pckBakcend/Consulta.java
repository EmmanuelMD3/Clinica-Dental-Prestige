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
public class Consulta implements Serializable
{
    private String nombre;
    private String apellidoPaterno;
    private int edad;
    private String numeroContacto;
    private String correo;
    private String motivo;
    private int diaCita;
    private String mesCita;
    private String horaCita;
    private boolean estatusPago;
    private String numeroDeReferencia;
    private boolean cancelada;

    public Consulta()
    {
    }

    public Consulta(String nombre, String apellidoPaterno, int edad, String numeroContacto, String correo, String motivo, int diaCita, String mesCita, String horaCita, boolean estatusPago, String numeroDeReferencia, boolean cancelada)
    {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.edad = edad;
        this.numeroContacto = numeroContacto;
        this.correo = correo;
        this.motivo = motivo;
        this.diaCita = diaCita;
        this.mesCita = mesCita;
        this.horaCita = horaCita;
        this.estatusPago = estatusPago;
        this.numeroDeReferencia = numeroDeReferencia;
        this.cancelada = cancelada;
    }
    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the apellidoPaterno
     */
    public String getApellidoPaterno()
    {
        return apellidoPaterno;
    }

    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno)
    {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * @return the edad
     */
    public int getEdad()
    {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    /**
     * @return the numeroContacto
     */
    public String getNumeroContacto()
    {
        return numeroContacto;
    }

    /**
     * @param numeroContacto the numeroContacto to set
     */
    public void setNumeroContacto(String numeroContacto)
    {
        this.numeroContacto = numeroContacto;
    }

    /**
     * @return the correo
     */
    public String getCorreo()
    {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    /**
     * @return the motivo
     */
    public String getMotivo()
    {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo)
    {
        this.motivo = motivo;
    }

    /**
     * @return the diaCita
     */
    public int getDiaCita()
    {
        return diaCita;
    }

    /**
     * @param diaCita the diaCita to set
     */
    public void setDiaCita(int diaCita)
    {
        this.diaCita = diaCita;
    }

    /**
     * @return the mesCita
     */
    public String getMesCita()
    {
        return mesCita;
    }

    /**
     * @param mesCita the mesCita to set
     */
    public void setMesCita(String mesCita)
    {
        this.mesCita = mesCita;
    }

    /**
     * @return the horaCita
     */
    public String getHoraCita()
    {
        return horaCita;
    }

    /**
     * @param horaCita the horaCita to set
     */
    public void setHoraCita(String horaCita)
    {
        this.horaCita = horaCita;
    }

    /**
     * @return the estatusPago
     */
    public boolean isEstatusPago()
    {
        return estatusPago;
    }

    /**
     * @param estatusPago the estatusPago to set
     */
    public void setEstatusPago(boolean estatusPago)
    {
        this.estatusPago = estatusPago;
    }

    /**
     * @return the numeroDeReferencia
     */
    public String getNumeroDeReferencia()
    {
        return numeroDeReferencia;
    }

    /**
     * @param numeroDeReferencia the numeroDeReferencia to set
     */
    public void setNumeroDeReferencia(String numeroDeReferencia)
    {
        this.numeroDeReferencia = numeroDeReferencia;
    }
    
    /**
     * @return the cancelada
     */
    public boolean isCancelada()
    {
        return cancelada;
    }

    /**
     * @param cancelada the cancelada to set
     */
    public void setCancelada(boolean cancelada)
    {
        this.cancelada = cancelada;
    }

    @Override
    public String toString()
    {
        return "Consulta{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", edad=" + edad + ", numeroContacto=" + numeroContacto + ", correo=" + correo + ", motivo=" + motivo + ", diaCita=" + diaCita + ", mesCita=" + mesCita + ", horaCita=" + horaCita + ", estatusPago=" + estatusPago + ", numeroDeReferencia=" + numeroDeReferencia + ", cancelada=" + cancelada + '}';
    }
    
   
}
