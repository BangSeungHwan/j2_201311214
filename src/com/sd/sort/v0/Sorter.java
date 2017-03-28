package com.sd.sort.v0;

public class Sorter {
  
  String[] data={"John", "Adam", "Skrien", "Smith", "Jones"};
  Integer[] data1={new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
  
  void sortString(){
    for(int i=data.length-1;i>=0;i--) {
    int indexOfMax=0;
    for(int j=1;j<=i;j++) {
        if(data[j].compareTo(data[indexOfMax])>0)
            indexOfMax=j;
    }
    String temp=data[i];
    data[i]=data[indexOfMax];
    data[indexOfMax]=temp;
    }
    for(int i=0; i<data.length; i++)
      System.out.println("data["+i+"]="+data[i]);
  }
  
  
  void sortInteger(){
    for(int i=data1.length-1;i>=0;i--) {
      int indexOfMax=0;
      for(int j=1;j<=i;j++) {
        if(data1[j] > data1[indexOfMax])
            indexOfMax=j;
      }
    Integer temp=data1[i];
    data1[i]=data1[indexOfMax];
    data1[indexOfMax]=temp;
    }
    for(int i=0; i<data1.length; i++){
      System.out.println("data1["+i+"]="+data1[i]);
    }
  }
}