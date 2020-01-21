package com.lucasjwilber.songr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test void contextLoads() {
	}

	@Test public void album_testConstructor() {
		Album testAlbum = new Album("NOW! 80s", "Stevie Wonder", 50, 300, "realURL.com");
		assertEquals("NOW! 80s", testAlbum.title);
		assertEquals("Stevie Wonder", testAlbum.artist);
		assertEquals(50, testAlbum.songCount);
		assertEquals(300, testAlbum.length);
		assertEquals("realURL.com", testAlbum.imageURL);
	}

}
