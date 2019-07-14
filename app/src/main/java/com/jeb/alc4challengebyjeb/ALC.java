package com.jeb.alc4challengebyjeb;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ALC extends AppCompatActivity {
    WebView webALC ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc);

        webALC = findViewById(R.id.webALC);
        //webALC.getSettings().setJavaScriptEnabled(true);
     //webALC.getSettings().setAppCacheEnabled(true);
    // webALC.setWebViewClient(new WebViewClient());;
//       webALC.getSettings().setLoadWithOverviewMode(true);
//        webALC.getSettings().setUseWideViewPort(true);

        webALC.getSettings().setLoadsImagesAutomatically(true);
        webALC.getSettings().setJavaScriptEnabled(true);
        webALC.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        // Configure the client to use when opening URLs

        // Load the initial URL
       // myWebView.loadUrl("http://www.example.com");

        webALC.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        webALC.loadUrl("https://andela.com/alc");




    }
}
