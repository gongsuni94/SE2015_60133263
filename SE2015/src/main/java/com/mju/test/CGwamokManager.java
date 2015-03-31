package com.mju.test;

public class CGwamokManager {
	private DAO dao;
	
	public DAO getDao() {return dao;}
	public void setDao(DAO dao) {this.dao = dao;}
	
	public void gaeseol(EGwamok gwamok) {
		dao.write(gwamok);
	}
} 
