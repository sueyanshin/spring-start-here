package com.sys.ch9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class LoginControllerUnitTest {

    @Mock
    private Model model;

    @Mock
    private LoginProcessor loginProcessor;

    @InjectMocks
    private LoginController loginController;

    @Test
    public void loginPostLoginSucceedsTest(){
        given(loginProcessor.login())
                .willReturn(true);

        String result = loginController.login("suesue","password",model);

        assertEquals("login.html",result);

        verify(model)
                .addAttribute("message","You are now logged in.");
    }

    @Test
    public  void loginFailsTest(){
        given(loginProcessor.login())
                .willReturn(false);

        String result = loginController.login("suesue","password",model);

        assertEquals("login.html",result);

        verify(model)
                .addAttribute("message","Login failed!");
    }
}
