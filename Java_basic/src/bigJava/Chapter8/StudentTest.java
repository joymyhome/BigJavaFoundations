package bigJava.Chapter8;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/**
 * Run test for Student.java
 * @author jing
 *
 */
public class StudentTest {
	
	@Test public void testSum() {
		Student scoreboard = new Student(10);
		scoreboard.addScore(98);
		scoreboard.addScore(80);
		scoreboard.addScore(100);
		double expect = 278;
		assertEquals(expect, scoreboard.sum());	
	}
	
	@Test public void TestMinimum() {
		Student scoreboard = new Student(10);
		scoreboard.addScore(98);
		scoreboard.addScore(80);
		scoreboard.addScore(100);
		double expect = 80;
		assertEquals(expect, scoreboard.minimum());
	}
	
	@Test public void TestFinalScore() {
		Student scoreboard = new Student(10);
		scoreboard.addScore(98);
		scoreboard.addScore(80);
		scoreboard.addScore(100);
		double expect = 198;
		assertEquals(expect, scoreboard.finalScore());
	}
	
	
}
