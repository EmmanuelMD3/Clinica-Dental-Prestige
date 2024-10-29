package pckBakcend;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import poo_lecturas.Lecturas;

/**
 *
 * @author chemo
 */
public class PrbClinicaDental
{

    public static void main(String[] args)
    {
        String correoAdmin = "Admin@gmail.com";
        String contraAdmin = "Admin";

        Usuario usuario[] = null;
        Consulta consulta[][] = null;
        MetodoDePago metodoPago[][] = null;
        PagoRealizado pagoRealizado[][] = null;

        usuario = (Usuario[]) archivos.Archivos.cargaArr(null, "Datos.dat");
        consulta = (Consulta[][]) archivos.Archivos.cargaArr(null, "DatosMatriz.dat");
        pagoRealizado = (PagoRealizado[][]) archivos.Archivos.cargaArr(null, "DatosPagos.dat");
        metodoPago = (MetodoDePago[][]) archivos.Archivos.cargaArr(null, "DatosMetodoDePago.dat");
                

        int opcMenuLogin;

        do
        {
            opcMenuLogin = mostrarMenuLogin();
            switch (opcMenuLogin)
            {
                case 1:
                    System.out.println("Correo: ");
                    String correo = Lecturas.LeerCadena();
                    System.out.println("Contraseña: ");
                    String contra = Lecturas.LeerCadena();
                    manejarInicioSesion(usuario, consulta, pagoRealizado, correo, contra, correoAdmin, contraAdmin);
                    break;
                case 2:
                    cambiarContrasenia(usuario);
                    break;
                case 3:
                    usuario = insertaUsuario(registrarUsuario(), usuario);
                    consulta = crearMatrizConsulta(consulta, usuario);
                    pagoRealizado = crearMatrizPagos(pagoRealizado, usuario);
                    metodoPago = crearMatrizMetodoDePago(metodoPago, usuario);
                    break;
                default:
                    System.out.println("Opcion Incorrecta...");
            }
        } while (opcMenuLogin != 4);
        
        archivos.Archivos.guardaArr(null, usuario, "Datos.dat");
        archivos.Archivos.guardaArr(null, consulta, "DatosMatriz.dat");
        archivos.Archivos.guardaArr(null, pagoRealizado, "DatosPagos.dat");
        archivos.Archivos.guardaArr(null, metodoPago, "DatosMetodoDePago.dat");
    }

    public static void manejarMenuUsuario(Usuario[] usuarios, Consulta[][] matriz, int usuarioPos, PagoRealizado[][] pagoRealizado)
    {
        System.out.println("**MENU USUARIO**");
        String[] menuUsuario =
        {
            "1.- Agendar Cita",
            "2.- Consultar Historial de Consultas",
            "3.- Pagar Consulta",
            "4.- Cancelar Cita",
            "5.- Actualizar Información Personal",
            "6.- Consultar Próximas Citas",
            "7.- Cerrar Sesion"
        };

        int opcMenuUsuario;
        do
        {
            for (int i = 0; i < menuUsuario.length; i++)
            {
                System.out.println(menuUsuario[i]);
            }
            opcMenuUsuario = Lecturas.LeerEntero();

            switch (opcMenuUsuario)
            {
                case 1:
                    matriz = insertaConsulta(matriz, crearConsulta(), usuarioPos);
                    break;
                case 2:
                    muestraConsultasPorNumeroSocial(matriz, usuarios);
                    break;
                case 3:
                    pagoRealizado = insertaPagos(pagoRealizado, creaPagos(matriz), usuarioPos);
                    break;
                case 4:
                    cancelarCita(matriz, usuarioPos);
                    break;
                case 5:
                    actualizarInformacionPersonal(usuarios, usuarioPos);
                    break;
                case 6:
                    consultarProximasCitas(matriz, usuarios, usuarioPos);
                    break;
                case 7:
                    System.out.println("Cerrando sesion de usuario...");
                    break;
                default:
                    System.out.println("Opcion Incorrecta...");
            }
        } while (opcMenuUsuario != 7);
    }

