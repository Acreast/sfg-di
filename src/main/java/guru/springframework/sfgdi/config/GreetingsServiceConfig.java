package guru.springframework.sfgdi.config;


import guru.springframework.sfgdi.controllers.SetterInjectedController;
import guru.springframework.sfgdi.repositories.EnglishGreetingsRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingsRepositoryImpl;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.I18NEnglishGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingsServiceConfig {


    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    EnglishGreetingsRepository englishGreetingsRepository(){
        return new EnglishGreetingsRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18NEnglishGreetingService i18NEnglishGreetingService(EnglishGreetingsRepository englishGreetingsRepository){
        return new I18NEnglishGreetingService(englishGreetingsRepository);
    }



    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }



}
