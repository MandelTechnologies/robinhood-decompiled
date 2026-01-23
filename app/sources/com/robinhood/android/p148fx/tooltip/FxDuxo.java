package com.robinhood.android.p148fx.tooltip;

import com.robinhood.android.lib.p166fx.provider.FxRatesProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FxDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/FxDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/fx/tooltip/FxDataState;", "Lcom/robinhood/android/fx/tooltip/FxViewState;", "stateProvider", "Lcom/robinhood/android/fx/tooltip/FxStateProvider;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/fx/tooltip/FxStateProvider;Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "bind", "usdAmount", "Lcom/robinhood/models/util/Money;", "streamFxQuoteState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/fx/tooltip/FxQuoteState;", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class FxDuxo extends BaseDuxo<FxDataState, FxViewState> {
    public static final int $stable = 8;
    private final FxRatesProvider fxRatesProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FxDuxo(FxStateProvider stateProvider, FxRatesProvider fxRatesProvider, DuxoBundle duxoBundle) {
        super(new FxDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.fxRatesProvider = fxRatesProvider;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C176481(null));
    }

    /* compiled from: FxDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.fx.tooltip.FxDuxo$onCreate$1", m3645f = "FxDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.fx.tooltip.FxDuxo$onCreate$1 */
    static final class C176481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C176481(Continuation<? super C176481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FxDuxo.this.new C176481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C176481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamFxQuoteState = FxDuxo.this.streamFxQuoteState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FxDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamFxQuoteState, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: FxDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quoteState", "Lcom/robinhood/android/fx/tooltip/FxQuoteState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.fx.tooltip.FxDuxo$onCreate$1$1", m3645f = "FxDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.fx.tooltip.FxDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FxQuoteState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FxDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FxDuxo fxDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = fxDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FxQuoteState fxQuoteState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(fxQuoteState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FxDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/fx/tooltip/FxDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.fx.tooltip.FxDuxo$onCreate$1$1$1", m3645f = "FxDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.fx.tooltip.FxDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501641 extends ContinuationImpl7 implements Function2<FxDataState, Continuation<? super FxDataState>, Object> {
                final /* synthetic */ FxQuoteState $quoteState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501641(FxQuoteState fxQuoteState, Continuation<? super C501641> continuation) {
                    super(2, continuation);
                    this.$quoteState = fxQuoteState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501641 c501641 = new C501641(this.$quoteState, continuation);
                    c501641.L$0 = obj;
                    return c501641;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FxDataState fxDataState, Continuation<? super FxDataState> continuation) {
                    return ((C501641) create(fxDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return FxDataState.copy$default((FxDataState) this.L$0, this.$quoteState, null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C501641((FxQuoteState) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: FxDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/fx/tooltip/FxDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.fx.tooltip.FxDuxo$bind$1", m3645f = "FxDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.fx.tooltip.FxDuxo$bind$1 */
    static final class C176471 extends ContinuationImpl7 implements Function2<FxDataState, Continuation<? super FxDataState>, Object> {
        final /* synthetic */ Money $usdAmount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C176471(Money money, Continuation<? super C176471> continuation) {
            super(2, continuation);
            this.$usdAmount = money;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176471 c176471 = new C176471(this.$usdAmount, continuation);
            c176471.L$0 = obj;
            return c176471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FxDataState fxDataState, Continuation<? super FxDataState> continuation) {
            return ((C176471) create(fxDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FxDataState.copy$default((FxDataState) this.L$0, null, this.$usdAmount, 1, null);
        }
    }

    public final void bind(Money usdAmount) {
        applyMutation(new C176471(usdAmount, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<FxQuoteState> streamFxQuoteState() {
        return FlowKt.transformLatest(FxRatesProvider.DefaultImpls.streamFxRate$default(this.fxRatesProvider, null, 1, null), new FxDuxo$streamFxQuoteState$$inlined$flatMapLatest$1(null, this));
    }
}
