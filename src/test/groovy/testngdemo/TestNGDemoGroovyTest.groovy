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

import static org.testng.Assert.*

import org.testng.annotations.AfterClass
import org.testng.annotations.AfterMethod
import org.testng.annotations.AfterSuite
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeClass
import org.testng.annotations.BeforeMethod
import org.testng.annotations.BeforeSuite
import org.testng.annotations.BeforeTest
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class TestNGDemoGroovyTest
{
    @BeforeSuite
    void beforeSuite()
    {
        println("beforeSuite() --" + Thread.currentThread())
    }
    @AfterSuite
    void afterSuite()
    {
        println("afterSuite() --" + Thread.currentThread())
    }
    @BeforeTest
    void beforeTest()
    {
        println("beforeTest() --" + Thread.currentThread())
    }
    @AfterTest
    void afterTest()
    {
        println("afterTest() --" + Thread.currentThread())
    }
    @BeforeClass
    void beforeClass()
    {
        println("beforeClass() --" + Thread.currentThread())
    }
    @AfterClass
    void afterClass()
    {
        println("afterClass() --" + Thread.currentThread())
    }
    @BeforeMethod
    void beforeMethod()
    {
        println("beforeMethod() --" + Thread.currentThread())
    }
    @AfterMethod
    void afterMethod()
    {
        println("afterMethod() --" + Thread.currentThread())
    }

    @Test
    // NG !! def xxx() => public Object xxx(), so, TestNG can't recognize it!! :(
    // def TestNGFromGroovy() {
    void TestNGFromGroovy() {
        println '>>> TestNG From Groovy!!'
        def list = [100, 200, 300]
        assertEquals(list.size(), 3)
    }

    @Test
    void TestNGWithGroovyPowerAssert()
    {
        def s1 = [1, 2, 3, 3, 4, 1, 3, 2] as Set
        def s2 = [4, 2, 1, 3] as Set
        def s3 = new HashSet([1, 3, 2, 4, 4])
        assert s1 == s2
        assert s2 == s3
        assert s3 == s1

        def l1 = [100, 200, 300]
        def l2 = [100, 200, 300]
        assert l1 == l2

        def m1 = [
            key1: 100,
            key2: [100, 200, 300],
            key3: [k1: 100, k2: 200, k3: 300],
            key4: null,
        ]
        def m2 = [
            key1: 100,
            key2: [100, 200, 300],
            key3: [k1: 100, k2: 200, k3: 300],
            key4: null,
        ]
        assert m1 == m2
    }

    @DataProvider(name="dp1")
    Object[][] dp1() {
        return [
            [1, 2, 3] as Object[],
            [4, 5, 9] as Object[],
            [6, 7, 13] as Object[],
        ] as Object[][]
    }

    int testadd(int a, int b) {
        return a + b;
    }

    @Test(dataProvider = "dp1")
    void verifyAddFunc(int a, int b, int expected) {
        assertEquals(testadd(a, b), expected);
    }

    @DataProvider(name="dp2")
    Object[][] dp2() {
        return [
            [1, 2, 3],
            [4, 5, 9],
            [6, 7, 13]
        ]
    }

    @Test(dataProvider = "dp2")
    void verifyAddFunc2(int a, int b, int expected) {
        assert testadd(a, b) == expected;
    }

    @DataProvider(name="dp3")
    Object[][] dp3() {
        return [
            ["", "", 0],
            ["a", "", 1],
            ["", "a", 1],
            ["a", "b", 2],
        ]
    }

    @Test(dataProvider = "dp3")
    void dataproviderSample3(String a, String b, int expected) {
        assert (a + b).length() == expected
    }
}
