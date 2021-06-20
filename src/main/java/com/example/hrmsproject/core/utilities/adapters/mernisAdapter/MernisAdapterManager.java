package com.example.hrmsproject.core.utilities.adapters.mernisAdapter;

import com.example.hrmsproject.entities.concretes.Candidate;
import com.example.hrmsproject.serviceMessage.MernisMessageManager;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MernisAdapterManager implements MernisService{


    @Override
    public boolean auth(Candidate candidate ) {
        MernisMessageManager mernisMessageManager = new MernisMessageManager();

        if (candidate.getIdentificationNumber().length()== 11 && candidate.getFirstName().equals("şöhret")
        || candidate.getLastName().equals("Turaman")) {
           mernisMessageManager.checkedMernis( candidate.getIdentificationNumber()+"tc ye sahip "+candidate.getFirstName()+candidate.getLastName());
            return true;
        } else
            return false;
    }

//  && anlamı VEYA ayrıca || anlamı VE dir if komutu
}
