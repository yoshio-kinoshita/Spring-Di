package jp.yoshio.velvet;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ykinos
 * 
 */
// @Component���C���W�F�N�V��������Ώ�.
@Component
public class ExampleDiService implements Service {

	@Override
	public String getMessage() {
		return "Hello world!";
	}
	
	@Override
	public String findProduct() {
		return "findProduct";
	}
}
