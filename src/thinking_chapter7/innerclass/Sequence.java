package thinking_chapter7.innerclass;

/**
 * 
 * 本程序说明内部类链接到外部类是通过在内部类中持有一个外部类成员的引用。
 * 在SubSelector类中，继承自Selector类的方法中，都使用了o引用，但是o是外部类Sequence的一个数组引用。
 * 得出结论：内部类通过外部类的成员引用来访问外部类
 * 下面是Thinking in Java的原话：
 * 内部类必须拥有对封装类的特定对象的一个引用，而封装类的作用就是创建这个内部类。
 * 随后，当我们引用封装类的一个成员时，就利用那个（隐藏）的引用来选择那个成员
 * @author v_zhangwei13
 * Create on 2017年5月13日下午4:56:53
 */
public class Sequence {
    private Object[] o;
    private int next = 0;
    public Sequence(int size) {
		o = new Object[size];
	}
    
    public void add(Object x) {
    	if (next < o.length) {
    		o[next] = x;
    		next++;
    	}
    }
    
    private class SubSelector implements Selector {
    	int i = 0;
    	@Override
    	public boolean end() {
    		return i == o.length;
    	}

    	@Override
    	public Object current() {
    		return o[i];
    	}

    	@Override
    	public void next() {
    		if (i < o.length) {
    			i++;
    		}
    	}
    }
    
    public Selector getSelector() {
		return new SubSelector();
	}
    
    public static void main(String[] args) {
		Sequence s = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			s.add(Integer.toString(i));
		}
		Selector s1 = s.getSelector();
		while (!s1.end()) {
			System.out.println(s1.current());
			s1.next();
		}
	}
}

interface Selector {
	boolean end();
	Object current();
	void next();
}

