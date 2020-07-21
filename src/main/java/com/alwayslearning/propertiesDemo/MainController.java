package com.alwayslearning.propertiesDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
    @Autowired
    User user;

    @Autowired
    UserConfigDemo userConfigDemo;

    @GetMapping("/user")
    public String getUsers()
    {
        //System.out.println(user.getSystemProps());
        return user.toString();
    }

    @GetMapping("/userConfig")
    public String getUserConfig()
    {
        return userConfigDemo.toString();
    }
}
