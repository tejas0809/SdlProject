package com.login_signup_screendesign_demo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shantanu on 4/10/17.
 */

public class Answer_model {

    @SerializedName("atext")
    private String ans_text;

    @SerializedName("User_name")
    private String u_name;

    @SerializedName("tagline")
    private String u_tag;


    public String getU_tag() {
        return u_tag;
    }

    public String getAns_text() {

        return ans_text;
    }

    public String getU_name() {
        return u_name;
    }
}
