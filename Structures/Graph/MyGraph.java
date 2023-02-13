package NodesGraphTree;

import MyArrayList.MyArrayList;

public class MyGraph<T> {
    private int numRows;
    private int numCols;
    private MyArrayList<GraphNode<T>> nodes;

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }

    public MyArrayList<GraphNode<T>> getNodes() {
        return nodes;
    }

    public void setNodes(MyArrayList<GraphNode<T>> nodes) {
        this.nodes = nodes;
    }

    public MyGraph(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        nodes = new MyArrayList<GraphNode<T>>(numRows * numCols);
        setNodes();
    }

    private void setNodes() {
        for (int i = 0; i < this.nodes.length ; i++) {
            GraphNode<T> newNode = new GraphNode<T>();

            this.nodes.set(i, newNode);
        }

        for (int i = 0; i < this.nodes.length ; i++) {
            GraphNode<T> currentNode = this.nodes.get(i);
            setNeighbor(currentNode, i);
        }
    }

    private void setNeighbor(GraphNode<T> node, int index) {
        // setting right neighbor
        if (index % this.numCols < numCols - 1) {
            node.setRight(nodes.get(index + 1));
        }

        // setting left neighbor
        if (index % this.numCols != 0) {
            node.setLeft(nodes.get(index - 1));
        }

        // setting top neighbor
        if (index > numCols - 1) {
            node.setTop(nodes.get(index - numCols));
        }

        // setting bottom neighbor
        if (index < nodes.length - numCols) {
            node.setBottom(nodes.get(index + numCols));
        }

        // setting topRight neighbor
        if (node.getTop() != null) {
            node.setTopRight(node.getTop().getRight());
        }

        // setting topLeft neighbor
        if (node.getTop() != null) {
            node.setTopLeft(node.getTop().getLeft());
        }

        // setting bottomRight
        if (node.getBottom() != null) {
            node.setBottomRight(node.getBottom().getRight());
        }

        // setting bottomLeft
        if (node.getBottom() != null) {
            node.setBottomLeft(node.getBottom().getLeft());
        }
    }

    public void setXY(int row, int col, T value) {
        int index = (row * this.numCols) + col;
        this.nodes.get(index).setValue(value);
    }

    public GraphNode<T> getXY(int row, int col) {
        int index = (row * this.numCols) + col;
        return this.nodes.get(index);
    }

    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();
        representation.append("[");
        for (int i = 0; i < this.numRows; i++) {
            for (int y = 0; y < this.numCols; y ++) {
                String valueString = getXY(i, y).toString();
                representation.append(valueString);
                if (y != this.numCols - 1){
                    representation.append(", ");
                }
            }
            if (i != this.numRows - 1){
                representation.append("\n");
            }
        }
        representation.append("]");
        return representation.toString();
    }

    public static void main(String[] args) {
        MyGraph<Integer> graph = new MyGraph<>(3, 4);
        graph.setXY(0, 0, 15);
        System.out.println(graph);

        graph.setXY(0, 2, 10);
        System.out.println(graph);
        System.out.println(graph.getXY(0, 2).getLeft().getLeft());
    }
}
