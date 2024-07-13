package com.example.TheDiner_BE.models;

import com.example.TheDiner_BE.constants.APIConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class APIResponse<T> {

    private String status;
    private String errorsDescription;
    private T data;

    public APIResponse(T data) {
        status = APIConstants.SUCCESS;
        errorsDescription=APIConstants.DESCIPTION;
        this.data = data;
    }

    public APIResponse(String status, String errorsDescription, T data) {
        this.status = status;
        this.errorsDescription = errorsDescription;
        this.data = data;
    }
}
