package jp.yoshio.velvet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// Bean��`�t�@�C����ǂݍ��ށB
@ContextConfiguration
// Spring��Unit�e�X�g�Ƃ��Ď��s
@RunWith(SpringJUnit4ClassRunner.class)
public class ExampleDiServiceTest {

	// service���C���W�F�N�V����.ExampleService���C���W�F�N�V���������B
	@Autowired
	private Service service;

	@Test
	public void getMessage() {
		assertEquals("Hello world!", service.getMessage());
	}
	
	@Test
	public void findProduct() {
		assertEquals("findProduct", service.findProduct());
	}
}
