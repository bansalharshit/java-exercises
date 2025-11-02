package javacodingpractice.OOPS.abstractclass;

public class OuterBChild extends OuterB {
	public class InnerE extends OuterC{
		@Override
		public void OuterCMethod()
		{
			System.out.println("Outer C Class Method is Called from the Inner E Class");
		}
	}

}
