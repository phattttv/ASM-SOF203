/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Thanhnamcuti
 */
public class Employee {
    private String name;
    private String id;
    private String dob;
    private String gender;
    private String department;
    private String phone;
    private String email;

    public Employee(String name, String id, String dob, String gender, String department, String phone, String email) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.gender = gender;
        this.department = department;
        this.phone = phone;
        this.email = email;
    }

    // Getters và Setters cho các thuộc tính
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", ID='" + id + '\'' +
                ", DOB='" + dob + '\'' +
                ", Gender='" + gender + '\'' +
                ", Department='" + department + '\'' +
                ", Phone='" + phone + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
