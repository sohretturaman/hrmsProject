package com.example.hrmsproject.core.utilities.results;

public class DataResult<P> extends Result{
     private P data ;

    public DataResult( P data,boolean success ) {
        super(success);
        this.data = data;
    }

    public DataResult(P data,boolean success, String message){
        super(success,message);
        this.data = data ;

    }

    public P getData (){                 // bu sınıfta yeni constructor oluşturarak bir veri türü ekleyip  onu getirmeye çalışıyoruz çünkü
        return this.data;              // bu sınıfın amacı verinin yüklenip yüklenmediğini kontrol etmek

    }
}
