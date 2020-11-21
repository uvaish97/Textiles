package org.tex;

public class SaravanaStores extends Pothys {
	@Override
	public void shirt() {
	// TODO Auto-generated method stub
	System.out.println("Rs.400");
	}
	@Override
	public void jeans() {
	// TODO Auto-generated method stub
	System.out.println("Rs.1000");
	}
	@Override
	public void track() {
	// TODO Auto-generated method stub
	System.out.println("Rs.300");
	}
	public static void main(String[] args) {
		SaravanaStores s = new SaravanaStores();
				s.shirt();
				s.jeans();
				s.track();
				s.saree();
	}
}
