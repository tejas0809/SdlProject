package com.login_signup_screendesign_demo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shantanu on 1/10/17.
 */

public class get_detailed_fromQues {

    @SerializedName("qtext")
    private String ques_text;

    @SerializedName("User_name")
    private String user_name;

    @SerializedName("tagline")
    private String user_tag;

    @SerializedName("name")
    private String topic_name;


    public String getQues_text() {
        return ques_text;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_tag() {
        return user_tag;
    }

    public String getTopic_name() {
        return topic_name;
    }
}
