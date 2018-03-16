package other;

import org.apache.commons.lang3.StringUtils;

/**
 * @author xuwenjin
 *
 * 为了线程安全
 */
public class TestThreadLocal {
	
	@SuppressWarnings("rawtypes")
	private ThreadLocal processHolder = new ThreadLocal();
	
	public static void main(String[] args) {
		TestThreadLocal test = new TestThreadLocal();
		System.out.println(test.getName());
	}
	
	public String getName(){
		String xwj = (String) processHolder.get();
		if(StringUtils.isEmpty(xwj)){
			xwj = "xuwenjin";
			processHolder.set(xwj);
		}
		return xwj;
	}

}
