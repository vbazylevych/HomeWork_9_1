package com.goit.javaonline3.musicshop.test;

import com.goit.javaonline3.musicshop.Caesar;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class CaesarTest {

    @Test
    public void testEncrypt() throws Exception {
        assertEquals("def # abc", Caesar.encrypt("abc # ЭЮЯ").toString());
    }

    @Test
    public void testDecrypt() throws Exception {
        assertEquals("abc # ЭЮЯ", Caesar.decrypt("def # abc").toString());
    }
}