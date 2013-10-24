package project.main;

import project.model.Model;
import project.model.AnimatorBuilder;
import project.model.swing.SwingAnimatorBuilder;
import project.model.text.TextAnimatorBuilder;

/**
 * A static class to demonstrate the visualization aspect of
 * simulation.
 */
public class Main {
  private Main() {}
  public static void main(String[] args) {
    {
      Model m = new Model(new TextAnimatorBuilder(), 0, 1);
      m.run(10);
      m.dispose();
    }
    {
      Model m = new Model(new SwingAnimatorBuilder(), 0, 1);
      m.run(10);
      m.dispose();
    }
    {
      Model m = new Model(new TextAnimatorBuilder(), 1, 1);
      m.run(10);
      m.dispose();
    }
    {
      Model m = new Model(new SwingAnimatorBuilder(), 1, 1);
      m.run(10);
      m.dispose();
    }
    {
      Model m = new Model(new SwingAnimatorBuilder(), 2, 3);
      m.run(500);
      m.run(500);
      m.dispose();
    }
    System.exit(0);
  }
}

