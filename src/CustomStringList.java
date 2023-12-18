import java.util.Arrays;
public class CustomStringList {
    public String[] list;

    public CustomStringList(String[] list){
        this.list = list;
    }

    public boolean check(String newString) {
        for (int i =0; i < this.list.length; i++){
            if (newString.equals(this.list[i])) return true;
        }
        return false;
    }

    public boolean check(String[] newArray) {
        for (int i=0; i < newArray.length; i++){
            if (!this.check(newArray[i])) return false;}
        return true;
    }

    public String longestWord () {
        String result = this.list[0];
        for (String string: this.list){
            if (string.length() > result.length()){
                result = string;
            }
        }
        return result;
//        int length = this.list[0].length();
//        int index = 0;
//        for (int i=0; i < this.list.length; i++){
//            if (this.list[i].length() > length){
//                length = this.list[i].length();
//                index = i;
//            }
//        }
//        return this.list[index];
    }

    public String toString() {
        return Arrays.toString(this.list);
    }

    public void add (String newString) {
        String[] newArray = new String[this.list.length + 1];
        for (int i = 0; i < this.list.length; i++){
            newArray[i] = this.list[i];
        }
        newArray[this.list.length] = newString;
        this.list = newArray;
    }

    public void addIfNotExists (String newString) {
        if (!check(newString)){
            add(newString);
        }
        else {
            System.out.printf("Строка %s в массиве уже есть.%n", newString);
        }
    }
}






