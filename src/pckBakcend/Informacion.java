package pckBakcend;

import java.io.Serializable;

/**
 *
 * @author chemo
 */
public class Informacion implements Serializable
{

    private String nombre;
    private String apellido;
    private int dia;
    private String mes;
    private int anio;
    private String sexo;
    private String correo;
    private String contraseña;

    public Informacion()
    {
    }

    public Informacion(String nombre, String apellido, int dia, String mes, int anio, String sexo, String correo, String contraseña)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.sexo = sexo;
        this.correo = correo;
        this.contraseña = contraseña;
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
     * @return the apellido
     */
    public String getApellido()
    {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    /**
     * @return the dia
     */
    public int getDia()
    {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia)
    {
        this.dia = dia;
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
     * @return the sexo
     */
    public String getSexo()
    {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
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
     * @return the contraseña
     */
    public String getContraseña()
    {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña)
    {
        this.contraseña = contraseña;
    }
    
    @Override
    public String toString()
    {
        return "Informacion{" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", dia=" + getDia() + ", mes=" + getMes() + ", anio=" + getAnio() + ", sexo=" + getSexo() + ", correo=" + getCorreo() + ", contrase\u00f1a=" + getContraseña() + '}';
    }
}