    public static void menuAdmin(Usuario[] usuarios, Consulta[][] consulta, PagoRealizado[][] pagoRealizados)
    {
        int opcMenuAdmin;
        do
        {
            System.out.println("**MENU ADMINISTRADOR**");
            String[] menuAdmin =
            {
                "1.- Ver Usuarios Registrados",
                "2.- Cancelar Cita",
                "3.- Ver Pagos Realizados",
                "4.- Generar Informes",
                "5.- Cerrar Sesion"
            };

            for (String opcion : menuAdmin)
            {
                System.out.println(opcion);
            }
            opcMenuAdmin = Lecturas.LeerEntero();

            switch (opcMenuAdmin)
            {
                case 1:
                    muestraUsuarios(usuarios);
                    break;
                case 2:
                    cancelarCita(consulta);
                    break;
                case 3:
                    verPagos(pagoRealizados);
                    break;
                case 4:
                    generarInformes(pagoRealizados, consulta);
                    break;
                case 5:
                    System.out.println("Cerrando sesión de administrador...");
                    break;
                default:
                    System.out.println("Opción Incorrecta...");
            }
        } while (opcMenuAdmin != 5);
    }

    public static void verPagos(PagoRealizado[][] pagos)
    {
        System.out.println("***** PAGOS REALIZADOS *****");

        if (pagos == null || pagos.length == 0)
        {
            System.out.println("No hay pagos registrados.");
            return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < pagos.length; i++)
        {
            if (pagos[i] != null && pagos[i].length > 0)
            {
                for (int j = 0; j < pagos[i].length; j++)
                {
                    if (pagos[i][j] != null)
                    {
                        System.out.println("Referencia de Pago: " + pagos[i][j].getNumeroReferencia());
                        String fechaFormateada = dateFormat.format(pagos[i][j].getFechaPago());
                        System.out.println("Fecha de Pago: " + fechaFormateada);
                        System.out.println("Nombre del Titular: " + pagos[i][j].getTitular());
                        System.out.println("Número de Tarjeta: " + pagos[i][j].getNumTarjeta());
                        System.out.println("Mes de Expiración: " + pagos[i][j].getMes());
                        System.out.println("Año de Expiración: " + pagos[i][j].getAnio());
                        System.out.println("CVV: " + pagos[i][j].getCvv());
                        System.out.println("-------------------------------------");
                    }
                }
            }
        }

        System.out.println("***** FIN DE PAGOS *****");
    }

    public static void agregarMetodoDePago(MetodoDePago[] metodosDePago, int indice)
    {
        System.out.println("***** AGREGAR MÉTODO DE PAGO *****");
        System.out.print("Ingrese un alias para el método de pago: ");
        String alias = Lecturas.LeerCadena();

        System.out.print("Ingrese el nombre del titular: ");
        String titular = Lecturas.LeerCadena();

        System.out.print("Ingrese el número de tarjeta: ");
        String numTarjeta = Lecturas.LeerCadena();

        System.out.print("Ingrese el mes de expiración: ");
        String mes = Lecturas.LeerCadena();

        System.out.print("Ingrese el año de expiración: ");
        int anio = Lecturas.LeerEntero();

        System.out.print("Ingrese el CVV: ");
        int cvv = Lecturas.LeerEntero();

        MetodoDePago nuevoMetodo = new MetodoDePago(titular, numTarjeta, mes, anio, cvv);

        metodosDePago[indice] = nuevoMetodo;
        System.out.println("Método de pago agregado exitosamente.");
    }

    public static void generarInformes(PagoRealizado[][] pagoRealizados, Consulta[][] consultas)
    {
        System.out.println("***** INFORME DE PAGOS *****");

        for (int i = 0; i < pagoRealizados.length; i++)
        {
            if (pagoRealizados[i] != null)
            {
                for (int j = 0; j < pagoRealizados[i].length; j++)
                {
                    if (pagoRealizados[i][j] != null)
                    {
                        String referenciaPago = pagoRealizados[i][j].getNumeroReferencia();
                        System.out.println("Referencia de Pago: " + referenciaPago);

                        boolean consultaEncontrada = false;
                        for (int k = 0; k < consultas.length; k++)
                        {
                            if (consultas[k] != null)
                            {
                                for (int l = 0; l < consultas[k].length; l++)
                                {
                                    if (consultas[k][l] != null && consultas[k][l].getNumeroDeReferencia().equals(referenciaPago))
                                    {
                                        System.out.println("Consulta asociada: " + consultas[k][l]);
                                        consultaEncontrada = true;
                                        break;
                                    }
                                }
                            }
                            if (consultaEncontrada)
                            {
                                break;
                            }
                        }

                        if (!consultaEncontrada)
                        {
                            System.out.println("No se encontró la consulta asociada a este pago.");
                        }

                        System.out.println("-------------------------------------");
                    }
                }
            }
        }
        System.out.println("***** FIN DEL INFORME *****");
    }

