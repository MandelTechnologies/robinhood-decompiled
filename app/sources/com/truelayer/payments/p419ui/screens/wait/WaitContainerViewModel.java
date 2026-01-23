package com.truelayer.payments.p419ui.screens.wait;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow2;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.TranslatableText;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.network.experience.TranslationProvider;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.utils.UiText;
import java.util.Map;
import kotlin.ExceptionsH;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: WaitContainerViewModel.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020/J\u0010\u00101\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0016J\u0010\u00105\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0016J\b\u00106\u001a\u00020/H\u0002J\u0006\u00107\u001a\u00020/J\u001a\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020:09H\u0082@¢\u0006\u0002\u0010;R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020!0%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/wait/WaitContainerViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "providerCountryCode", "", "translations", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "api", "Lcom/truelayer/payments/core/network/Network;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/truelayer/payments/ui/models/PaymentContext;Lcom/truelayer/payments/core/domain/payments/Payment;Ljava/lang/String;Ljava/util/Map;Lcom/truelayer/payments/core/network/Network;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getApi", "()Lcom/truelayer/payments/core/network/Network;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "maxRetryCount", "", "numberOfRetries", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getPaymentContext", "()Lcom/truelayer/payments/ui/models/PaymentContext;", "paymentState", "getProviderCountryCode", "()Ljava/lang/String;", "screen", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/truelayer/payments/ui/screens/wait/WaitScreens;", "getScreen", "()Lkotlinx/coroutines/flow/StateFlow;", "screenState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "shouldAutoRetry", "", "getTranslations", "()Ljava/util/Map;", "setTranslations", "(Ljava/util/Map;)V", "waitIntervalMillis", "", "init", "", "notifyLocaleChange", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onPause", "onResume", "reloadPayment", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "updatePayment", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WaitContainerViewModel extends ViewModel implements DefaultLifecycleObserver {
    private final Network api;
    private final CoroutineDispatcher dispatcher;
    private final int maxRetryCount;
    private int numberOfRetries;
    private final Payment payment;
    private final PaymentContext paymentContext;
    private Payment paymentState;
    private final String providerCountryCode;
    private final StateFlow<WaitViewData3> screen;
    private StateFlow2<WaitViewData3> screenState;
    private boolean shouldAutoRetry;
    private Map<String, LocalisedText> translations;
    private long waitIntervalMillis;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final PaymentContext getPaymentContext() {
        return this.paymentContext;
    }

    public final Payment getPayment() {
        return this.payment;
    }

    public final String getProviderCountryCode() {
        return this.providerCountryCode;
    }

    public final Map<String, LocalisedText> getTranslations() {
        return this.translations;
    }

    public final void setTranslations(Map<String, LocalisedText> map) {
        this.translations = map;
    }

    public /* synthetic */ WaitContainerViewModel(PaymentContext paymentContext, Payment payment, String str, Map map, Network network, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentContext, payment, str, map, (i & 16) != 0 ? TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork() : network, (i & 32) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final Network getApi() {
        return this.api;
    }

    public final CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public WaitContainerViewModel(PaymentContext paymentContext, Payment payment, String providerCountryCode, Map<String, LocalisedText> map, Network api, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(providerCountryCode, "providerCountryCode");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.paymentContext = paymentContext;
        this.payment = payment;
        this.providerCountryCode = providerCountryCode;
        this.translations = map;
        this.api = api;
        this.dispatcher = dispatcher;
        StateFlow2<WaitViewData3> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(INSTANCE.produceWaitScreen(payment, map));
        this.screenState = stateFlow2MutableStateFlow;
        this.screen = FlowKt.asStateFlow(stateFlow2MutableStateFlow);
        this.paymentState = payment;
        this.waitIntervalMillis = 2500L;
        this.maxRetryCount = 6;
    }

    public final StateFlow<WaitViewData3> getScreen() {
        return this.screen;
    }

    /* compiled from: WaitContainerViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.wait.WaitContainerViewModel$init$1", m3645f = "WaitContainerViewModel.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.wait.WaitContainerViewModel$init$1 */
    static final class C432971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C432971(Continuation<? super C432971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WaitContainerViewModel.this.new C432971(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C432971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = WaitContainerViewModel.this.waitIntervalMillis;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            WaitContainerViewModel.this.reloadPayment();
            return Unit.INSTANCE;
        }
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new C432971(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), Dispatchers.getMain(), null, new C432982(null), 2, null);
    }

    /* compiled from: WaitContainerViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.wait.WaitContainerViewModel$init$2", m3645f = "WaitContainerViewModel.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.wait.WaitContainerViewModel$init$2 */
    static final class C432982 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C432982(Continuation<? super C432982> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WaitContainerViewModel.this.new C432982(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C432982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<Outcome<Map<String, LocalisedText>, CoreError>> inputTranslations = WaitContainerViewModel.this.getApi().getTranslationProvider().getInputTranslations();
                final WaitContainerViewModel waitContainerViewModel = WaitContainerViewModel.this;
                FlowCollector<? super Outcome<Map<String, LocalisedText>, CoreError>> flowCollector = new FlowCollector() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerViewModel.init.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Outcome<? extends Map<String, LocalisedText>, ? extends CoreError>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Outcome<? extends Map<String, LocalisedText>, ? extends CoreError> outcome, Continuation<? super Unit> continuation) {
                        WaitContainerViewModel waitContainerViewModel2 = waitContainerViewModel;
                        if (outcome instanceof Ok) {
                            Map<String, LocalisedText> map = (Map) ((Ok) outcome).getValue();
                            if (!Intrinsics.areEqual(waitContainerViewModel2.getTranslations(), map)) {
                                waitContainerViewModel2.setTranslations(map);
                                waitContainerViewModel2.screenState.tryEmit(WaitContainerViewModel.INSTANCE.produceWaitScreen(waitContainerViewModel2.getPayment(), map));
                            }
                        } else if (!(outcome instanceof Fail)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (inputTranslations.collect(flowCollector, this) == coroutine_suspended) {
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

    public final void retry() {
        this.screenState.tryEmit(INSTANCE.produceWaitScreen(this.payment, this.translations));
        this.numberOfRetries = 0;
        reloadPayment();
    }

    public final void notifyLocaleChange() {
        this.api.getTranslationProvider().updateInputs(this.paymentContext.intoDomain$payments_ui_release(), this.providerCountryCode);
    }

    /* compiled from: WaitContainerViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.wait.WaitContainerViewModel$reloadPayment$1", m3645f = "WaitContainerViewModel.kt", m3646l = {77, 78, 102}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.wait.WaitContainerViewModel$reloadPayment$1 */
    static final class C432991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C432991(Continuation<? super C432991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WaitContainerViewModel.this.new C432991(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C432991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Outcome outcome;
            WaitContainerViewModel waitContainerViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TranslationProvider translationProvider = WaitContainerViewModel.this.getApi().getTranslationProvider();
                com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = WaitContainerViewModel.this.getPaymentContext().intoDomain$payments_ui_release();
                String providerCountryCode = WaitContainerViewModel.this.getProviderCountryCode();
                this.label = 1;
                if (translationProvider.updateInputsSync(paymentContextIntoDomain$payments_ui_release, providerCountryCode, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    waitContainerViewModel = (WaitContainerViewModel) this.L$1;
                    outcome = (Outcome) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    waitContainerViewModel.reloadPayment();
                    WaitContainerViewModel waitContainerViewModel2 = WaitContainerViewModel.this;
                    if (!(outcome instanceof Ok)) {
                        if (outcome instanceof Fail) {
                            CoreError coreError = (CoreError) ((Fail) outcome).getError();
                            coreError.setUnderlyingError("Failed to fetch payment for wait screen");
                            waitContainerViewModel2.screenState.tryEmit(new Error(coreError));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                outcome = (Outcome) obj;
                WaitContainerViewModel waitContainerViewModel3 = WaitContainerViewModel.this;
                if (!(outcome instanceof Ok)) {
                    Payment payment = (Payment) ((Ok) outcome).getValue();
                    waitContainerViewModel3.paymentState = payment;
                    Companion companion = WaitContainerViewModel.INSTANCE;
                    if (companion.isPaymentWaiting(payment) != null) {
                        if (waitContainerViewModel3.numberOfRetries >= waitContainerViewModel3.maxRetryCount) {
                            waitContainerViewModel3.screenState.tryEmit(new WaitingTimeout(null, 1, null));
                            return Unit.INSTANCE;
                        }
                        waitContainerViewModel3.screenState.tryEmit(companion.produceWaitScreen(payment, waitContainerViewModel3.getTranslations()));
                        waitContainerViewModel3.numberOfRetries++;
                        long j = waitContainerViewModel3.waitIntervalMillis;
                        this.L$0 = outcome;
                        this.L$1 = waitContainerViewModel3;
                        this.label = 3;
                        if (DelayKt.delay(j, this) != coroutine_suspended) {
                            waitContainerViewModel = waitContainerViewModel3;
                            waitContainerViewModel.reloadPayment();
                            WaitContainerViewModel waitContainerViewModel22 = WaitContainerViewModel.this;
                            if (!(outcome instanceof Ok)) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    waitContainerViewModel3.screenState.tryEmit(new PaymentStatusChanged(payment, companion.produceWaitScreen(payment, waitContainerViewModel3.getTranslations())));
                    return Unit.INSTANCE;
                }
                if (!(outcome instanceof Fail)) {
                    throw new NoWhenBranchMatchedException();
                }
                WaitContainerViewModel waitContainerViewModel222 = WaitContainerViewModel.this;
                if (!(outcome instanceof Ok)) {
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WaitContainerViewModel waitContainerViewModel4 = WaitContainerViewModel.this;
            this.label = 2;
            obj = waitContainerViewModel4.updatePayment(this);
            if (obj != coroutine_suspended) {
                outcome = (Outcome) obj;
                WaitContainerViewModel waitContainerViewModel32 = WaitContainerViewModel.this;
                if (!(outcome instanceof Ok)) {
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reloadPayment() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new C432991(null), 2, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.shouldAutoRetry && (this.screen.getValue() instanceof WaitingTimeout)) {
            retry();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.shouldAutoRetry = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.shouldAutoRetry = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updatePayment(Continuation<? super Outcome<? extends Payment, ? extends CoreError>> continuation) {
        return this.api.getPayment(this.paymentContext.intoDomain$payments_ui_release(), continuation);
    }

    /* compiled from: WaitContainerViewModel.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0002¨\u0006\r"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/wait/WaitContainerViewModel$Companion;", "", "()V", "isPaymentWaiting", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Wait;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "produceWaitScreen", "Lcom/truelayer/payments/ui/screens/wait/Waiting;", "translations", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AuthorizationFlow2.Wait isPaymentWaiting(Payment payment) {
            AuthorizationFlow.FlowActions actions;
            AuthorizationFlow2 next;
            if (!(payment instanceof Payment.Authorizing) || (actions = ((Payment.Authorizing) payment).getAuthorizationFlow().getActions()) == null || (next = actions.getNext()) == null || !(next instanceof AuthorizationFlow2.Wait)) {
                return null;
            }
            return (AuthorizationFlow2.Wait) next;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Waiting produceWaitScreen(Payment payment, Map<String, LocalisedText> translations) {
            AuthorizationFlow2.Wait waitIsPaymentWaiting = isPaymentWaiting(payment);
            if (waitIsPaymentWaiting == null) {
                TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.WTF(null, "Wait screen invoked for non Wait action payment state.", ExceptionsKt.stackTraceToString(new Throwable("Wait screen invoked for non Wait action payment state.")), null, null, null, 57, null));
                return new Waiting(null, null, 3, null);
            }
            TranslatableText displayMessage = waitIsPaymentWaiting.getDisplayMessage();
            if (displayMessage != null) {
                if (translations == null) {
                    translations = MapsKt.emptyMap();
                }
                displayMessage.applyTranslation(translations);
                return new Waiting(new UiText.DynamicString(displayMessage.getText()), null);
            }
            return new Waiting(null, null, 1, null);
        }
    }
}
