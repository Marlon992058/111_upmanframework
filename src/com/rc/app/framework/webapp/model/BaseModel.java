package com.rc.app.framework.webapp.model;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.rc.app.framework.webapp.model.page.PageInfo;

/**
 * 
 * @author wind
 * @version 1.0.0.1  2008-12-15
 */

public class BaseModel implements Serializable {
	private static final long serialVersionUID = -5337484404562836810L;
	PageInfo pageInfo = new PageInfo(1,20,5);
	//系统上下文
	String context;
	String nowDate;
	String page;
	//提示信息
	String result;
	//根目录真实路径
	String realPath;
	
	//是否使用session的model对象
    private String useSession;
    
	public PageInfo getPageInfo(){
		return pageInfo;
	}
	
	public void setPageInfo(PageInfo pageInfo){
		this.pageInfo = pageInfo;
	}
	
	public String getContext(){
		return context;
	}
	
	public void setContext(String context){
		this.context = context;
	}
	
	public String getPage(){
		return page;
	}
	
	public void setPage(String page){
		this.page = page;
	}
	
	public String getResult(){
		return result;
	}

	public void setResult(String result){
		this.result = result;
	}
	
	//ACTION跳转信息提示
	public void setRedirectResult(String result){
		try{
			this.result = URLEncoder.encode(result,"UTF-8");
		}catch (UnsupportedEncodingException e){
			this.result = result;
		}
	}
	
	public String getRealPath(){
		return realPath;
	}
	
	public void setRealPath(String realPath){
		this.realPath = realPath;
	}
	
	public void setNowDate(String nowDate){
		this.nowDate = nowDate;
	}
	
	public String getUseSession(){
		return useSession;
	}
	
	public void setUseSession(String useSession){
		this.useSession = useSession;
	}
}