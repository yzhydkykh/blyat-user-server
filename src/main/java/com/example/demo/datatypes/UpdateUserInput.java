package com.example.demo.datatypes;

import java.util.Optional;

public class UpdateUserInput {
    private Optional<String> name = Optional.empty();
    private Optional<Role> role = Optional.empty();

    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public Optional<Role> getRole() {
        return role;
    }

    public void setRole(Optional<Role> role) {
        this.role = role;
    }
}
