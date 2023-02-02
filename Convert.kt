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
	
		var sourceUnit = readLine()!!.toInt()
	}
}
