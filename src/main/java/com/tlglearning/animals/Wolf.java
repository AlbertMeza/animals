package com.tlglearning.animals;

public class Wolf {
  private static final int MY_CONSTANT = initializeValue();

  static {
    System.out.println("Wolf static initialization block");
  }

  private int data = initializeData();

  {
    System.out.println("Wolf instance initialization block");
  }

  {
    System.out.println("Second Wolf initialization block");
  }

  public Wolf(){
    System.out.println("Wolf constructor");
  }

  private static int initializeValue(){
    System.out.println("Wolf.initializeValue");
    return -1;
  }

  public static void whoAmI(){
    System.out.println("I am a wolf");
  }

  private int initializeData(){
    System.out.println("Wolf.initializeData");
    return 1;
  }

  public void vocalize(){
    System.out.println("Howl like a wolf!");
  }

  public void hunt(){
    System.out.println("Hunt in packs for live prey");
  }
}
