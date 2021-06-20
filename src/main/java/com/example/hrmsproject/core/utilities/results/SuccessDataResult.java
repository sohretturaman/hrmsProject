package com.example.hrmsproject.core.utilities.results;

public class SuccessDataResult<P> extends DataResult<P>{

   public SuccessDataResult (){
       super ( null, true) ;
   }


    public SuccessDataResult(P data) {
        super(data, true);
    }


    public SuccessDataResult(String message){
        super (null,true,message);
    }


    public SuccessDataResult (P data , boolean success){
       super(data,true);
    }


    public SuccessDataResult (P data,String message){
        super ( data ,true , message) ;
    }

}
