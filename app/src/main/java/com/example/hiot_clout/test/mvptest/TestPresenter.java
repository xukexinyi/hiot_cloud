package com.example.hiot_clout.test.mvptest;

import com.example.hiot_clout.test.mvptest.model.User;

public class TestPresenter {

    private TestView view;

    public TestPresenter(TestView view){
        this.view = view;

    }

    public void login(User user) {
        if("xkx".equals(user.getUserName()) && "xkx520".equals(user.getPassword())){
            view.showMessage("登录成功");
        }else{
            view.showMessage("登录失败");
        }

    }
}
