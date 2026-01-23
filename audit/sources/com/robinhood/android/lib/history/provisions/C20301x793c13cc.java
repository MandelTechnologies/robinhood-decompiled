package com.robinhood.android.lib.history.provisions;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore;
import com.robinhood.shared.history.HistoryLoaderV2;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginSubscriptionFeeHistoryModule_ProvideFeeRefundHistoryLoaderCallbacksFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/history/provisions/MarginSubscriptionFeeHistoryModule_ProvideFeeRefundHistoryLoaderCallbacksFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/HistoryLoaderV2;", PlaceTypes.STORE, "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.history.provisions.MarginSubscriptionFeeHistoryModule_ProvideFeeRefundHistoryLoaderCallbacksFactory */
/* loaded from: classes17.dex */
public final class C20301x793c13cc implements Factory<HistoryLoaderV2> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<MarginSubscriptionFeeStore> store;

    @JvmStatic
    public static final C20301x793c13cc create(Provider<MarginSubscriptionFeeStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final HistoryLoaderV2 provideFeeRefundHistoryLoaderCallbacks(MarginSubscriptionFeeStore marginSubscriptionFeeStore) {
        return INSTANCE.provideFeeRefundHistoryLoaderCallbacks(marginSubscriptionFeeStore);
    }

    public C20301x793c13cc(Provider<MarginSubscriptionFeeStore> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.store = store;
    }

    @Override // javax.inject.Provider
    public HistoryLoaderV2 get() {
        Companion companion = INSTANCE;
        MarginSubscriptionFeeStore marginSubscriptionFeeStore = this.store.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionFeeStore, "get(...)");
        return companion.provideFeeRefundHistoryLoaderCallbacks(marginSubscriptionFeeStore);
    }

    /* compiled from: MarginSubscriptionFeeHistoryModule_ProvideFeeRefundHistoryLoaderCallbacksFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/history/provisions/MarginSubscriptionFeeHistoryModule_ProvideFeeRefundHistoryLoaderCallbacksFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/history/provisions/MarginSubscriptionFeeHistoryModule_ProvideFeeRefundHistoryLoaderCallbacksFactory;", PlaceTypes.STORE, "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore;", "provideFeeRefundHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.history.provisions.MarginSubscriptionFeeHistoryModule_ProvideFeeRefundHistoryLoaderCallbacksFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C20301x793c13cc create(Provider<MarginSubscriptionFeeStore> store) {
            Intrinsics.checkNotNullParameter(store, "store");
            return new C20301x793c13cc(store);
        }

        @JvmStatic
        public final HistoryLoaderV2 provideFeeRefundHistoryLoaderCallbacks(MarginSubscriptionFeeStore store) {
            Intrinsics.checkNotNullParameter(store, "store");
            Object objCheckNotNull = Preconditions.checkNotNull(MarginSubscriptionFeeHistoryModule.INSTANCE.provideFeeRefundHistoryLoaderCallbacks(store), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryLoaderV2) objCheckNotNull;
        }
    }
}
