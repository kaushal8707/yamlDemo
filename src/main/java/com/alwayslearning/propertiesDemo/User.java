package com.alwayslearning.propertiesDemo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import java.util.List;
import java.util.Map;

@Configuration
public class User
{
    @Value("${user.fb.name}")
    private String fbUser;

    @Value("${user.fb.password:hydr}")
    private String fbPassword;

    @Value("${user.gmail.name}")
    private String gmailUser;

    @Value("${user.gmail.password}")
    private String gmailPassword;

    @Value("#{'${list}'.split(',')}")
    private List<String> listOfItems;

    @Value("${list}")
    private List<String> arrayValue;

    @Value("#{${values.map}}")
    private Map<String,Integer> mapValue;

//    @Value("${SystemProperties}")
//    private Map<String,String> systemProps;
//
//    public Map<String, String> getSystemProps() {
//        return systemProps;
//    }
//
//    public void setSystemProps(Map<String, String> systemProps) {
//        this.systemProps = systemProps;
//    }

    public String getFbUser() {
        return fbUser;
    }

    public void setFbUser(String fbUser) {
        this.fbUser = fbUser;
    }

    public String getFbPassword() {
        return fbPassword;
    }

    public void setFbPassword(String fbPassword) {
        this.fbPassword = fbPassword;
    }

    public String getGmailUser() {
        return gmailUser;
    }

    public void setGmailUser(String gmailUser) {
        this.gmailUser = gmailUser;
    }

    public String getGmailPassword() {
        return gmailPassword;
    }

    public void setGmailPassword(String gmailPassword) {
        this.gmailPassword = gmailPassword;
    }

    public List<String> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(List<String> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public List<String> getArrayValue() {
        return arrayValue;
    }

    public void setArrayValue(List<String> arrayValue) {
        this.arrayValue = arrayValue;
    }

    public Map<String, Integer> getMapValue() {
        return mapValue;
    }

    public void setMapValue(Map<String, Integer> mapValue) {
        this.mapValue = mapValue;
    }

    @Override
    public String toString() {
        return "User{" +
                "fbUser='" + fbUser + '\'' +
                ", fbPassword='" + fbPassword + '\'' +
                ", gmailUser='" + gmailUser + '\'' +
                ", gmailPassword='" + gmailPassword + '\'' +
                ", listOfItems=" + listOfItems +
                ", arrayValue=" + arrayValue +
                ", mapValue=" + mapValue +
                '}';
    }
}
