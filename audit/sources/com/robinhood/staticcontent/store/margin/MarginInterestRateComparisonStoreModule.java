package com.robinhood.staticcontent.store.margin;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.staticcontent.model.margin.MarginInterestRateComparisonContent;
import com.robinhood.staticcontent.store.ContentStore;
import kotlin.Metadata;

/* compiled from: MarginInterestRateComparisonStoreModule.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/staticcontent/store/margin/MarginInterestRateComparisonStoreModule;", "", "<init>", "()V", "provideMarginInterestRateComparisonStore", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparisonContent;", PlaceTypes.STORE, "Lcom/robinhood/staticcontent/store/margin/RealMarginInterestRateComparisonStore;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class MarginInterestRateComparisonStoreModule {
    public abstract ContentStore<MarginInterestRateComparisonContent> provideMarginInterestRateComparisonStore(RealMarginInterestRateComparisonStore store);
}
