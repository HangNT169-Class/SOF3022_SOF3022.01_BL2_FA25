package com.poly.main.B3_LamViecVoiForm.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginRequest {
    // liet ke cac thuoc tinh ma yeu cau gui di
    private String username;

    private String password;

}
