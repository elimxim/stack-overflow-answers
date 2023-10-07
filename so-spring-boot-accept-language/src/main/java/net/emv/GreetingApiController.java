package net.emv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class GreetingApiController {

    @Autowired
    private MessageSourceAccessor messageSourceAccessor;

    @GetMapping(path = "/greeting", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getGreeting() {
        String msg = messageSourceAccessor.getMessage("greeting", LocaleContextHolder.getLocale());
        return ResponseEntity.ok(msg);
    }
}
