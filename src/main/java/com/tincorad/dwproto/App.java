import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

package com.tincorad.dwproto;
/**
 * Hello world!
 *
 */
public class App extends Application<Configuration> {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Override
    public void initialize(Bootstrap<Configuration> b) {
        
    }

    @Override
    public void run(Configuration c, Environment e) throws Exception {
        LOGGER.info("Method App#run() called");
        System.out.println( "Hello world, by Dropwizard!" );
    }

    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        new App().run(args);
    }
}
