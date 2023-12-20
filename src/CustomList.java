import java.util.Arrays;
public class CustomList {
    private int[] list;

    public CustomList(int[] list){
       this.list = list;
    }

    public CustomList(){
        this.list =new int[0];
    }
    @Override
    public String toString(){
        return Arrays.toString(this.list);
    }

    public int IndexOf (int value) {
        for (int i = 0; i < this.list.length; i++){
            if (this.list[i] == value) {
                return i;
            }
        }
        return -1;
}

    public int lastIndexOf (int value) {
        for (int i = this.list.length - 1; i >= 0; i--){
            if (this.list[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int get (int indexElem, int valueDefault) {
        if (indexElem >=0 && indexElem <= this.list.length) {
            return this.list[indexElem];
        }else {return valueDefault;
        }
    }

    public int get (int indexElem) {
        return get(indexElem, 0);
    }

    public void add (int newValue) {
          int [] newList = new int[this.list.length + 1];
          for (int i = 0; i < this.list.length; i++){
             newList[i] = this.list[i];
           }
          newList[this.list.length] = newValue;
          this.list = newList;

    }
    
    public int getMax (){
        int maxValue = this.list[0];
        for (int value: this.list) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public int pop () {
        int[] newArray = new int[this.list.length - 1];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = this.list[i];
        }
        int result = this.list[this.list.length-1];
        this.list = newArray;
        return result;
    }

    private void copyArray(int [] init, int [] result) {
        int minLength = (init.length > result.length) ? result.length : init.length;
        for (int i = 0; i < minLength; i++) {
            result[i] = init[i];
        }
    }

    public void remove (int value) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
                return;
            }
         }
        System.out.println("Элемент не найден");
       }

    public void removeRight (int value) {
        for (int i = this.list.length-1; i >=0; i--) {
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
                return;
            }
        }
        System.out.println("Элемент не найден");
    }

    private void shiftByIndex (int index) {
        for (int i = index; i < this.list.length-1; i++){
            this.list[i] = this.list[i+1];
        }
    }

    public void removeAll (int value) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
            }
        }
    }

    public void removeAll2 (int value) {
        int i = 0;
        while (i < this.list.length) {
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
            }else {i++;
            }
        }
    }

    public void removeByIndex (int index) {
        if (index>=0 && index<this.list.length){
        shiftByIndex(index);
        pop();}
        else {
            System.out.println("Неверное значение индекса");
        }
            }

    public void removeAllByIndex (int index) {
        if (index>=0 && index<this.list.length){
            int value = this.list[index];
            int i = 0;
            while (i < this.list.length) {
                if (this.list[i] == value) {
                    shiftByIndex(i);
                    pop();
                }else {i++;
                }
            }
        }else {
            System.out.println("Неверное значение индекса");
        }
    }

    public void swap(int firstIndex, int lastIndex) {
        int tmp = this.list[firstIndex];
        this.list[firstIndex] = this.list[lastIndex];
        this.list[lastIndex] = tmp;
    }

    public void reverse () {
      for (int i = 0; i < this.list.length /2; i++) {
          System.out.println(this.list[i] + " " + this.list[this.list.length - 1 - i]);
          swap(i, this.list.length - 1 - i);
          }
    }

    public void bubbleSort(boolean desc) {
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list.length - i - 1; j++) {
                if (desc) {
                    if (this.list[j] < this.list[j + 1]) {
                        swap(j + 1, j);
                    }
                }else {
                    if (this.list[j] > this.list[j + 1]) {
                        swap(j, j + 1);
                        }
                    }
                }
            }
        }




    public void selectionSort(boolean desc) {
        for (int i = 0; i < this.list.length; i++) {
            int value = this.list[0];
            int index = 0;
            for (int j = 0; j < this.list.length - i; j++){
                if (desc) {
                   if (this.list[j] > value) {
                     value = this.list[j];
                     index = j;}
                   } else {
                       if (this.list[j] < value) {
                           value = this.list[j];
                           index = j;
                       }
                   }
                }
                swap(index, this.list.length - 1 - i);
            }
        }
}


