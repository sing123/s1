package sing.common.sys;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SysEnv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> getenv = System.getenv();
		Set<String> keySet = getenv.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String next = it.next();
			System.out.println(next+":"+getenv.get(next));
		}
		
		System.out.println("------------------------"+isX64BitSys());
		
		Properties properties = System.getProperties();
		Set<Object> keySet2 = properties.keySet();
		Iterator<Object> it2 = keySet2.iterator();
		while(it2.hasNext()){
			String next = it2.next()+"";
			System.out.println(next+":"+properties.getProperty(next));
		}
//		System.out.println(keySet);
//		System.out.println(System.getProperties());
	}
	
	public static boolean isX64BitSys(){
		boolean rtnValue = false;
		if("64".equals(System.getProperty("sun.arch.data.model"))){
			rtnValue = true;
		}
		return rtnValue;
	}

}
