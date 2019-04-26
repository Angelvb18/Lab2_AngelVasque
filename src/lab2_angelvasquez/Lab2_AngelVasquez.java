package lab2_angelvasquez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Lab2_AngelVasquez {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Empleado bas = new Empleado();
        ArrayList<Empleado> lista = new ArrayList();
        String nombre, apellido, Colorfav, psw, usu, tit, carg = "";
        int valu = 0, edad, op = 0, op2 = 0, numcaj = 0, aux = 0;
        char gen;
        double alt, peso;
        while (op != 8) {

            System.out.println("1. Registro de Empleados\n"
                    + "\n"
                    + "2. Despedir Empleados\n"
                    + "\n"
                    + "3. Log In\n"
                    + "\n"
                    + "4. Ascender Cajero\n"
                    + "\n"
                    + "5. Listar Empleados\n"
                    + "\n"
                    + "6. Modificar Empleado\n"
                    + "\n"
                    + "7. RANDOM\n"
                    + "\n8. Salir\nIngrese una opcion:");
            op = l.nextInt();
            if (numcaj == 1) {
                System.out.println("Ingrese 2");
                op = l.nextInt();
                while (op != 2) {
                    System.out.println("Ingrese 2");
                    op = l.nextInt();
                }
            }
            if (numcaj == 2) {
                System.out.println("Ingrese 4");
                op = l.nextInt();
                while (op != 4) {
                    System.out.println("Ingrese 4");
                    op = l.nextInt();
                }
            }
            if (valu == 0 && op != 3) {
                System.out.println("Ingrese 3");
                op = l.nextInt();
                while (op != 3) {
                    System.out.println("Ingrese 3");
                    op = l.nextInt();
                }
            }
            switch (op) {
                case 1:

                    System.out.println("Ingrese nombre");
                    nombre = l.next();
                    System.out.println("Ingrese apellido");
                    apellido = l.next();
                    System.out.println("Ingrese su color favorito");
                    Colorfav = l.next();
                    System.out.println("Ingrese su edad");
                    edad = l.nextInt();
                    System.out.println("Ingrese f si es mujer o ingrese m si es hombre");
                    gen = l.next().charAt(0);
                    while (gen != 'f' && gen != 'm') {
                        System.out.println("Ingrese f si es mujer o ingrese m si es hombre");
                        gen = l.next().charAt(0);
                    }
                    System.out.println("Ingrese su altura");
                    alt = l.nextInt();
                    System.out.println("Ingrese su peso");
                    peso = l.nextInt();
                    System.out.println("Ingrese su titulo");
                    tit = l.nextLine();
                    tit = l.nextLine();
                    System.out.println("1.Gerente\n2.Aseadores\n3.Cajeros\n4.Seguridad.\nIngrese cargo:");
                    op2 = l.nextInt();
                    while (op2 < 1 || op > 4) {
                        System.out.println("Ingrese cargo");
                        op2 = l.nextInt();
                    }
                    switch (op2) {
                        case 1:
                            carg = "Gerente";
                            break;
                        case 2:
                            carg = "Aseadores";
                            break;
                        case 3:
                            carg = "Cajeros";
                            break;
                        case 4:
                            carg = "Seguridad";
                            break;
                    }
                    if (carg.equals("Gerente")) {
                        if (nungen(lista) == true) {
                            lista.add(new Empleado(nombre, apellido, Colorfav, edad, gen, alt, peso, tit, carg));
                        } else {
                            System.out.println("Ya hay 3 Gerentes");
                        }
                    } else {
                        lista.add(new Empleado(nombre, apellido, Colorfav, edad, gen, alt, peso, tit, carg));
                    }

                    break;
                case 2:
                    char red;
                    System.out.println("Ingrese s si esta seguro que va a despedir al gerente sino presione cualquir tecla");
                    red = l.next().charAt(0);
                    if (red == 's' || red == 'S') {
                        if (valu == 1) {
                            int pop;
                            System.out.println("Ingrese posicion en la lista del empleado que desea depedir");
                            pop = l.nextInt();
                            while (pop >= lista.size()) {
                                System.out.println("Ingrese posicion en la lista del empleado que desea depedir");
                                pop = l.nextInt();
                            }

                            if (lista.get(pop).getCarg().equals("Gerente") == true && numcaj == 1) {
                                lista.get(aux).setCarg("Gerente");
                                lista.remove(pop);
                                numcaj = 0;

                                aux = -1;
                            } else {
                                System.out.println("No a selecionado la opcion acender cajero");
                            }
                            if (lista.get(pop).getCarg().equals("Gerente") == false) {
                                lista.remove(pop);
                                numcaj = 2;
                            }
                        } else {
                            System.out.println("Inicie secion para poder acceder");
                        }
                    } else {
                        System.out.println("Adiós");
                    }

                    break;
                case 3:
                    System.out.println("Ingrese usuario");
                    usu = l.next();
                    System.out.println("Ingrese Contraseña");
                    psw = l.next();

                    if (login(usu, psw) == true) {
                        valu = 1;
                        System.out.println("Bienvenido");
                    } else {
                        System.out.println("Vuelva a intentarlo");
                    }
                    break;
                case 4:
                    if (valu == 1) {
                        if (nungen(lista) == true) {
                            System.out.println("Ingrese posicion en la lista del cajero");
                            aux = l.nextInt();
                            while (aux >= lista.size()) {
                                System.out.println("Ingrese posicion en la lista del cajero");
                                aux = l.nextInt();
                            }
                            while (lista.get(aux).getCarg().equals("Cajeros") == false) {
                                System.out.println("Ingrese posicion en la lista del cajero");
                                aux = l.nextInt();
                                while (aux >= lista.size()) {
                                    System.out.println("Ingrese posicion en la lista del cajero");
                                    aux = l.nextInt();
                                }
                            }
                            lista.get(aux).setCarg("Gerente");
                        } else {
                            System.out.println("Ingrese posicion en la lista del cajero");
                            aux = l.nextInt();
                            while (aux >= lista.size()) {
                                System.out.println("Ingrese posicion en la lista del cajero");
                                aux = l.nextInt();
                            }
                            while (lista.get(aux).getCarg().equals("Cajeros") == false && aux > lista.size()) {
                                System.out.println("Ingrese posicion en la lista del cajero");
                                aux = l.nextInt();
                                while (aux >= lista.size()) {
                                    System.out.println("Ingrese posicion en la lista del cajero");
                                    aux = l.nextInt();
                                }
                            }

                            numcaj = 1;
                            System.out.println("La promoci'on de " + lista.get(aux).getNombre() + " " + lista.get(aux).getApellido() + " esta en proceso");
                        }
                    } else {
                        System.out.println("Inicie secion");
                    }

                    break;
                case 5:
                    System.out.println("");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getCarg().equals("Gerente")) {
                            System.out.println(i + " " + bas.toString(lista.get(i)));
                        }
                    }
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getCarg().equals("Aseadores")) {
                            System.out.println(i + " " + bas.toString(lista.get(i)));
                        }
                    }
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getCarg().equals("Cajeros")) {
                            System.out.println(i + " " + bas.toString(lista.get(i)));
                        }
                    }
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getCarg().equals("Seguridad")) {
                            System.out.println(i + " " + bas.toString(lista.get(i)));
                        }
                    }

                    break;
                case 6:
                    int pop;
                    System.out.println("Ingrese posicio del empleado a modificar");
                    pop = l.nextInt();
                    while (pop >= lista.size()) {
                        System.out.println("Ingrese posicio del empleado a modificar");
                        pop = l.nextInt();
                    }

                    System.out.println("1.Cambiar nombre\n2.Cambiar Apellido\n3.Cambiar Color Favorito\n4.Cambiar Color Favorito \n5.Cambiar edad\n6.Cambiar genero \n7.Cambiar altura \n8.Cambiar titulo\n9.Cambiar Cargo\nIngrese una opcion:");
                    switch (op2) {
                        case 1:
                            System.out.println("Ingrese nombre");
                            nombre = l.next();
                            lista.get(pop).setNombre(nombre);
                            break;
                        case 2:
                            System.out.println("Ingrese apellido");
                            apellido = l.next();
                            lista.get(pop).setApellido(apellido);
                            break;
                        case 3:
                            System.out.println("Ingrese su color favorito");
                            Colorfav = l.next();
                            lista.get(pop).setColorfav(Colorfav);
                            break;
                        case 4:
                            System.out.println("Ingrese su edad");
                            edad = l.nextInt();
                            lista.get(pop).setEdad(edad);
                            break;
                        case 5:
                            System.out.println("Ingrese f si es mujer o ingrese m si es hombre");
                            gen = l.next().charAt(0);
                            while (gen != 'f' && gen != 'm') {
                                System.out.println("Ingrese f si es mujer o ingrese m si es hombre");
                                gen = l.next().charAt(0);
                            }
                            lista.get(pop).setGen(gen);
                            break;
                        case 6:
                            System.out.println("Ingrese su altura");
                            alt = l.nextInt();
                            lista.get(pop).setAlt(alt);
                            break;
                        case 7:
                            System.out.println("Ingrese su peso");
                            peso = l.nextInt();
                            lista.get(pop).setPeso(peso);
                            break;
                        case 8:
                            System.out.println("Ingrese titulo");
                            tit = l.next();
                            lista.get(pop).setTit(tit);
                            break;
                        case 9:
                            System.out.println("1.Aseadores\n2.Cajeros\n3.Seguridad.\nIngrese cargo:");
                            op2 = l.nextInt();
                            while (op2 < 1 || op > 4) {
                                System.out.println("Ingrese cargo");
                                op2 = l.nextInt();
                            }
                            switch (op2) {
                                
                                case 1:
                                    carg = "Aseadores";
                                    break;
                                case 2:
                                    carg = "Cajeros";
                                    break;
                                case 3:
                                    carg = "Seguridad";
                                    break;
                            }
                              lista.get(pop).setCarg(carg);
                            break;
                        default:
                            System.out.println("No se efectuo ningun cambio");
                            break;
                        
                    }
                    break;
                case 7:
                    int num;
                    System.out.println("Ingrese un numero");
                    num=l.nextInt();
                    while (num>=lista.size()) {
                        
                    }
                    break;
                case 8:
                    System.out.println("Adiós");
                    break;
            }

        }
    }

    public static boolean login(String a, String b) {
        boolean e = false;
        if (a.equals("leobanegas") && b.equals("99")) {
            e = true;
        }
        return e;
    }

    public static boolean nungen(ArrayList<Empleado> a) {
        Empleado ra = new Empleado();
        boolean r = false;
        int cont = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getCarg().equals("Gerente")) {
                cont++;
            }
        }
        if (cont < 3) {
            r = true;
        }
        return r;
    }
}
