package com.robinhood.android.notification.data;

import com.robinhood.android.notification.data.ProductUpsellExperiments;
import com.robinhood.android.productupsell.contracts.ProductUpsellKey;
import com.robinhood.experiments.Experiment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductUpsellHelper.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"experiment", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "getExperiment", "(Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;)Lcom/robinhood/experiments/Experiment;", "feature-lib-product-upsell_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.notification.data.ProductUpsellHelperKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ProductUpsellHelper {
    public static final Experiment<?> getExperiment(ProductUpsellKey productUpsellKey) {
        Intrinsics.checkNotNullParameter(productUpsellKey, "<this>");
        String experimentKey = productUpsellKey.getExperimentKey();
        ProductUpsellExperiments.PostTradeNotificationExperiment postTradeNotificationExperiment = ProductUpsellExperiments.PostTradeNotificationExperiment.INSTANCE;
        if (Intrinsics.areEqual(experimentKey, postTradeNotificationExperiment.getServerName())) {
            return postTradeNotificationExperiment;
        }
        return null;
    }
}
