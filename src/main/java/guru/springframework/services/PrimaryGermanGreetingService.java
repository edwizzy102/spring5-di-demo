package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Eddie Ekpo on 7/15/2018
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Primärer Begrüßungs Dienst";
    }
}
