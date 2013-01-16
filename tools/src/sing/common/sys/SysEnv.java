package sing.common.sys;

import java.util.Iterator;
import java.util.Map;
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
//		System.out.println(keySet);
//		System.out.println(System.getProperties());
	}

}
