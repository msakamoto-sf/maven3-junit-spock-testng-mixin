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
package spockdemo.spec

class SpockBasicSpec extends spock.lang.Specification {

    def setup() { println 'fixture method(setup)' }
    def cleanup() { println 'fixture method(cleanup)' }
    def setupSpec() { println 'fixture method(setupSpec)' }
    def cleanupSpec() { println 'fixture method(cleanupSpec)' }

    def "Spock's basic1"()
    {
        setup:
        def map = [:]
        map['abc'] = 100

        when:
        map['def'] = 200

        then:
        match_helper1(map)

        cleanup:
        map.clear()
        println 'cleanupped.'
    }

    def "Spock's basic2"()
    {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }

    void match_helper1(map)
    {
        assert map['abc'] + map['def'] == 300
    }
}
