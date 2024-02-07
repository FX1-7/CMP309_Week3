package CMP320.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class BrowserActivity extends AppCompatActivity {

    WebView webV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        String myURL = this.getIntent().getStringExtra("url");

        webV = findViewById(R.id.webView);
        webV.setWebChromeClient(new WebChromeClient());
        webV.loadUrl(myURL);

    }
}