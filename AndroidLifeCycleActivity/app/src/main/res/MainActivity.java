import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Reno on 2/7/2015.
 */
public class MainActivity extends TracerActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}