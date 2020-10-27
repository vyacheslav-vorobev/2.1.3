package app.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog extends Animal{
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
