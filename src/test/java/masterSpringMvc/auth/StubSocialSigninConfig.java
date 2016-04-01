package masterSpringMvc.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInController;
import org.springframework.social.connect.web.SignInAdapter;

@Configuration
public class StubSocialSigninConfig {
	@Bean
	@Primary
	@Autowired
	public ProviderSignInController signInController(
			ConnectionFactoryLocator factoryLocator,
			UsersConnectionRepository usersRepository,
			SignInAdapter signInAdapter) {
		return new FakeSigninController(factoryLocator, usersRepository,
				signInAdapter);
	}
}