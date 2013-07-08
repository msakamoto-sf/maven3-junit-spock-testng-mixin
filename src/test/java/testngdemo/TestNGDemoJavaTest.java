/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package testngdemo;

import static org.testng.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemoJavaTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println(Thread.currentThread() + " - beforeSuite()");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println(Thread.currentThread() + " - afterSuite()");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println(Thread.currentThread() + " - beforeTest()");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(Thread.currentThread() + " - afterTest()");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(Thread.currentThread() + " - beforeClass()");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(Thread.currentThread() + " - afterClass()");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println(Thread.currentThread() + " - beforeMethod()");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println(Thread.currentThread() + " - afterMethod()");
    }

    @DataProvider(name = "dp1")
    public Object[][] dp1() {
        return new Object[][] { { 1, 2, 3 }, { 4, 5, 9 }, { 6, 7, 13 } };
    }

    int testadd(int a, int b) {
        return a + b;
    }

    @Test(dataProvider = "dp1")
    public void verifyAddFunc(int a, int b, int expected) {
        assertEquals(expected, testadd(a, b));
    }

    List<String> mylist = Arrays.asList("123", "456");

    @Test
    public void listLength1() {
        mylist = Arrays.asList("abc", "def", "ghi");
        System.out.println(mylist);
        assertEquals(3, mylist.size());
    }

    @Test
    public void listLenngth2() {
        System.out.println(mylist);
        assertEquals(3, mylist.size());
    }

}
