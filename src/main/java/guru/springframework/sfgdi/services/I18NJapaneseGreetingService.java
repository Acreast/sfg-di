package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18NService")
@Profile({"JP","default"})
public class I18NJapaneseGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Ohaiyo Sekai - JP";
    }
}
