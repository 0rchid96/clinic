package ir.rasht.clinic.utils;

import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageUtil {

    private final MessageSource messageSource;
    private MessageSourceAccessor messageSourceAccessor;

    public MessageUtil(MessageSource messageSource) {
        this.messageSource = messageSource;
        messageSourceAccessor = new MessageSourceAccessor(messageSource, Locale.forLanguageTag("fa"));
    }

    public String get(String property){
        return messageSourceAccessor.getMessage(property);
    }
}
