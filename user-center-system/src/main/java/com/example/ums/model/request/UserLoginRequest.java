package com.example.ums.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author pengYuJun
 */
@Data
public class UserLoginRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 2339040579134251257L;

    private String loginName;

    private String loginPwd;
}
