import java.util.ArrayList;
import java.util.List;

public class Tree {

    public Integer data = null;
    public List<Tree> subTrees = null;

    public Tree(Integer data){
        super();
        this.data = data;
        subTrees = new ArrayList<Tree>();
    } 

}
