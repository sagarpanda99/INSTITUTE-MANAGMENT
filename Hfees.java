/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ias;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Sagar panda
 */
@Entity
@Table(name = "hfees", catalog = "adminaccount", schema = "")
@NamedQueries({
    @NamedQuery(name = "Hfees.findAll", query = "SELECT h FROM Hfees h")
    , @NamedQuery(name = "Hfees.findById", query = "SELECT h FROM Hfees h WHERE h.id = :id")
    , @NamedQuery(name = "Hfees.findByName", query = "SELECT h FROM Hfees h WHERE h.name = :name")
    , @NamedQuery(name = "Hfees.findByRoll", query = "SELECT h FROM Hfees h WHERE h.roll = :roll")
    , @NamedQuery(name = "Hfees.findByStream", query = "SELECT h FROM Hfees h WHERE h.stream = :stream")
    , @NamedQuery(name = "Hfees.findByYear", query = "SELECT h FROM Hfees h WHERE h.year = :year")
    , @NamedQuery(name = "Hfees.findBySem", query = "SELECT h FROM Hfees h WHERE h.sem = :sem")
    , @NamedQuery(name = "Hfees.findByPayment", query = "SELECT h FROM Hfees h WHERE h.payment = :payment")
    , @NamedQuery(name = "Hfees.findByContact", query = "SELECT h FROM Hfees h WHERE h.contact = :contact")})
public class Hfees implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "roll")
    private String roll;
    @Basic(optional = false)
    @Column(name = "stream")
    private String stream;
    @Basic(optional = false)
    @Column(name = "year")
    private String year;
    @Basic(optional = false)
    @Column(name = "sem")
    private String sem;
    @Basic(optional = false)
    @Column(name = "payment")
    private String payment;
    @Basic(optional = false)
    @Column(name = "contact")
    private String contact;

    public Hfees() {
    }

    public Hfees(Integer id) {
        this.id = id;
    }

    public Hfees(Integer id, String name, String roll, String stream, String year, String sem, String payment, String contact) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.stream = stream;
        this.year = year;
        this.sem = sem;
        this.payment = payment;
        this.contact = contact;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        String oldRoll = this.roll;
        this.roll = roll;
        changeSupport.firePropertyChange("roll", oldRoll, roll);
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        String oldStream = this.stream;
        this.stream = stream;
        changeSupport.firePropertyChange("stream", oldStream, stream);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        String oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        String oldSem = this.sem;
        this.sem = sem;
        changeSupport.firePropertyChange("sem", oldSem, sem);
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        String oldPayment = this.payment;
        this.payment = payment;
        changeSupport.firePropertyChange("payment", oldPayment, payment);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hfees)) {
            return false;
        }
        Hfees other = (Hfees) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ias.Hfees[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
