package com.example;

public class Netflix {

    public String username;
    public String password;
    private static volatile Netflix n;

 private Netflix (String username,  String password)

 {
     this.username=username;
     this.password=password;
 }

 public boolean validateCredentials()
    {
        boolean validate;
        validate= username.equals(Credentials.USERNAME) && password.equals(Credentials.PASSWORD);
        return validate;
    }
  public static Netflix login (String user,String pass)
  {
      if(n==null){

          synchronized(Netflix.class)
          {

              if(n==null)
               n=new Netflix(user,pass);

          }
      }

      return n;
  }

}
