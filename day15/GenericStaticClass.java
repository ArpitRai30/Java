package day15;

class Container{
    static class Storage<T>{
        private T item;
        Storage(T item){
            this.item=item;
        }
        void showItem(){
            System.out.println("Stored items: "+item);
        }
    }
}

public class GenericStaticClass {
    public static void main(String[] args) {
        Container.Storage<Integer> intStorage=new Container.Storage<>(100);
        intStorage.showItem();
        Container.Storage<String> strStorage=new Container.Storage<>("Hello");
        strStorage.showItem();
    }
}