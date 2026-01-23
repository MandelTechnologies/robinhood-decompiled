package com.robinhood.android.gold.history.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.lib.hub.store.GoldHubStore;
import com.robinhood.shared.history.HistoryTransactionLoader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldHubHistoryModule_ProvideGoldHubDepositBoostAdjustmentTransactionLoaderFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/history/provisions/GoldHubHistoryModule_ProvideGoldHubDepositBoostAdjustmentTransactionLoaderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "goldHubStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.history.provisions.GoldHubHistoryModule_ProvideGoldHubDepositBoostAdjustmentTransactionLoaderFactory */
/* loaded from: classes17.dex */
public final class C17767x99cd213 implements Factory<HistoryTransactionLoader> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<GoldHubStore> goldHubStore;

    @JvmStatic
    public static final C17767x99cd213 create(Provider<GoldHubStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final HistoryTransactionLoader provideGoldHubDepositBoostAdjustmentTransactionLoader(GoldHubStore goldHubStore) {
        return INSTANCE.provideGoldHubDepositBoostAdjustmentTransactionLoader(goldHubStore);
    }

    public C17767x99cd213(Provider<GoldHubStore> goldHubStore) {
        Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
        this.goldHubStore = goldHubStore;
    }

    @Override // javax.inject.Provider
    public HistoryTransactionLoader get() {
        Companion companion = INSTANCE;
        GoldHubStore goldHubStore = this.goldHubStore.get();
        Intrinsics.checkNotNullExpressionValue(goldHubStore, "get(...)");
        return companion.provideGoldHubDepositBoostAdjustmentTransactionLoader(goldHubStore);
    }

    /* compiled from: GoldHubHistoryModule_ProvideGoldHubDepositBoostAdjustmentTransactionLoaderFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gold/history/provisions/GoldHubHistoryModule_ProvideGoldHubDepositBoostAdjustmentTransactionLoaderFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gold/history/provisions/GoldHubHistoryModule_ProvideGoldHubDepositBoostAdjustmentTransactionLoaderFactory;", "goldHubStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;", "provideGoldHubDepositBoostAdjustmentTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.history.provisions.GoldHubHistoryModule_ProvideGoldHubDepositBoostAdjustmentTransactionLoaderFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C17767x99cd213 create(Provider<GoldHubStore> goldHubStore) {
            Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
            return new C17767x99cd213(goldHubStore);
        }

        @JvmStatic
        public final HistoryTransactionLoader provideGoldHubDepositBoostAdjustmentTransactionLoader(GoldHubStore goldHubStore) {
            Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
            Object objCheckNotNull = Preconditions.checkNotNull(GoldHubHistoryModule.INSTANCE.provideGoldHubDepositBoostAdjustmentTransactionLoader(goldHubStore), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryTransactionLoader) objCheckNotNull;
        }
    }
}
