package org.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/// Implementing bean life cycle using interfaces
public class Bank implements InitializingBean, DisposableBean {
    private String name;

    public Bank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Displaying Balance\nYour account balance is RS 10,000/-");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Closing balance window");
    }
}
