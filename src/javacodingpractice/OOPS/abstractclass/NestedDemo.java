package javacodingpractice.OOPS.abstractclass;

import javacodingpractice.OOPS.abstractclass.OuterBChild.InnerE;

public class NestedDemo {
	public static void main(String[] args) {
		// instantiate outer class
		OuterBChild outer = new OuterBChild();
		OuterBChild.InnerE inner= outer.new InnerE();
		inner.OuterCMethod();
	}

	
}
