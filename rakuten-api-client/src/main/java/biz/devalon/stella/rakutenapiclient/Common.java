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

/**
 * Created by ichiwa on 2015/10/15.
 */
public class Common {

    /**
     * 楽天市場系API
     */
    /**
     * 楽天市場商品検索API
      */
    public static final String ICHIBA_ITEM_URL = "https://app.rakuten.co.jp/services/api/IchibaItem/Search/";
    public static final String ICHIBA_ITEM_VERSION = "20140222";

    /**
     * 楽天市場ジャンル検索API
     */
    public static final String ICHIBA_GENRE_URL = "https://app.rakuten.co.jp/services/api/IchibaGenre/Search/";
    public static final String ICHIBA_GENRE_VERSION = "20140222";

    /**
     * 楽天市場タグ検索API
     */
    public static final String ICHIBA_TAG_URL = "https://app.rakuten.co.jp/services/api/IchibaTag/Search/";
    public static final String ICHIBA_TAG_VERSION = "20140222";

    /**
     * 楽天市場ランキングAPI
     */
    public static final String ICHIBA_ITEM_RANKING_URL = "https://app.rakuten.co.jp/services/api/IchibaItem/Ranking/";
    public static final String ICHIBA_ITEM_RANKING_VERSION = "20120927";

    /**
     * 楽天商品コード検索API
     * ※未対応
     */

    /**
     * 商品価格ナビ製品検索API
     */
    public static final String PRODUCT_URL = "https://app.rakuten.co.jp/services/api/Product/Search/";
    public static final String PRODUCT_VERSION = "20140305";

    /**
     * 楽天ブックス系API
     */

    /**
     * 楽天ブックス総合検索API
     */
    public static final String BOOKS_TOTAL_URL = "https://app.rakuten.co.jp/services/api/BooksTotal/Search/";
    public static final String BOOKS_TOTAL_VERSION = "20130522";

    /**
     * 楽天ブックス書籍検索API
     */
    public static final String BOOKS_BOOK_URL = "https://app.rakuten.co.jp/services/api/BooksBook/Search/";
    public static final String BOOKS_BOOK_VERSION = "20130522";

    /**
     * 楽天ブックスCD検索API
     */
    public static final String BOOKS_CD_URL = "https://app.rakuten.co.jp/services/api/BooksCD/Search/";
    public static final String BOOKS_CD_VERSION = "20130522";

    /**
     * 楽天ブックスDVD/Blu-ray検索API
     */
    public static final String BOOKS_DVD_URL = "https://app.rakuten.co.jp/services/api/BooksDVD/Search/";
    public static final String BOOKS_DVD_VERSION = "20130522";

    /**
     * 楽天ブックス洋書検索API
     */
    public static final String BOOKS_FOREIGN_BOOK_URL = "https://app.rakuten.co.jp/services/api/BooksForeignBook/Search/";
    public static final String BOOKS_FOREIGN_BOOK_VERSION = "20130522";

    /**
     * 楽天ブックス雑誌検索API
     */
    public static final String BOOKS_MAGAZINE_URL = "https://app.rakuten.co.jp/services/api/BooksMagazine/Search/";
    public static final String BOOKS_MAGAZINE_VERSION = "20130522";

    /**
     * 楽天ブックスゲーム検索API
     */
    public static final String BOOKS_GAME_URL = "https://app.rakuten.co.jp/services/api/BooksGame/Search/";
    public static final String BOOKS_GAME_VERSION = "20130522";

    /**
     * 楽天ブックスソフトウェア検索API
     */
    public static final String BOOKS_SOFTWARE_URL = "https://app.rakuten.co.jp/services/api/BooksSoftware/Search/";
    public static final String BOOKS_SOFTWARE_VERSION = "20130522";

    /**
     * 楽天ブックスジャンル検索API
     */
    public static final String BOOKS_GENRE_URL = "https://app.rakuten.co.jp/services/api/BooksGenre/Search/";
    public static final String BOOKS_GENRE_VERSION = "20121128";

    /**
     * 楽天オークション系API
     */

    /**
     * 楽天オークションジャンル検索API
     */
    public static final String AUCTION_GENRE_ID_URL = "https://app.rakuten.co.jp/services/api/AuctionGenreId/Search/";
    public static final String AUCTION_GENRE_ID_VERSION = "20120927";

    /**
     * 楽天オークションジャンルキーワード検索API
     */
    public static final String AUCTION_GENRE_KEYWORD_URL = "https://app.rakuten.co.jp/services/api/AuctionGenreKeyword/Search/";
    public static final String AUCTION_GENRE_KEYWORD_VERSION = "20120927";

    /**
     * 楽天オークション商品検索API
     */
    public static final String AUCTION_ITEM_URL = "https://app.rakuten.co.jp/services/api/AuctionItem/Search/";
    public static final String AUCTION_ITEM_VERSION = "20130110";

    /**
     * 楽天オークション商品コード検索API
     */
    public static final String AUCTION_ITEM_CODE_URL = "https://app.rakuten.co.jp/services/api/AuctionItemCode/Search/";
    public static final String AUCTION_ITEM_CODE_VERSION = "20121010";

    /**
     * 楽天トラベル系API
     */

