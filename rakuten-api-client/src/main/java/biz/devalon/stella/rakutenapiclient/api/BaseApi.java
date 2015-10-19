/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 ichiwa
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package biz.devalon.stella.rakutenapiclient.api;

import android.content.Context;
import android.net.Uri;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ichiwa on 2015/10/15.
 */
public abstract class BaseApi {
    /**
     * for Ion.
     */
    protected Context mContext;

    /**
     * Default Api Callback. always show
     * Exception.
     */
    protected FutureCallback mFutureCallback = new FutureCallback() {
        @Override
        public void onCompleted(Exception e, Object result) {
            new Exception("This is Default for API Callback").printStackTrace();
        }
    };

    /**
     * context setter
     *
     * @param context コンテキスト
     */
    public void setContext(Context context) {
        mContext = context;
    }

    /**
     * callback setter
     *
     * @param callback API Callback
     * @see com.koushikdutta.async.future.FutureCallback
     */
    public void setCallback(FutureCallback<JsonObject> callback) {
        mFutureCallback = callback;
    }

    /**
     * create URL parameters
     *
     * @param params GET parameters
     * @return query
     */
    public String createUrlParameters(HashMap<String, String> params) {
        StringBuilder sb = new StringBuilder();
        sb.append("?");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            sb.append(String.format("%s=%s&", Uri.encode(entry.getKey()), Uri.encode(entry.getValue())));
        }
        return sb.toString();
    }

    /**
     * call GET method
     *
     * @param params GET parameters
     */
    public abstract void get(HashMap<String, String> params);
}
