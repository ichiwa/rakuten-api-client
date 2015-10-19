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
package biz.devalon.stella.rakutenapiclient.api.books;

import biz.devalon.stella.rakutenapiclient.api.BaseApi;
import biz.devalon.stella.rakutenapiclient.Common;
import com.koushikdutta.ion.Ion;
import java.util.HashMap;

/**
 * Created by ichiwa on 2015/10/15.
 */
public class BooksDvdApi extends BaseApi {

    private final String BASE_URL = Common.BOOKS_DVD_URL;
    private final String VERSION = Common.BOOKS_DVD_VERSION;

    @Override
    public void get(HashMap<String, String> params) {
        Ion
            .with(mContext)
            .load(BASE_URL + VERSION + createUrlParameters(params))
            .asJsonObject()
            .setCallback(mFutureCallback);
    }
}
