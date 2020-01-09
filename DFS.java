package DFS._01;

import java.util.List;
import java.util.Stack;

public class DFS {
	private Stack<PointNode> stack;
	
	public DFS() {
		this.stack = new Stack<PointNode>();
	}
	
	public void dfs(List<PointNode> list) {
		for (PointNode pointNode : list) {
			if(!pointNode.isVisited())
			{
				pointNode.setVisited(true);
				//dfsWithStack(pointNode);
				dfsWithRecursive(pointNode);
			}
		}
	}
	
	public void dfsWithStack(PointNode root) {
		this.stack.add(root);
		root.setVisited(true);
		
		while (!stack.isEmpty()) {
			PointNode point = this.stack.pop();
			System.out.println(point + " ");
			for (PointNode pointNode : point.getNeigbourList()) {
				if(!pointNode.isVisited()) {
					pointNode.setVisited(true);
					this.stack.push(pointNode);
				}
			}
		}
	}
	
	public void dfsWithRecursive(PointNode point) {
		System.out.println(point + " ");
		for (PointNode pointNode : point.getNeigbourList()) {
			if(!pointNode.isVisited()) {
				pointNode.setVisited(true);
				dfsWithRecursive(pointNode);
			}
		}
	}
}
