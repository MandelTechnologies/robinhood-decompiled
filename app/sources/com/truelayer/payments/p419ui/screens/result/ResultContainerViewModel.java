package com.truelayer.payments.p419ui.screens.result;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow2;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.payments.PaymentMethod;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.store.Store;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.models.PaymentContext3;
import com.truelayer.payments.p419ui.screens.components.NetworkErrorView;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: ResultContainerViewModel.kt */
@Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u001fH\u0002J\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020403H\u0082@¢\u0006\u0002\u00105J\u0006\u00106\u001a\u000207J\u0010\u00108\u001a\u0002072\u0006\u00101\u001a\u00020\u001fH\u0002J\b\u00109\u001a\u00020(H\u0002JO\u00109\u001a\u00020(2\u0006\u00101\u001a\u00020\u001f2!\u0010:\u001a\u001d\u0012\u0013\u0012\u00110<¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020?0;2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020D0AH\u0002J\u0006\u0010E\u001a\u000207R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020(0,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/result/ResultContainerViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "resultContext", "Lcom/truelayer/payments/ui/screens/result/ResultContext;", "api", "Lcom/truelayer/payments/core/network/Network;", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/truelayer/payments/ui/screens/result/ResultContext;Lcom/truelayer/payments/core/network/Network;Lcom/truelayer/payments/core/store/Store;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getApi", "()Lcom/truelayer/payments/core/network/Network;", "canRetry", "", "getCanRetry", "()Z", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "maxRetryCount", "", "maxWaitTimeMillis", "", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "minWaitTimeMillis", "numberOfRetries", "paymentContext", "Lcom/truelayer/payments/core/domain/payments/PaymentContext;", "paymentDetails", "Lcom/truelayer/payments/core/domain/payments/Payment;", "paymentProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "paymentType", "Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;", "getResultContext", "()Lcom/truelayer/payments/ui/screens/result/ResultContext;", "screen", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/truelayer/payments/ui/screens/result/ResultScreen;", "getScreen", "()Lkotlinx/coroutines/flow/StateFlow;", "screenState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getStore", "()Lcom/truelayer/payments/core/store/Store;", "waitTimeMillis", "getPaymentTypeFromPayment", Card.Icon.PAYMENT, "getResultData", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "", "notifyResultScreenToAnalytics", "produceResultScreen", "failedScreenProvider", "Lkotlin/Function1;", "Lcom/truelayer/payments/core/domain/payments/Payment$Failed;", "Lkotlin/ParameterName;", "name", "Lcom/truelayer/payments/ui/screens/result/Failed;", "successScreenProvider", "Lkotlin/Function0;", "Lcom/truelayer/payments/ui/screens/result/Success;", "inProgressScreenProvider", "Lcom/truelayer/payments/ui/screens/result/InProgress;", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ResultContainerViewModel extends ViewModel implements DefaultLifecycleObserver {
    public static final int $stable = 8;
    private final Network api;
    private final CoroutineDispatcher dispatcher;
    private final int maxRetryCount;
    private final long maxWaitTimeMillis;
    private MerchantConfig merchantConfig;
    private final long minWaitTimeMillis;
    private int numberOfRetries;
    private PaymentContext paymentContext;
    private Payment paymentDetails;
    private PaymentProvider paymentProvider;
    private ResultScreen8 paymentType;
    private final ResultContext resultContext;
    private final StateFlow<ResultScreen> screen;
    private StateFlow2<ResultScreen> screenState;
    private final Store store;
    private long waitTimeMillis;

    /* compiled from: ResultContainerViewModel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResultScreen8.values().length];
            try {
                iArr[ResultScreen8.Payment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResultScreen8.Mandate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final ResultContext getResultContext() {
        return this.resultContext;
    }

    public /* synthetic */ ResultContainerViewModel(ResultContext resultContext, Network network, Store store, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultContext, (i & 2) != 0 ? TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork() : network, (i & 4) != 0 ? TrueLayerUI.INSTANCE.getCore$payments_ui_release().getStore() : store, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final Network getApi() {
        return this.api;
    }

    public final Store getStore() {
        return this.store;
    }

    public final CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public ResultContainerViewModel(ResultContext resultContext, Network api, Store store, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(resultContext, "resultContext");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.resultContext = resultContext;
        this.api = api;
        this.store = store;
        this.dispatcher = dispatcher;
        StateFlow2<ResultScreen> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(new Loading(null, 1, null));
        this.screenState = stateFlow2MutableStateFlow;
        this.screen = FlowKt.asStateFlow(stateFlow2MutableStateFlow);
        this.numberOfRetries = 1;
        this.maxRetryCount = 3;
        this.maxWaitTimeMillis = 10000L;
        this.minWaitTimeMillis = 2000L;
        this.waitTimeMillis = 3000L;
        this.paymentType = ResultScreen8.Payment;
    }

    public final StateFlow<ResultScreen> getScreen() {
        return this.screen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getCanRetry() {
        return this.numberOfRetries < this.maxRetryCount;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012 A[PHI: r2
      0x0012: PHI (r2v3 long) = (r2v1 long), (r2v2 long) binds: [B:5:0x0010, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void init() {
        Long waitTimeMillis = this.resultContext.getWaitTimeMillis();
        if (waitTimeMillis != null) {
            long jLongValue = waitTimeMillis.longValue();
            long j = this.minWaitTimeMillis;
            if (jLongValue < j) {
                jLongValue = j;
                this.waitTimeMillis = jLongValue;
            } else {
                j = this.maxWaitTimeMillis;
                if (jLongValue > j) {
                }
                this.waitTimeMillis = jLongValue;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new C432392(null), 2, null);
    }

    /* compiled from: ResultContainerViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.result.ResultContainerViewModel$init$2", m3645f = "ResultContainerViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, 69, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.result.ResultContainerViewModel$init$2 */
    static final class C432392 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C432392(Continuation<? super C432392> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ResultContainerViewModel.this.new C432392(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C432392) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
        
            if (r6.emit(r4, r5) == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Outcome outcome;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ResultContainerViewModel resultContainerViewModel = ResultContainerViewModel.this;
                this.label = 1;
                obj = resultContainerViewModel.getResultData(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                outcome = (Outcome) this.L$0;
                ResultKt.throwOnFailure(obj);
                ResultContainerViewModel resultContainerViewModel2 = ResultContainerViewModel.this;
                if (!(outcome instanceof Ok)) {
                    if (outcome instanceof Fail) {
                        ProcessorResult.Failure failure = (ProcessorResult.Failure) ((Fail) outcome).getError();
                        StateFlow2 stateFlow2 = resultContainerViewModel2.screenState;
                        ResultError resultError = new ResultError(failure);
                        this.L$0 = outcome;
                        this.label = 3;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            outcome = (Outcome) obj;
            ResultContainerViewModel resultContainerViewModel3 = ResultContainerViewModel.this;
            if (outcome instanceof Ok) {
                ResultScreen resultScreen = (ResultScreen) ((Ok) outcome).getValue();
                StateFlow2 stateFlow22 = resultContainerViewModel3.screenState;
                this.L$0 = outcome;
                this.label = 2;
                if (stateFlow22.emit(resultScreen, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (!(outcome instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            ResultContainerViewModel resultContainerViewModel22 = ResultContainerViewModel.this;
            if (!(outcome instanceof Ok)) {
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ResultContainerViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.result.ResultContainerViewModel$retry$1", m3645f = "ResultContainerViewModel.kt", m3646l = {79, 81, 85, 87}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.result.ResultContainerViewModel$retry$1 */
    static final class C432451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C432451(Continuation<? super C432451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ResultContainerViewModel.this.new C432451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C432451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
        
            if (r11.emit(r4, r10) == r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Outcome outcome;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ResultContainerViewModel.this.numberOfRetries++;
                long j = ResultContainerViewModel.this.waitTimeMillis / ResultContainerViewModel.this.maxRetryCount;
                this.label = 1;
                if (DelayKt.delay(j, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    outcome = (Outcome) obj;
                    ResultContainerViewModel resultContainerViewModel = ResultContainerViewModel.this;
                    if (!(outcome instanceof Ok)) {
                        resultContainerViewModel.paymentDetails = (Payment) ((Ok) outcome).getValue();
                        resultContainerViewModel.paymentType = resultContainerViewModel.getPaymentTypeFromPayment(resultContainerViewModel.getResultContext().getPayment());
                        ResultScreen resultScreenProduceResultScreen = resultContainerViewModel.produceResultScreen();
                        StateFlow2 stateFlow2 = resultContainerViewModel.screenState;
                        this.L$0 = outcome;
                        this.label = 3;
                        if (stateFlow2.emit(resultScreenProduceResultScreen, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (!(outcome instanceof Fail)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ResultContainerViewModel resultContainerViewModel2 = ResultContainerViewModel.this;
                    if (!(outcome instanceof Ok)) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                outcome = (Outcome) this.L$0;
                ResultKt.throwOnFailure(obj);
                ResultContainerViewModel resultContainerViewModel22 = ResultContainerViewModel.this;
                if (!(outcome instanceof Ok)) {
                    if (outcome instanceof Fail) {
                        CoreError coreError = (CoreError) ((Fail) outcome).getError();
                        StateFlow2 stateFlow22 = resultContainerViewModel22.screenState;
                        ResultError resultError = new ResultError(NetworkErrorView.intoProcessorResult(coreError));
                        this.L$0 = outcome;
                        this.label = 4;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Network api = ResultContainerViewModel.this.getApi();
            PaymentContext paymentContext = ResultContainerViewModel.this.paymentContext;
            if (paymentContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paymentContext");
                paymentContext = null;
            }
            this.label = 2;
            obj = api.getPayment(paymentContext, this);
            if (obj != coroutine_suspended) {
                outcome = (Outcome) obj;
                ResultContainerViewModel resultContainerViewModel3 = ResultContainerViewModel.this;
                if (!(outcome instanceof Ok)) {
                }
                ResultContainerViewModel resultContainerViewModel222 = ResultContainerViewModel.this;
                if (!(outcome instanceof Ok)) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    public final void retry() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new C432451(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResultScreen8 getPaymentTypeFromPayment(Payment payment) {
        PaymentMethod paymentMethod = payment.getPaymentMethod();
        if (paymentMethod instanceof PaymentMethod.BankTransfer) {
            return ResultScreen8.Payment;
        }
        if (paymentMethod instanceof PaymentMethod.Mandate) {
            return ResultScreen8.Mandate;
        }
        if (paymentMethod instanceof PaymentMethod.PaymentOfMandate) {
            return ResultScreen8.Payment;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getResultData(Continuation<? super Outcome<? extends ResultScreen, ProcessorResult.Failure>> continuation) {
        this.paymentDetails = this.resultContext.getPayment();
        this.paymentType = getPaymentTypeFromPayment(this.resultContext.getPayment());
        this.paymentProvider = this.resultContext.getPaymentProvider();
        this.merchantConfig = this.resultContext.getMerchantConfig();
        this.paymentContext = this.resultContext.getPaymentContext().intoDomain$payments_ui_release();
        return new Ok(produceResultScreen());
    }

    private final void notifyResultScreenToAnalytics(final Payment payment) {
        Function0<AnalyticsEvents.PaymentResultScreenLoaded> function0 = new Function0<AnalyticsEvents.PaymentResultScreenLoaded>() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerViewModel$notifyResultScreenToAnalytics$invalidStateEvent$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AnalyticsEvents.PaymentResultScreenLoaded invoke() {
                String paymentId = payment.getPaymentId();
                String name = payment.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return new AnalyticsEvents.PaymentResultScreenLoaded(paymentId, name, "Invalid state");
            }
        };
        Function0<AnalyticsEvents.PaymentResultScreenLoaded> function02 = new Function0<AnalyticsEvents.PaymentResultScreenLoaded>() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerViewModel$notifyResultScreenToAnalytics$loadingSuccessEvent$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AnalyticsEvents.PaymentResultScreenLoaded invoke() {
                String paymentId = payment.getPaymentId();
                String name = payment.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return new AnalyticsEvents.PaymentResultScreenLoaded(paymentId, name, null);
            }
        };
        if (payment instanceof Payment.AuthorizationRequired ? true : payment instanceof Payment.Revoked) {
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(function0.invoke());
            return;
        }
        if (payment instanceof Payment.Authorizing) {
            AuthorizationFlow.FlowActions actions = ((Payment.Authorizing) payment).getAuthorizationFlow().getActions();
            if (!((actions != null ? actions.getNext() : null) instanceof AuthorizationFlow2.Wait) && !getCanRetry()) {
                TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(function0.invoke());
                return;
            } else {
                TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(function02.invoke());
                return;
            }
        }
        if (payment instanceof Payment.Authorized ? true : payment instanceof Payment.Executed ? true : payment instanceof Payment.Settled) {
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(function02.invoke());
            return;
        }
        if (payment instanceof Payment.Failed) {
            TrueLayerAnalytics analytics$payments_ui_release = TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release();
            String paymentId = payment.getPaymentId();
            String name = payment.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            analytics$payments_ui_release.track(new AnalyticsEvents.PaymentResultScreenLoaded(paymentId, name, ((Payment.Failed) payment).getFailureReason().name()));
        }
    }

    private final ResultScreen produceResultScreen(Payment payment, Function1<? super Payment.Failed, Failed> failedScreenProvider, Function0<Success> successScreenProvider, final Function0<InProgress> inProgressScreenProvider) {
        AuthorizationFlow authorizationFlow;
        AuthorizationFlow.FlowActions actions;
        Function1<AuthorizationFlow2, ResultScreen> function1 = new Function1<AuthorizationFlow2, ResultScreen>() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerViewModel$produceResultScreen$handleRetry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final ResultScreen invoke(AuthorizationFlow2 authorizationFlow2) {
                if (this.this$0.getCanRetry()) {
                    this.this$0.retry();
                    return new Loading(this.this$0.paymentProvider);
                }
                if (authorizationFlow2 != null && !(authorizationFlow2 instanceof AuthorizationFlow2.Wait)) {
                    PaymentContext paymentContext = this.this$0.paymentContext;
                    if (paymentContext == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("paymentContext");
                        paymentContext = null;
                    }
                    return new NeedsFurtherProcessing(PaymentContext3.intoUi(paymentContext));
                }
                return inProgressScreenProvider.invoke();
            }
        };
        int i = WhenMappings.$EnumSwitchMapping$0[this.paymentType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (payment instanceof Payment.AuthorizationRequired ? true : payment instanceof Payment.Revoked) {
                return ResultScreen4.INSTANCE;
            }
            if (payment instanceof Payment.Failed) {
                return failedScreenProvider.invoke(payment);
            }
            if (payment instanceof Payment.Settled ? true : payment instanceof Payment.Executed ? true : payment instanceof Payment.Authorized) {
                return successScreenProvider.invoke();
            }
            if (!(payment instanceof Payment.Authorizing)) {
                throw new NoWhenBranchMatchedException();
            }
            AuthorizationFlow.FlowActions actions2 = ((Payment.Authorizing) payment).getAuthorizationFlow().getActions();
            return function1.invoke(actions2 != null ? actions2.getNext() : null);
        }
        if (payment.getCreditableAt() != null) {
            return successScreenProvider.invoke();
        }
        if (payment instanceof Payment.AuthorizationRequired ? true : payment instanceof Payment.Revoked) {
            return ResultScreen4.INSTANCE;
        }
        if (payment instanceof Payment.Failed) {
            return failedScreenProvider.invoke(payment);
        }
        if (!(payment instanceof Payment.Settled ? true : payment instanceof Payment.Executed ? true : payment instanceof Payment.Authorized ? true : payment instanceof Payment.Authorizing)) {
            throw new NoWhenBranchMatchedException();
        }
        Payment.Authorizing authorizing = payment instanceof Payment.Authorizing ? (Payment.Authorizing) payment : null;
        if (authorizing != null && (authorizationFlow = authorizing.getAuthorizationFlow()) != null && (actions = authorizationFlow.getActions()) != null) {
            next = actions.getNext();
        }
        return function1.invoke(next);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResultScreen produceResultScreen() {
        long amountInMinor;
        int i = WhenMappings.$EnumSwitchMapping$0[this.paymentType.ordinal()];
        if (i == 1) {
            Payment payment = this.paymentDetails;
            PaymentMethod paymentMethod = payment != null ? payment.getPaymentMethod() : null;
            PaymentMethod.BankTransfer bankTransfer = paymentMethod instanceof PaymentMethod.BankTransfer ? (PaymentMethod.BankTransfer) paymentMethod : null;
            if (bankTransfer == null) {
                return new ResultError(new ProcessorResult.Failure(ProcessorResult.FailureReason.InvalidResource));
            }
            amountInMinor = bankTransfer.getAmountInMinor();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amountInMinor = 0;
        }
        final long j = amountInMinor;
        final Payment payment2 = this.paymentDetails;
        final MerchantConfig merchantConfig = this.merchantConfig;
        final PaymentProvider paymentProvider = this.paymentProvider;
        if (payment2 != null && merchantConfig != null && paymentProvider != null) {
            notifyResultScreenToAnalytics(payment2);
            return produceResultScreen(payment2, new Function1<Payment.Failed, Failed>() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerViewModel$produceResultScreen$failedScreenProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Failed invoke(Payment.Failed it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new Failed(it.getPaymentReference(), merchantConfig.getName(), it.getFailureReason(), paymentProvider, this.paymentType);
                }
            }, new Function0<Success>() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerViewModel$produceResultScreen$successScreenProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Success invoke() {
                    return new Success(payment2.getPaymentReference(), payment2.getCurrency(), j, merchantConfig.getName(), paymentProvider, this.paymentType);
                }
            }, new Function0<InProgress>() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerViewModel$produceResultScreen$inProgressScreenProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final InProgress invoke() {
                    return new InProgress(payment2.getPaymentReference(), payment2.getCurrency(), j, merchantConfig.getName(), paymentProvider, this.paymentType);
                }
            });
        }
        return new ResultError(new ProcessorResult.Failure(ProcessorResult.FailureReason.CommunicationIssue));
    }
}
