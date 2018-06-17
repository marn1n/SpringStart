package ua.com.me.models;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.me.dao.UserDAO;
import ua.com.me.service.UserSerivceImpl;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("classpath:/context.xml");
//        User user = (User) container.getBean("user");
//        System.out.println(user);

//
//        UserDAO userDAO = container.getBean(UserDAO.class);
//        userDAO.save(new User("Alice"));
//        userDAO.save(new User("Mark"));

        UserSerivceImpl bean = container.getBean(UserSerivceImpl.class);
        bean.save("Peter");
    }
}
