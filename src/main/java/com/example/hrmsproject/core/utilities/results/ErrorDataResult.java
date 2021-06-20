package com.example.hrmsproject.core.utilities.results;

public class ErrorDataResult<P> extends DataResult<P>{


    public ErrorDataResult (){
        super ( null, false) ;
    }


    public ErrorDataResult(P data) {
        super(data, false);
    }


    public  ErrorDataResult(String message){
        super (null,false,message);
    }


    public  ErrorDataResult (P data , boolean success){
        super(data,false);
    }


    public  ErrorDataResult (P data,String message){
        super ( data ,false , message) ;
    }

}
