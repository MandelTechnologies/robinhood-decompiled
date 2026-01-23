package com.robinhood.android.portfolio.pnl;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnrealizedProfitAndLossStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "quoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-profit-and-loss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class UnrealizedProfitAndLossStore_Factory implements Factory<UnrealizedProfitAndLossStore> {
    private final Provider<EquitiesBrokeback> equitiesBrokeback;
    private final Provider<PositionStore> positionStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<StoreBundle> storeBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final UnrealizedProfitAndLossStore_Factory create(Provider<QuoteStore> provider, Provider<PositionStore> provider2, Provider<EquitiesBrokeback> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final UnrealizedProfitAndLossStore newInstance(QuoteStore quoteStore, PositionStore positionStore, EquitiesBrokeback equitiesBrokeback, StoreBundle storeBundle) {
        return INSTANCE.newInstance(quoteStore, positionStore, equitiesBrokeback, storeBundle);
    }

    public UnrealizedProfitAndLossStore_Factory(Provider<QuoteStore> quoteStore, Provider<PositionStore> positionStore, Provider<EquitiesBrokeback> equitiesBrokeback, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.quoteStore = quoteStore;
        this.positionStore = positionStore;
        this.equitiesBrokeback = equitiesBrokeback;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public UnrealizedProfitAndLossStore get() {
        Companion companion = INSTANCE;
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        EquitiesBrokeback equitiesBrokeback = this.equitiesBrokeback.get();
        Intrinsics.checkNotNullExpressionValue(equitiesBrokeback, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(quoteStore, positionStore, equitiesBrokeback, storeBundle);
    }

    /* compiled from: UnrealizedProfitAndLossStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore_Factory;", "quoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "lib-store-profit-and-loss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final UnrealizedProfitAndLossStore_Factory create(Provider<QuoteStore> quoteStore, Provider<PositionStore> positionStore, Provider<EquitiesBrokeback> equitiesBrokeback, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new UnrealizedProfitAndLossStore_Factory(quoteStore, positionStore, equitiesBrokeback, storeBundle);
        }

        @JvmStatic
        public final UnrealizedProfitAndLossStore newInstance(QuoteStore quoteStore, PositionStore positionStore, EquitiesBrokeback equitiesBrokeback, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new UnrealizedProfitAndLossStore(quoteStore, positionStore, equitiesBrokeback, storeBundle);
        }
    }
}
