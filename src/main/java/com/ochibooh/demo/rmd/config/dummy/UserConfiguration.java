package com.ochibooh.demo.rmd.config.dummy;import com.ochibooh.demo.rmd.model.User;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;import org.springframework.context.annotation.Primary;@Configurationpublic class UserConfiguration {    @Bean    @Primary    public User user() {        User user = new User();        user.setEmail("bean1@dummy.com");        user.setFirstName("FNAme");        user.setLastName("Lname");        return user;    }    @Bean    //@Profile(value = "dev")    public User user2() {        User user = new User();        user.setEmail("bean2@dummy.com");        user.setFirstName("FNAme");        user.setLastName("Lname");        return user;    }}