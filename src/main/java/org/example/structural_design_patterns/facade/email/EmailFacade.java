package org.example.structural_design_patterns.facade.email;

import org.example.structural_design_patterns.facade.Order;

//Facade provides simple methods for client to use
public class EmailFacade {

    public boolean sendOrderEmail(final Order order){
        Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .forObject(order)
                .build();
        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);
    }
}
