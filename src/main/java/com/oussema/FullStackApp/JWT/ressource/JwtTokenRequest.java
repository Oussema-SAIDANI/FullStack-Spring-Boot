package com.oussema.FullStackApp.JWT.ressource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
  /*  {
        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJvdXNzZW1hIiwiZXhwIjoxNTkwMTY3MTkyLCJpYXQiOjE1ODk1NjIzOTJ9.Y8a3uJTOLvtkqbHsZ6ehtNFVli4iKFxXuCy6DCkBpl3WdSPDC28ReSdB2EfYngYRuXDCOUP2ahh2Y-1olL-51g"
    }*/
    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

