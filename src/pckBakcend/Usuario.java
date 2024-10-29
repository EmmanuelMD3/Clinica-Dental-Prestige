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

    public Usuario(int noSocial, String nombre, String apellido, int dia, String mes, int anio, String sexo, String correo, String contraseña)
    {
        super(nombre, apellido, dia, mes, anio, sexo, correo, contraseña);
        this.cve = noSocial;
    }

    /**
     * @return the noSocial
     */
    public int getNoSocial()
    {
        return cve;
    }

    /**
     * @param noSocial the noSocial to set
     */
    public void setNoSocial(int noSocial)
    {
        this.cve = noSocial;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Usuario{" + "noSocial=" + cve + '}';
    }
}
