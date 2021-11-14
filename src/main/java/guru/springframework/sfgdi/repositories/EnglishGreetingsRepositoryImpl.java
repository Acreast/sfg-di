package guru.springframework.sfgdi.repositories;

public class EnglishGreetingsRepositoryImpl implements EnglishGreetingsRepository {



    @Override
    public String getGreeting() {
        return "Hello world - EN";
    }
}
