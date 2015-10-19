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

import biz.devalon.stella.rakutenapiclient.api.BaseApi;
import biz.devalon.stella.rakutenapiclient.api.auction.AuctionGenereIdApi;
import biz.devalon.stella.rakutenapiclient.api.auction.AuctionGenreKeywordApi;
import biz.devalon.stella.rakutenapiclient.api.auction.AuctionItemApi;
import biz.devalon.stella.rakutenapiclient.api.auction.AuctionItemCodeApi;
import biz.devalon.stella.rakutenapiclient.api.books.BooksBookApi;
import biz.devalon.stella.rakutenapiclient.api.books.BooksCdApi;
import biz.devalon.stella.rakutenapiclient.api.books.BooksDvdApi;
import biz.devalon.stella.rakutenapiclient.api.books.BooksForeignBookApi;
import biz.devalon.stella.rakutenapiclient.api.books.BooksGameApi;
import biz.devalon.stella.rakutenapiclient.api.books.BooksGenreApi;
import biz.devalon.stella.rakutenapiclient.api.books.BooksMagazineApi;
import biz.devalon.stella.rakutenapiclient.api.books.BooksSoftwareApi;
import biz.devalon.stella.rakutenapiclient.api.books.BooksTotalApi;
import biz.devalon.stella.rakutenapiclient.api.etc.DynamicAdApi;
import biz.devalon.stella.rakutenapiclient.api.etc.DynamicAdTravelApi;
import biz.devalon.stella.rakutenapiclient.api.etc.HighCommissionShopApi;
import biz.devalon.stella.rakutenapiclient.api.gora.GoraGolfCourseSearchApi;
import biz.devalon.stella.rakutenapiclient.api.gora.GoraGolfCouseDetailApi;
import biz.devalon.stella.rakutenapiclient.api.gora.GoraPlanSearchApi;
import biz.devalon.stella.rakutenapiclient.api.ichibaitem.IchibaGenreApi;
import biz.devalon.stella.rakutenapiclient.api.ichibaitem.IchibaItemApi;
import biz.devalon.stella.rakutenapiclient.api.ichibaitem.IchibaItemRankingApi;
import biz.devalon.stella.rakutenapiclient.api.ichibaitem.IchibaTagApi;
import biz.devalon.stella.rakutenapiclient.api.ichibaitem.ProductApi;
import biz.devalon.stella.rakutenapiclient.api.kobo.KoboEbookSearchApi;
import biz.devalon.stella.rakutenapiclient.api.kobo.KoboGenreSearchApi;
import biz.devalon.stella.rakutenapiclient.api.recipe.RecipeCategoryListApi;
import biz.devalon.stella.rakutenapiclient.api.recipe.RecipeCategoryRankingApi;
import biz.devalon.stella.rakutenapiclient.api.travel.TravelGetAreaClassApi;
import biz.devalon.stella.rakutenapiclient.api.travel.TravelGetHotelChainListApi;
import biz.devalon.stella.rakutenapiclient.api.travel.TravelHotelDetailSearchApi;
import biz.devalon.stella.rakutenapiclient.api.travel.TravelHotelRankingApi;
import biz.devalon.stella.rakutenapiclient.api.travel.TravelKeywordHotelSearchApi;
import biz.devalon.stella.rakutenapiclient.api.travel.TravelSimpleHotelSearchApi;
import biz.devalon.stella.rakutenapiclient.api.travel.TravelVacantHotelSearchApi;

/**
 * Created by ichiwa on 2015/10/15.
 */
public enum ApiSelecter {
    IchibaItem(IchibaItemApi.class),
    IchibaGenre(IchibaGenreApi.class),
    IchibaTag(IchibaTagApi.class),
    Product(ProductApi.class),
    IchibaItemRanking(IchibaItemRankingApi.class),

    BooksBook(BooksBookApi.class),
    BooksCd(BooksCdApi.class),
    BooksDvd(BooksDvdApi.class),
    BooksForeignBook(BooksForeignBookApi.class),
    BooksGame(BooksGameApi.class),
    BooksGenre(BooksGenreApi.class),
    BooksMagazine(BooksMagazineApi.class),
    BooksSoftware(BooksSoftwareApi.class),
    BooksTotal(BooksTotalApi.class),

    AuctionGenreId(AuctionGenereIdApi.class),
    AuctionGenreKeyword(AuctionGenreKeywordApi.class),
    AuctionItem(AuctionItemApi.class),
    AuctionItemCode(AuctionItemCodeApi.class),

    TravelGetAreaClass(TravelGetAreaClassApi.class),
    TravelGetHotelChainList(TravelGetHotelChainListApi.class),
    TravelHotelDetailSearch(TravelHotelDetailSearchApi.class),
    TravelKeywordHotelSearch(TravelKeywordHotelSearchApi.class),
    TravelSimpleHotelSearch(TravelSimpleHotelSearchApi.class),
    TravelVacantHotelSearch(TravelVacantHotelSearchApi.class),
    TravelHotelRanking(TravelHotelRankingApi.class),

    RecipeCategoryList(RecipeCategoryListApi.class),
    RecipeCategoryRanking(RecipeCategoryRankingApi.class),

    KoboEbookSearch(KoboEbookSearchApi.class),
    KoboGenreSearch(KoboGenreSearchApi.class),

    GoraGolfCourseSearch(GoraGolfCourseSearchApi.class),
    GoraGolfCourseDetail(GoraGolfCouseDetailApi.class),
    GoraPlanSearch(GoraPlanSearchApi.class),

    DynamicAd(DynamicAdApi.class),
    DynamicAdTravel(DynamicAdTravelApi.class),
    HighCommissionShop(HighCommissionShopApi.class);

    private Class apiClazz;

    ApiSelecter(Class clazz) {
        apiClazz = clazz;
    }

    public BaseApi get() {
        try {
            return (BaseApi) apiClazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("");
        }
    }
}