    public static void cancelarCita(Consulta[][] consultas)
    {
        System.out.println("Ingrese el número de referencia de la cita que desea cancelar:");
        String referencia = Lecturas.LeerCadena();

        boolean citaCancelada = false;

        for (int i = 0; i < consultas.length; i++)
        {
            if (consultas[i] != null)
            {
                for (int j = 0; j < consultas[i].length; j++)
                {
                    if (consultas[i][j] != null && consultas[i][j].getNumeroDeReferencia().equals(referencia))
                    {
                        consultas[i][j].setCancelada(true);
                        System.out.println("Cita cancelada exitosamente: " + consultas[i][j]);
                        citaCancelada = true;
                        break;
                    }
                }
            }
            if (citaCancelada)
            {
                break;
            }
        }

        if (!citaCancelada)
        {
            System.out.println("Número de referencia no encontrado. No se pudo cancelar la cita.");
        }
    }

    public static void muestraUsuarios(Usuario usuario[])
    {
        if (usuario == null || usuario.length == 0)
        {
            System.out.println("No hay usuarios registrados.");
        } else
        {
            for (int i = 0; i < usuario.length; i++)
            {
                System.out.println(usuario[i].toString());
            }
        }
    }

    public static void consultarProximasCitas(Consulta[][] matriz, Usuario[] usuarios, int usuarioPos)
    {
        Usuario usuario = usuarios[usuarioPos];
        boolean tieneCitas = false;

        System.out.println("** Consultar Próximas Citas **");
        System.out.println("Citas para el usuario: " + usuario.getNombre() + " " + usuario.getApellido());

        if (matriz != null && matriz[usuarioPos] != null)
        {
            for (Consulta cita : matriz[usuarioPos])
            {
                if (cita != null && !cita.isEstatusPago())
                {
                    System.out.println(cita.toString());
                    tieneCitas = true;
                }
            }
        }

        if (!tieneCitas)
        {
            System.out.println("No tiene próximas citas registradas.");
        }
    }

    public static void actualizarInformacionPersonal(Usuario[] usuarios, int usuarioPos)
    {
        Usuario usuario = usuarios[usuarioPos];

        System.out.println("** Actualización de Información Personal **");
        System.out.println("1. Nombre actual: " + usuario.getNombre());
        System.out.println("2. Apellido actual: " + usuario.getApellido());
        System.out.println("4. Correo actual: " + usuario.getCorreo());

        System.out.println("Ingrese el número del campo que desea actualizar (1-3) o 0 para cancelar:");
        int opcion = Lecturas.LeerEntero();

        switch (opcion)
        {
            case 1:
                System.out.println("Ingrese el nuevo nombre:");
                String nuevoNombre = Lecturas.LeerCadena();
                usuario.setNombre(nuevoNombre);
                System.out.println("Nombre actualizado correctamente.");
                break;
            case 2:
                System.out.println("Ingrese el nuevo apellido:");
                String nuevoApellido = Lecturas.LeerCadena();
                usuario.setApellido(nuevoApellido);
                System.out.println("Apellido actualizado correctamente.");
                break;
            case 3:
                System.out.println("Ingrese el nuevo correo:");
                String nuevoCorreo = Lecturas.LeerCadena();
                usuario.setCorreo(nuevoCorreo);
                System.out.println("Correo actualizado correctamente.");
                break;
            case 0:
                System.out.println("Operación cancelada.");
                return;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
        }
        archivos.Archivos.guardaArr(null, usuarios, "Datos.dat");
    }

