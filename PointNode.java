package DFS._01;

import java.util.ArrayList;
import java.util.List;

public class PointNode {
	private String name;
	private boolean isVisited;
	private List<PointNode> neigbourList;

	public PointNode(String name) {
		this.name = name;
		this.neigbourList = new ArrayList<PointNode>();
	}

	public void insertNeighbour(PointNode node) {
		this.neigbourList.add(node);
	}

	public List<PointNode> getNeigbourList() {
		return neigbourList;
	}

	public void setNeigbourList(List<PointNode> neigbourList) {
		this.neigbourList = neigbourList;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PointNode [name=" + name + "]";
	}
	
	public void addNeighbour(PointNode neighbour) {
		this.neigbourList.add(neighbour);
	}
}
