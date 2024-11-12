package pckBakcend;

import java.io.Serializable;

/**
 *
 * @author chemo
 */
public class Usuario extends Informacion implements Serializable
{
    private int cve;

    public Usuario()
    {
    }

    public Usuario(int cve, String nombre, String apellido, int dia, String mes, int anio, String sexo, String correo, String contraseña)
    {
        super(nombre, apellido, dia, mes, anio, sexo, correo, contraseña);
        this.cve = cve;
    }

    /**
     * @return the noSocial
     */
    public int cve()
    {
        return getCve();
    }

    /**
     * @param cve the noSocial to set
     */
    public void cve(int cve)
    {
        this.setCve(cve);
    }

    @Override
    public String toString()
    {
        return super.toString() + "Usuario{" + "noSocial=" + getCve() + '}';
    }

    /**
     * @return the cve
     */
    public int getCve()
    {
        return cve;
    }

    /**
     * @param cve the cve to set
     */
    public void setCve(int cve)
    {
        this.cve = cve;
    }
}
