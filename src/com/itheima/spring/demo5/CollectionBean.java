package com.itheima.spring.demo5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * �������Ե�ע��
 * @author ��������
 * @param <E>
 * @param <V>
 *
 */
public class CollectionBean<E, V> {
	private String[] arrs;
	private List<E> list;
	private Set<E> set;
	private Map<E,V> map;
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	public void setList(List<E> list) {
		this.list = list;
	}
	
	public void setSet(Set<E> set) {
		this.set = set;
	}
	public void setMap(Map<E,V> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "CollectionBean [arrs=" + Arrays.toString(arrs) + ", list=" + list + ", set=" + set + ", map=" + map
				+ "]";
	}
	
	

	
	
}
