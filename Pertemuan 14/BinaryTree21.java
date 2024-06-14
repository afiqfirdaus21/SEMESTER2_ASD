// public class BinaryTree21 {
//     Node21 root;

//     public BinaryTree21() {
//         root = null;
//     }

//     boolean isEmpty() {
//         return root == null;
//     }

//     void add(int data) {
//         if (isEmpty()) {
//             root = new Node21(data);
//         } else {
//             Node21 current = root;
//             while (true) {
//                 if (data < current.data) {
//                     if (current.left == null) {
//                         current.left = new Node21(data);
//                         break;
//                     } else {
//                         current = current.left;
//                     }
//                 } else if (data > current.data) {
//                     if (current.right == null) {
//                         current.right = new Node21(data);
//                         break;
//                     } else {
//                         current = current.right;
//                     }
//                 } else {
//                     break; // Data already exists in the tree, do nothing
//                 }
//             }
//         }
//     }

//     boolean find(int data) {
//         Node21 current = root;
//         while (current != null) {
//             if (current.data == data) {
//                 return true;
//             } else if (data < current.data) {
//                 current = current.left;
//             } else {
//                 current = current.right;
//             }
//         }
//         return false;
//     }

//     void traversePreOrder(Node21 node) {
//         if (node != null) {
//             System.out.print(" " + node.data);
//             traversePreOrder(node.left);
//             traversePreOrder(node.right);
//         }
//     }

//     void traversePostOrder(Node21 node) {
//         if (node != null) {
//             traversePostOrder(node.left);
//             traversePostOrder(node.right);
//             System.out.print(" " + node.data);
//         }
//     }

//     void traverseInOrder(Node21 node) {
//         if (node != null) {
//             traverseInOrder(node.left);
//             System.out.print(" " + node.data);
//             traverseInOrder(node.right);
//         }
//     }

//     Node21 getSuccessor(Node21 del) {
//         Node21 successor = del.right;
//         Node21 successorParent = del;
//         while (successor.left != null) {
//             successorParent = successor;
//             successor = successor.left;
//         }
//         if (successor != del.right) {
//             successorParent.left = successor.right;
//             successor.right = del.right;
//         }
//         return successor;
//     }

//     void delete(int data) {
//         if (isEmpty()) {
//             System.out.println("Tree is empty!");
//             return;
//         }
//         Node21 parent = root;
//         Node21 current = root;
//         boolean isLeftChild = false;
//         while (current != null) {
//             if (current.data == data) {
//                 break;
//             } else if (data < current.data) {
//                 parent = current;
//                 current = current.left;
//                 isLeftChild = true;
//             } else {
//                 parent = current;
//                 current = current.right;
//                 isLeftChild = false;
//             }
//         }
//         if (current == null) {
//             System.out.println("Couldn't find data!");
//             return;
//         } else {
//             if (current.left == null && current.right == null) {
//                 if (current == root) {
//                     root = null;
//                 } else {
//                     if (isLeftChild) {
//                         parent.left = null;
//                     } else {
//                         parent.right = null;
//                     }
//                 }
//             } else if (current.left == null) {
//                 if (current == root) {
//                     root = current.right;
//                 } else {
//                     if (isLeftChild) {
//                         parent.left = current.right;
//                     } else {
//                         parent.right = current.right;
//                     }
//                 }
//             } else if (current.right == null) {
//                 if (current == root) {
//                     root = current.left;
//                 } else {
//                     if (isLeftChild) {
//                         parent.left = current.left;
//                     } else {
//                         parent.right = current.left;
//                     }
//                 }
//             } else {
//                 Node21 successor = getSuccessor(current);
//                 if (current == root) {
//                     root = successor;
//                 } else {
//                     if (isLeftChild) {
//                         parent.left = successor;
//                     } else {
//                         parent.right = successor;
//                     }
//                 }
//                 successor.left = current.left;
//             }
//         }
//     }
// }

// TUGAS 2
public class BinaryTree21 {
    Node21 root;

    public BinaryTree21() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        root = addRecursive(root, data);
    }

    public Node21 addRecursive(Node21 current, int data) {
        if (current == null) {
            return new Node21(data);
        }
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }
        return current;
    }

    boolean find(int data) {
        Node21 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void traversePreOrder(Node21 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node21 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node21 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node21 getSuccessor(Node21 del) {
        Node21 successor = del.right;
        Node21 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node21 parent = root;
        Node21 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node21 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    int findMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Tree is empty!");
        }
        Node21 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    int findMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Tree is empty!");
        }
        Node21 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    void printLeafNodes(Node21 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            }
            printLeafNodes(node.left);
            printLeafNodes(node.right);
        }
    }

    int countLeafNodes(Node21 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodes(node.left) +
                countLeafNodes(node.right);
    }
}