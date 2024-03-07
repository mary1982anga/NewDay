package newday.test.diamond;



	import static org.junit.Assert.assertEquals;
	import org.junit.Test;

	public class DiamondPrinterTest {

		 @Test
		    public void testCreateDiamondA() {
		        assertEquals("A\n", Diamond.create('A'));
		    }

		    @Test
		    public void testCreateDiamondBCharacterSequence() {
		        assertEquals("AB\n", Diamond.create('B'));
		    }

		    @Test
		    public void testCreateDiamondBRepeatCharacters() {
		        assertEquals("ABB\n", Diamond.create('B'));
		    }

		    @Test
		    public void testCreateDiamondBSeparateLines() {
		        assertEquals("A\nBB\n", Diamond.create('B'));
		    }

		    @Test
		    public void testCreateDiamondBIndentation() {
		        assertEquals(" A\nB B\n A\n", Diamond.create('B'));
		    }

		    @Test
		    public void testCreateDiamondBInterCharacterSpaces() {
		        assertEquals(" A\nB B\n A\n", Diamond.create('B'));
		    }

		    @Test
		    public void testCreateDiamondBSymmetry() {
		        assertEquals(" A\nB B\n A\n", Diamond.create('B'));
		    }

		    @Test
		    public void testCreateDiamondC() {
		        assertEquals("  A\n B B\nC   C\n B B\n  A\n", Diamond.create('C'));
		    }

		    @Test
		    public void testCreateDiamondD() {
		        assertEquals("   A\n  B B\n C   C\nD     D\n C   C\n  B B\n   A\n", Diamond.create('D'));
		    }

		    // Add more test cases as needed to cover additional scenarios
		}