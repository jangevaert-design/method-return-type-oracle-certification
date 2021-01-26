package edu.cnm.deepdive;

public class MethodReturnType {

  public void jump() {
  }//return type void

  public void jump2() {
    return;//this return statement is redundant because the return type is void.
  }

  public String jump3() {
    return "";// when we call this method we will get an empty String.
  }
//  public String jump4() {}//does not compile because there is no return statement.

//  public jump5() {} no return type.
//  String jump6(int a) {
//  if (a == 5) { if a == 5 is false, then there is no return statement so does not compile.
//  return "";
//}
//}

  int getInt() {
    return 9; //compiles because the return type is an int.
  }

//  int getLong() {
//    return 9L; does not compile because the return type has to be an int and not a long.
//  } If we cast 9L to int like this (int) 9L, then it will compile.


  boolean isTrue() {
    return 5 < 10;
  }
//methods can only contain letters, numbers, $ and -.
//not start with numbers








}
