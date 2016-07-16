package com.goit.javaonline3.musicshop.test;

import com.goit.javaonline3.musicshop.Caesar;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class CaesarTest {
    Caesar caesar = new Caesar();

    @Test
    public void testEncript() throws Exception {
        assertEquals("def # abc", caesar.encript("abc # ЭЮЯ").toString());
    }

    @Test
    public void testDecrypt() throws Exception {
        assertEquals("abc # ЭЮЯ", caesar.decrypt("def # abc").toString());
    }
}