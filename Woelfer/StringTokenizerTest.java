/*
 * @Author W�lfer
 * @Version 2016-04-11
 */

package Woelfer;

import static org.junit.Assert.*;

import java.util.StringTokenizer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringTokenizerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNextTokenWithSpaceDelimeter() {
		StringTokenizer st = new StringTokenizer("This is a test");
		assertEquals("This",st.nextToken());
	}

}
