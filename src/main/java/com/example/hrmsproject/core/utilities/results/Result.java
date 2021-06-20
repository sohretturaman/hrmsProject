package com.example.hrmsproject.core.utilities.results;

public class Result {
    private boolean success ;
    private String message ;


    public Result (boolean success ){
        this.success= success ;
    }

    public Result ( boolean success, String massage){   // super  fonksiyonu base sınıfın constructor unu kullanır
        this(success);                                  // önce boolean yazman gerek . ayrıca  succes tek parametre ile bir constructorda duruyor bu yüzden çağırabilidk
        this.message= message ;
    }

    public boolean  isSuccess(){  // parametre yok yukarda  zaten var . this kullnarak return ediyoruz .
        return this.success;
    }

    public String getMessage(){
        return this.message;
    }
}
