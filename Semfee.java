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
@Table(name = "semfee", catalog = "adminaccount", schema = "")
@NamedQueries({
    @NamedQuery(name = "Semfee.findAll", query = "SELECT s FROM Semfee s")
    , @NamedQuery(name = "Semfee.findById", query = "SELECT s FROM Semfee s WHERE s.id = :id")
    , @NamedQuery(name = "Semfee.findByName", query = "SELECT s FROM Semfee s WHERE s.name = :name")
    , @NamedQuery(name = "Semfee.findByRoll", query = "SELECT s FROM Semfee s WHERE s.roll = :roll")
    , @NamedQuery(name = "Semfee.findByYear", query = "SELECT s FROM Semfee s WHERE s.year = :year")
    , @NamedQuery(name = "Semfee.findByStream", query = "SELECT s FROM Semfee s WHERE s.stream = :stream")
    , @NamedQuery(name = "Semfee.findBySem", query = "SELECT s FROM Semfee s WHERE s.sem = :sem")
    , @NamedQuery(name = "Semfee.findBySubjects", query = "SELECT s FROM Semfee s WHERE s.subjects = :subjects")
    , @NamedQuery(name = "Semfee.findByPayment", query = "SELECT s FROM Semfee s WHERE s.payment = :payment")})
public class Semfee implements Serializable {

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
    @Column(name = "year")
    private String year;
    @Basic(optional = false)
    @Column(name = "stream")
    private String stream;
    @Basic(optional = false)
    @Column(name = "sem")
    private String sem;
    @Basic(optional = false)
    @Column(name = "subjects")
    private String subjects;
    @Basic(optional = false)
    @Column(name = "payment")
    private String payment;

    public Semfee() {
    }

    public Semfee(Integer id) {
        this.id = id;
    }

    public Semfee(Integer id, String name, String roll, String year, String stream, String sem, String subjects, String payment) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.year = year;
        this.stream = stream;
        this.sem = sem;
        this.subjects = subjects;
        this.payment = payment;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        String oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        String oldStream = this.stream;
        this.stream = stream;
        changeSupport.firePropertyChange("stream", oldStream, stream);
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        String oldSem = this.sem;
        this.sem = sem;
        changeSupport.firePropertyChange("sem", oldSem, sem);
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        String oldSubjects = this.subjects;
        this.subjects = subjects;
        changeSupport.firePropertyChange("subjects", oldSubjects, subjects);
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        String oldPayment = this.payment;
        this.payment = payment;
        changeSupport.firePropertyChange("payment", oldPayment, payment);
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
        if (!(object instanceof Semfee)) {
            return false;
        }
        Semfee other = (Semfee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ias.Semfee[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
