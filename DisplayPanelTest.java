import static org.junit.Assert.*;

import org.junit.Test;

public class DisplayPanelTest {

	@Test
	public void chooseImageTest1() {
		String[] inputArray = null;
		String expected = null;
		String actual = DisplayPanel.chooseImage(inputArray);
		assertEquals(expected, actual);
		//i'm getting a null pointer exception
	}
	
	@Test
	public void chooseImageTest2() {
		String[] inputArray2 = new String[2];
		inputArray2[0] = "Yes";
		inputArray2[1] = "No";
		String expected2 = "Yes";
		String actual2 = DisplayPanel.chooseImage(inputArray2);
		assertEquals(expected2, actual2);
		//test passes!
	}
	
	@Test
	public void chooseImageTest3() {
		String[] inputArray3 = new String[6];
		inputArray3[0] = "Yes";
		inputArray3[1] = "No";
		inputArray3[2] = "Maybe";
		inputArray3[3] = "So";
		inputArray3[4] = "Why";
		inputArray3[5] = "Ask?";
		String expected3 = "Ask?";
		String actual3 = DisplayPanel.chooseImage(inputArray3);
		assertEquals(expected3, actual3);
		//test passes!
	}

}
