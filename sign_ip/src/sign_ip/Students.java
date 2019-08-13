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
@Table(name = "STUDENTS", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s"),
    @NamedQuery(name = "Students.findById", query = "SELECT s FROM Students s WHERE s.id = :id"),
    @NamedQuery(name = "Students.findByRollNo", query = "SELECT s FROM Students s WHERE s.rollNo = :rollNo"),
    @NamedQuery(name = "Students.findByFullName", query = "SELECT s FROM Students s WHERE s.fullName = :fullName"),
    @NamedQuery(name = "Students.findByAge", query = "SELECT s FROM Students s WHERE s.age = :age"),
    @NamedQuery(name = "Students.findByCourse", query = "SELECT s FROM Students s WHERE s.course = :course"),
    @NamedQuery(name = "Students.findByPhoneNo", query = "SELECT s FROM Students s WHERE s.phoneNo = :phoneNo"),
    @NamedQuery(name = "Students.findByEmailId", query = "SELECT s FROM Students s WHERE s.emailId = :emailId"),
    @NamedQuery(name = "Students.findByPassword", query = "SELECT s FROM Students s WHERE s.password = :password"),
    @NamedQuery(name = "Students.findByAddress", query = "SELECT s FROM Students s WHERE s.address = :address"),
    @NamedQuery(name = "Students.findByImage", query = "SELECT s FROM Students s WHERE s.image = :image")})
public class Students implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
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
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "IMAGE")
    private String image;

    public Students() {
    }

    public Students(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        String oldImage = this.image;
        this.image = image;
        changeSupport.firePropertyChange("image", oldImage, image);
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
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sign_ip.Students[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
