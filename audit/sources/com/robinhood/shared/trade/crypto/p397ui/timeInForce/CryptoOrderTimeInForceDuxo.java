package com.robinhood.shared.trade.crypto.p397ui.timeInForce;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.CryptoEventLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.trade.crypto.p397ui.timeInForce.CryptoOrderTimeInForceEvent;
import com.robinhood.shared.trade.crypto.p397ui.timeInForce.CryptoOrderTimeInForceFragment;
import com.robinhood.shared.trade.crypto.util.CryptoOrderMinuteFlowProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: CryptoOrderTimeInForceDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001%B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDataState;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceViewState;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/analytics/CryptoEventLogger;", "eventLogger", "Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;", "cryptoOrderMinuteFlowProvider", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/analytics/CryptoEventLogger;Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;)V", "", "onCreate", "()V", "Lcom/robinhood/models/db/OrderTimeInForce;", "timeInForce", "onTimeInForceSelected", "(Lcom/robinhood/models/db/OrderTimeInForce;)V", "onTimeInForceConfirmClicked", "Lcom/robinhood/analytics/CryptoEventLogger;", "Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOrderTimeInForceDuxo extends BaseDuxo3<CryptoOrderTimeInForceDataState, CryptoOrderTimeInForceViewState, CryptoOrderTimeInForceEvent> implements HasSavedState {
    private final CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider;
    private final CryptoEventLogger eventLogger;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoOrderTimeInForceDuxo(CryptoOrderTimeInForceStateProvider stateProvider, DuxoBundle duxoBundle, CryptoEventLogger eventLogger, CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider, Clock clock, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(cryptoOrderMinuteFlowProvider, "cryptoOrderMinuteFlowProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        OrderTimeInForce orderTimeInForce = OrderTimeInForce.GFD;
        Instant instantNow = Instant.now(clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        super(new CryptoOrderTimeInForceDataState(orderTimeInForce, instantNow), stateProvider, duxoBundle);
        this.eventLogger = eventLogger;
        this.cryptoOrderMinuteFlowProvider = cryptoOrderMinuteFlowProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C408201(null));
    }

    /* compiled from: CryptoOrderTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.timeInForce.CryptoOrderTimeInForceDuxo$onCreate$1", m3645f = "CryptoOrderTimeInForceDuxo.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.timeInForce.CryptoOrderTimeInForceDuxo$onCreate$1 */
    static final class C408201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C408201(Continuation<? super C408201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderTimeInForceDuxo.this.new C408201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C408201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderTimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"j$/time/Instant", "it", "", "<anonymous>", "(Lj$/time/Instant;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.timeInForce.CryptoOrderTimeInForceDuxo$onCreate$1$1", m3645f = "CryptoOrderTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.timeInForce.CryptoOrderTimeInForceDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderTimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderTimeInForceDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Instant instant, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoOrderTimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.timeInForce.CryptoOrderTimeInForceDuxo$onCreate$1$1$1", m3645f = "CryptoOrderTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.timeInForce.CryptoOrderTimeInForceDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508181 extends ContinuationImpl7 implements Function2<CryptoOrderTimeInForceDataState, Continuation<? super CryptoOrderTimeInForceDataState>, Object> {
                final /* synthetic */ Instant $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508181(Instant instant, Continuation<? super C508181> continuation) {
                    super(2, continuation);
                    this.$it = instant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508181 c508181 = new C508181(this.$it, continuation);
                    c508181.L$0 = obj;
                    return c508181;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderTimeInForceDataState cryptoOrderTimeInForceDataState, Continuation<? super CryptoOrderTimeInForceDataState> continuation) {
                    return ((C508181) create(cryptoOrderTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderTimeInForceDataState.copy$default((CryptoOrderTimeInForceDataState) this.L$0, null, this.$it, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C508181((Instant) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Instant> minuteFlow = CryptoOrderTimeInForceDuxo.this.cryptoOrderMinuteFlowProvider.getMinuteFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderTimeInForceDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(minuteFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Screen getEventScreen() {
        Screen.Name name = Screen.Name.CRYPTO_ORDER_SET_TIME_IN_FORCE;
        String string2 = ((CryptoOrderTimeInForceFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    public final void onTimeInForceSelected(OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, getEventScreen(), new Component(Component.ComponentType.RADIO_BUTTON, timeInForce.getServerValue(), null, 4, null), null, null, false, 57, null);
        applyMutation(new C408211(timeInForce, null));
    }

    /* compiled from: CryptoOrderTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.timeInForce.CryptoOrderTimeInForceDuxo$onTimeInForceSelected$1", m3645f = "CryptoOrderTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.timeInForce.CryptoOrderTimeInForceDuxo$onTimeInForceSelected$1 */
    static final class C408211 extends ContinuationImpl7 implements Function2<CryptoOrderTimeInForceDataState, Continuation<? super CryptoOrderTimeInForceDataState>, Object> {
        final /* synthetic */ OrderTimeInForce $timeInForce;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C408211(OrderTimeInForce orderTimeInForce, Continuation<? super C408211> continuation) {
            super(2, continuation);
            this.$timeInForce = orderTimeInForce;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C408211 c408211 = new C408211(this.$timeInForce, continuation);
            c408211.L$0 = obj;
            return c408211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderTimeInForceDataState cryptoOrderTimeInForceDataState, Continuation<? super CryptoOrderTimeInForceDataState> continuation) {
            return ((C408211) create(cryptoOrderTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoOrderTimeInForceDataState.copy$default((CryptoOrderTimeInForceDataState) this.L$0, this.$timeInForce, null, 2, null);
        }
    }

    public final void onTimeInForceConfirmClicked() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.timeInForce.CryptoOrderTimeInForceDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderTimeInForceDuxo.onTimeInForceConfirmClicked$lambda$0(this.f$0, (CryptoOrderTimeInForceDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTimeInForceConfirmClicked$lambda$0(CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo, CryptoOrderTimeInForceDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logTap$default(cryptoOrderTimeInForceDuxo.eventLogger, null, cryptoOrderTimeInForceDuxo.getEventScreen(), new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, null, false, 57, null);
        cryptoOrderTimeInForceDuxo.submit(new CryptoOrderTimeInForceEvent.ConfirmTimeInForce(it.getSelectedTimeInForce(), ((CryptoOrderTimeInForceFragment.Args) INSTANCE.getArgs((HasSavedState) cryptoOrderTimeInForceDuxo)).getOrderPrices()));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoOrderTimeInForceDuxo, CryptoOrderTimeInForceFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderTimeInForceFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoOrderTimeInForceFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderTimeInForceFragment.Args getArgs(CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo) {
            return (CryptoOrderTimeInForceFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoOrderTimeInForceDuxo);
        }
    }
}
