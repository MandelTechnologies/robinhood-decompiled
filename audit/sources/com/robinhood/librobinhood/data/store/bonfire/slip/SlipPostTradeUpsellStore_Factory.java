package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.prefs.LongPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipPostTradeUpsellStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPostTradeUpsellStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPostTradeUpsellStore;", "slipApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/SlipApi;", "lastTimePromptedForSlipUpsell", "Lcom/robinhood/prefs/LongPreference;", "slipUpsellPromptCount", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SlipPostTradeUpsellStore_Factory implements Factory<SlipPostTradeUpsellStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<LongPreference> lastTimePromptedForSlipUpsell;
    private final Provider<SlipApi> slipApi;
    private final Provider<LongPreference> slipUpsellPromptCount;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final SlipPostTradeUpsellStore_Factory create(Provider<SlipApi> provider, Provider<LongPreference> provider2, Provider<LongPreference> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final SlipPostTradeUpsellStore newInstance(SlipApi slipApi, LongPreference longPreference, LongPreference longPreference2, StoreBundle storeBundle) {
        return INSTANCE.newInstance(slipApi, longPreference, longPreference2, storeBundle);
    }

    public SlipPostTradeUpsellStore_Factory(Provider<SlipApi> slipApi, Provider<LongPreference> lastTimePromptedForSlipUpsell, Provider<LongPreference> slipUpsellPromptCount, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(slipApi, "slipApi");
        Intrinsics.checkNotNullParameter(lastTimePromptedForSlipUpsell, "lastTimePromptedForSlipUpsell");
        Intrinsics.checkNotNullParameter(slipUpsellPromptCount, "slipUpsellPromptCount");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.slipApi = slipApi;
        this.lastTimePromptedForSlipUpsell = lastTimePromptedForSlipUpsell;
        this.slipUpsellPromptCount = slipUpsellPromptCount;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public SlipPostTradeUpsellStore get() {
        Companion companion = INSTANCE;
        SlipApi slipApi = this.slipApi.get();
        Intrinsics.checkNotNullExpressionValue(slipApi, "get(...)");
        LongPreference longPreference = this.lastTimePromptedForSlipUpsell.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        LongPreference longPreference2 = this.slipUpsellPromptCount.get();
        Intrinsics.checkNotNullExpressionValue(longPreference2, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(slipApi, longPreference, longPreference2, storeBundle);
    }

    /* compiled from: SlipPostTradeUpsellStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H\u0007J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPostTradeUpsellStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPostTradeUpsellStore_Factory;", "slipApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/SlipApi;", "lastTimePromptedForSlipUpsell", "Lcom/robinhood/prefs/LongPreference;", "slipUpsellPromptCount", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPostTradeUpsellStore;", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SlipPostTradeUpsellStore_Factory create(Provider<SlipApi> slipApi, Provider<LongPreference> lastTimePromptedForSlipUpsell, Provider<LongPreference> slipUpsellPromptCount, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(slipApi, "slipApi");
            Intrinsics.checkNotNullParameter(lastTimePromptedForSlipUpsell, "lastTimePromptedForSlipUpsell");
            Intrinsics.checkNotNullParameter(slipUpsellPromptCount, "slipUpsellPromptCount");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new SlipPostTradeUpsellStore_Factory(slipApi, lastTimePromptedForSlipUpsell, slipUpsellPromptCount, storeBundle);
        }

        @JvmStatic
        public final SlipPostTradeUpsellStore newInstance(SlipApi slipApi, LongPreference lastTimePromptedForSlipUpsell, LongPreference slipUpsellPromptCount, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(slipApi, "slipApi");
            Intrinsics.checkNotNullParameter(lastTimePromptedForSlipUpsell, "lastTimePromptedForSlipUpsell");
            Intrinsics.checkNotNullParameter(slipUpsellPromptCount, "slipUpsellPromptCount");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new SlipPostTradeUpsellStore(slipApi, lastTimePromptedForSlipUpsell, slipUpsellPromptCount, storeBundle);
        }
    }
}
