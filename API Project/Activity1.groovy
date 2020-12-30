package APIActivities

class Activity1 {
	static main (args) {
	def mixarray = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
	
	def intarray = mixarray.minus(["Mango", "Apple", "Watermelon"])
	def strarray = mixarray.minus([11, 2, 19, 5])
	
	println intarray.sort()
	println strarray.sort()
		}
}
