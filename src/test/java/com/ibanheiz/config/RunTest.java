package com.ibanheiz.config;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import com.ibanheiz.conhecimento.steps.ComposicaoConhecimentoSteps;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;

@RunWith(JUnitReportingRunner.class)
public class RunTest extends JUnitStories {
 
	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration()
        .useStoryLoader(new LoadFromClasspath(this.getClass()))  
        .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
	}
 
	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(), new ComposicaoConhecimentoSteps());
	}

	@Override
	protected List<String> storyPaths() {
		StoryFinder finder = new StoryFinder();
		return finder.findPaths(codeLocationFromClass(this.getClass()).getFile(), Arrays.asList("**/*.story"), Arrays.asList(""));
	}
}