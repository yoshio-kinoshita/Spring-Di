package jp.yoshio.velvet;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ykinos
 * 
 */
// @Componentがインジェクションする対象.
@Component
public class ExampleService implements Service {

	@Override
	public String getMessage() {
		return "Hello world!";
	}

}
