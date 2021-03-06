package algorithms.sort;

import junit.framework.TestCase;

/**
 * Static implementation of the shell sort algorithm
 *
 * @author AtharvaKamble
 * @see <a href="https://www.geeksforgeeks.org/shellsort/">Shell Sort (GeeksforGeeks)</a>
 * @see <a href="http://www.asciitable.com/">ASCII Table for reference</a>
 */
public class ShellSortTest extends TestCase {

  public void testShellSortShort() {
    Short[] array = new Short[]{3, 2, 5, 4, 1};

    ShellSort.shellSort(array);

    for (int i = 0; i < 5; i++) {
      assertEquals(i + 1, (short) array[i]);
    }
  }

  public void testShellSortString() {
    String[] array = new String[]{"e", "d", "c", "b", "a"};

    ShellSort.shellSort(array);

    int asciiIndex = 97;
    for (int i = 0; i < 5; i++) {
      assertEquals(asciiIndex++, (int) array[i].charAt(0));
    }
  }

  public void testShellSortEmpty() {
    Short[] array = new Short[]{};

    ShellSort.shellSort(array);

    assertEquals(array.length, 0);
  }

  public void testShellSortOneElement() {
    Short[] array = new Short[]{1};

    ShellSort.shellSort(array);

    assertEquals(1, (short) array[0]);
  }

  public void testShellSortTwoElement() {
    Short[] array = new Short[]{2, 1};

    ShellSort.shellSort(array);

    assertEquals(1, (short) array[0]);
  }

  public void testShellSortTwoElementSorted() {
    Short[] array = new Short[]{1, 2};

    ShellSort.shellSort(array);

    assertEquals(1, (short) array[0]);
  }

}
