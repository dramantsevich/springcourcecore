package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Marry";
    }
}