    /**
     * 楽天トラベル施設検索API
     */
    public static final String TRAVEL_SIMPLE_HOTEL_SEARCH_URL = "https://app.rakuten.co.jp/services/api/Travel/SimpleHotelSearch/";
    public static final String TRAVEL_SIMPLE_HOTEL_SEARCH_VERSION = "20131024";

    /**
     * 楽天トラベル施設情報API
     */
    public static final String TRAVEL_HOTEL_DETAIL_SEARCH_URL = "https://app.rakuten.co.jp/services/api/Travel/HotelDetailSearch/";
    public static final String TRAVEL_HOTEL_DETAIL_SEARCH_VERSION = "20131024";

    /**
     * 楽天トラベル空室検索API
     */
    public static final String TRAVEL_VACANT_HOTEL_SEARCH_URL = "https://app.rakuten.co.jp/services/api/Travel/VacantHotelSearch/";
    public static final String TRAVEL_VACANT_HOTEL_SEARCH_VERSION = "20131024";

    /**
     * 楽天トラベル地区コードAPI
     */
    public static final String TRAVEL_GET_AREA_CLASS_URL = "https://app.rakuten.co.jp/services/api/Travel/GetAreaClass/";
    public static final String TRAVEL_GET_AREA_CLASS_VERSION = "20131024";

    /**
     * 楽天トラベルキーワード検索API
     */
    public static final String TRAVEL_KEYWORD_HOTEL_SEARCH_URL = "https://app.rakuten.co.jp/services/api/Travel/KeywordHotelSearch/";
    public static final String TRAVEL_KEYWORD_HOTEL_SEARCH_VERSION = "20131024";

    /**
     * 楽天トラベルホテルチェーンAPI
     */
    public static final String TRAVEL_GET_HOTEL_CHAIN_LIST_URL = "https://app.rakuten.co.jp/services/api/Travel/GetHotelChainList/";
    public static final String TRAVEL_GET_HOTEL_CHAIN_LIST_VERSION = "20131024";

    /**
     * 楽天トラベルランキングAPI
     */
    public static final String TRAVEL_HOTEL_RANKING_URL = "https://app.rakuten.co.jp/services/api/Travel/HotelRanking/";
    public static final String TRAVEL_HOTEL_RANKING_VERSION = "20131024";

    /**
     * 楽天ブックマーク系API
     * 未対応
     */

    /**
     * 楽天レシピ系API
     */

    /**
     * 楽天レシピカテゴリ一覧API
     */
    public static final String RECIPE_CATEGORY_LIST_URL = "https://app.rakuten.co.jp/services/api/Recipe/CategoryList/";
    public static final String RECIPE_CATEGORY_LIST_VERSION = "20121121";

    /**
     * 楽天レシピカテゴリ別ランキングAPI
     */
    public static final String RECIPE_CATEGORY_RANKING_URL = "https://app.rakuten.co.jp/services/api/Recipe/CategoryRanking/";
    public static final String RECIPE_CATEGORY_RANKING_VERSION = "20121121";

    /**
     * 楽天Kobo系API
     */

    /**
     * 楽天Kobo電子書籍検索API
     */
    public static final String KOBO_EBOOK_SEARCH_URL = "https://app.rakuten.co.jp/services/api/Kobo/EbookSearch/";
    public static final String KOBO_EBOOK_SEARCH_VERSION = "20140811";

    /**
     * 楽天Koboジャンル検索API
     */
    public static final String KOBO_GENERE_SEARCH_URL = "https://app.rakuten.co.jp/services/api/Kobo/GenreSearch/";
    public static final String KOBO_GENERE_SEARCH_VERSION = "20131010";

    /**
     * 楽天GORA系API
     */

    /**
     * 楽天GORAゴルフ場検索API
     */
    public static final String GORA_GORA_GOLF_COURSE_SEARCH_URL = "https://app.rakuten.co.jp/services/api/Gora/GoraGolfCourseSearch/";
    public static final String GORA_GORA_GOLF_COURSE_SEARCH_VERSION = "20131113";

    /**
     * 楽天GORAゴルフ場詳細API
     */
    public static final String GORA_GORA_GOLF_COURSE_DETAIL_URL = "https://app.rakuten.co.jp/services/api/Gora/GoraGolfCourseDetail/";
    public static final String GORA_GORA_GOLF_COURSE_DETAIL_VERSION = "20140410";

    /**
     * 楽天GORAプラン検索API
     */
    public static final String GORA_GORA_PLAN_SEARCH_URL = "https://app.rakuten.co.jp/services/api/Gora/GoraPlanSearch/";
    public static final String GORA_GORA_PLAN_SEARCH_VERSION = "20150706";

    /**
     * その他のAPI
     */

    /**
     * 楽天ダイナミックアドAPI
     */
    public static final String DYNAMIC_AD_URL = "http://api.rakuten.co.jp/rws/3.0/json";

    /**
     * 楽天ダイナミックアド トラベルAPI
     */
    public static final String DYNAMIC_AD_TRAVEL_URL = "http://api.rakuten.co.jp/rws/3.0/json?";

    /**
     * 楽天アフィリエイト高料率ショップAPI
     */
    public static final String HIGH_COMMISSION_SHOP_URL = "https://app.rakuten.co.jp/services/api/HighCommissionShop/List/";
    public static final String HIGH_COMMISSION_SHOP_VERSION = "20131205";
}
