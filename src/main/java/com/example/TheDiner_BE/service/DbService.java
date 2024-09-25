package com.example.TheDiner_BE.service;

import com.example.TheDiner_BE.models.entities.Root;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DbService {

    public void validateRootBeanToSave(Root bean){
       if(bean.getCreatedOn()==null)bean.setCreatedOn(LocalDateTime.now());
       else bean.setUpdatedOn(LocalDateTime.now());

       if (bean.getVersion()==null)bean.setVersion(0);
       else bean.setVersion(bean.getVersion()+1);
    }
}
