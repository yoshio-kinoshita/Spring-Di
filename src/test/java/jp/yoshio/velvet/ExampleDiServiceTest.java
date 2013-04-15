package jp.yoshio.velvet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// Bean定義ファイルを読み込む。
@ContextConfiguration
// SpringのUnitテストとして実行
@RunWith(SpringJUnit4ClassRunner.class)
public class ExampleDiServiceTest {

	// serviceをインジェクション.ExampleServiceがインジェクションされる。
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
