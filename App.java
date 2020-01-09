package DFS._01;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		PointNode node1 = new PointNode("1");
		PointNode node2 = new PointNode("2");
		PointNode node3 = new PointNode("3");
		PointNode node4 = new PointNode("4");
		PointNode node5 = new PointNode("5");
		
		List<PointNode> list = new ArrayList<PointNode>();
		
		node1.addNeighbour(node2);
		node1.addNeighbour(node3);
		node3.addNeighbour(node4);
		node4.addNeighbour(node5);
		
		list.add(node1);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		list.add(node5);
		
		DFS dfs = new DFS();
		dfs.dfs(list);
	}
}
