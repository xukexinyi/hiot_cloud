package com.example.hiot_clout.test.mvptest;

import com.example.hiot_clout.test.mvptest.model.User;

public class TestPresenter {

    private TestView view;

    public TestPresenter(TestView view){
        this.view = view;

    }

    public void login(User user) {
<<<<<<< HEAD
        if("xkx".equals(user.getUserName()) && "xkx520".equals(user.getPassword())){
=======
        if("susu".equals(user.getUserName()) && "sjw123".equals(user.getPassword())){
>>>>>>> bfaf4a2a8b800877d74bcc25e1ea2658dd7a645a
            view.showMessage("登录成功");
        }else{
            view.showMessage("登录失败");
        }

    }
}
