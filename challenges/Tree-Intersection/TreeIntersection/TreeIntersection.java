package TreeIntersection;
import tree.BinarySearchTree;

import tree.Node;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public
class TreeIntersection {

    public static Integer[] tree_intersection(BinarySearchTree tree1, BinarySearchTree tree2){

        Set<Integer> tree1Values=new HashSet<>();
        Set<Integer> tree2Values=new HashSet<>();
        Set<Integer> intersectedValues=new HashSet<>();

        if(tree1.getRoot()==null ||tree2.getRoot()==null){
            return new Integer[]{};
        }

        loopOver(tree1.getRoot(),tree1Values);
        loopOver(tree2.getRoot(),tree2Values);

        for (Integer value:tree2Values) {
            if (tree1Values.contains(value)){
                intersectedValues.add(value);
            }
        }
        return  intersectedValues.stream().toArray(Integer[]::new);
    }

    public static void loopOver(Node tree, Set intersectedValues){

             intersectedValues.add(tree.value);

            if(tree.left != null) {
                loopOver(tree.left,intersectedValues);
            }
            if(tree.right != null) {
                loopOver(tree.right,intersectedValues);

            }
            return;
    }


}