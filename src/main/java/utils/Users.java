package utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashMap;

public class Users {
    public static final HashMap<String, UserModel> userRoles = new HashMap<String, UserModel>() {{
        //API
        put("Admin", new UserModel("admin", "password123"));
        //UI
        put("Standard user", new UserModel("standard_user", "secret_sauce"));
        put("Locked user", new UserModel("locked_out_user", "secret_sauce"));
        put("Problem user", new UserModel("problem_user", "secret_sauce"));
        put("Performance user", new UserModel("performance_glitch_user", "secret_sauce"));
    }};

    @Getter
    @Setter
    @RequiredArgsConstructor
    public static class UserModel {
        private final String userName;
        private final String userPassword;
    }
}
