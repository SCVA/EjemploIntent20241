package moviles20241.ejemplointent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_NOMBRE = "moviles20241.ejemplointent";
    public final static int OPINION_REQUEST_CODE = 1;
    private Button botonIntent;
    private TextView holamundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        botonIntent = (Button) findViewById( R.id.button );
        holamundo = (TextView) findViewById( R.id.textView );
    }

    public void redireccionar (View v){
        Intent intent = new Intent(this, Actividad2.class);
        intent.putExtra( EXTRA_NOMBRE,"Actividad 2" );
        startActivityForResult( intent, OPINION_REQUEST_CODE );

        //Uri webpage = Uri.parse("https://www.develou.com");
        //Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        //startActivity(webIntent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult( requestCode, resultCode, data );
        if (requestCode == OPINION_REQUEST_CODE){
            if (resultCode == RESULT_OK){
                String result = data.getStringExtra( "textoRetorno" );
                holamundo.setText( result );
            }
        }
    }
}