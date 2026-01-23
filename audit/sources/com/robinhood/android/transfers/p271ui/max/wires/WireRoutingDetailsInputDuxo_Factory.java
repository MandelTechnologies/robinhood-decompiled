package com.robinhood.android.transfers.p271ui.max.wires;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.plaidconnect.api.PlaidConnectApi;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WireRoutingDetailsInputDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDuxo;", "plaidConnectApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "stateProvider", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class WireRoutingDetailsInputDuxo_Factory implements Factory<WireRoutingDetailsInputDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<PaymentInstrumentBonfireApi> paymentInstrumentBonfireApi;
    private final Provider<PlaidConnectApi> plaidConnectApi;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<WireRoutingDetailsInputStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final WireRoutingDetailsInputDuxo_Factory create(Provider<PlaidConnectApi> provider, Provider<PaymentInstrumentBonfireApi> provider2, Provider<MicrogramManager> provider3, Provider<WireRoutingDetailsInputStateProvider> provider4, Provider<DuxoBundle> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final WireRoutingDetailsInputDuxo newInstance(PlaidConnectApi plaidConnectApi, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi, MicrogramManager microgramManager, WireRoutingDetailsInputStateProvider wireRoutingDetailsInputStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(plaidConnectApi, paymentInstrumentBonfireApi, microgramManager, wireRoutingDetailsInputStateProvider, duxoBundle, savedStateHandle);
    }

    public WireRoutingDetailsInputDuxo_Factory(Provider<PlaidConnectApi> plaidConnectApi, Provider<PaymentInstrumentBonfireApi> paymentInstrumentBonfireApi, Provider<MicrogramManager> microgramManager, Provider<WireRoutingDetailsInputStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
        Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.plaidConnectApi = plaidConnectApi;
        this.paymentInstrumentBonfireApi = paymentInstrumentBonfireApi;
        this.microgramManager = microgramManager;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public WireRoutingDetailsInputDuxo get() {
        Companion companion = INSTANCE;
        PlaidConnectApi plaidConnectApi = this.plaidConnectApi.get();
        Intrinsics.checkNotNullExpressionValue(plaidConnectApi, "get(...)");
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.paymentInstrumentBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(paymentInstrumentBonfireApi, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        WireRoutingDetailsInputStateProvider wireRoutingDetailsInputStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(wireRoutingDetailsInputStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(plaidConnectApi, paymentInstrumentBonfireApi, microgramManager, wireRoutingDetailsInputStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: WireRoutingDetailsInputDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDuxo_Factory;", "plaidConnectApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "stateProvider", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDuxo;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WireRoutingDetailsInputDuxo_Factory create(Provider<PlaidConnectApi> plaidConnectApi, Provider<PaymentInstrumentBonfireApi> paymentInstrumentBonfireApi, Provider<MicrogramManager> microgramManager, Provider<WireRoutingDetailsInputStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
            Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new WireRoutingDetailsInputDuxo_Factory(plaidConnectApi, paymentInstrumentBonfireApi, microgramManager, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final WireRoutingDetailsInputDuxo newInstance(PlaidConnectApi plaidConnectApi, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi, MicrogramManager microgramManager, WireRoutingDetailsInputStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
            Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new WireRoutingDetailsInputDuxo(plaidConnectApi, paymentInstrumentBonfireApi, microgramManager, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
