package biz.devalon.stella.rakutenapiclient.api.ichibaitem;

import biz.devalon.stella.rakutenapiclient.api.BaseApi;
import biz.devalon.stella.rakutenapiclient.Common;
import com.koushikdutta.ion.Ion;
import java.util.HashMap;

/**
 * Created by ichiwa on 2015/10/15.
 */
public class IchibaGenreApi extends BaseApi {

    private final String BASE_URL = Common.ICHIBA_GENRE_URL;
    private final String VERSION = Common.ICHIBA_GENRE_VERSION;

    @Override
    public void get(HashMap<String, String> params) {
        Ion
            .with(mContext)
            .load(BASE_URL + VERSION + createUrlParameters(params))
            .asJsonObject()
            .setCallback(mFutureCallback);
    }
}
