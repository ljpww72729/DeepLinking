package cc.lkme.deeplinking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by LinkedME06 on 16/7/25.
 */
public class BrowserActivity extends AppCompatActivity{

    WebView webView;
    TextView ua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        webView = (WebView) findViewById(R.id.webview);
        ua = (TextView) findViewById(R.id.ua);
        webView.getSettings().setJavaScriptEnabled(true);
        ua.setText(webView.getSettings().getUserAgentString());
        webView.loadUrl("file:///android_asset/web.html");
    }
}
