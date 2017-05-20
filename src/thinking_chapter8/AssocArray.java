package thinking_chapter8;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Vector;

public class AssocArray extends Dictionary<Object, Object> {

	private Vector<Object> keys = new Vector<Object>();
	private Vector<Object> values = new Vector<Object>();

	@Override
	public int size() {
		return keys.size();
	}

	@Override
	public boolean isEmpty() {
		return keys.isEmpty();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Enumeration keys() {
		return keys.elements();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Enumeration elements() {
		return values.elements();
	}

	// remove的时候一定是key和value都一起remove掉
	@Override
	public Object remove(Object key) {
		int index = keys.indexOf(keys);
		if (index == -1) {
			return null;
		}
		// 先删除key
		keys.removeElementAt(index);
		// 用于返回当前的key对应的value
		Object keyValue = values.elementAt(index);
		// 再删除value
		values.removeElementAt(index);
		return keyValue;
	}

	@Override
	public Object put(Object key, Object value) {
		keys.addElement(key);
		values.addElement(value);
		return key;
	}

	@Override
	public Object get(Object key) {
		int index = keys.indexOf(key);
		if (index == -1) {
			return null;
		}
		return values.elementAt(index);
	}
}
