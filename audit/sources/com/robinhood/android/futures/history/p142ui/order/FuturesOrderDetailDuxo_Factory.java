package com.robinhood.android.futures.history.p142ui.order;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.arsenal.FuturesTradingHoursStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/order/FuturesOrderDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/history/ui/order/FuturesOrderDetailDuxo;", "futuresContractStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "futuresTradingHoursStore", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesOrderDetailDuxo_Factory implements Factory<FuturesOrderDetailDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<FuturesContractStore> futuresContractStore;
    private final Provider<FuturesOrderStore> futuresOrderStore;
    private final Provider<FuturesTradingHoursStore> futuresTradingHoursStore;
    private final Provider<Navigator> navigator;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FuturesOrderDetailDuxo_Factory create(Provider<FuturesContractStore> provider, Provider<FuturesOrderStore> provider2, Provider<FuturesTradingHoursStore> provider3, Provider<Navigator> provider4, Provider<SavedStateHandle> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final FuturesOrderDetailDuxo newInstance(FuturesContractStore futuresContractStore, FuturesOrderStore futuresOrderStore, FuturesTradingHoursStore futuresTradingHoursStore, Navigator navigator, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(futuresContractStore, futuresOrderStore, futuresTradingHoursStore, navigator, savedStateHandle, duxoBundle);
    }

    public FuturesOrderDetailDuxo_Factory(Provider<FuturesContractStore> futuresContractStore, Provider<FuturesOrderStore> futuresOrderStore, Provider<FuturesTradingHoursStore> futuresTradingHoursStore, Provider<Navigator> navigator, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
        Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.futuresContractStore = futuresContractStore;
        this.futuresOrderStore = futuresOrderStore;
        this.futuresTradingHoursStore = futuresTradingHoursStore;
        this.navigator = navigator;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public FuturesOrderDetailDuxo get() {
        Companion companion = INSTANCE;
        FuturesContractStore futuresContractStore = this.futuresContractStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresContractStore, "get(...)");
        FuturesOrderStore futuresOrderStore = this.futuresOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresOrderStore, "get(...)");
        FuturesTradingHoursStore futuresTradingHoursStore = this.futuresTradingHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresTradingHoursStore, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(futuresContractStore, futuresOrderStore, futuresTradingHoursStore, navigator, savedStateHandle, duxoBundle);
    }

    /* compiled from: FuturesOrderDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/order/FuturesOrderDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/history/ui/order/FuturesOrderDetailDuxo_Factory;", "futuresContractStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "futuresTradingHoursStore", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/futures/history/ui/order/FuturesOrderDetailDuxo;", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesOrderDetailDuxo_Factory create(Provider<FuturesContractStore> futuresContractStore, Provider<FuturesOrderStore> futuresOrderStore, Provider<FuturesTradingHoursStore> futuresTradingHoursStore, Provider<Navigator> navigator, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
            Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FuturesOrderDetailDuxo_Factory(futuresContractStore, futuresOrderStore, futuresTradingHoursStore, navigator, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final FuturesOrderDetailDuxo newInstance(FuturesContractStore futuresContractStore, FuturesOrderStore futuresOrderStore, FuturesTradingHoursStore futuresTradingHoursStore, Navigator navigator, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
            Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FuturesOrderDetailDuxo(futuresContractStore, futuresOrderStore, futuresTradingHoursStore, navigator, savedStateHandle, duxoBundle);
        }
    }
}
