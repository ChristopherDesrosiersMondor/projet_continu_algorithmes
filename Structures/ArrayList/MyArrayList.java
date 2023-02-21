package ArrayList;

public class MyArrayList<T> {
    
    private T[] list;
    public int length;
    public int nb_data;

    {
        nb_data = 0;
    }


    // Create
    public MyArrayList() {
        super();
        this.list = (T[]) new Object[0];
        this.length = 0;
    }

    public MyArrayList(int length) {
        super();
        this.list = (T[]) new Object[length];
        this.length = length;
    }

    public MyArrayList(T[] oldlist) {
        super();
        this.list = oldlist;
        this.length = oldlist.length;
        // calcul
        for (T data : oldlist) {
            if (data != null) {
                this.nb_data += 1;
            }
            
        }
    }

    public MyArrayList(MyArrayList<T> oldlist) {
        super();
        this.list = oldlist.list;
        this.length = oldlist.length;
        // calcul
        for (int i = 0; i < oldlist.length ; i++) {
            if (oldlist.get(i) != null) {
                this.nb_data += 1;
            }
        }
    }

    // Update
    public void add(T object){
        if (nb_data == length){
            T[] new_list = (T[]) new Object[this.length + 1];
            for(int i = 0; i < this.list.length ; i++) {
                if (this.length > 0){
                    new_list[i] = this.list[i];
                }
            }
            new_list[this.length] = object;
            this.list = new_list;
            this.length += 1;
            this.nb_data += 1;
        } else {
            this.list[this.nb_data] = object;
            this.nb_data += 1;
        }

    }

    public void set(int index, T object) {
        this.list[index] = object;
    }

    // Read
    // Exemple d'exception avec message et call stack
    public T get(int index){
        T objet = null;
        try {
            if (!(0 <= index && index < this.length)){
                //throw(new MyArrayIndexOutOfBoundsException("Erreur"));
                throw(new MyArrayIndexOutOfBoundsException());
            }
            objet = this.list[index];
        } catch (MyArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return objet;
    }

    // Delete
    public void remove(int index){
        if (this.nb_data == this.length) {
            T to_remove = this.list[index];

            T[] new_list = (T[]) new Object[this.length - 1];
            for(int i = 0; i < this.length ; i++) {
                if (this.list[i] != to_remove) {
                    new_list[i] = this.list[i];
                }
            }
            this.list = new_list;
            this.length -= 1;
        } else {
            // Le dernier est null maintenant mais best case je diminue le n
            for (int i = index + 1; i < this.length; i++) {
                this.list[i - 1] = this.list[i];
            }

        }

    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < this.length; i++) {
            if (i == this.length - 1) {
                str.append(this.list[i]);
                continue;
            }
            str.append(this.list[i] + ", ");
        }
        str.append("]");
        return str.toString();
    }



    public static void main(String[] args) {
        MyArrayList<Integer> test = new MyArrayList<Integer>();
        System.out.println(test);
        test.add(10);
        test.add(null);
    }
}
