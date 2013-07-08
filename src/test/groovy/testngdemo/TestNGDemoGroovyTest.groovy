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

import org.testng.annotations.Test

class TestNGDemoGroovyTest
{

    @Test
    // NG !! def xxx() => public Object xxx(), so, TestNG can't recognize it!! :(
    // def TestNGFromGroovy() {
    void TestNGFromGroovy() {
        println '>>> TestNG From Groovy!!'
        def list = [100, 200, 300]
        assertEquals(list.size(), 3)
    }

}
