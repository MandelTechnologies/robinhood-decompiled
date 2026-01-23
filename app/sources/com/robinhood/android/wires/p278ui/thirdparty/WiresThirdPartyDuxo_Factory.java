package com.robinhood.android.wires.p278ui.thirdparty;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
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

/* compiled from: WiresThirdPartyDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class WiresThirdPartyDuxo_Factory implements Factory<WiresThirdPartyDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<PaymentInstrumentBonfireApi> paymentInstrumentBonfireApi;
    private final Provider<PlaidConnectApi> plaidConnectApi;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final WiresThirdPartyDuxo_Factory create(Provider<DuxoBundle> provider, Provider<PlaidConnectApi> provider2, Provider<PaymentInstrumentBonfireApi> provider3, Provider<MicrogramManager> provider4, Provider<TransfersBonfireApi> provider5, Provider<EventLogger> provider6, Provider<SavedStateHandle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final WiresThirdPartyDuxo newInstance(DuxoBundle duxoBundle, PlaidConnectApi plaidConnectApi, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi, MicrogramManager microgramManager, TransfersBonfireApi transfersBonfireApi, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(duxoBundle, plaidConnectApi, paymentInstrumentBonfireApi, microgramManager, transfersBonfireApi, eventLogger, savedStateHandle);
    }

    public WiresThirdPartyDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<PlaidConnectApi> plaidConnectApi, Provider<PaymentInstrumentBonfireApi> paymentInstrumentBonfireApi, Provider<MicrogramManager> microgramManager, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<EventLogger> eventLogger, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
        Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.duxoBundle = duxoBundle;
        this.plaidConnectApi = plaidConnectApi;
        this.paymentInstrumentBonfireApi = paymentInstrumentBonfireApi;
        this.microgramManager = microgramManager;
        this.transfersBonfireApi = transfersBonfireApi;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public WiresThirdPartyDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        PlaidConnectApi plaidConnectApi = this.plaidConnectApi.get();
        Intrinsics.checkNotNullExpressionValue(plaidConnectApi, "get(...)");
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.paymentInstrumentBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(paymentInstrumentBonfireApi, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(duxoBundle, plaidConnectApi, paymentInstrumentBonfireApi, microgramManager, transfersBonfireApi, eventLogger, savedStateHandle);
    }

    /* compiled from: WiresThirdPartyDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDuxo;", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WiresThirdPartyDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<PlaidConnectApi> plaidConnectApi, Provider<PaymentInstrumentBonfireApi> paymentInstrumentBonfireApi, Provider<MicrogramManager> microgramManager, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<EventLogger> eventLogger, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
            Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new WiresThirdPartyDuxo_Factory(duxoBundle, plaidConnectApi, paymentInstrumentBonfireApi, microgramManager, transfersBonfireApi, eventLogger, savedStateHandle);
        }

        @JvmStatic
        public final WiresThirdPartyDuxo newInstance(DuxoBundle duxoBundle, PlaidConnectApi plaidConnectApi, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi, MicrogramManager microgramManager, TransfersBonfireApi transfersBonfireApi, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
            Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new WiresThirdPartyDuxo(duxoBundle, plaidConnectApi, paymentInstrumentBonfireApi, microgramManager, transfersBonfireApi, eventLogger, savedStateHandle);
        }
    }
}
