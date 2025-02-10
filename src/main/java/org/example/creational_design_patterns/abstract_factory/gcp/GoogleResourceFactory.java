package org.example.creational_design_patterns.abstract_factory.gcp;

import org.example.creational_design_patterns.abstract_factory.Instance;
import org.example.creational_design_patterns.abstract_factory.ResourceFactory;
import org.example.creational_design_patterns.abstract_factory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
