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
@Table(name = "hadmission", catalog = "adminaccount", schema = "")
@NamedQueries({
    @NamedQuery(name = "Hadmission.findAll", query = "SELECT h FROM Hadmission h")
    , @NamedQuery(name = "Hadmission.findById", query = "SELECT h FROM Hadmission h WHERE h.id = :id")
    , @NamedQuery(name = "Hadmission.findByStudentName", query = "SELECT h FROM Hadmission h WHERE h.studentName = :studentName")
    , @NamedQuery(name = "Hadmission.findByRollNo", query = "SELECT h FROM Hadmission h WHERE h.rollNo = :rollNo")
    , @NamedQuery(name = "Hadmission.findByFatherName", query = "SELECT h FROM Hadmission h WHERE h.fatherName = :fatherName")
    , @NamedQuery(name = "Hadmission.findByYear", query = "SELECT h FROM Hadmission h WHERE h.year = :year")
    , @NamedQuery(name = "Hadmission.findByAadhaarId", query = "SELECT h FROM Hadmission h WHERE h.aadhaarId = :aadhaarId")
    , @NamedQuery(name = "Hadmission.findByDepertment", query = "SELECT h FROM Hadmission h WHERE h.depertment = :depertment")
    , @NamedQuery(name = "Hadmission.findByContact", query = "SELECT h FROM Hadmission h WHERE h.contact = :contact")
    , @NamedQuery(name = "Hadmission.findBySemester", query = "SELECT h FROM Hadmission h WHERE h.semester = :semester")
    , @NamedQuery(name = "Hadmission.findByStudentCategory", query = "SELECT h FROM Hadmission h WHERE h.studentCategory = :studentCategory")
    , @NamedQuery(name = "Hadmission.findByIncome", query = "SELECT h FROM Hadmission h WHERE h.income = :income")
    , @NamedQuery(name = "Hadmission.findByAmountPaid", query = "SELECT h FROM Hadmission h WHERE h.amountPaid = :amountPaid")})
public class Hadmission implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "roll_no")
    private String rollNo;
    @Column(name = "father_name")
    private String fatherName;
    @Column(name = "year")
    private String year;
    @Column(name = "aadhaar_id")
    private String aadhaarId;
    @Column(name = "depertment")
    private String depertment;
    @Column(name = "contact")
    private String contact;
    @Column(name = "semester")
    private String semester;
    @Column(name = "student_category")
    private String studentCategory;
    @Column(name = "income")
    private String income;
    @Column(name = "amount_paid")
    private String amountPaid;

    public Hadmission() {
    }

    public Hadmission(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        String oldFatherName = this.fatherName;
        this.fatherName = fatherName;
        changeSupport.firePropertyChange("fatherName", oldFatherName, fatherName);
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        String oldSemester = this.semester;
        this.semester = semester;
        changeSupport.firePropertyChange("semester", oldSemester, semester);
    }

    public String getStudentCategory() {
        return studentCategory;
    }

    public void setStudentCategory(String studentCategory) {
        String oldStudentCategory = this.studentCategory;
        this.studentCategory = studentCategory;
        changeSupport.firePropertyChange("studentCategory", oldStudentCategory, studentCategory);
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        String oldIncome = this.income;
        this.income = income;
        changeSupport.firePropertyChange("income", oldIncome, income);
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        String oldAmountPaid = this.amountPaid;
        this.amountPaid = amountPaid;
        changeSupport.firePropertyChange("amountPaid", oldAmountPaid, amountPaid);
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
        if (!(object instanceof Hadmission)) {
            return false;
        }
        Hadmission other = (Hadmission) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ias.Hadmission[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
