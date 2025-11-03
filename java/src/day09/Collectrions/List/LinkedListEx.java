//package day09.Collectrions.List;
//
//import java.util.LinkedList;
//
//import lombok.Builder;
//import lombok.Data;
//
//public class LinkedListEx {
//
//@Data
//@Builder
//	class Product{
//		String name;
//		int price;
//		int count;
//	}
//	
//	public static void main(String[] args) {
//		/*
//		 * LinkedList 생성 -상품 목록
//		 */
//		LinkedList<Product> Products = new LinkedList<>();
//		Product product1 = new Product.ProductBuilder()
//									  .name("기계식 키보드")
//									  .price(50000)
//									  .count(10)
//									  .build();
//		
//		Product product2 = new Product.ProductBuilder()
//									  .name("무선 마우스")
//									  .price(30000)
//									  .count(20)
//									  .build();
//		
//		Product product3 = new Product.ProductBuilder()
//									  .name("미니 손난로")
//									  .price(10000)
//									  .count(40)
//									  .build();
//		Products.add(product1);
//		Products.add(product2);
//		Products.add(product3);
//		
//		Product firstProduct = Products.getFirst();
//		Product lastProduct = Products.getLast();
//		System.out.println("첫 번째 상품 : "+firstProduct);
//		System.out.println("두 번째 상품 : "+lastProduct);
//		
//		Products.removeFirst();
//		Products.removeLast();
//		
//		Products.addFirst(new Product("모니터",200000,10));
//		Products.addLast(new Product("컴퓨터",1200000,15));
//		System.out.println(Products);
//		
//		System.out.println("상품 개수 : "+products.size());
//		
//		products.clear();
//		System.out.println(":::::: 상품 목록 :::::");
//		System.out.println(products);
//	}
//}
