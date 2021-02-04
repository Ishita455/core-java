package com.company.practice.practiceserialization;

import java.io.PushbackInputStream;
import java.io.Serializable;

public class StudentDemo implements Serializable {
    Integer stId;
    String stName;

    public StudentDemo(Integer stId, String stName){
        this.stId = stId;
        this.stName = stName;
    }

}