    public static void cancelarCita(Consulta[][] matriz, int usuarioPos)
    {
        if (matriz[usuarioPos] == null || matriz[usuarioPos].length == 0)
        {
            System.out.println("No hay citas registradas para cancelar.");
            return;
        }

        System.out.println("Ingrese el número de referencia de la cita que desea cancelar:");
        String referencia = Lecturas.LeerCadena();

        for (Consulta cita : matriz[usuarioPos])
        {
            if (cita != null && cita.getNumeroDeReferencia().equals(referencia))
            {
                if (cita.isCancelada())
                {
                    System.out.println("La cita ya está cancelada.");
                } else
                {
                    cita.setCancelada(true);
                    System.out.println("Cita cancelada exitosamente.");
                }
                return;
            }
        }
        System.out.println("No se encontró una cita con el número de referencia proporcionado.");
    }

    public static PagoRealizado[][] crearMatrizPagos(PagoRealizado[][] pagoRealizado, Usuario[] usuario)
    {
        PagoRealizado[][] matriztmp;

        if (pagoRealizado == null)
        {
            matriztmp = new PagoRealizado[usuario.length + 1][];
        } else
        {
            matriztmp = new PagoRealizado[pagoRealizado.length + 1][];

            for (int i = 0; i < pagoRealizado.length; i++)
            {
                if (pagoRealizado[i] != null)
                {
                    matriztmp[i] = new PagoRealizado[pagoRealizado[i].length];
                    System.arraycopy(pagoRealizado[i], 0, matriztmp[i], 0, pagoRealizado[i].length);
                }
            }
        }
        return matriztmp;
    }

    public static Consulta[][] crearMatrizConsulta(Consulta[][] matriz, Usuario[] usuarios)
    {
        Consulta[][] matriztmp;

        if (matriz == null)
        {
            matriztmp = new Consulta[usuarios.length + 1][];
        } else
        {
            matriztmp = new Consulta[matriz.length + 1][];

            for (int i = 0; i < matriz.length; i++)
            {
                if (matriz[i] != null)
                {
                    matriztmp[i] = new Consulta[matriz[i].length];
                    System.arraycopy(matriz[i], 0, matriztmp[i], 0, matriz[i].length);
                }
            }
        }
        return matriztmp;
    }

    public static MetodoDePago[][] crearMatrizMetodoDePago(MetodoDePago[][] metodoDePago, Usuario[] usuarios)
    {
        MetodoDePago[][] matriztmp;

        if (metodoDePago == null)
        {
            matriztmp = new MetodoDePago[usuarios.length + 1][];
        } else
        {
            matriztmp = new MetodoDePago[metodoDePago.length + 1][];

            for (int i = 0; i < metodoDePago.length; i++)
            {
                if (metodoDePago[i] != null)
                {
                    matriztmp[i] = new MetodoDePago[metodoDePago[i].length];
                    System.arraycopy(metodoDePago[i], 0, matriztmp[i], 0, metodoDePago[i].length);
                }
            }
        }
        return matriztmp;
    }

    public static int buscarPosCorreo(Usuario[] usuario, String correo)
    {
        for (int i = 0; i < usuario.length; i++)
        {
            if (usuario[i].getCorreo().equals(correo))
            {
                return i;
            }
        }
        return -1;
    }

    public static void cambiarContrasenia(Usuario[] usuario)
    {
        System.out.println("Ingrese su correo electrónico:");
        String correo = Lecturas.LeerCadena();

        int posicion = buscarPosCorreo(usuario, correo);
        if (posicion == -1)
        {
            System.out.println("Usuario no encontrado.");
            return;
        }

        System.out.println("Ingrese su contraseña actual:");
        String contrasenaActual = Lecturas.LeerCadena();

        if (!usuario[posicion].getContraseña().equals(contrasenaActual))
        {
            System.out.println("Contraseña incorrecta.");
            return;
        }

        System.out.println("Ingrese su nueva contraseña:");
        String nuevaContrasenia = Lecturas.LeerCadena();

        System.out.println("Confirme su nueva contraseña:");
        String confirmarContrasenia = Lecturas.LeerCadena();

        if (!nuevaContrasenia.equals(confirmarContrasenia))
        {
            System.out.println("Las contraseñas no coinciden. Operación cancelada.");
            return;
        }

        usuario[posicion].setContraseña(nuevaContrasenia);
        System.out.println("Contraseña cambiada exitosamente.");

        archivos.Archivos.guardaArr(null, usuario, "Datos.dat");
    }

