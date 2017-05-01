package thinking_chapter2;

/**
 * 1、给对象的属性赋值
 * 2、给对象包含的对象属性赋值
 * @author v_zhangwei13
 *
 */
public class DataOnly {
	
	Helper helper;
	
	public DataOnly(Helper helper) {
	    this.helper = helper;
	}
	
	public static void main(String[] args) {
		Helper helper = new Helper();
		helper.i = 47;
		helper.f = 1.1f;
		helper.b = true;
		
		System.out.println(helper.i);
		System.out.println(helper.f);
		System.out.println(helper.b);
		
		DataOnly data = new DataOnly(helper);
		helper.i = 33;
		System.out.println("修改data对象中包含的helper对象的属性i的值：" + data.helper.i);
	}
}

class Helper {
	int i;
	float f;
	boolean b;
}
