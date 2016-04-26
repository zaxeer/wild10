package com.test.session;

import javax.ejb.Remote;

import com.test.model.UserInfo;

@Remote
public interface NewsletterRegistrationRemote {

    void registerUser(UserInfo userInfo);

    UserInfo  findUserByEmail(String email);
}
