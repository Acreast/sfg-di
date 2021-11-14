package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingsRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18NService")
@Profile("EN")
public class I18NEnglishGreetingService implements GreetingService{

    private final EnglishGreetingsRepository englishGreetingsRepository;



    public I18NEnglishGreetingService(EnglishGreetingsRepository englishGreetingsRepository) {
        this.englishGreetingsRepository = englishGreetingsRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
