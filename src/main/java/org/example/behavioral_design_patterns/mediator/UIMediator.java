package org.example.behavioral_design_patterns.mediator;

import java.util.ArrayList;
import java.util.List;

//Mediator
public class UIMediator {

    final List<UIControl> colleagues = new ArrayList<>();

    public void register(final UIControl uiControl){
        //Null check needed
        colleagues.add(uiControl);
    }

    public void valueChanged(UIControl uiControl){
        colleagues.stream()
                .filter(c -> c != uiControl )
                .forEach(c -> c.controlChanged(uiControl) );
    }

}
