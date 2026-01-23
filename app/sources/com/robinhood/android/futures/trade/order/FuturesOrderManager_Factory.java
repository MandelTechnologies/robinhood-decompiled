package com.robinhood.android.futures.trade.order;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.store.futures.FuturesPositionStore;
import com.robinhood.store.futures.PostTradeLadderFtuxState;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesOrderManager_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BJ\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/order/FuturesOrderManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/trade/order/FuturesOrderManager;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "postTradeLadderFtuxStatePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/store/futures/PostTradeLadderFtuxState;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FuturesOrderManager_Factory implements Factory<FuturesOrderManager> {
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<FuturesOrderStore> futuresOrderStore;
    private final Provider<FuturesPositionStore> futuresPositionStore;
    private final Provider<EnumPreference<PostTradeLadderFtuxState>> postTradeLadderFtuxStatePref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FuturesOrderManager_Factory create(Provider<CoroutineScope> provider, Provider<FuturesOrderStore> provider2, Provider<FuturesPositionStore> provider3, Provider<EnumPreference<PostTradeLadderFtuxState>> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final FuturesOrderManager newInstance(CoroutineScope coroutineScope, FuturesOrderStore futuresOrderStore, FuturesPositionStore futuresPositionStore, EnumPreference<PostTradeLadderFtuxState> enumPreference) {
        return INSTANCE.newInstance(coroutineScope, futuresOrderStore, futuresPositionStore, enumPreference);
    }

    public FuturesOrderManager_Factory(Provider<CoroutineScope> coroutineScope, Provider<FuturesOrderStore> futuresOrderStore, Provider<FuturesPositionStore> futuresPositionStore, Provider<EnumPreference<PostTradeLadderFtuxState>> postTradeLadderFtuxStatePref) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
        Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
        Intrinsics.checkNotNullParameter(postTradeLadderFtuxStatePref, "postTradeLadderFtuxStatePref");
        this.coroutineScope = coroutineScope;
        this.futuresOrderStore = futuresOrderStore;
        this.futuresPositionStore = futuresPositionStore;
        this.postTradeLadderFtuxStatePref = postTradeLadderFtuxStatePref;
    }

    @Override // javax.inject.Provider
    public FuturesOrderManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        FuturesOrderStore futuresOrderStore = this.futuresOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresOrderStore, "get(...)");
        FuturesPositionStore futuresPositionStore = this.futuresPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresPositionStore, "get(...)");
        EnumPreference<PostTradeLadderFtuxState> enumPreference = this.postTradeLadderFtuxStatePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        return companion.newInstance(coroutineScope, futuresOrderStore, futuresPositionStore, enumPreference);
    }

    /* compiled from: FuturesOrderManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00100\u0007H\u0007J3\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/order/FuturesOrderManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/trade/order/FuturesOrderManager_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "postTradeLadderFtuxStatePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/store/futures/PostTradeLadderFtuxState;", "Lkotlin/jvm/JvmSuppressWildcards;", "newInstance", "Lcom/robinhood/android/futures/trade/order/FuturesOrderManager;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesOrderManager_Factory create(Provider<CoroutineScope> coroutineScope, Provider<FuturesOrderStore> futuresOrderStore, Provider<FuturesPositionStore> futuresPositionStore, Provider<EnumPreference<PostTradeLadderFtuxState>> postTradeLadderFtuxStatePref) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
            Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
            Intrinsics.checkNotNullParameter(postTradeLadderFtuxStatePref, "postTradeLadderFtuxStatePref");
            return new FuturesOrderManager_Factory(coroutineScope, futuresOrderStore, futuresPositionStore, postTradeLadderFtuxStatePref);
        }

        @JvmStatic
        public final FuturesOrderManager newInstance(CoroutineScope coroutineScope, FuturesOrderStore futuresOrderStore, FuturesPositionStore futuresPositionStore, EnumPreference<PostTradeLadderFtuxState> postTradeLadderFtuxStatePref) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
            Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
            Intrinsics.checkNotNullParameter(postTradeLadderFtuxStatePref, "postTradeLadderFtuxStatePref");
            return new FuturesOrderManager(coroutineScope, futuresOrderStore, futuresPositionStore, postTradeLadderFtuxStatePref);
        }
    }
}
