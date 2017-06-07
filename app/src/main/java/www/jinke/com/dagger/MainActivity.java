package www.jinke.com.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    /**
     * @Inject：这个很简单了，通常是在需要注入的地方添加这个依赖。
     * 比如：MainActivity要使用LocalManager实例，那我们就在要使用的地方定义一个成员变量
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
