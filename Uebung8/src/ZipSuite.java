import junit.framework.TestCase;
import org.junit.*;

/**
 * Testclass for class Zip.
 *
 * @author Name: <a href="mailto:t_hoge03@uni-muenster.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 * @author Name: <a href="mailto:a_mutz01@uni-muenster.de">Ann-Cathrin Mutz</a>, Matrikelnummer: 438 871
 * @author Name: <a href="mailto:f_inge03@uni-muenster.de">Fabian Ingenhorst</a>, Matrikelnummer: 441 378
 */
public class ZipSuite extends TestCase {

    int[] array1;
    int[] array2;
    Zip.IntOperation intOperation;

    /**
     * Sets the test environment up.
     *
     * @throws Exception if an error occurs
     */
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Tears the test environment down.
     *
     * @throws Exception if an error occurs
     */
    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Runs the Test for given result.
     *
     * @param resultExpected the result which will be tested.
     */
    private void runTest(int[] resultExpected) {
        int[] resultActual = Zip.zip(array1, array2, intOperation);

        Assert.assertArrayEquals(resultExpected, resultActual);
    }

    @Test
    public void testZipInputNormalArrayExpectNormalResult() throws Exception {
        array1 = new int[]{1, 2, 3, 5};
        array2 = new int[]{3, 5, 2};
        intOperation = (i, j) -> i - j;

        int[] resultExpected = new int[]{-2, -3, 1};

        runTest(resultExpected);
    }


    @Test
    public void testZipInputEmptyArrayExpectEmptyResult() throws Exception {
        array1 = new int[]{};
        array2 = new int[]{3, 5, 2};
        intOperation = (i, j) -> i - j;

        int[] resultExpected = new int[]{};

        runTest(resultExpected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZipInputNullArrayExpectException1() throws Exception {
        array1 = null;
        array2 = new int[]{3, 5, 2};
        intOperation = (i, j) -> i - j;

        try {
            Zip.zip(array1, array2, intOperation);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("array1 is null.", e.getMessage());
        }
    }

    @Test
    public void testZipInputNullArrayExpectException2() throws Exception {
        array1 = new int[]{1, 2, 3, 5};
        array2 = null;
        intOperation = (i, j) -> i - j;

        try {
            Zip.zip(array1, array2, intOperation);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("array2 is null.", e.getMessage());
        }
    }

    @Test
    public void testZipInputNullIntOperationExpectException() throws Exception {
        array1 = new int[]{1, 2, 3, 5};
        array2 = new int[]{3, 5, 2};
        intOperation = null;

        try {
            Zip.zip(array1, array2, intOperation);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("intOperation is null.", e.getMessage());
        }
    }
}