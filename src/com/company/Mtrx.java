package com.company;

public class Mtrx { //матрИца
    private int [][] elem;
    public Mtrx(int [][] n){ //Конструктор с передачей массива
        this.elem = n;
    }
    public Mtrx(int n, int m, int mx){ //Конструктор с рандомной генерацией
        elem = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                this.elem[i][j] = (int) (Math.random() * mx);
            }
        }
    }
    public void setNums(int [][] n){
        this.elem = n;
    }
    public void Swap(int k){ //Переставляем строки с макс и мин в столбце k
        int pos_x = 0;
        int pos_n = 0;
        int buf_x = this.elem[0][k];
        int buf_n = this.elem[0][k];
        for (int i = 0; i < this.elem.length; i++){
            if (this.elem[i][k] > buf_x){
                buf_x = this.elem[i][k];
                pos_x = i;
            }
            if (this.elem[i][k] < buf_n){
                buf_n = this.elem[i][k];
                pos_n = i;
            }
        }
        int [] buf_ar = this.elem[pos_x];
        this.elem[pos_x] = this.elem[pos_n];
        this.elem[pos_n] = buf_ar;
    }
    public void sqr(int i)
    {
        if ((i>this.elem.length)||(i>this.elem[i].length)){
            System.out.println("i too big, bro :C");
        }
        else {
            System.out.println("nice i, bro C:");
            for (int k = 0; k < i; k++) {
                for (int j=0; j<i; j++) {
                    this.elem[k][j]= (int) Math.pow(this.elem[k][j],2);
                }
            }
        }
    }
    public void Show(){
        for (int i = 0; i < this.elem.length; i++){
            for (int j = 0; j < this.elem[i].length; j++){
                System.out.print(this.elem[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}