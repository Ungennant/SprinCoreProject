package org.serf.project.model;

import javax.persistence.*;

@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "accreditation")
    private String accreditation;
    @Column(name = "institutes")
    private int institutes;
    @Column(name = "students")
    private int students;
    @Column(name = "address")
    private String address;

    public University() {
    }

    public University(String name, String accreditation, int institutes, int students, String address) {
        this.name = name;
        this.accreditation = accreditation;
        this.institutes = institutes;
        this.students = students;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }

    public int getInstitutes() {
        return institutes;
    }

    public void setInstitutes(int institutes) {
        this.institutes = institutes;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accreditation='" + accreditation + '\'' +
                ", institutes='" + institutes + '\'' +
                ", students='" + students + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
