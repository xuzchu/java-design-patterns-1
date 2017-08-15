package com.java.bobomee.java_design_patterns_module.interpreter;

/**
 * Created on 16/9/6.下午11:29.
 *
 * @author bobomee.
 * @description:
 */
public class NumExpression extends ArithmeticExpression {
  private int num;

  public NumExpression(int _num) {
    num = _num;
  }

  @Override public int interptet() {
    return num;
  }
}
