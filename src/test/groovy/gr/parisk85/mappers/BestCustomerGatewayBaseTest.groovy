package gr.parisk85.mappers

import spock.lang.Specification

abstract class BestCustomerGatewayBaseTest extends Specification {

    def restClient = Mock(BestBuyersRestClient)

    abstract def sut()

    def 'should find top 1'() {
        given:
        restClient.top1() >> top(1)
        when:
        def result = sut().findTop1()
        then:
        result.id == 'id 1'
        result.name == 'label 1'
    }

    def 'should find top 2'() {
        given:
        restClient.top2() >> [top(1), top(2)]
        when:
        def result = sut().findTop2()
        then:
        result.id == ['id 1', 'id 2']
        result.name == ['label 1', 'label 2']
    }

    def top(order) {
        Buyer.builder().id("id $order").label("label $order").build();
    }
}
