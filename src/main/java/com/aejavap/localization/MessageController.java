package com.aejavap.localization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class MessageController {

    @Autowired
    private ResourceBundleMessageSource messageSource;

    @GetMapping(path = "/msg", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getMessages(@RequestHeader("Accept-Language") String locale) {
        return messageSource.getMessage("text.hello", null, new Locale(locale));


    }
}
