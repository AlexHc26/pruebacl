//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 12:49:21 PM PET 
//


package com.example.salario;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="horasTrabajadas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tarifaHoraRegular" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tarifaHoraExtra" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="salario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "horasTrabajadas",
    "tarifaHoraRegular",
    "tarifaHoraExtra",
    "salario"
})
@XmlRootElement(name = "salarioSemanal")
public class SalarioSemanal {

    protected int horasTrabajadas;
    protected double tarifaHoraRegular;
    protected double tarifaHoraExtra;
    protected double salario;

    /**
     * Obtiene el valor de la propiedad horasTrabajadas.
     * 
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * Define el valor de la propiedad horasTrabajadas.
     * 
     */
    public void setHorasTrabajadas(int value) {
        this.horasTrabajadas = value;
    }

    /**
     * Obtiene el valor de la propiedad tarifaHoraRegular.
     * 
     */
    public double getTarifaHoraRegular() {
        return tarifaHoraRegular;
    }

    /**
     * Define el valor de la propiedad tarifaHoraRegular.
     * 
     */
    public void setTarifaHoraRegular(double value) {
        this.tarifaHoraRegular = value;
    }

    /**
     * Obtiene el valor de la propiedad tarifaHoraExtra.
     * 
     */
    public double getTarifaHoraExtra() {
        return tarifaHoraExtra;
    }

    /**
     * Define el valor de la propiedad tarifaHoraExtra.
     * 
     */
    public void setTarifaHoraExtra(double value) {
        this.tarifaHoraExtra = value;
    }

    /**
     * Obtiene el valor de la propiedad salario.
     * 
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define el valor de la propiedad salario.
     * 
     */
    public void setSalario(double value) {
        this.salario = value;
    }

}
