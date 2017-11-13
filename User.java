package model;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class User {
    private int userID = 0;
    private String firstname;
    private String lastname;
    private String email;
    private String role;
    private String securityQ1;
    private String securityQ2;

    public int getUserID() {
        return userID;
    }

//    public void setUserID(int userID) {
//        this.userID = userID;
//    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSecurityQ1() {
        return securityQ1;
    }

    public void setSecurityQ1(String securityQ1) {
        this.securityQ1 = securityQ1;
    }

    public String getSecurityQ2() {
        return securityQ2;
    }

    public void setSecurityQ2(String securityQ2) {
        this.securityQ2 = securityQ2;
    }
////for store pic (code from internet)
//    try{
//
//        BufferedImage originalImage = ImageIO.read(new File("path/to/image/imag.jpg"));
//
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ImageIO.write( originalImage, "jpg", baos );
//        baos.flush();
//        byte[] imageInByte = baos.toByteArray();
//
//        //save imageInByte as blob in database
//    }catch(IOException e){
//        System.out.println(e.getMessage());
//    }finally{
//        baos.close();
//        //close database connection
//    }
////end store pic







}
