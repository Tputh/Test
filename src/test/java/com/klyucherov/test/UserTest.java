

package com.klyucherov.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
    private User user;




    @Test
    public void testingConstructor() {
        user = new User("test","@.");
        Assertions.assertEquals(user.getEmail(), "@.");
        Assertions.assertEquals(user.getLogin(), "test");
    }

    @Test
    public void testingNulParameters() {
        user = new User();
        Assertions.assertNull(user.getLogin());
        Assertions.assertNull(user.getEmail());
    }

    @Test
    public void testingEmail() {
        Assertions.assertThrows(RuntimeException.class, () -> user.checkEmail("test"));
    }

    @Test
    public void testingСompare() {
        user = new User("test","@.");
        Assertions.assertNotEquals(user.getEmail(), user.getLogin());
    }


}
