/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sign_ip;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author hp 1
 */
@Entity
@Table(name = "REGISTER", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Register.findAll", query = "SELECT r FROM Register r"),
    @NamedQuery(name = "Register.findByRollNo", query = "SELECT r FROM Register r WHERE r.rollNo = :rollNo"),
    @NamedQuery(name = "Register.findByFullName", query = "SELECT r FROM Register r WHERE r.fullName = :fullName"),
    @NamedQuery(name = "Register.findByAge", query = "SELECT r FROM Register r WHERE r.age = :age"),
    @NamedQuery(name = "Register.findByCourse", query = "SELECT r FROM Register r WHERE r.course = :course"),
    @NamedQuery(name = "Register.findByPhoneNo", query = "SELECT r FROM Register r WHERE r.phoneNo = :phoneNo"),
    @NamedQuery(name = "Register.findByEmailId", query = "SELECT r FROM Register r WHERE r.emailId = :emailId"),
    @NamedQuery(name = "Register.findByAddress", query = "SELECT r FROM Register r WHERE r.address = :address"),
    @NamedQuery(name = "Register.findByCity", query = "SELECT r FROM Register r WHERE r.city = :city"),
    @NamedQuery(name = "Register.findByState", query = "SELECT r FROM Register r WHERE r.state = :state"),
    @NamedQuery(name = "Register.findByA", query = "SELECT r FROM Register r WHERE r.a = :a"),
    @NamedQuery(name = "Register.findByA1", query = "SELECT r FROM Register r WHERE r.a1 = :a1")})
public class Register implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ROLL_NO")
    private String rollNo;
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "AGE")
    private String age;
    @Column(name = "COURSE")
    private String course;
    @Column(name = "PHONE_NO")
    private String phoneNo;
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "10_%")
    private String a;
    @Column(name = "12_%")
    private String a1;

    public Register() {
    }

    public Register(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        String oldRollNo = this.rollNo;
        this.rollNo = rollNo;
        changeSupport.firePropertyChange("rollNo", oldRollNo, rollNo);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        String oldFullName = this.fullName;
        this.fullName = fullName;
        changeSupport.firePropertyChange("fullName", oldFullName, fullName);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        String oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        String oldPhoneNo = this.phoneNo;
        this.phoneNo = phoneNo;
        changeSupport.firePropertyChange("phoneNo", oldPhoneNo, phoneNo);
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        String oldEmailId = this.emailId;
        this.emailId = emailId;
        changeSupport.firePropertyChange("emailId", oldEmailId, emailId);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        String oldA = this.a;
        this.a = a;
        changeSupport.firePropertyChange("a", oldA, a);
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        String oldA1 = this.a1;
        this.a1 = a1;
        changeSupport.firePropertyChange("A1", oldA1, a1);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rollNo != null ? rollNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Register)) {
            return false;
        }
        Register other = (Register) object;
        if ((this.rollNo == null && other.rollNo != null) || (this.rollNo != null && !this.rollNo.equals(other.rollNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sign_ip.Register[ rollNo=" + rollNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
