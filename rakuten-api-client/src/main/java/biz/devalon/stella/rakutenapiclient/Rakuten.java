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

package biz.devalon.stella.rakutenapiclient;

import android.content.Context;
import biz.devalon.stella.rakutenapiclient.api.BaseApi;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import java.util.HashMap;

/**
 * Created by ichiwa on 2015/10/15.
 */
public class Rakuten {
    private static Context mContext;
    private static String mApplicationId = "";
    private static String mAffiliateId = "";

    /**
     * call to set log
     *
     * @param tag Log tag
     * @param level Log level
     * @see com.koushikdutta.ion.Ion.Config
     */
    public static void setLogging(String tag, int level) {
        Ion.getDefault(mContext).configure().setLogging(tag, level);
    }

    /**
     * initialize with applicationId
     *
     * @param context context
     * @param applicationId applicationId
     */
    public static void initialize(Context context, String applicationId) {
        Rakuten.mContext = context;
        Rakuten.mApplicationId = applicationId;
    }

    /**
     * initialize with applicationId, affiliateId
     *
     * @param context context
     * @param applicationId applicationId
     * @param affiliateId affiliateId
     */
    public static void initialize(Context context, String applicationId, String affiliateId) {
        Rakuten.mContext = context;
        Rakuten.mApplicationId = applicationId;
        Rakuten.mAffiliateId = affiliateId;
    }

    /**
     * create Generator
     *
     * @param apiSelecter API Selecter
     * @return Generator
     * @see ApiSelecter
     */
    public static Generator create(ApiSelecter apiSelecter) {
        return new Generator(apiSelecter);
    }

    /**
     * API Generator
     */
    public static final class Generator {
        private BaseApi mBaseApi;

        /**
         * constructor
         *
         * @param apiSelecter API selector
         * @see ApiSelecter
         */
        private Generator(ApiSelecter apiSelecter) {
            mBaseApi = apiSelecter.get();
            mBaseApi.setContext(Rakuten.mContext);
        }

        /**
         * callback setter
         *
         * @param callback FutureCallback
         * @return Generator
         * @see FutureCallback
         */
        public Generator setCallback(FutureCallback<JsonObject> callback) {
            mBaseApi.setCallback(callback);
            return this;
        }

        /**
         * call GET method
         *
         * @param params GET parameters
         * @return Generator
         * @see BaseApi#get(HashMap)
         */
        public Generator get(HashMap<String, String> params) {
            params.put("applicationId", Rakuten.mApplicationId);
            if (!"".equals(Rakuten.mAffiliateId)) {
                params.put("affiliateId", Rakuten.mAffiliateId);
            }
            mBaseApi.get(params);
            return this;
        }
    }


}
