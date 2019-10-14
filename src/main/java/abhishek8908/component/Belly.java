package abhishek8908.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Belly {
    private int cukes = 0;

    public Belly() {
        System.out.println("Initiating Belly Class");
    }

    public void setCukes(int cukes) {
        this.cukes = cukes;
    }

    public int getCukes() {
        return cukes;
    }
}