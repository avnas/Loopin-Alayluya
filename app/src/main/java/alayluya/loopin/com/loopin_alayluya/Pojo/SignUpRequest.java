package alayluya.loopin.com.loopin_alayluya.Pojo;

import java.io.Serializable;

/**
 * Created by ranja_000 on 4/5/2017.
 */

public class SignUpRequest implements Serializable{

   String FirstName, LastName, Email, Password, ConfirmPassword, LanguageId;

   public SignUpRequest(String firstName, String lastName, String email, String password, String confirmPassword, String languageId) {
      FirstName = firstName;
      LastName = lastName;
      Email = email;
      Password = password;
      ConfirmPassword = confirmPassword;
      LanguageId = languageId;
   }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public String getLanguageId() {
        return LanguageId;
    }

    public void setLanguageId(String languageId) {
        LanguageId = languageId;
    }
}
