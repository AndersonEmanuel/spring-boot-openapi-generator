package br.com.andersonemanuel.app.demo.api

import br.com.andersonemanuel.app.demo.model.Order
import org.springframework.stereotype.Service

@Service
class StoreApiServiceImpl : StoreApiService {

    override fun deleteOrder(orderId: Long) {
        TODO("Not yet implemented")
    }

    override fun getInventory(): Map<String, Int> {
        TODO("Not yet implemented")
    }

    override fun getOrderById(orderId: Long): Order {
        TODO("Not yet implemented")
    }

    override fun placeOrder(order: Order?): Order {
        TODO("Not yet implemented")
    }

}