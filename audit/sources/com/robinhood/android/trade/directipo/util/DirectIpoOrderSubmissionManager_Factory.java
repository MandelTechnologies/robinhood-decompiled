package com.robinhood.android.trade.directipo.util;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.OrderStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DirectIpoOrderSubmissionManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DirectIpoOrderSubmissionManager_Factory implements Factory<DirectIpoOrderSubmissionManager> {
    private final Provider<DirectIpoApi> api;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<OrderStore> orderStore;
    private final Provider<RxFactory> rxFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DirectIpoOrderSubmissionManager_Factory create(Provider<DirectIpoApi> provider, Provider<OrderStore> provider2, Provider<RxFactory> provider3, Provider<CoroutineScope> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final DirectIpoOrderSubmissionManager newInstance(DirectIpoApi directIpoApi, OrderStore orderStore, RxFactory rxFactory, CoroutineScope coroutineScope) {
        return INSTANCE.newInstance(directIpoApi, orderStore, rxFactory, coroutineScope);
    }

    public DirectIpoOrderSubmissionManager_Factory(Provider<DirectIpoApi> api, Provider<OrderStore> orderStore, Provider<RxFactory> rxFactory, Provider<CoroutineScope> coroutineScope) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.api = api;
        this.orderStore = orderStore;
        this.rxFactory = rxFactory;
        this.coroutineScope = coroutineScope;
    }

    @Override // javax.inject.Provider
    public DirectIpoOrderSubmissionManager get() {
        Companion companion = INSTANCE;
        DirectIpoApi directIpoApi = this.api.get();
        Intrinsics.checkNotNullExpressionValue(directIpoApi, "get(...)");
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        return companion.newInstance(directIpoApi, orderStore, rxFactory, coroutineScope);
    }

    /* compiled from: DirectIpoOrderSubmissionManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager_Factory;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "newInstance", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DirectIpoOrderSubmissionManager_Factory create(Provider<DirectIpoApi> api, Provider<OrderStore> orderStore, Provider<RxFactory> rxFactory, Provider<CoroutineScope> coroutineScope) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            return new DirectIpoOrderSubmissionManager_Factory(api, orderStore, rxFactory, coroutineScope);
        }

        @JvmStatic
        public final DirectIpoOrderSubmissionManager newInstance(DirectIpoApi api, OrderStore orderStore, RxFactory rxFactory, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            return new DirectIpoOrderSubmissionManager(api, orderStore, rxFactory, coroutineScope);
        }
    }
}
