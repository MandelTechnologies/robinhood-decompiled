package com.robinhood.android.notification.data;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: ProductUpsellExperiments.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellExperiments;", "", "PostTradeNotificationExperiment", "feature-lib-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface ProductUpsellExperiments {

    /* compiled from: ProductUpsellExperiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellExperiments$PostTradeNotificationExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "feature-lib-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class PostTradeNotificationExperiment extends Experiment<SimpleVariant> {
        public static final PostTradeNotificationExperiment INSTANCE = new PostTradeNotificationExperiment();

        private PostTradeNotificationExperiment() {
            super("engagement-post-trade-notification-upsell", null, 2, null);
        }
    }
}
