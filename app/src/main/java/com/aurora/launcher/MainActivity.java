package com.aurora.launcher;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.graphics.BitmapFactory;

public class MainActivity extends Activity {
    // IP definido por padrão
    public static final String SERVER_IP = "188.165.192.24:5644";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Interface simples programática (botão 'Conectar')
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(40, 80, 40, 40);

        ImageView iv = new ImageView(this);
        iv.setImageBitmap(BitmapFactory.decodeResource(getResources(), getResources().getIdentifier("ic_launcher", "mipmap", getPackageName())));
        layout.addView(iv);

        TextView tv = new TextView(this);
        tv.setText("AURORA ROLEPLAY");
        tv.setTextSize(24);
        layout.addView(tv);

        Button btn = new Button(this);
        btn.setText("Conectar ao servidor");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Exemplo de como abrir um URI com o IP - o real cliente SAMP Android requer integração nativa.
                // Aqui deixamos um intento simples (usuário verá que algo aconteceu).
                // Para uma integração completa, o projeto SAMP Android original deve ser integrado.
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("samp://" + SERVER_IP));
                startActivity(intent);
            }
        });
        layout.addView(btn);

        setContentView(layout);
    }
}
