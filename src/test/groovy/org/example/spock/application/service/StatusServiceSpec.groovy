package org.example.spock.application.service

import spock.lang.*
import org.example.spock.domain.model.ObjectEqualsTest
import org.example.spock.domain.model.ObjectListEqualsTest

class StatusServiceSpec extends Specification {

    StatusService service

    def "文字列が大文字に変換される"() {
        given:
        def expected = ObjectListEqualsTest.of(
                100, 100, 100, 100, 100, 100,
                List.of(
                        ObjectEqualsTest.of(100, 100, 100, 100, 100, 100),
                        ObjectEqualsTest.of(200, 100, 100, 100, 100, 100),
                        ObjectEqualsTest.of(300, 100, 100, 100, 100, 100),

                )
        )
        def result = ObjectListEqualsTest.of(
                100, 100, 100, 100, 100, 100,
                List.of(
                        ObjectEqualsTest.of(100, 100, 100, 100, 100, 100),
                        ObjectEqualsTest.of(100, 100, 100, 100, 100, 100),
                        ObjectEqualsTest.of(100, 100, 100, 100, 100, 100),

                )
        )
        expect:
//        expected == result
        expected.getList() == result.getList()
    }
}
