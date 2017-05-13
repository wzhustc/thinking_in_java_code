package thinking_chapter7.innerclass;

/**
 * 
 * 本程序展示了：
 * 1、匿名内部类，每次创建都是new Contents(),而不需要类名
 * 2、匿名内部类的特点就是在new一个类时候，在这个new的肚子里一大段代码。这段代码表示通过匿名内部类想做的东西
 * 3、匿名内部类想表达的如下面注释的代码一样（注释代码可看成"有名内部类"）
 * 4、con()方法和wrap()方法中的匿名内部类的区别是构造函数需不需要传参，注意区别。
 * @author v_zhangwei13
 * Create on 2017年5月13日下午3:05:37
 */
public class Parcel6 {

	public Contents con(){
		System.out.println("new Contents class behind");
		return new Contents() {
			private int i = 11;
			public int value() {
				System.out.println(i);
				return i;
			}
		};
		
		/*class myContents implements Contents {
			private int i = 11;
			@Override
			public int value() {
				return i;
			}
		}
		return new myContents();*/
	}
	
	public Wrapping wrap(int x) {
		System.out.println("new Wrapping class behind");
		return new Wrapping(x) {
			public int value() {
				System.out.println(super.value() * 10);
				return super.value() * 10;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel6 p6 = new Parcel6();
		Contents cc = p6.con();
		cc.value();
		
		//--------------------
		Parcel6 p66 = new Parcel6();
		Wrapping wp = p66.wrap(11);
		wp.value();
	}
}
