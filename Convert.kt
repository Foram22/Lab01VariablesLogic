// Foramben Jayeshkumar Patel
// Student ID:-  A00272251
// Mobile Application Development (January 2023)

fun main() {

	// try{...}catch{...} for exception handling
	try{
	
		// Get value from user
		print("\nEnter a number that you want to convert it in a different unit: ")
		val enteredNumber: Double = readLine()!!.toDouble()
		
		// Source unit selection from user
		println("\n1 -> Second\n2 -> Minute\n3 -> Hour\n4 -> Day\n5 -> Week\n6 -> Month")
		println("Example:- For 'Second' enter '1' ")
		print("Please select any source measurent unit: ")
	
		val sourceUnit = readLine()!!.toInt()
		
		when(sourceUnit){
		
			// 'Second' to other units
			(1) -> {
				val destUnits = listOf("Minute", "Hour", "Day", "Week", "Month", "Year")
				val destNum = getDestinationUnit(destUnits)
				val conversionValues = listOf(0.01667, 0.000278, 0.00001157, 0.00000165, 0.00000038, 0.00000003)
				showResult("Second", destUnits[destNum-1], enteredNumber, enteredNumber * conversionValues[destNum-1])
			}
			
			// 'Minute' to other units
			(2) -> {
				val destUnits = listOf("Second", "Hour", "Day", "Week", "Month", "Year")
				val destNum = getDestinationUnit(destUnits)
				val conversionValues = listOf(60.0, 0.01667, 0.0006944, 0.0009921, 0.00002283, 0.0000019)
				showResult("Minute", destUnits[destNum-1], enteredNumber, enteredNumber * conversionValues[destNum-1])
			}
			
			// 'Hour' to other units
			(3) -> {
				val destUnits = listOf("Second", "Minute", "Day", "Week", "Month", "Year")
				val destNum = getDestinationUnit(destUnits)
				val conversionValues = listOf(3600.0, 60.0, 0.041667, 0.005952, 0.001369, 0.0001141)
				showResult("Hour", destUnits[destNum-1], enteredNumber, enteredNumber * conversionValues[destNum-1])
			}
			
			// 'Day' to other units
			(4) -> {
				val destUnits = listOf("Second", "Minute", "Hour", "Week", "Month", "Year")
				val destNum = getDestinationUnit(destUnits)
				val conversionValues = listOf(86400.0, 1440.0, 24.0, 0.142857, 0.328763, 0.002739)
				showResult("Day", destUnits[destNum-1], enteredNumber, enteredNumber * conversionValues[destNum-1])
			}
			
			// 'Week' to other units
			(5) -> {
				val destUnits = listOf("Second", "Minute", "Hour", "Day", "Month", "Year")
				val destNum = getDestinationUnit(destUnits)
				val conversionValues = listOf(604800.0, 10080.0, 168.0, 7.0, 0.23014, 0.019178)
				showResult("Week", destUnits[destNum-1], enteredNumber, enteredNumber * conversionValues[destNum-1])
			}
			
			// 'Month' to other units
			(6) -> {
				val destUnits = listOf("Second", "Minute", "Hour", "Day", "Week", "Year")
				val destNum = getDestinationUnit(destUnits)
				val conversionValues = listOf(2629746.0, 43800.0, 730.0, 30.417, 4.345, 0.0833)
				showResult("Month", destUnits[destNum-1], enteredNumber, enteredNumber * conversionValues[destNum-1])
			}
			else -> {
				print("\nPlease select any measurement unit")
			}
		}
	} catch(e: Exception){
		println(e)
	}
}

fun getDestinationUnit(units: List<String>): Int {
	println()
	for (index in units.indices){
		println("${index+1} -> ${units[index]}")
	}
	
	// Get destination unit from user
	print("Please select any destination measurent unit: ")
	val destUnit = readLine()!!.toInt()
	
	return destUnit			// return selected destination unit 
}

fun showResult(sourceUnit: String, destUnit: String, number: Double, result: Double){
	println("\n$number $sourceUnit = $result $destUnit")
}