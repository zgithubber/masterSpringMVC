package masterSpringMvc;

import javax.servlet.Filter;

import masterSpringMvc.config.PictureUploadProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.ShallowEtagHeaderFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableConfigurationProperties({ PictureUploadProperties.class })
public class MasterSpringMvcApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(MasterSpringMvcApplication.class, args);
	}

	@Bean
	public Filter etagFilter() {
		return new ShallowEtagHeaderFilter();
	}
}
