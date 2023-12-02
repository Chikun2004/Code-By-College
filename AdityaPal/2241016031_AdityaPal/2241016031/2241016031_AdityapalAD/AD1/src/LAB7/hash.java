package LAB7;

import java.util.HashMap;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(10,"I");
        hm.put(20,"love");
        hm.put(30,"ITER");
        System.out.println("INDIVIDUAL MAPPING ARE:" + hm);
        System.out.println("THE VALUE :"+hm.get(20));
        System.out.println("Is the value ITER Present?"+hm.containsValue("ITER"));
        System.out.println("Is the key love Present?"+hm.containsKey(20));
	}
}
