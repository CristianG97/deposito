/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *Esta clase sirve para crear objetos del tipo cuenta y agrupa varios metodos como ver saldo, ingresar o retirar
 * @author Cristian
 */
public class CCuenta {

    /**
     * Devuelve el nombre del propietario de la cuenta
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sirve para modificar el nombre del propietario de la cuenta
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el id de la cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sirve para modificar el id de la cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Sirve para modificar el saldo de la cuenta
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * devuelve el tipo de interes de la cuenta
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Sirve para modificar el tipo de interes de la cuenta
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *Creo un constructor vacio
     */
    public CCuenta()
    {
    }

    /**
     *Creo un constructor con los parametros
     * @param nom El nombre del propietario
     * @param cue El id de la cuenta
     * @param sal El saldo de la cuenta
     * @param tipo El tipo de interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *Este metodo devuelve el saldo de la cuenta
     * @return
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     *Este metodo sirve para añadir saldo a la cuenta
     *Comprueba que no se ingresen cantidades negativas
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     *Este metodo sirve para quitar saldo de la cuenta, 
     *tambien comprueba que el saldo sea positivo al final de la operacion y la entrada de cantidades negativas
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}

    

