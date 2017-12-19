package org.wso2.nira.sample.repo.sample1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by nira on 12/14/17.
 */
public class SampleActivator implements BundleActivator {

    private static final Logger logger = LoggerFactory.getLogger(SampleActivator.class);

    @Activate
    public void start(BundleContext bundleContext) throws Exception {
        logger.info("1.0.0g");
    }

    @Deactivate
    public void stop(BundleContext bundleContext) throws Exception {
        logger.debug("Deactivating startup resolver component available in bundle {}",
                bundleContext.getBundle().getSymbolicName());
    }
}
