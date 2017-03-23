package com.example.mango.colburna3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebpageViewerActivity extends AppCompatActivity {

    String _url;
    WebView _webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        _url = (String) intent.getExtras().get("url");

        setContentView(R.layout.activity_mesa_college_webpage);

        _webView = (WebView) findViewById(R.id.webView);

        _webView.loadUrl(_url);
        //_webView.loadUrl("https://www.sdmesa.edu");
    }
}
