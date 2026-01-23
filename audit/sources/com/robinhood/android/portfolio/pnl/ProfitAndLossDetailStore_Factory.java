package com.robinhood.android.portfolio.pnl;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wormhole.service.p554v1.PNLService;

/* compiled from: ProfitAndLossDetailStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "pnlService", "Ljavax/inject/Provider;", "Lwormhole/service/v1/PNLService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-profit-and-loss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ProfitAndLossDetailStore_Factory implements Factory<ProfitAndLossDetailStore> {
    private final Provider<PNLService> pnlService;
    private final Provider<StoreBundle> storeBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ProfitAndLossDetailStore_Factory create(Provider<PNLService> provider, Provider<StoreBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final ProfitAndLossDetailStore newInstance(PNLService pNLService, StoreBundle storeBundle) {
        return INSTANCE.newInstance(pNLService, storeBundle);
    }

    public ProfitAndLossDetailStore_Factory(Provider<PNLService> pnlService, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(pnlService, "pnlService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.pnlService = pnlService;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public ProfitAndLossDetailStore get() {
        Companion companion = INSTANCE;
        PNLService pNLService = this.pnlService.get();
        Intrinsics.checkNotNullExpressionValue(pNLService, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(pNLService, storeBundle);
    }

    /* compiled from: ProfitAndLossDetailStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore_Factory;", "pnlService", "Ljavax/inject/Provider;", "Lwormhole/service/v1/PNLService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "lib-store-profit-and-loss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ProfitAndLossDetailStore_Factory create(Provider<PNLService> pnlService, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(pnlService, "pnlService");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new ProfitAndLossDetailStore_Factory(pnlService, storeBundle);
        }

        @JvmStatic
        public final ProfitAndLossDetailStore newInstance(PNLService pnlService, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(pnlService, "pnlService");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new ProfitAndLossDetailStore(pnlService, storeBundle);
        }
    }
}
