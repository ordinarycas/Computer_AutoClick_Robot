/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Josephus;

/**
 *第11讲 约瑟夫问题 --循序渐进学.java.从入门到精通 -- 韩顺平
 * @author Family
 */
public class JosephusProblem {
    public static void main(String[] arge){
        CycLink cycLink = new CycLink();
        cycLink.setLen(5);
        cycLink.createLink();
        cycLink.setK(1);
        cycLink.setM(3);
        cycLink.show();
        cycLink.play();
    }
}

class Chlid{
    int no;
    Chlid nextChild = null;
    public Chlid(int no){
        this.no = no;
    }
}

class CycLink {
    Chlid firstChlid = null;
    int len = 0;
    Chlid temp = null;
    int k=0;
    int m=0;
    public void setM(int m){
        this.m = m;
    }
    
    public void setLen(int len){
        this.len = len;
    }
    public void setK(int k){
        this.k=k;
    }
    public void play(){
        Chlid temp = this.firstChlid;
        for(int i=1;i<=k;i++){
            temp=temp.nextChild;
        }
        while(this.len!=1){
            for(int j=1;j<=m;j++){
              temp=temp.nextChild;
          }
          Chlid temp2=temp;
          while(temp2.nextChild != temp){
              temp2=temp2.nextChild;
          }
          
          temp2.nextChild=temp.nextChild;
          temp=temp.nextChild;
          this.len--;
          }
        System.out.println("最後出來：" + temp.no);
    }
    
    public void createLink(){
        for(int i = 1; i<=len ; i++){
            if(i == 1){
                Chlid ch =new Chlid(i);
                this.firstChlid=ch;
                this.temp=ch;
            }else{
                if(i == len){
                    Chlid ch = new Chlid(i);
                    temp.nextChild=ch;
                    temp=ch;
                    temp.nextChild = this.firstChlid;
                }else{
                    Chlid ch = new Chlid(i);
                    temp.nextChild=ch;
                    temp=ch;
                }
            }
        }
    }
    public void show(){
        Chlid temp = this.firstChlid;
        do{
            System.out.println(temp.no + "  ");
            temp=temp.nextChild;
        }while(temp!=this.firstChlid);
    }
}