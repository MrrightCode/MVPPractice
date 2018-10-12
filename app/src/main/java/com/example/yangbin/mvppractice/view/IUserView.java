package com.example.yangbin.mvppractice.view;

/**
 *
 * https://www.jianshu.com/p/9a6845b26856
 * Created by yangbin on 2018/10/12.
 * View的接口
 * 根据业务的需求来定义这里面的抽象方法
 * 业务需求分析：
 * 1.save 把用户输入的ID FirstName 和LastName 的数据传递给presenter再传递给model进行存储
 * 2.load 根据用户输入的ID 传递给presenter然后让它从model里面获取到用户名和密码再返回回来，再传递给View进行显示
 */
public interface IUserView {
    int getId();
    String getUserName();
    String getPassword();

    void setUserName();
    void setPassword();
}
