package com.voidsreach.nexus.userservice.model;

import java.util.UUID;

public record UserResponse(UUID id, String username, String email) {}
