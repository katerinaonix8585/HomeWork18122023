package test;

import java.sql.ClientInfoStatus;
import java.util.Arrays;

public class Test {
    int[] list;

    public Test (int[] list){
        this.list = list;
    }



    public int max() {
        int result = this.list[0];
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] > result){
                result = this.list[i];
            }
        }
        return result;
    }

    public int min() {
        int result = this.list[0];
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] < result){
                result = this.list[i];
            }
        }
        return result;
    }

    public int get(boolean condition) {
        int result = this.list[0];
        for (int i = 0; i < this.list.length; i++){
            if (this.list[i] > result == condition){
                result = this.list[i];
            }
        }
        return result;
    }

    public void invert (){
        for (int i = 0; i < this.list.length; i++) {
            this.list[i] *= -1;

        }
        System.out.println(Arrays.toString(this.list));
    }

    public void positive () {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] < 0) {this.list[i] *= -1;}
    }
        System.out.println(Arrays.toString(this.list));
}

    public void changeSign (boolean sign){
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] < 0 == sign)
            {
                this.list[i] *= -1;
            }
    }
        System.out.println(Arrays.toString(this.list));
}
}

