import java.util.Arrays;

public class MyList<E> {
    private int count = 0;
    private static int size = 10;
    private int element[];

    public MyList() {
        element = new int[size];
    }

    public int[] getElement() {
        return element;
    }

    public void setElement(int[] element) {
        this.element = element;
    }

    private void ensureCapacity() {
        int newSize = size * 2;
        Arrays.copyOf(element, newSize);
    }

    public void add(int index, int value) {
        if (count == size) {
            ensureCapacity();
        }
        int[] newArray = new int[element.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = element[i];
            } else if (i > index) {
                newArray[i] = element[i - 1];
            } else {
                newArray[index] = value;
            }
        }
        element = newArray;
        count++;
    }

    public void remove(int index) {
        int[] newArray = new int[element.length - 1];
        for (int i = 0; i < newArray.length - 1; i++) {
            if (i < index) {
                newArray[i] = element[i];
            } else {
                newArray[i] = element[i + 1];
            }
        }
        element = newArray;
        count--;
    }

    public int getSize() {
        return this.count;
    }

    public MyList clone() {
        MyList myList = new MyList();
        myList.count = this.count;
        myList.size = this.size;
        myList.element = this.element;
        return myList;
    }

    public boolean contains(int value) {
        boolean isContains = false;
        for (int i = 0; i < element.length; i++) {
            if (element[i] == value) {
                isContains = true;
                break;
            }
        }
        return isContains;
    }

    public int indexOf(int value) {
        int index = -1;
        for (int i = 0; i < element.length; i++) {
            if (element[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void clear() {
        count = 0;
        size = 10;
        element = new int[size];
    }

    public int getCount(){
        return this.count;
    }
}
