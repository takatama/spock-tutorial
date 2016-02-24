package spock_tutorial

import spock.lang.Specification

class MyFirstSpecification extends Specification {
    def "pushing an element on the stack"() {
        setup:
        def stack = new Stack()
        def elem = "push me"

        when:
        stack.push(elem)

        then:
        !stack.empty
        stack.size() == 2
        stack.peek() == elem
    }
}
