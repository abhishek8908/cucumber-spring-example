package abhishek8908.stepdefs.hooks;


import abhishek8908.component.Belly;
import abhishek8908.component.config.Config;
import cucumber.api.java.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {Config.class})
public class HookSteps {

    @Autowired
    Belly belly;


    @Before
    public void beforeHook() {
        System.out.println(belly.getCukes());
    }

}
