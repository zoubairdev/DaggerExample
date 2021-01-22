package com.example.daggerexample;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleDaggerTest {

    @Test
    public void givenGeneratedComponent__whenBuildingPhone__thenDependenciesInjected() {
        PhoneComponent component = DaggerPhoneComponent.create();

        Phone phoneOne = component.buildPhone();
        Phone phoneTwo = component.buildPhone();

        Assert.assertNotNull(phoneOne);
        Assert.assertNotNull(phoneTwo);
        Assert.assertNotNull(phoneOne.getColor());
        Assert.assertNotNull(phoneOne.getDimension());
        Assert.assertNotNull(phoneTwo.getColor());
        Assert.assertNotNull(phoneTwo.getDimension());
        Assert.assertNotEquals(phoneOne.getColor(), phoneTwo.getColor());
        Assert.assertEquals(phoneOne.getDimension(), phoneTwo.getDimension());
    }
}