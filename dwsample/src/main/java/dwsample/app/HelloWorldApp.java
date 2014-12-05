package dwsample.app;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import dwsample.config.HelloWorldConfiguration;
import dwsample.resources.HelloWorldResource;

public class HelloWorldApp extends Application<HelloWorldConfiguration> {
	public static void main(String[] args) throws Exception {
		new HelloWorldApp().run(args);
	}

	@Override
	public String getName() {
		return "hello-world";
	}

	@Override
	public void initialize(Bootstrap<HelloWorldConfiguration> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(HelloWorldConfiguration configuration, Environment environment)
			throws Exception {
		final HelloWorldResource resource = new HelloWorldResource(
				configuration.getTemplate());
		environment.jersey().register(resource);

	}
}
