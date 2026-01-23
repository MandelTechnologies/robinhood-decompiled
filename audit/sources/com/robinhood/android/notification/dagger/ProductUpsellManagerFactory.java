package com.robinhood.android.notification.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.notification.data.ProductUpsellManager;
import com.robinhood.android.productupsell.contracts.ProductUpsellKey;
import kotlin.Metadata;

/* compiled from: ProductUpsellManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/notification/data/ProductUpsellManager;", "upsellKey", "Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "feature-lib-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface ProductUpsellManagerFactory {
    ProductUpsellManager create(ProductUpsellKey upsellKey);
}
