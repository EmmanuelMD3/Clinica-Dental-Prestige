/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import cjb.ci.Mensajes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;

/**
 *
 * @author chemo
 */
public class Archivos
{
    public static void guarda(JFrame jf, Object obj, String s)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("../ArchivosClinicaDental/" + s);
            ObjectOutputStream arch = new ObjectOutputStream(fos);
            arch.writeObject(obj);
            arch.close();
            Mensajes.exito(jf, "Datos guardados correctamente.");
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No se encontró el archivo.");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error: " + ex.toString());
        }
    }

    public static void guardaArr(JFrame jf, Object obj[], String s)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("../ArchivosClinicaDental/" + s);
            ObjectOutputStream arch = new ObjectOutputStream(fos);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "no se encontro el archivo");
        } catch (Exception ex)

        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
    }

    public static Object carga(JFrame jf, String s)
    {
        Object obj = null;
        try
        {
            FileInputStream fis = new FileInputStream("../ArchivosClinicaDental/" + s);
            ObjectInputStream arch = new ObjectInputStream(fis);
            obj = arch.readObject();
            arch.close();

        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No se encontro el arcchivo");
            Mensajes.error(jf, "No se encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "ERROR... " + ex.toString());
        }
        return obj;
    }

    public static Object cargaArr(JFrame jf, String s)
    {
        Object obj = null;
        try
        {
            FileInputStream fis = new FileInputStream("../ArchivosClinicaDental/" + s);
            ObjectInputStream arch = new ObjectInputStream(fis);
            obj = (Object[]) arch.readObject();
            arch.close();

        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No se encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error" + ex.toString());
        }
        return obj;
    }

    public static void guardaMat(JFrame jf, Object obj[][], String s)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("../ArchivosClinicaDental/" + s);
            ObjectOutputStream arch = new ObjectOutputStream(fos);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No se encontro el archivo...");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
    }

    public static Object[][] cargaMat(JFrame jf, String s)
    {     
        Object obj[][] = null;
        try
        {
            FileInputStream fis = new FileInputStream("../ArchivosClinicaDental/" + s);
            ObjectInputStream arch = new ObjectInputStream(fis);
            obj = (Object[][]) arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No se encontro el archivo...");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
        return obj;
    }
}
