package jp.yoshio.velvet;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ykinos
 * 
 */
// @Component���C���W�F�N�V��������Ώ�.
@Component
public class ExampleService implements Service {

	@Override
	public String getMessage() {
		return "Hello world!";
	}

}
