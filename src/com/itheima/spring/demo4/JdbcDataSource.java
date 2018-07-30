package com.itheima.spring.demo4;

/**
 * DI依赖注入之setter注入
 * @author 隔壁老王
 *
 */
public class JdbcDataSource {
	
	private String driver;
	private String url;
	private String username;
	private String passeord;
	public void setDriver(String driver) {
		//注册数据库驱动
		try {
			Class.forName(driver);
			this.driver = driver;
		} catch (Exception e) {
			throw new RuntimeException();
		}
		
	}
	public void setUrl(String url) {
		this.url = url;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public void setPasseord(String passeord) {
		this.passeord = passeord;
	}
	@Override
	public String toString() {
		return "JdbcDataSource [driver=" + driver + ", url=" + url + ", username=" + username + ", passeord=" + passeord
				+ "]";
	}


	
}
