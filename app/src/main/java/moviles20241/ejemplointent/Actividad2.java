package moviles20241.ejemplointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    TextView texto;
    Button botonRetornar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_actividad2 );
        texto = (TextView) findViewById( R.id.textView2 );
        botonRetornar = (Button) findViewById( R.id.botonRetornar );

        Intent intent = getIntent();
        String valor = intent.getStringExtra( MainActivity.EXTRA_NOMBRE );
        texto.setText( valor );
    }

    public void retornar(View v){
        Intent intent = new Intent();
        intent.putExtra( "textoRetorno","Volvio" );
        setResult( RESULT_OK,intent );
        finish();
    }


}