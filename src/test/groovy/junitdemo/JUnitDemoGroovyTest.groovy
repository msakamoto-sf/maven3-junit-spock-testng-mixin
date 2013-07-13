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
package junitdemo

import static org.junit.Assert.*

import org.junit.Test

class JUnitDemoGroovyTest
{

    @Test
    void JUnitAssertion()
    {
        def expected = 3
        def actual = 1 + 2
        assertEquals(expected, actual)
    }

    @Test
    void JUnitWithGroovyPowerAssert()
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
}