    public static PagoRealizado creaPagos(Consulta[][] consulta)
    {
        System.out.println("Ingrese Referencia: ");
        String referencia = Lecturas.LeerCadena();

        if (consulta != null)
        {
            for (int i = 0; i < consulta.length; i++)
            {
                for (int j = 0; j < consulta[i].length; j++)
                {
                    if (consulta[i][j] != null && consulta[i][j].getNumeroDeReferencia().equals(referencia))
                    {
                        System.out.println("Nombre del Titular: ");
                        String nombre = Lecturas.LeerCadena();
                        System.out.println("Número de Tarjeta: ");
                        String tarjeta = Lecturas.LeerCadena();
                        System.out.println("Mes: ");
                        String mes = Lecturas.LeerCadena();
                        System.out.println("Año: ");
                        int anio = Lecturas.LeerEntero();
                        System.out.println("CVV: ");
                        int cvv = Lecturas.LeerEntero();

                        Date fechaPago = new Date();

                        PagoRealizado pago = new PagoRealizado(referencia, fechaPago, tarjeta, tarjeta, mes, anio, cvv);

                        consulta[i][j].setEstatusPago(true);

                        System.out.println("Pago realizado exitosamente.");
                        return pago;
                    }
                }
            }
        } else
        {
            System.out.println("No hay consultas registradas.");
        }

        System.out.println("Referencia no encontrada.");
        return null;
    }

    public static PagoRealizado[][] insertaPagos(PagoRealizado[][] pagos, PagoRealizado obj, int posicionCorreo)
    {
        if (pagos[posicionCorreo] == null)
        {
            pagos[posicionCorreo] = new PagoRealizado[1];
        } else
        {
            PagoRealizado[] nvo = new PagoRealizado[pagos[posicionCorreo].length + 1];
            System.arraycopy(pagos[posicionCorreo], 0, nvo, 0, pagos[posicionCorreo].length);
            pagos[posicionCorreo] = nvo;
        }
        pagos[posicionCorreo][pagos[posicionCorreo].length - 1] = obj;
        return pagos;
    }

    public static void muestraConsultasPorNumeroSocial(Consulta[][] matriz, Usuario[] usuarios)
    {
        if (matriz == null || usuarios == null || usuarios.length == 0)
        {
            System.out.println("No hay consultas registradas.");
        } else
        {
            System.out.println("Ingrese su CVE: ");
            int numeroSocial = Lecturas.LeerEntero();

            boolean usuarioEncontrado = false;

            for (int i = 0; i < usuarios.length; i++)
            {
                if (usuarios[i].getNoSocial() == numeroSocial)
                {
                    usuarioEncontrado = true;
                    System.out.println("Consultas del usuario: " + usuarios[i].getNombre() + " " + usuarios[i].getApellido());

                    if (matriz[i] == null || matriz[i].length == 0)
                    {
                        System.out.println("Este usuario no tiene consultas registradas.");
                    } else
                    {
                        for (int j = 0; j < matriz[i].length; j++)
                        {
                            System.out.println(matriz[i][j].toString());
                        }
                    }
                    break;
                }
            }
            if (!usuarioEncontrado)
            {
                System.out.println("CVE no encontrado.");
            }
        }
    }

    public static int manejarInicioSesion(Usuario[] usuarios, Consulta[][] consulta, PagoRealizado[][] pagoRealizado, String correo, String contra, String correoAdmin, String contraAdmin)
    {
        if (correo.equals(correoAdmin) && contra.equals(contraAdmin))
        {
            System.out.println("Inicio de sesión como Administrador exitoso.");
            menuAdmin(usuarios, consulta, pagoRealizado);
            return 0;
        }

        if (usuarios != null)
        {
            for (int i = 0; i < usuarios.length; i++)
            {
                if (usuarios[i].getCorreo().equals(correo) && usuarios[i].getContraseña().equals(contra))
                {
                    System.out.println("Inicio de sesión como Usuario exitoso.");
                    manejarMenuUsuario(usuarios, consulta, i, pagoRealizado);
                    return i;
                }
            }
        }

        System.out.println("Credenciales incorrectas. Intente nuevamente.");
        return -1;
    }

