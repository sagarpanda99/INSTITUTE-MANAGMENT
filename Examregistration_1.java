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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Sagar panda
 */
@Entity
@Table(name = "examregistration", catalog = "adminaccount", schema = "")
@NamedQueries({
    @NamedQuery(name = "Examregistration_1.findAll", query = "SELECT e FROM Examregistration_1 e")
    , @NamedQuery(name = "Examregistration_1.findBySId", query = "SELECT e FROM Examregistration_1 e WHERE e.sId = :sId")})
public class Examregistration_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "STUDENT_NAME")
    private String studentName;
    @Basic(optional = false)
    @Lob
    @Column(name = "ROLL_NO")
    private String rollNo;
    @Basic(optional = false)
    @Lob
    @Column(name = "FATHERS_NAME")
    private String fathersName;
    @Basic(optional = false)
    @Lob
    @Column(name = "YEAR")
    private String year;
    @Basic(optional = false)
    @Lob
    @Column(name = "AADHAAR_ID")
    private String aadhaarId;
    @Basic(optional = false)
    @Lob
    @Column(name = "DEPERTMENT")
    private String depertment;
    @Basic(optional = false)
    @Lob
    @Column(name = "CONTACT_NO")
    private String contactNo;
    @Basic(optional = false)
    @Lob
    @Column(name = "SEMESTER")
    private String semester;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "S_ID")
    private Integer sId;

    public Examregistration_1() {
    }

    public Examregistration_1(Integer sId) {
        this.sId = sId;
    }

    public Examregistration_1(Integer sId, String studentName, String rollNo, String fathersName, String year, String aadhaarId, String depertment, String contactNo, String semester) {
        this.sId = sId;
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.fathersName = fathersName;
        this.year = year;
        this.aadhaarId = aadhaarId;
        this.depertment = depertment;
        this.contactNo = contactNo;
        this.semester = semester;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        String oldStudentName = this.studentName;
        this.studentName = studentName;
        changeSupport.firePropertyChange("studentName", oldStudentName, studentName);
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        String oldRollNo = this.rollNo;
        this.rollNo = rollNo;
        changeSupport.firePropertyChange("rollNo", oldRollNo, rollNo);
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        String oldFathersName = this.fathersName;
        this.fathersName = fathersName;
        changeSupport.firePropertyChange("fathersName", oldFathersName, fathersName);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        String oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    public String getAadhaarId() {
        return aadhaarId;
    }

    public void setAadhaarId(String aadhaarId) {
        String oldAadhaarId = this.aadhaarId;
        this.aadhaarId = aadhaarId;
        changeSupport.firePropertyChange("aadhaarId", oldAadhaarId, aadhaarId);
    }

    public String getDepertment() {
        return depertment;
    }

    public void setDepertment(String depertment) {
        String oldDepertment = this.depertment;
        this.depertment = depertment;
        changeSupport.firePropertyChange("depertment", oldDepertment, depertment);
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        String oldContactNo = this.contactNo;
        this.contactNo = contactNo;
        changeSupport.firePropertyChange("contactNo", oldContactNo, contactNo);
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        String oldSemester = this.semester;
        this.semester = semester;
        changeSupport.firePropertyChange("semester", oldSemester, semester);
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        Integer oldSId = this.sId;
        this.sId = sId;
        changeSupport.firePropertyChange("SId", oldSId, sId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sId != null ? sId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Examregistration_1)) {
            return false;
        }
        Examregistration_1 other = (Examregistration_1) object;
        if ((this.sId == null && other.sId != null) || (this.sId != null && !this.sId.equals(other.sId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ias.Examregistration_1[ sId=" + sId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
