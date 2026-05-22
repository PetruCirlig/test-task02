package PA.PrimulExercitiu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/Moldova")
        public String Moldova() {
        return "Capitala este Chisinau";
    }

    @GetMapping("/France")
    public String France() {
        return "Capitala este Paris";
    }

    @GetMapping("/Germany")
    public String Germany() {
        return "Capitala este Berlin";
    }

}
