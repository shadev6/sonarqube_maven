/**
 *
 */
package com.sddevops.sonarqube_maven.eclipse;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

/**
 * @author keyongenesis - Republic Polytechnic
 *
 */
public class SongCollectionTest {

	//if you want to run once per class - > like creating a database connection or start up of server then you might want to annotate with at before all

	/**
	 * @throws java.lang.Exception
	 */

	// Before each means - the method will run before and after every test case
	// this runs before every each test case!
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#SongCollection()}.
	 */
	@Test
	public void testSongCollection() {
		// fail("Not yet implemented");
	    System.out.println("@Test: testSongCollection");
	    assertTrue(true);  // try true and false

	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#SongCollection(int)}.
	 */
	@Test
	public void testSongCollectionInt() {
		// fail("Not yet implemented");
	    System.out.println("@Test: testSongCollectionInt");
	    assertTrue(true);  // try true and false
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#getSongs()}.
	 */
	@Test
	public void testGetSongs(){
		 assertTrue(true);  // try true and false
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#addSong(com.sddevops.junit_maven.eclipse.Song)}.
	 */
	@Test
	public void testAddSong() {
		 assertTrue(true);  // try true and false
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#sortSongsByTitle()}.
	 */
	@Test
	public void testSortSongsByTitle() {
		 assertTrue(true);  // try true and false
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#sortSongsBySongLength()}.
	 */
	@Test
	public void testSortSongsBySongLength() {
		 assertTrue(true);  // try true and false
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#findSongsById(java.lang.String)}.
	 */
	@Test
	public void testFindSongsById() {
		 assertTrue(true);  // try true and false
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#findSongByTitle(java.lang.String)}.
	 */
	@Test
	public void testFindSongByTitle() {
		 assertTrue(true);  // try true and false
	}

}
