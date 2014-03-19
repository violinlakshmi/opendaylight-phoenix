#set( $symbol_pound = '#' )

package ${package};
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class SimpleData {
	@XmlElement
	private String foo;
	@XmlElement
	private int bar;

	public String getFoo() {
		return foo;
	}
	public int getBar() {
		return bar;
	}
	public SimpleData() {
		super();
	}
	public SimpleData(String foo, int bar) {
		super();
		this.foo = foo;
		this.bar = bar;
	}
}
