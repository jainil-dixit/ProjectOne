package c.dixit.projectone;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int i=0;
    public String s="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TextView tv=(TextView)findViewById(R.id.textView);
                String score = Integer.toString(++i);
                tv.setText(score);
            }
        });

        Button b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv=(TextView)findViewById(R.id.textView);
                String score = Integer.toString(0);
                tv.setText(score);
                i=0;
            }
        });
    }
}
