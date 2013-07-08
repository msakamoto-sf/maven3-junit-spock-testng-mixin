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
package spockdemo.test

class SpockBasicTest extends spock.lang.Specification
{

    def "Spock class name suffix is 'Test'."()
    {
        setup:
        def str = 'Spock class name suffix is'

        when:
        str += ' "Test".'

        then:
        str == 'Spock class name suffix is "Test".'

        cleanup:
        println str
    }
}
