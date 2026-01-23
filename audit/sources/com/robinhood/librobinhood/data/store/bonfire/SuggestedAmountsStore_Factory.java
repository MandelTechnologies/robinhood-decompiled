package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SuggestedAmountsStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;", "transfersBonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "lastUpdatedAtPreference", "Lcom/robinhood/prefs/LongPreference;", "suggestedAmountsPreference", "Lcom/robinhood/prefs/StringPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SuggestedAmountsStore_Factory implements Factory<SuggestedAmountsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<LongPreference> lastUpdatedAtPreference;
    private final Provider<LazyMoshi> moshi;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<StringPreference> suggestedAmountsPreference;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;

    @JvmStatic
    public static final SuggestedAmountsStore_Factory create(Provider<TransfersBonfireApi> provider, Provider<LongPreference> provider2, Provider<StringPreference> provider3, Provider<LazyMoshi> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final SuggestedAmountsStore newInstance(TransfersBonfireApi transfersBonfireApi, LongPreference longPreference, StringPreference stringPreference, LazyMoshi lazyMoshi, StoreBundle storeBundle) {
        return INSTANCE.newInstance(transfersBonfireApi, longPreference, stringPreference, lazyMoshi, storeBundle);
    }

    public SuggestedAmountsStore_Factory(Provider<TransfersBonfireApi> transfersBonfireApi, Provider<LongPreference> lastUpdatedAtPreference, Provider<StringPreference> suggestedAmountsPreference, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(lastUpdatedAtPreference, "lastUpdatedAtPreference");
        Intrinsics.checkNotNullParameter(suggestedAmountsPreference, "suggestedAmountsPreference");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.transfersBonfireApi = transfersBonfireApi;
        this.lastUpdatedAtPreference = lastUpdatedAtPreference;
        this.suggestedAmountsPreference = suggestedAmountsPreference;
        this.moshi = moshi;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public SuggestedAmountsStore get() {
        Companion companion = INSTANCE;
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        LongPreference longPreference = this.lastUpdatedAtPreference.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        StringPreference stringPreference = this.suggestedAmountsPreference.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(transfersBonfireApi, longPreference, stringPreference, lazyMoshi, storeBundle);
    }

    /* compiled from: SuggestedAmountsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore_Factory;", "transfersBonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "lastUpdatedAtPreference", "Lcom/robinhood/prefs/LongPreference;", "suggestedAmountsPreference", "Lcom/robinhood/prefs/StringPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SuggestedAmountsStore_Factory create(Provider<TransfersBonfireApi> transfersBonfireApi, Provider<LongPreference> lastUpdatedAtPreference, Provider<StringPreference> suggestedAmountsPreference, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(lastUpdatedAtPreference, "lastUpdatedAtPreference");
            Intrinsics.checkNotNullParameter(suggestedAmountsPreference, "suggestedAmountsPreference");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new SuggestedAmountsStore_Factory(transfersBonfireApi, lastUpdatedAtPreference, suggestedAmountsPreference, moshi, storeBundle);
        }

        @JvmStatic
        public final SuggestedAmountsStore newInstance(TransfersBonfireApi transfersBonfireApi, LongPreference lastUpdatedAtPreference, StringPreference suggestedAmountsPreference, LazyMoshi moshi, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(lastUpdatedAtPreference, "lastUpdatedAtPreference");
            Intrinsics.checkNotNullParameter(suggestedAmountsPreference, "suggestedAmountsPreference");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new SuggestedAmountsStore(transfersBonfireApi, lastUpdatedAtPreference, suggestedAmountsPreference, moshi, storeBundle);
        }
    }
}
