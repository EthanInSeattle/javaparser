package com.github.javaparser;

import com.github.javaparser.TokenTypes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenTypesTest {
    @Test
    void eolTokenKindUnix() {
        System.setProperty("line.separator", "\n");
        assertEquals(3, TokenTypes.eolTokenKind());
    }

   @Test
   void eolTokenKindWindows() {
     System.setProperty("line.separator", "\r\n");
     assertEquals(2, TokenTypes.eolTokenKind());
  }

   @Test
   void eolTokenKindOldMac() {
     System.setProperty("line.separator", "\r");
     assertEquals(4, TokenTypes.eolTokenKind());
  }
}
