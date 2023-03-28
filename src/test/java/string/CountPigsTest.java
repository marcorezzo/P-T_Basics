/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */

package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//CHECKSTYLE:OFF MagicNumber
class CountPigsTest {


	@Test
	void countPigs1() {
		Assertions.assertEquals(0, CountPigs.countPigs(""));
		Assertions.assertEquals(0, CountPigs.countPigs("a"));
		Assertions.assertEquals(0, CountPigs.countPigs("pi"));
		Assertions.assertEquals(0, CountPigs.countPigs(" "));
		Assertions.assertEquals(0, CountPigs.countPigs("    "));
	}

	@Test
	void countPigs2() {
		Assertions.assertEquals(1, CountPigs.countPigs("pig"));
		Assertions.assertEquals(1, CountPigs.countPigs("  pag  "));
		Assertions.assertEquals(1, CountPigs.countPigs(" pug "));
		Assertions.assertEquals(1, CountPigs.countPigs(" pog"));
		Assertions.assertEquals(1, CountPigs.countPigs("peg "));
	}

	@Test
	void countPigs3() {
		Assertions.assertEquals(0, CountPigs.countPigs("pgg"));
		Assertions.assertEquals(0, CountPigs.countPigs("pop"));
		Assertions.assertEquals(0, CountPigs.countPigs("picpoc"));
	}

	@Test
	void countPigs4() {
		Assertions.assertEquals(5, CountPigs.countPigs("pagpegpigpogpug"));
		Assertions.assertEquals(1, CountPigs.countPigs("abc.pig"));
		Assertions.assertEquals(1, CountPigs.countPigs("papigpo"));
		Assertions.assertEquals(1, CountPigs.countPigs("pogpo"));
	}

	@Test
	void countPigs5() {
		Assertions.assertEquals(2, CountPigs.countPigs("pigpig"));
		Assertions.assertEquals(3, CountPigs.countPigs("pigpigpog"));
		Assertions.assertEquals(3, CountPigs.countPigs("pigpagpig"));
		Assertions.assertEquals(4, CountPigs.countPigs("pigpagpugpig"));
	}

}
