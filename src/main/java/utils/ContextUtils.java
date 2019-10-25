package utils;

import domain.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

public class ContextUtils {
    public static OAuth2Authentication getSessionAuthentication() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();
        return (OAuth2Authentication) authentication;
    }

    public static User getUserInfo() {
        Object userDetails = getSessionAuthentication().getUserAuthentication().getDetails();
        return (User) userDetails;
    }

    public static Integer getCurrentUserId() {
        return getUserInfo().getId();
    }

    public static String getUserName() {
        return getUserInfo().getUsername();
    }
}
