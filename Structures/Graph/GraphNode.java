package NodesGraphTree;

public class GraphNode<T> {
    private T value;
    private GraphNode<T> top;
    private GraphNode<T> bottom;
    private GraphNode<T> left;
    private GraphNode<T> right;
    private GraphNode<T> topLeft;
    private GraphNode<T> topRight;
    private GraphNode<T> bottomLeft;
    private GraphNode<T> bottomRight;

    public T getValue() {
      return value;
    }

    public void setValue(T value) {
      this.value = value;
    }

    public GraphNode<T> getTop() {
      return top;
    }

    public void setTop(GraphNode<T> top) {
      this.top = top;
    }

    public GraphNode<T> getBottom() {
      return bottom;
    }

    public void setBottom(GraphNode<T> bottom) {
      this.bottom = bottom;
    }

    public GraphNode<T> getLeft() {
      return left;
    }

    public void setLeft(GraphNode<T> left) {
      this.left = left;
    }

    public GraphNode<T> getRight() {
      return right;
    }

    public void setRight(GraphNode<T> right) {
      this.right = right;
    }

    public GraphNode<T> getTopLeft() {
      return topLeft;
    }

    public void setTopLeft(GraphNode<T> topLeft) {
      this.topLeft = topLeft;
    }

    public GraphNode<T> getTopRight() {
      return topRight;
    }

    public void setTopRight(GraphNode<T> topRight) {
      this.topRight = topRight;
    }

    public GraphNode<T> getBottomLeft() {
      return bottomLeft;
    }

    public void setBottomLeft(GraphNode<T> bottomLeft) {
      this.bottomLeft = bottomLeft;
    }

    public GraphNode<T> getBottomRight() {
      return bottomRight;
    }

    public void setBottomRight(GraphNode<T> bottomRight) {
      this.bottomRight = bottomRight;
    }

    public GraphNode() {
      super();
      this.value = null;
      this.top = null;
      this.bottom = null;
      this.left = null;
      this.right = null;
      this.topLeft = null;
      this.topRight = null;
      this.bottomLeft = null;
      this.bottomRight = null;
    }

    public GraphNode(T value) {
      super();
      this.value = value;
      this.top = null;
      this.bottom = null;
      this.left = null;
      this.right = null;
      this.topLeft = null;
      this.topRight = null;
      this.bottomLeft = null;
      this.bottomRight = null;
    }

    @Override
    public String toString(){
      if (this.value == null) {
        return "null";
      }
      return this.value.toString();
    }
    
}
