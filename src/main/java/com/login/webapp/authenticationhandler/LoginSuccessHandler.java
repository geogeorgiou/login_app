package com.login.webapp.authenticationhandler;

import com.login.webapp.enums.RoleType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    private static final String USER_HOME_PAGE_URL = "/user/home";
    private static final String ADMIN_HOME_URL = "/admin/home";

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//        response.addCookie(generateTimestampCookie());

        String redirectUrl = USER_HOME_PAGE_URL;
        for (GrantedAuthority grantedAuthority : authentication.getAuthorities()) {
            if (RoleType.ADMIN.name().equals(grantedAuthority.getAuthority())) {
                redirectUrl = ADMIN_HOME_URL;
            }
        }
        redirectStrategy.sendRedirect(request, response, redirectUrl);
    }


//    private Cookie generateTimestampCookie() {
//        return new Cookie(TIMESTAMP_COOKIE_NAME, String.valueOf(System.currentTimeMillis()));
//    }

}
