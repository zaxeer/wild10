package com.test.session;

import javax.ejb.Local;

import com.test.model.UserInfo;

@Local
public interface NewsletterRegistrationLocal {

    void registerUser(UserInfo userInfo);

    UserInfo findUserByEmail(String email);
}
