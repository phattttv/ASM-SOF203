/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceDNDK;

/**
 *
 * @author Bap Bun
 */
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Java String Encryption Decryption Example
 *
 * @author Ramesh Fadatare
 *
 */
public class AESEncryptionDecryption {

    private static SecretKeySpec secretKey;
    private static byte[] key;
    private static final String ALGORITHM = "AES";

    public void prepareSecreteKey(String myKey) {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes(StandardCharsets.UTF_8);
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public String encrypt(String strToEncrypt, String secret) {
        try {
            prepareSecreteKey(secret);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    public String decrypt(String strToDecrypt, String secret) {
        try {
            prepareSecreteKey(secret);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
    
    private String MD5encoder(String text) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(StandardCharsets.UTF_8.encode(text));
        return String.format("%032x", new BigInteger(1, md5.digest()));
    }
    

    public static void main(String[] args) {
        final String secretKey = "thekeyhere";

        String originalString = "jdbc:sqlserver://DESKTOP-QSJ8J12\\SQLEXPRESS:1433;databaseName=userdb;trustServerCertificate=true";
        String user = "sa";
        String password = "tanphat4379";
        AESEncryptionDecryption aesEncryptionDecryption = new AESEncryptionDecryption();
        //duong dan
        String encryptedString = aesEncryptionDecryption.encrypt(originalString, secretKey);
        String decryptedString = aesEncryptionDecryption.decrypt(encryptedString, secretKey);
        //user
        String userencryptedString= aesEncryptionDecryption.encrypt(user, secretKey);
        String userdecryptedString = aesEncryptionDecryption.decrypt(userencryptedString, secretKey);
        //password
        String passencryptedString= aesEncryptionDecryption.encrypt(password, secretKey);
        String passdecryptedString = aesEncryptionDecryption.decrypt(passencryptedString, secretKey);
        //user ma hoa
        System.out.println(user);
        System.out.println(userencryptedString);
        System.out.println(userdecryptedString);
        //duong dan ma hoa
        System.out.println(originalString);
        System.out.println(encryptedString);
        System.out.println(decryptedString);
        //duong password ma hoa
        System.out.println(password);
        System.out.println(passencryptedString);
        System.out.println(passdecryptedString);
        String pass = "phat123";
        
        
    }
}
