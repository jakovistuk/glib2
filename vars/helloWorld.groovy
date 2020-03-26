#!/usr/bin/env groovy
import com.mpsi.Test2
import java.util.List
import java.util.ArrayList
def call(){
	println 'HELLO WORLD 1...'
	//Test2.DisplayName().call()
	Test2.test1()
	println 'HELLO WORLD 2...'
	
	println Test2.test2()

	List<Integer> stringList = new ArrayList<>();
	stringList.add(1)
	stringList.add(2)
	stringList.add(3)
	stringList.add(4)
	stringList.add(5)

	println stringList.countBy { it % 2 }


}
