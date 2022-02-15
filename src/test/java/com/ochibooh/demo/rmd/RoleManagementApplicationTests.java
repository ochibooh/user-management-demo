package com.ochibooh.demo.rmd;

import com.ochibooh.demo.rmd.integ.RoleService;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Level;

@Log
@SpringBootTest
public class RoleManagementApplicationTests {
    @Autowired
    private RoleService roleService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void showAccessRights() {
        log.log(Level.INFO, String.format("Access rights [ %s ]", this.roleService.accessRights()));
    }
}
