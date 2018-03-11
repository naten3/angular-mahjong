package come.natenelles.mahjong.config;


import come.natenelles.mahjong.model.SessionAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static come.natenelles.mahjong.controller.SessionController.INIT_PATH;

@Component
public class SessionInterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {

        if (!request.getServletPath().equals(INIT_PATH) && (request.getSession() == null ||
                request.getSession().getAttribute(SessionAttributes.USER_DETAILS.name()) == null)) {
            response.sendError(HttpStatus.FORBIDDEN.value(), "No active session, use " + INIT_PATH);
            return false;
        } else {
            return true;
        }
    }
}
