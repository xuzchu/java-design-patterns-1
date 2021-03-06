package com.java.bobomee.java_design_patterns_module.abstactfactory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.java.bobomee.java_design_patterns_module.BaseActivity;
import com.java.bobomee.java_design_patterns_module.R;

/**
 * Created on 16/9/6.上午7:46.
 *
 * @author bobomee.
 * @description:
 */
public class AbstractFactoryActivity extends BaseActivity {

  @BindView(R.id.btn_click) Button mBtnClick;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.btn_layout);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.btn_click) public void setBtnClick() {
    AbstractFactory abstractFactory = new ConcreteFactory();
    AbstractProductA abstractFactoryA = abstractFactory.createAbstractFactoryA();
    AbstractProductB abstractFactoryB = abstractFactory.createAbstractFactoryB();

    abstractFactoryA.method();
    abstractFactoryB.method();
  }
}