    public static Consulta[][] insertaConsulta(Consulta[][] matriz, Consulta obj, int posicionCorreo)
    {
        if (matriz[posicionCorreo] == null)
        {
            matriz[posicionCorreo] = new Consulta[1];
        } else
        {
            Consulta[] nvo = new Consulta[matriz[posicionCorreo].length + 1];
            System.arraycopy(matriz[posicionCorreo], 0, nvo, 0, matriz[posicionCorreo].length);
            matriz[posicionCorreo] = nvo;
        }
        matriz[posicionCorreo][matriz[posicionCorreo].length - 1] = obj;
        return matriz;
    }

    public static String generarReferenciaPago()
    {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder referencia = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 10; i++)
        {
            int indiceAleatorio = random.nextInt(caracteres.length());
            referencia.append(caracteres.charAt(indiceAleatorio));
        }

        return referencia.toString();
    }

    public static Consulta crearConsulta()
    {
        System.out.println("Nombre: ");
        String nombre = Lecturas.LeerCadena();
        System.out.println("Apellido Paterno: ");
        String apellidoPaterno = Lecturas.LeerCadena();
        System.out.println("Edad: ");
        int edad = Lecturas.LeerEntero();
        System.out.println("Numero de Contacto: ");
        String numeroContacto = Lecturas.LeerCadena();
        System.out.println("Correo: ");
        String correo = Lecturas.LeerCadena();
        System.out.println("Motivo: ");
        String motivo = Lecturas.LeerCadena();
        System.out.println("Dia cita:");
        int diaCita = Lecturas.LeerEntero();
        System.out.println("Mes Cita: ");
        String mesCita = Lecturas.LeerCadena();
        System.out.println("Hora Cita: ");
        String horaCita = Lecturas.LeerCadena();
        boolean estatusPago = false;
        String referenciaPago = generarReferenciaPago();
        boolean citaCancelar = false;
        System.out.println("Registro de Consulta Exitoso");
        System.out.println("Numero de Referencia: " + referenciaPago);

        return new Consulta(nombre, apellidoPaterno, edad, numeroContacto, correo, motivo, diaCita, mesCita, horaCita, estatusPago, referenciaPago, citaCancelar);
    }

    public static int mostrarMenuLogin()
    {
        System.out.println("**MENU LOGIN**");
        String[] menuLogin =
        {
            "1.- Iniciar Sesión", "2.- Cambiar Contraseña", "3.- Crear Cuenta", "4.- Salir"
        };

        for (int i = 0; i < menuLogin.length; i++)
        {
            System.out.println(menuLogin[i]);
        }
        return Lecturas.LeerEntero();
    }

    public static Usuario registrarUsuario()
    {
        System.out.println("Nombre: ");
        String nom = Lecturas.LeerCadena();
        System.out.println("Apellido: ");
        String ape = Lecturas.LeerCadena();
        System.out.println("Día: ");
        int dia = Lecturas.LeerEntero();
        System.out.println("Mes: ");
        String mes = Lecturas.LeerCadena();
        System.out.println("Año: ");
        int anio = Lecturas.LeerEntero();
        System.out.println("Sexo: ");
        String sexo = Lecturas.LeerCadena();
        System.out.println("Correo: ");
        String correo = Lecturas.LeerCadena();
        System.out.println("Contraseña: ");
        String contraseña = Lecturas.LeerCadena();
        int numeroSocial = generarNumeroAleatorio();

        Usuario obj = new Usuario(numeroSocial, nom, ape, dia, mes, anio, sexo, correo, contraseña);

        System.out.println("Su CVE es: " + numeroSocial);
        System.out.println("Registro Exitoso.");

        return obj;
    }

    public static Usuario[] insertaUsuario(Usuario obj, Usuario usuario[])
    {
        if (usuario == null)
        {
            usuario = new Usuario[1];
        } else
        {
            Usuario nvo[] = new Usuario[usuario.length + 1];
            System.arraycopy(usuario, 0, nvo, 0, usuario.length);
            usuario = nvo;
        }
        usuario[usuario.length - 1] = obj;
        return usuario;
    }

    public static int generarNumeroAleatorio()
    {
        Random random = new Random();
        return 1000 + random.nextInt(9000);
    }
}
