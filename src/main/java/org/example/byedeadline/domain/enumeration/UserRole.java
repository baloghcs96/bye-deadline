package org.example.byedeadline.domain.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserRole {

    ROLE_USER("USER"),
    ROLE_ADMIN("ADMIN"),
    ROLE_UNVERIFIED("UNVERIFIED"),
    ROLE_BOUNTY_HUNTER("BOUNTY_HUNTER"),
    ROLE_EMPLOYER("EMPLOYER");

    private final String role;
}
