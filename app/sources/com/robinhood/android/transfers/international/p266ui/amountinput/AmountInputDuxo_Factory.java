package com.robinhood.android.transfers.international.p266ui.amountinput;

import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.p166fx.provider.McwFxRatesProvider;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AmountInputDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDuxo;", "bffMoneyMovementService", "Ljavax/inject/Provider;", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "stateProvider", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AmountInputDuxo_Factory implements Factory<AmountInputDuxo> {
    private final Provider<BffMoneyMovementService> bffMoneyMovementService;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<McwFxRatesProvider> fxRatesProvider;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<AmountInputStateProvider> stateProvider;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AmountInputDuxo_Factory create(Provider<BffMoneyMovementService> provider, Provider<EventLogger> provider2, Provider<McwFxRatesProvider> provider3, Provider<MicrogramManager> provider4, Provider<TransfersBonfireApi> provider5, Provider<AmountInputStateProvider> provider6, Provider<DuxoBundle> provider7, Provider<SavedStateHandle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final AmountInputDuxo newInstance(BffMoneyMovementService bffMoneyMovementService, EventLogger eventLogger, McwFxRatesProvider mcwFxRatesProvider, MicrogramManager microgramManager, TransfersBonfireApi transfersBonfireApi, AmountInputStateProvider amountInputStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(bffMoneyMovementService, eventLogger, mcwFxRatesProvider, microgramManager, transfersBonfireApi, amountInputStateProvider, duxoBundle, savedStateHandle);
    }

    public AmountInputDuxo_Factory(Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<EventLogger> eventLogger, Provider<McwFxRatesProvider> fxRatesProvider, Provider<MicrogramManager> microgramManager, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<AmountInputStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.eventLogger = eventLogger;
        this.fxRatesProvider = fxRatesProvider;
        this.microgramManager = microgramManager;
        this.transfersBonfireApi = transfersBonfireApi;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public AmountInputDuxo get() {
        Companion companion = INSTANCE;
        BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService.get();
        Intrinsics.checkNotNullExpressionValue(bffMoneyMovementService, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        McwFxRatesProvider mcwFxRatesProvider = this.fxRatesProvider.get();
        Intrinsics.checkNotNullExpressionValue(mcwFxRatesProvider, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        AmountInputStateProvider amountInputStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(amountInputStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(bffMoneyMovementService, eventLogger, mcwFxRatesProvider, microgramManager, transfersBonfireApi, amountInputStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: AmountInputDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDuxo_Factory;", "bffMoneyMovementService", "Ljavax/inject/Provider;", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "stateProvider", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDuxo;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AmountInputDuxo_Factory create(Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<EventLogger> eventLogger, Provider<McwFxRatesProvider> fxRatesProvider, Provider<MicrogramManager> microgramManager, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<AmountInputStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new AmountInputDuxo_Factory(bffMoneyMovementService, eventLogger, fxRatesProvider, microgramManager, transfersBonfireApi, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final AmountInputDuxo newInstance(BffMoneyMovementService bffMoneyMovementService, EventLogger eventLogger, McwFxRatesProvider fxRatesProvider, MicrogramManager microgramManager, TransfersBonfireApi transfersBonfireApi, AmountInputStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new AmountInputDuxo(bffMoneyMovementService, eventLogger, fxRatesProvider, microgramManager, transfersBonfireApi, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
