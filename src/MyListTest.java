public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(0,1);
        myList.add(0,2);
        myList.add(0,3);
        myList.add(0,4);
        myList.add(0,5);
        myList.add(0,6);
        myList.add(0,7);
        myList.add(0,8);
        myList.add(0,9);
        myList.add(0,10);
        for (int x: myList.getElement()) {
            System.out.print(x+", ");
        }
        System.out.println();
        System.out.println("Có "+myList.getCount()+" phần tử trong mảng");
        System.out.println("---------------");

        myList.remove(3);
        for (int x: myList.getElement()) {
            System.out.print(x+", ");
        }
        System.out.println();
        System.out.println("xóa phần tử ở vị trí 3");
        System.out.println("Có "+myList.getCount()+" phần tử trong mảng");
        System.out.println("---------------");
    }
}
