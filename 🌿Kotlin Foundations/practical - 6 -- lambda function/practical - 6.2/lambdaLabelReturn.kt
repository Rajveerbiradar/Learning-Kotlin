//You have a list of orders with IDs (1, 2, 3).

//Order #2 is defective and should trigger different behaviors in each test.

//Order #3 is high-priority and must be logged even if processing stops.
//-----------------


data class Order(val id : Int, val isDefective : Boolean, val highPriority : Boolean)

fun main() {
	val orders : List<Order> = listOf(
		Order(1, isDefective = false, highPriority = false),
		Order(2, isDefective = true, highPriority = false),
		Order(3, isDefective = false, highPriority = false),
		Order(4, isDefective = false, highPriority = true)
	);	
	val totalProcessed = OrderProcessing(orders)
	println("Total orders processed: $totalProcessed")
}

fun OrderProcessing(list : List<Order>) : Int{
	var notFoundDefective : Boolean = true
	var totalOrderProcessed : Int = 0;
	list.forEach { order -> 
		if(notFoundDefective || order.highPriority){
			run singleProcess@{
				if(order.isDefective){
					notFoundDefective = false;
					println("${order.id} is defective - stopping normal processing")
					return@singleProcess
				}
				totalOrderProcessed++
				println("${order.id} is processed")
			}
		}
	}
	return totalOrderProcessed;	
}

