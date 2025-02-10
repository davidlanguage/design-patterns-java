package org.example.creational_design_patterns.abstract_factory;

import org.example.creational_design_patterns.abstract_factory.aws.AwsResourceFactory;
import org.example.creational_design_patterns.abstract_factory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory){
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib){
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);

        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 20488);
        i1.start();
        i1.stop();

        System.out.println("*****************************************************");

        Client gcp = new Client(new GoogleResourceFactory());
        i1 = gcp.createServer(Instance.Capacity.micro, 20488);
        i1.start();
        i1.stop();

    }

}
