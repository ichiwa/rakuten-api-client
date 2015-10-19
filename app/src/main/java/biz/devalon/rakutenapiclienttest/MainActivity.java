package biz.devalon.rakutenapiclienttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import biz.devalon.stella.rakutenapiclient.ApiSelecter;
import biz.devalon.stella.rakutenapiclient.Rakuten;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    MainActivity self;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        self = this;

        findViewById(R.id.call_api_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickButton();
            }
        });
    }

    FutureCallback<JsonObject> callback = new FutureCallback<JsonObject>() {
        @Override
        public void onCompleted(Exception e, JsonObject result) {
            if (e != null) {
                e.printStackTrace();
                return;
            }
            ((TextView) findViewById(R.id.result)).setText(result.toString());
        }
    };

    private void clickButton() {
        Rakuten.initialize(this, "your application id here");
        Rakuten.setLogging("test", Log.DEBUG);

        HashMap<String, String> params = new HashMap<>();
        params.put("keyword", "テスト");

        Rakuten
            .create(ApiSelecter.IchibaItem)
            .setCallback(callback)
            .get(params);
    }
}
