package sum;

import sum.resource.SumResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CalculateSumApp extends Application<AppConfiguration> {

	public static void main(String[] args) throws Exception {
		new CalculateSumApp().run(args);
	}

	@Override
	public String getName() {
		return "sum";
	}

	@Override
	public void initialize(Bootstrap<AppConfiguration> bootstrap) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(AppConfiguration configuration, Environment environment)
			throws Exception {
		final SumResource resource = new SumResource();
		environment.jersey().register(resource);
	}

}
