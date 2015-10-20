# rakuten-api-client
Non official android client for [Rakuten API](https://webservice.rakuten.co.jp/document/).

# Usage
```
dependencies {
  compile 'biz.devalon.stella:rakutenapiclient:0.0.7'
}
```

## Callback Example
```
FutureCallback<JsonObject> callback = new FutureCallback<JsonObject>() {
    @Override
    public void onCompleted(Exception e, JsonObject result) {
        if (e != null) {
            e.printStackTrace();
            return;
        }
        // do something...
    }
};
```
## Usage Example 
```
Rakuten.initialize(this, "your application id here");
// Rakuten.initialize(this, "your application id here", "your affiliate id here");
Rakuten.setLogging("test", Log.DEBUG);

HashMap<String, String> params = new HashMap<>();
params.put("keyword", "テスト");

Rakuten
.create(ApiSelecter.IchibaItem)
.setCallback(callback)
.get(params);
```

## Api [(楽天API)](https://webservice.rakuten.co.jp/document/)
### 楽天市場系API
`IchibaItem`, `IchibaGenre`, `IchibaTag`, `IchibaItemRanking`, `Product`
### 楽天ブックス系API
`BooksBook`, `BooksCd`, `BooksDvd`, `BooksForeignBook`, `BooksGame`, `BooksGenre`, `BooksMagazine`, `BooksSoftware`, `BooksTotal`
### 楽天オークション系API
`AuctionGenreId`, `AuctionGenreKeyword`, `AuctionItem`, `AuctionItemCode`
### 楽天トラベル系API
`TravelGetAreaClass`, `TravelGetHotelChainList`, `TravelHotelDetailSearch`, `TravelKeywordHotelSearch`, `TravelSimpleHotelSearch`, `TravelVacantHotelSearch`, `TravelHotelRanking`
### 楽天ブックマーク系API (未対応)

### 楽天レシピ系API
`RecipeCategoryList`, `RecipeCategoryRanking`
### 楽天Kobo系API
`KoboEbookSearch`, `KoboGenreSearch`
### 楽天GORA系API
`GoraGolfCourseSearch`, `GoraGolfCourseDetail`, `GoraPlanSearch`
### その他のAPI
`DynamicAd`, `DynamicAdTravel`, `HighCommissionShop`

# Dependency
[Ion](https://github.com/koush/ion)

# License
```
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
```
