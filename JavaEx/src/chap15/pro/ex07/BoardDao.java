package chap15.pro.ex07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> list = new ArrayList<Board>();

	public List<Board> getBoardList() {
		list.add(new Board("力格1", "郴侩1"));
		list.add(new Board("力格2", "郴侩2"));
		list.add(new Board("力格3", "郴侩3"));
		return list;
	}
}
