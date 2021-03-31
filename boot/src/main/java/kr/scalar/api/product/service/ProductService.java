package kr.scalar.api.product.service;

import kr.scalar.api.product.domain.Product;

import java.util.List;


public interface ProductService {
	public List<Product> findByPrdNo(long prdNo);
	public List<Product> findByCtgName(String ctgName);
	public String deleteById(long prdNo);
//	public long update(String prdName, String ctgName, String prdPrice, String prdInv, String prdImg, long prdNo);
}