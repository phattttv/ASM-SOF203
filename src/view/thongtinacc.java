/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author trinhkim
 */
public class thongtinacc {
    public String user;
    public String password;
    public String chucvu;

    public thongtinacc() {
    }

    public thongtinacc(String user, String password, String chucvu) {
        this.user = user;
        this.password = password;
        this.chucvu = chucvu;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }
    
    
}
