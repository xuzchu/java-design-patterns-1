package com.java.bobomee.java_design_patterns_module.abstactfactory;

/**
 * Created on 16/9/6.上午7:44.
 *
 * @author bobomee.
 * @description:
 */
public class ConcreteFactory extends AbstractFactory {
  @Override public AbstractProductA createAbstractFactoryA() {
    return new ConcreteProductA();
  }

  @Override public AbstractProductB createAbstractFactoryB() {
    return new ConcreteProductB();
  }
}
