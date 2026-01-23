package com.robinhood.android.marketdatadisclosure;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDialog;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentPrice;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Quote;
import com.robinhood.nbbo.models.api.ApiNbboSummary;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import retrofit2.Response;

/* compiled from: MarketDataDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001%B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDataState;", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "stateProvider", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getNbboSummaryStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "getQuoteStore", "()Lcom/robinhood/librobinhood/data/store/QuoteStore;", "getInstrumentStore", "()Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "shouldUseNbboSummary", "", "getShouldUseNbboSummary$lib_market_data_disclosure_externalDebug", "()Z", "fetchInstrument", "instrumentId", "Ljava/util/UUID;", "fetchInstrument$lib_market_data_disclosure_externalDebug", "Companion", "lib-market-data-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarketDataDisclosureDuxo extends BaseDuxo<MarketDataDisclosureDataState, MarketDataDisclosureViewState> implements HasSavedState {
    private final InstrumentStore instrumentStore;
    private final NbboSummaryStore nbboSummaryStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final NbboSummaryStore getNbboSummaryStore() {
        return this.nbboSummaryStore;
    }

    public final QuoteStore getQuoteStore() {
        return this.quoteStore;
    }

    public final InstrumentStore getInstrumentStore() {
        return this.instrumentStore;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MarketDataDisclosureDuxo(NbboSummaryStore nbboSummaryStore, QuoteStore quoteStore, InstrumentStore instrumentStore, MarketDataDisclosureStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new MarketDataDisclosureDataState(null, null, ((MarketDataDisclosureDialog.Args) companion.getArgs(savedStateHandle)).getQuote(), null, ((MarketDataDisclosureDialog.Args) companion.getArgs(savedStateHandle)).getSide(), ((MarketDataDisclosureDialog.Args) companion.getArgs(savedStateHandle)).getConfiguration(), 11, null), stateProvider, duxoBundle);
        this.nbboSummaryStore = nbboSummaryStore;
        this.quoteStore = quoteStore;
        this.instrumentStore = instrumentStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Companion companion = INSTANCE;
        fetchInstrument$lib_market_data_disclosure_externalDebug(((MarketDataDisclosureDialog.Args) companion.getArgs((HasSavedState) this)).getInstrumentId());
        if (getShouldUseNbboSummary$lib_market_data_disclosure_externalDebug()) {
            Observable<Response<ApiNbboSummary>> observable = this.nbboSummaryStore.refresh(((MarketDataDisclosureDialog.Args) companion.getArgs((HasSavedState) this)).getInstrumentId()).toObservable();
            Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
            ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observable, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
            LifecycleHost.DefaultImpls.bind$default(this, this.nbboSummaryStore.streamNbboSummary(((MarketDataDisclosureDialog.Args) companion.getArgs((HasSavedState) this)).getInstrumentId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketDataDisclosureDuxo.onCreate$lambda$0(this.f$0, (NbboSummary) obj);
                }
            });
            return;
        }
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C212682(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C212693(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(MarketDataDisclosureDuxo marketDataDisclosureDuxo, NbboSummary nbboSummary) {
        Intrinsics.checkNotNullParameter(nbboSummary, "nbboSummary");
        marketDataDisclosureDuxo.applyMutation(new MarketDataDisclosureDuxo3(nbboSummary, null));
        return Unit.INSTANCE;
    }

    /* compiled from: MarketDataDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDuxo$onCreate$2", m3645f = "MarketDataDisclosureDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDuxo$onCreate$2 */
    static final class C212682 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C212682(Continuation<? super C212682> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarketDataDisclosureDuxo.this.new C212682(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212682) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MarketDataDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/models/db/Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDuxo$onCreate$2$1", m3645f = "MarketDataDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Quote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MarketDataDisclosureDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MarketDataDisclosureDuxo marketDataDisclosureDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = marketDataDisclosureDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Quote quote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(quote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MarketDataDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDuxo$onCreate$2$1$1", m3645f = "MarketDataDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502701 extends ContinuationImpl7 implements Function2<MarketDataDisclosureDataState, Continuation<? super MarketDataDisclosureDataState>, Object> {
                final /* synthetic */ Quote $quote;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502701(Quote quote, Continuation<? super C502701> continuation) {
                    super(2, continuation);
                    this.$quote = quote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502701 c502701 = new C502701(this.$quote, continuation);
                    c502701.L$0 = obj;
                    return c502701;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarketDataDisclosureDataState marketDataDisclosureDataState, Continuation<? super MarketDataDisclosureDataState> continuation) {
                    return ((C502701) create(marketDataDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MarketDataDisclosureDataState.copy$default((MarketDataDisclosureDataState) this.L$0, null, null, this.$quote, null, null, null, 59, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502701((Quote) this.L$0, null));
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
                Flow<Quote> flowStreamQuote = MarketDataDisclosureDuxo.this.getQuoteStore().streamQuote(((MarketDataDisclosureDialog.Args) MarketDataDisclosureDuxo.INSTANCE.getArgs((HasSavedState) MarketDataDisclosureDuxo.this)).getInstrumentId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MarketDataDisclosureDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamQuote, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: MarketDataDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDuxo$onCreate$3", m3645f = "MarketDataDisclosureDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDuxo$onCreate$3 */
    static final class C212693 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C212693(Continuation<? super C212693> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C212693 c212693 = MarketDataDisclosureDuxo.this.new C212693(continuation);
            c212693.L$0 = obj;
            return c212693;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212693) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MarketDataDisclosureDuxo marketDataDisclosureDuxo = MarketDataDisclosureDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    QuoteStore quoteStore = marketDataDisclosureDuxo.getQuoteStore();
                    UUID instrumentId = ((MarketDataDisclosureDialog.Args) MarketDataDisclosureDuxo.INSTANCE.getArgs((HasSavedState) marketDataDisclosureDuxo)).getInstrumentId();
                    this.label = 1;
                    obj = quoteStore.getInstrumentPrice(instrumentId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((InstrumentPrice) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            MarketDataDisclosureDuxo marketDataDisclosureDuxo2 = MarketDataDisclosureDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                marketDataDisclosureDuxo2.applyMutation(new MarketDataDisclosureDuxo4((InstrumentPrice) objM28550constructorimpl, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final boolean getShouldUseNbboSummary$lib_market_data_disclosure_externalDebug() {
        Companion companion = INSTANCE;
        return ((MarketDataDisclosureDialog.Args) companion.getArgs((HasSavedState) this)).getConfiguration() == Order.Configuration.LIMIT && ((MarketDataDisclosureDialog.Args) companion.getArgs((HasSavedState) this)).getQuote() == null;
    }

    public final void fetchInstrument$lib_market_data_disclosure_externalDebug(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentStore.getInstrument(instrumentId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketDataDisclosureDuxo.fetchInstrument$lambda$1(this.f$0, (Instrument) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchInstrument$lambda$1(MarketDataDisclosureDuxo marketDataDisclosureDuxo, Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        marketDataDisclosureDuxo.applyMutation(new MarketDataDisclosureDuxo2(instrument, null));
        return Unit.INSTANCE;
    }

    /* compiled from: MarketDataDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDuxo;", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDialog$Args;", "<init>", "()V", "lib-market-data-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MarketDataDisclosureDuxo, MarketDataDisclosureDialog.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarketDataDisclosureDialog.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MarketDataDisclosureDialog.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarketDataDisclosureDialog.Args getArgs(MarketDataDisclosureDuxo marketDataDisclosureDuxo) {
            return (MarketDataDisclosureDialog.Args) DuxoCompanion.DefaultImpls.getArgs(this, marketDataDisclosureDuxo);
        }
    }
}
