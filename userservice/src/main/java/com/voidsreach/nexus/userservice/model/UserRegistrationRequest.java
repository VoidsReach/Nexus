package com.voidsreach.nexus.userservice.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * A request object for user registration and profile updates.
 *
 * <p>This class validates fields based on the specified validation groups:
 * <ul>
 *     <li>{@link RegistrationGroup}: Used for user registration validation.</li>
 *     <li>{@link UpdateGroup}: Used for user profile updates.</li>
 * </ul>
 * </p>
 *
 * @param username the username of the user, cannot be blank.
 * @param email the email address of the user, must be valid and non-blank.
 * @param password the password of the user, required only for registration.
 */
public record UserRegistrationRequest(

        @NotBlank(message = "Username cannot be blank", groups = {
            RegistrationGroup.class, UpdateGroup.class
        })
        String username,

        @Email(message = "Email must be valid", groups = {
            RegistrationGroup.class, UpdateGroup.class
        })
        String email,

        @NotBlank(message = "Password cannot be blank", groups = {RegistrationGroup.class})
        @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
        @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]+$", message =
        "Password must contain at least one letter and one number")
        String password

) {}
