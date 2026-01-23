package com.robinhood.staticcontent.store.productmarketing;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.store.ContentStore;
import kotlin.Metadata;

/* compiled from: ProductMarketingStoreModule.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u0007\u001a\u00020\u000bH'¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/staticcontent/store/productmarketing/ProductMarketingStoreModule;", "", "<init>", "()V", "bindMarketing", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", PlaceTypes.STORE, "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "bindFeature", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingContentFeatureStore;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class ProductMarketingStoreModule {
    public abstract ContentStore<ProductMarketingContent.Feature> bindFeature(RealProductMarketingContentFeatureStore store);

    public abstract ContentStore<ProductMarketingContent> bindMarketing(RealProductMarketingStore store);
}
