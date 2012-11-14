package ti1.past;

import java.util.ArrayList;
import java.util.HashMap;

import rice.p2p.commonapi.NodeHandle;
import rice.pastry.PastryNode;

public class PrettyName {

	HashMap<NodeHandle, String> name;
	long count;
	
	public PrettyName(){
		this.count = 0;
		this.name = new HashMap<NodeHandle, String>();
	}

	public HashMap<NodeHandle, String> getName() {
		return name;
	}

	public long getCount() {
		return count;
	}
	
	public void insertNewNode(NodeHandle node){
		this.count++;
		String name = "N"+getCount();
		this.name.put(node, name);
	}
	
	public String getNodeName(NodeHandle node){
		return this.name.get((NodeHandle) node);
	}
	
}
