package APIActivities


class Activity1b {
	static main (args) {
		File  file = new File ("src/input.txt")
		file.createNewFile()
		def inputtext="A quick brown Fox jumped over the lazy Cow\nJohn Jimbo jingeled happily ever after\nTh1\$ 1\$ v3ry c0nfus1ng"
		file.write(inputtext)
		//Print the line that has Cow at the end of the line
		
		file.eachLine { line ->
			if(line ==~ /.*Cow$/) {
				println "line ending with cow -- $line"
			}
		}
		file.eachLine { line ->
			if(line ==~ /^J.*/) {
				println "line starting with capital J -- $line"
			}
		}
		
		//Print the line that has two numbers one after the other
		
		file.eachLine { line ->
			if(line ==~ /.*\d\d.*/) {
				println "line starting with capital J -- $line"
			}
		}
		
		//Print the string(s) that match the pattern '\S+er'
		
		def newstr = file.getText() =~ /\S+er/		
		println "New str -- ${newstr.findAll()}"
		
		//Print the string(s) that match the pattern '\S*\d\W'
		def newstr2 = file.getText() =~ /\S*\d\W/
		
		println "New str -- ${newstr2.findAll()}"
			

		
	}
}
