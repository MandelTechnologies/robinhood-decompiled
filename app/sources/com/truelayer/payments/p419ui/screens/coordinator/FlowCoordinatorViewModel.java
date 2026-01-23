package com.truelayer.payments.p419ui.screens.coordinator;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.ProviderScheme;
import com.truelayer.payments.core.domain.payments.UserAccount;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.logger.Logger6;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.store.Store;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.errors.InternalError;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.screens.Screen;
import com.truelayer.payments.p419ui.screens.coordinator.FlowState;
import com.truelayer.payments.p419ui.screens.coordinator.state.PaymentProcessorManager;
import com.truelayer.payments.p419ui.screens.coordinator.state.PaymentProcessorState;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: FlowCoordinatorViewModel.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u0000 W2\u00020\u0001:\u0002WXB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u000e\u00105\u001a\u00020.2\u0006\u00106\u001a\u000207J\u0010\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020\u0015J\b\u0010=\u001a\u00020.H\u0002J\u000e\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020@J\b\u0010A\u001a\u00020.H\u0014J\u000e\u0010B\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\rJ\u0010\u0010C\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020DH\u0002J\u0016\u0010E\u001a\u00020.2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IJ\u000e\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020LJ\u000e\u0010M\u001a\u00020.2\u0006\u00106\u001a\u000207J\u001e\u0010N\u001a\u00020.2\b\b\u0002\u0010O\u001a\u00020\u00152\n\b\u0002\u0010P\u001a\u0004\u0018\u00010GH\u0002J\u0010\u0010Q\u001a\u00020.2\u0006\u0010*\u001a\u00020\u0013H\u0002J\u001a\u0010R\u001a\u00020.2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020G0TJ\u0012\u0010U\u001a\u00020.2\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0002J\u0006\u0010V\u001a\u00020.R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\"\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0019¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u000e\u0010'\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Y"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowCoordinatorViewModel;", "Landroidx/lifecycle/ViewModel;", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", "api", "Lcom/truelayer/payments/core/network/Network;", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/truelayer/payments/ui/models/PaymentContext;Lcom/truelayer/payments/core/network/Network;Lcom/truelayer/payments/core/store/Store;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_error", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "_loadingDialog", "Lcom/truelayer/payments/ui/screens/coordinator/FlowCoordinatorViewModel$LoadingMessage;", "_merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "_screen", "Lcom/truelayer/payments/ui/screens/Screen;", "canRetry", "", "getCanRetry", "()Z", "error", "Lkotlinx/coroutines/flow/StateFlow;", "getError", "()Lkotlinx/coroutines/flow/StateFlow;", "setError", "(Lkotlinx/coroutines/flow/StateFlow;)V", "isInitialized", "isResultScreenEnabled", "loadingDialog", "getLoadingDialog", "setLoadingDialog", "maxNumberOfRetries", "", "merchantConfig", "getMerchantConfig", "numberOfRetries", "paymentStateManager", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorManager;", "screen", "getScreen", "setScreen", "cancelPayment", "", "reason", "Lcom/truelayer/payments/ui/screens/coordinator/PaymentCancellationReason;", "createFlowStateFailure", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure;", "authFlowResponse", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "deleteUserAccount", "account", "Lcom/truelayer/payments/core/domain/payments/UserAccount;", "handlePaymentProcessorState", "state", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", "initialize", "force", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "notifyPaymentStateChanged", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "onCleared", "onError", "proceedWithInternalInconsistency", "Lcom/truelayer/payments/ui/errors/InternalError;", "redirect", "redirectUrl", "", "context", "Landroid/content/Context;", "selectProvider", "selectionResult", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "selectUserAccount", "showLoading", "show", "message", "showScreen", "submitAdditionalInputs", "inputsMap", "", "tryEmmitError", "useNewAccount", "Companion", "LoadingMessage", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FlowCoordinatorViewModel extends ViewModel {
    private static final String TAG = "MGR-ViewModel";
    private StateFlow2<CoreError> _error;
    private StateFlow2<LoadingMessage> _loadingDialog;
    private final StateFlow2<MerchantConfig> _merchantConfig;
    private StateFlow2<Screen> _screen;
    private final Network api;
    private final CoroutineDispatcher dispatcher;
    private StateFlow<? extends CoreError> error;
    private boolean isInitialized;
    private StateFlow<LoadingMessage> loadingDialog;
    private int maxNumberOfRetries;
    private final StateFlow<MerchantConfig> merchantConfig;
    private int numberOfRetries;
    private final PaymentContext paymentContext;
    private final PaymentProcessorManager paymentStateManager;
    private StateFlow<? extends Screen> screen;
    private final Store store;
    public static final int $stable = 8;

    public /* synthetic */ FlowCoordinatorViewModel(PaymentContext paymentContext, Network network, Store store, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentContext, network, store, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* compiled from: FlowCoordinatorViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowCoordinatorViewModel$LoadingMessage;", "", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class LoadingMessage {
        public static final int $stable = 0;
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadingMessage() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ LoadingMessage copy$default(LoadingMessage loadingMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadingMessage.message;
            }
            return loadingMessage.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final LoadingMessage copy(String message) {
            return new LoadingMessage(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadingMessage) && Intrinsics.areEqual(this.message, ((LoadingMessage) other).message);
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "LoadingMessage(message=" + this.message + ")";
        }

        public LoadingMessage(String str) {
            this.message = str;
        }

        public /* synthetic */ LoadingMessage(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getMessage() {
            return this.message;
        }
    }

    public FlowCoordinatorViewModel(PaymentContext paymentContext, Network api, Store store, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.paymentContext = paymentContext;
        this.api = api;
        this.store = store;
        this.dispatcher = dispatcher;
        StateFlow2<Screen> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(Screen.Init.INSTANCE);
        this._screen = stateFlow2MutableStateFlow;
        this.screen = stateFlow2MutableStateFlow;
        StateFlow2<CoreError> stateFlow2MutableStateFlow2 = StateFlow4.MutableStateFlow(null);
        this._error = stateFlow2MutableStateFlow2;
        this.error = stateFlow2MutableStateFlow2;
        StateFlow2<LoadingMessage> stateFlow2MutableStateFlow3 = StateFlow4.MutableStateFlow(null);
        this._loadingDialog = stateFlow2MutableStateFlow3;
        this.loadingDialog = stateFlow2MutableStateFlow3;
        this.paymentStateManager = new PaymentProcessorManager(paymentContext, ViewModel2.getViewModelScope(this), api, store, dispatcher);
        StateFlow2<MerchantConfig> stateFlow2MutableStateFlow4 = StateFlow4.MutableStateFlow(null);
        this._merchantConfig = stateFlow2MutableStateFlow4;
        this.merchantConfig = stateFlow2MutableStateFlow4;
        this.maxNumberOfRetries = 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), dispatcher, null, new C430461(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), dispatcher, null, new C430472(null), 2, null);
    }

    public final StateFlow<Screen> getScreen() {
        return this.screen;
    }

    public final void setScreen(StateFlow<? extends Screen> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "<set-?>");
        this.screen = stateFlow;
    }

    public final StateFlow<CoreError> getError() {
        return this.error;
    }

    public final void setError(StateFlow<? extends CoreError> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "<set-?>");
        this.error = stateFlow;
    }

    public final StateFlow<LoadingMessage> getLoadingDialog() {
        return this.loadingDialog;
    }

    public final void setLoadingDialog(StateFlow<LoadingMessage> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "<set-?>");
        this.loadingDialog = stateFlow;
    }

    public final StateFlow<MerchantConfig> getMerchantConfig() {
        return this.merchantConfig;
    }

    private final boolean getCanRetry() {
        return this.numberOfRetries < this.maxNumberOfRetries;
    }

    private final boolean isResultScreenEnabled() {
        PaymentContext.Preferences preferences = this.paymentContext.getPreferences();
        if (preferences != null) {
            return preferences.getShouldPresentResultScreen();
        }
        return true;
    }

    /* compiled from: FlowCoordinatorViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorViewModel$1", m3645f = "FlowCoordinatorViewModel.kt", m3646l = {85}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorViewModel$1 */
    static final class C430461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C430461(Continuation<? super C430461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FlowCoordinatorViewModel.this.new C430461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<PaymentProcessorState> state = FlowCoordinatorViewModel.this.paymentStateManager.getState();
                final FlowCoordinatorViewModel flowCoordinatorViewModel = FlowCoordinatorViewModel.this;
                FlowCollector<? super PaymentProcessorState> flowCollector = new FlowCollector() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentProcessorState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PaymentProcessorState paymentProcessorState, Continuation<? super Unit> continuation) {
                        Logger6.d$default(Logger6.INSTANCE, "ManagerState in VM: " + paymentProcessorState.getClass(), FlowCoordinatorViewModel.TAG, null, 4, null);
                        flowCoordinatorViewModel._merchantConfig.tryEmit(flowCoordinatorViewModel.paymentStateManager.getMerchantConfig());
                        flowCoordinatorViewModel.handlePaymentProcessorState(paymentProcessorState);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (state.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* compiled from: FlowCoordinatorViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorViewModel$2", m3645f = "FlowCoordinatorViewModel.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorViewModel$2 */
    static final class C430472 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C430472(Continuation<? super C430472> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FlowCoordinatorViewModel.this.new C430472(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430472) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsLoading = FlowCoordinatorViewModel.this.paymentStateManager.isLoading();
                final FlowCoordinatorViewModel flowCoordinatorViewModel = FlowCoordinatorViewModel.this;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorViewModel.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        FlowCoordinatorViewModel.showLoading$default(flowCoordinatorViewModel, z, null, 2, null);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowIsLoading.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    public static /* synthetic */ void initialize$default(FlowCoordinatorViewModel flowCoordinatorViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        flowCoordinatorViewModel.initialize(z);
    }

    public final void initialize(boolean force) {
        if (!this.isInitialized || force) {
            this.isInitialized = true;
            tryEmmitError(null);
            showScreen(Screen.Init.INSTANCE);
            TrueLayerAnalytics.INSTANCE.setAnalyticsContext(new TrueLayerAnalytics.AnalyticsContext(this.paymentContext.getId(), null, this.paymentContext.getResourceToken(), this.paymentContext.getPaymentType().intoDomain$payments_ui_release().intoAnalyticsType(), null, null, null, this.paymentContext.getIntegrationType(), this.paymentContext.getIntegrationVersion(), 114, null));
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.SDKStarted(null, 1, null));
            if (force) {
                this.paymentStateManager.reset();
            }
            load();
        }
    }

    public final void notifyPaymentStateChanged(Payment payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        Logger6.d$default(Logger6.INSTANCE, "notifyPaymentStateChanged()", TAG, null, 4, null);
        this.paymentStateManager.notifyPaymentStateChanged(payment);
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        super.onCleared();
        Logger6.d$default(Logger6.INSTANCE, "PaymentProcessorState: ViewModel cleared", TAG, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePaymentProcessorState(PaymentProcessorState state) {
        if (state instanceof PaymentProcessorState.AuthorizationRequired) {
            this.paymentStateManager.startAuthorization();
            return;
        }
        if (state instanceof PaymentProcessorState.Authorizing.Consent) {
            PaymentProcessorState.Authorizing.Consent consent = (PaymentProcessorState.Authorizing.Consent) state;
            showScreen(Screen.ProviderSelection.INSTANCE.preselectedProvider(consent.getSelectedProvider(), consent.getPayment(), consent.getMerchantConfig(), null));
            return;
        }
        if (state instanceof PaymentProcessorState.Authorizing.Form) {
            PaymentProcessorState.Authorizing.Form form = (PaymentProcessorState.Authorizing.Form) state;
            showScreen(new Screen.Form(form.getMandatoryInputs(), form.getRecentAdditionalInput(), this.api, form.getSelectedProvider(), form.getSelectedBranch(), form.getPayment().isSignupPlus()));
            return;
        }
        if (state instanceof PaymentProcessorState.Authorizing.ProviderSelection) {
            PaymentProcessorState.Authorizing.ProviderSelection providerSelection = (PaymentProcessorState.Authorizing.ProviderSelection) state;
            showScreen(new Screen.ProviderSelection(providerSelection.getNextAction().getProviders(), providerSelection.getRecommendedProviders(), providerSelection.getPreferredCountryCode(), providerSelection.getPayment(), null, null, providerSelection.getMerchantConfig(), 48, null));
            return;
        }
        if (state instanceof PaymentProcessorState.Authorizing.Redirect) {
            showScreen(new Screen.Redirect(((PaymentProcessorState.Authorizing.Redirect) state).getNextAction().getUrl()));
            return;
        }
        if (state instanceof PaymentProcessorState.Authorizing.SchemeSelection) {
            Screen.ProviderSelection.Companion companion = Screen.ProviderSelection.INSTANCE;
            PaymentProcessorState.Authorizing.SchemeSelection schemeSelection = (PaymentProcessorState.Authorizing.SchemeSelection) state;
            PaymentProvider selectedProvider = schemeSelection.getSelectedProvider();
            Payment payment = schemeSelection.getPayment();
            MerchantConfig merchantConfig = schemeSelection.getMerchantConfig();
            List<String> schemes = schemeSelection.getNextAction().getSchemes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(schemes, 10));
            Iterator<T> it = schemes.iterator();
            while (it.hasNext()) {
                arrayList.add(new ProviderScheme((String) it.next()));
            }
            showScreen(companion.preselectedProvider(selectedProvider, payment, merchantConfig, arrayList));
            return;
        }
        if (state instanceof PaymentProcessorState.Authorizing.UserAccountSelection) {
            showScreen(new Screen.AccountSelection(((PaymentProcessorState.Authorizing.UserAccountSelection) state).getNextAction().getUserAccounts()));
            return;
        }
        if (state instanceof PaymentProcessorState.Authorizing.Wait) {
            PaymentProcessorState.Authorizing.Wait wait = (PaymentProcessorState.Authorizing.Wait) state;
            showScreen(new Screen.Wait(wait.getPayment(), wait.getLegals(), wait.getSelectedProvider(), wait.getTranslations(), this.api));
            return;
        }
        if (state instanceof PaymentProcessorState.Error.Internal) {
            proceedWithInternalInconsistency(((PaymentProcessorState.Error.Internal) state).getCode());
            return;
        }
        if (state instanceof PaymentProcessorState.Error.Core) {
            tryEmmitError(((PaymentProcessorState.Error.Core) state).getError());
            return;
        }
        if (state instanceof PaymentProcessorState.PaymentFailed) {
            if (isResultScreenEnabled()) {
                PaymentProcessorState.PaymentFailed paymentFailed = (PaymentProcessorState.PaymentFailed) state;
                showScreen(new Screen.Result(this.paymentContext, paymentFailed.getPayment(), paymentFailed.getMerchantConfig(), paymentFailed.getSelectedProvider()));
                return;
            } else {
                showScreen(new Screen.Failure(createFlowStateFailure(((PaymentProcessorState.PaymentFailed) state).getAuthorizationFlowResponse())));
                return;
            }
        }
        if (state instanceof PaymentProcessorState.PaymentSuccess) {
            if (isResultScreenEnabled()) {
                PaymentProcessorState.PaymentSuccess paymentSuccess = (PaymentProcessorState.PaymentSuccess) state;
                showScreen(new Screen.Result(this.paymentContext, paymentSuccess.getPayment(), paymentSuccess.getMerchantConfig(), paymentSuccess.getSelectedProvider()));
                return;
            } else {
                showScreen(new Screen.Success(((PaymentProcessorState.PaymentSuccess) state).getPayment()));
                return;
            }
        }
        if (state instanceof PaymentProcessorState.Uninitialized) {
            return;
        }
        if (state instanceof PaymentProcessorState.MoreDataRequiredToExecuteStep) {
            proceedWithInternalInconsistency(InternalError.FlowCoordinatorInternalInconsistency);
        } else if (state instanceof PaymentProcessorState.FinishedProcessingRedirect) {
            PaymentProcessorState.FinishedProcessingRedirect finishedProcessingRedirect = (PaymentProcessorState.FinishedProcessingRedirect) state;
            String redirectUrl = finishedProcessingRedirect.getRedirectUrl();
            PaymentProvider selectedProvider2 = finishedProcessingRedirect.getSelectedProvider();
            showScreen(new Screen.SuccessfulRedirect(redirectUrl, selectedProvider2 != null ? selectedProvider2.getId() : null));
        }
    }

    private final void tryEmmitError(CoreError error) {
        if (error == null) {
            this._error.tryEmit(null);
            return;
        }
        showLoading$default(this, false, null, 2, null);
        if (this._error.getValue() == null) {
            this._error.tryEmit(error);
        }
    }

    private final void load() {
        this.paymentStateManager.load();
    }

    /* compiled from: FlowCoordinatorViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorViewModel$cancelPayment$1", m3645f = "FlowCoordinatorViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorViewModel$cancelPayment$1 */
    static final class C430481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentCancellationReason $reason;
        int label;

        /* compiled from: FlowCoordinatorViewModel.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorViewModel$cancelPayment$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PaymentCancellationReason.values().length];
                try {
                    iArr[PaymentCancellationReason.NormalCancellation.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaymentCancellationReason.ProviderTemporarilyUnavailable.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C430481(PaymentCancellationReason paymentCancellationReason, Continuation<? super C430481> continuation) {
            super(2, continuation);
            this.$reason = paymentCancellationReason;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FlowCoordinatorViewModel.this.new C430481(this.$reason, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ProcessorResult.FailureReason failureReason;
            ProcessorResult.FailureReason failureReason2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Network network = FlowCoordinatorViewModel.this.api;
                com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = FlowCoordinatorViewModel.this.paymentContext.intoDomain$payments_ui_release();
                this.label = 1;
                obj = network.cancelPayment(paymentContextIntoDomain$payments_ui_release, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Outcome outcome = (Outcome) obj;
            FlowCoordinatorViewModel flowCoordinatorViewModel = FlowCoordinatorViewModel.this;
            PaymentCancellationReason paymentCancellationReason = this.$reason;
            boolean z = outcome instanceof Ok;
            if (z) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[paymentCancellationReason.ordinal()];
                if (i2 == 1) {
                    failureReason2 = ProcessorResult.FailureReason.UserAborted;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failureReason2 = ProcessorResult.FailureReason.UserAbortedProviderTemporarilyUnavailable;
                }
                flowCoordinatorViewModel.showScreen(new Screen.UserCancelled(failureReason2));
            } else if (!(outcome instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            FlowCoordinatorViewModel flowCoordinatorViewModel2 = FlowCoordinatorViewModel.this;
            PaymentCancellationReason paymentCancellationReason2 = this.$reason;
            if (!z) {
                if (outcome instanceof Fail) {
                    CoreError coreError = (CoreError) ((Fail) outcome).getError();
                    Logger6.w$default(Logger6.INSTANCE, "Unable to cancel payment due to error: " + coreError.getMessage() + ". TraceID: " + coreError.getTraceId(), null, null, 6, null);
                    int i3 = WhenMappings.$EnumSwitchMapping$0[paymentCancellationReason2.ordinal()];
                    if (i3 == 1) {
                        failureReason = ProcessorResult.FailureReason.UserAbortedFailedToNotifyBackend;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        failureReason = ProcessorResult.FailureReason.UserAbortedProviderTemporarilyUnavailableFailedToNotifyBackend;
                    }
                    flowCoordinatorViewModel2.showScreen(new Screen.UserCancelled(failureReason));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void cancelPayment(PaymentCancellationReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        showLoading$default(this, false, null, 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new C430481(reason, null), 2, null);
    }

    public final void onError(CoreError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        tryEmmitError(error);
    }

    public final void selectUserAccount(UserAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        showLoading$default(this, false, null, 3, null);
        this.paymentStateManager.selectUserAccount(account);
    }

    public final void deleteUserAccount(UserAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.paymentStateManager.deleteUserAccount(account);
    }

    public final void useNewAccount() {
        this.paymentStateManager.useNewAccount();
    }

    public final void selectProvider(ProviderSelectionResult selectionResult) {
        Intrinsics.checkNotNullParameter(selectionResult, "selectionResult");
        this.paymentStateManager.selectProvider(selectionResult);
    }

    private final FlowState.Failure createFlowStateFailure(AuthorizationFlowResponse authFlowResponse) {
        if (authFlowResponse instanceof AuthorizationFlowResponse.AuthorizationFailed) {
            AuthorizationFlowResponse.AuthorizationFailed authorizationFailed = (AuthorizationFlowResponse.AuthorizationFailed) authFlowResponse;
            return new FlowState.Failure(new FlowState.Failure.Reason.AuthorizationFailed(authorizationFailed.getFailureReason(), authorizationFailed.getFailureStage()));
        }
        return new FlowState.Failure(FlowState.Failure.Reason.Failed.INSTANCE);
    }

    public final void submitAdditionalInputs(Map<String, String> inputsMap) {
        Intrinsics.checkNotNullParameter(inputsMap, "inputsMap");
        PaymentProcessorManager paymentProcessorManager = this.paymentStateManager;
        Screen value = this._screen.getValue();
        paymentProcessorManager.submitAdditionalInputs(inputsMap, value instanceof Screen.Form ? (Screen.Form) value : null);
    }

    public final void redirect(String redirectUrl, Context context) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(redirectUrl));
        try {
            context.startActivity(intent);
            this.paymentStateManager.successfulRedirect();
        } catch (ActivityNotFoundException unused) {
            this.paymentStateManager.redirectFailed();
        }
    }

    private final void proceedWithInternalInconsistency(InternalError error) {
        showScreen(new Screen.Failure(new FlowState.Failure(new FlowState.Failure.Reason.Internal(error))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showScreen(Screen screen) {
        this._screen.tryEmit(screen);
    }

    static /* synthetic */ void showLoading$default(FlowCoordinatorViewModel flowCoordinatorViewModel, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        flowCoordinatorViewModel.showLoading(z, str);
    }

    private final void showLoading(boolean show, String message) {
        this._loadingDialog.tryEmit(show ? new LoadingMessage(message) : null);
    }
}
