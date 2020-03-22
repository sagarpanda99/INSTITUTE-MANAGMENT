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
@Table(name = "admission", catalog = "adminaccount", schema = "")
@NamedQueries({
    @NamedQuery(name = "Admission.findAll", query = "SELECT a FROM Admission a")
    , @NamedQuery(name = "Admission.findById", query = "SELECT a FROM Admission a WHERE a.id = :id")
    , @NamedQuery(name = "Admission.findByFullname", query = "SELECT a FROM Admission a WHERE a.fullname = :fullname")
    , @NamedQuery(name = "Admission.findByRoll", query = "SELECT a FROM Admission a WHERE a.roll = :roll")
    , @NamedQuery(name = "Admission.findByDob", query = "SELECT a FROM Admission a WHERE a.dob = :dob")
    , @NamedQuery(name = "Admission.findByGender", query = "SELECT a FROM Admission a WHERE a.gender = :gender")
    , @NamedQuery(name = "Admission.findByMeritrank", query = "SELECT a FROM Admission a WHERE a.meritrank = :meritrank")
    , @NamedQuery(name = "Admission.findByReligion", query = "SELECT a FROM Admission a WHERE a.religion = :religion")
    , @NamedQuery(name = "Admission.findByAddress", query = "SELECT a FROM Admission a WHERE a.address = :address")
    , @NamedQuery(name = "Admission.findByBranch", query = "SELECT a FROM Admission a WHERE a.branch = :branch")
    , @NamedQuery(name = "Admission.findByCaste", query = "SELECT a FROM Admission a WHERE a.caste = :caste")
    , @NamedQuery(name = "Admission.findByPwd", query = "SELECT a FROM Admission a WHERE a.pwd = :pwd")
    , @NamedQuery(name = "Admission.findByFather", query = "SELECT a FROM Admission a WHERE a.father = :father")
    , @NamedQuery(name = "Admission.findByMother", query = "SELECT a FROM Admission a WHERE a.mother = :mother")
    , @NamedQuery(name = "Admission.findByTenthmarks", query = "SELECT a FROM Admission a WHERE a.tenthmarks = :tenthmarks")
    , @NamedQuery(name = "Admission.findByTwelvemarks", query = "SELECT a FROM Admission a WHERE a.twelvemarks = :twelvemarks")
    , @NamedQuery(name = "Admission.findByAadhar", query = "SELECT a FROM Admission a WHERE a.aadhar = :aadhar")
    , @NamedQuery(name = "Admission.findByContact", query = "SELECT a FROM Admission a WHERE a.contact = :contact")
    , @NamedQuery(name = "Admission.findByPayment", query = "SELECT a FROM Admission a WHERE a.payment = :payment")})
public class Admission implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "FULLNAME")
    private String fullname;
    @Column(name = "ROLL")
    private String roll;
    @Column(name = "DOB")
    private String dob;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "MERITRANK")
    private String meritrank;
    @Column(name = "RELIGION")
    private String religion;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "BRANCH")
    private String branch;
    @Column(name = "CASTE")
    private String caste;
    @Column(name = "PWD")
    private String pwd;
    @Column(name = "FATHER")
    private String father;
    @Column(name = "MOTHER")
    private String mother;
    @Column(name = "TENTHMARKS")
    private String tenthmarks;
    @Column(name = "TWELVEMARKS")
    private String twelvemarks;
    @Column(name = "AADHAR")
    private String aadhar;
    @Column(name = "CONTACT")
    private String contact;
    @Column(name = "PAYMENT")
    private String payment;

    public Admission() {
    }

    public Admission(Integer id) {
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        String oldFullname = this.fullname;
        this.fullname = fullname;
        changeSupport.firePropertyChange("fullname", oldFullname, fullname);
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        String oldRoll = this.roll;
        this.roll = roll;
        changeSupport.firePropertyChange("roll", oldRoll, roll);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getMeritrank() {
        return meritrank;
    }

    public void setMeritrank(String meritrank) {
        String oldMeritrank = this.meritrank;
        this.meritrank = meritrank;
        changeSupport.firePropertyChange("meritrank", oldMeritrank, meritrank);
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        String oldReligion = this.religion;
        this.religion = religion;
        changeSupport.firePropertyChange("religion", oldReligion, religion);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        String oldBranch = this.branch;
        this.branch = branch;
        changeSupport.firePropertyChange("branch", oldBranch, branch);
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        String oldCaste = this.caste;
        this.caste = caste;
        changeSupport.firePropertyChange("caste", oldCaste, caste);
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        String oldPwd = this.pwd;
        this.pwd = pwd;
        changeSupport.firePropertyChange("pwd", oldPwd, pwd);
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        String oldFather = this.father;
        this.father = father;
        changeSupport.firePropertyChange("father", oldFather, father);
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        String oldMother = this.mother;
        this.mother = mother;
        changeSupport.firePropertyChange("mother", oldMother, mother);
    }

    public String getTenthmarks() {
        return tenthmarks;
    }

    public void setTenthmarks(String tenthmarks) {
        String oldTenthmarks = this.tenthmarks;
        this.tenthmarks = tenthmarks;
        changeSupport.firePropertyChange("tenthmarks", oldTenthmarks, tenthmarks);
    }

    public String getTwelvemarks() {
        return twelvemarks;
    }

    public void setTwelvemarks(String twelvemarks) {
        String oldTwelvemarks = this.twelvemarks;
        this.twelvemarks = twelvemarks;
        changeSupport.firePropertyChange("twelvemarks", oldTwelvemarks, twelvemarks);
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        String oldAadhar = this.aadhar;
        this.aadhar = aadhar;
        changeSupport.firePropertyChange("aadhar", oldAadhar, aadhar);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
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
        if (!(object instanceof Admission)) {
            return false;
        }
        Admission other = (Admission) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ias.Admission[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
