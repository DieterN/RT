package logic;

import java.util.ArrayList;
import java.util.List;

public class ExternalAxis {

	private List<Double> extax = new ArrayList<Double>();

	public ExternalAxis(List<Double> extax) {
		super();
		this.extax = extax;
	}

	public List<Double> getRobconf() {
		return extax;
	}

	public void setRobconf(List<Double> extax) {
		this.extax = extax;
	}
		
}
