package net.emv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingPageController {

    @Autowired
    private MessageSourceAccessor messageSourceAccessor;

    @GetMapping("/greeting")
    public String greetingPage(Model model) {
        String msg = messageSourceAccessor.getMessage("greeting", LocaleContextHolder.getLocale());
        model.addAttribute("msg", msg);
        return "greeting-page";
    }
}
