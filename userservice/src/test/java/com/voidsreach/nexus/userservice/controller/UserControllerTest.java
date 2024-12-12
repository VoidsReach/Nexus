package com.voidsreach.nexus.userservice.controller;

import com.voidsreach.nexus.userservice.model.UserRegistrationRequest;
import com.voidsreach.nexus.userservice.model.UserResponse;
import com.voidsreach.nexus.userservice.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private UserService userService;

    @Test
    void testRegisterUser() throws Exception {
        UserRegistrationRequest request = new UserRegistrationRequest("testuser", "test@example.com", "Pass123");
        UserResponse response = new UserResponse(UUID.randomUUID(), "testuser", "test@example.com");

        mockMvc.perform(post("/api/users/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                        {
                            "username": "testuser",
                            "email": "test@example.com",
                            "password": "Pass123
                        }
                        """))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.username").value("testuser"))
                .andExpect(jsonPath("$.email").value("test@example.com"));
    }

}
