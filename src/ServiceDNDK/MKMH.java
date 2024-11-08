/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceDNDK;

import FormLogin.Login;
import java.lang.System.Logger;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author trinhkim
 */
public class MKMH {

    private String MD5encoder(String text) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(StandardCharsets.UTF_8.encode(text));
        return String.format("%032x", new BigInteger(1, md5.digest()));
    }

    public static void main(String[] args) {
         // Khởi tạo Scanner để đọc input từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mật khẩu để mã hóa: ");
        
        // Nhập mật khẩu từ người dùng
        String password = scanner.nextLine();
        
        // Khởi tạo đối tượng PasswordEncoder để sử dụng hàm MD5encoder
        MKMH encoder = new MKMH();
        
        try {
            // Mã hóa mật khẩu và in ra kết quả
            String encryptedPassword = encoder.MD5encoder(password);
            System.out.println("Mật khẩu đã mã hóa (MD5): " + encryptedPassword);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
        
        // Đóng scanner
        scanner.close();
    }

}
