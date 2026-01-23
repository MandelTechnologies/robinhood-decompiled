package com.robinhood.android.crypto.p094ui.historicalchart.compat;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.CryptoHistoricalStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p355ui.GraphSelection;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoHistoricalChartCompatDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001 B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatDataState;", "Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatDuxo$InitArgs;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatStateProvider;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatStateProvider;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "currencyPairId", "Ljava/util/UUID;", "graphSelectionRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/ui/GraphSelection;", "onCreate", "", "onResume", "setGraphSelection", "graphSelection", "InitArgs", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHistoricalChartCompatDuxo extends BaseDuxo<CryptoHistoricalChartCompatDataState, CryptoHistoricalChartCompatViewState> implements HasArgs<InitArgs> {
    public static final int $stable = 8;
    private final CryptoHistoricalStore cryptoHistoricalStore;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final UUID currencyPairId;
    private final CurrencyPairV2Store currencyPairStore;
    private final BehaviorRelay<GraphSelection> graphSelectionRelay;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHistoricalChartCompatDuxo(DuxoBundle duxoBundle, CryptoHistoricalChartCompatStateProvider stateProvider, CryptoQuoteStore cryptoQuoteStore, CryptoHistoricalStore cryptoHistoricalStore, CurrencyPairV2Store currencyPairStore, SavedStateHandle savedStateHandle) {
        super(new CryptoHistoricalChartCompatDataState(null, null, null, null, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptoHistoricalStore = cryptoHistoricalStore;
        this.currencyPairStore = currencyPairStore;
        this.savedStateHandle = savedStateHandle;
        this.currencyPairId = ((InitArgs) getArgs(getSavedStateHandle())).getCurrencyPairId();
        BehaviorRelay<GraphSelection> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.graphSelectionRelay = behaviorRelayCreate;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C135521(null));
    }

    /* compiled from: CryptoHistoricalChartCompatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onCreate$1", m3645f = "CryptoHistoricalChartCompatDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onCreate$1 */
    static final class C135521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C135521(Continuation<? super C135521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHistoricalChartCompatDuxo.this.new C135521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C135521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CurrencyPairV2Store currencyPairV2Store = CryptoHistoricalChartCompatDuxo.this.currencyPairStore;
                CryptoHistoricalChartCompatDuxo cryptoHistoricalChartCompatDuxo = CryptoHistoricalChartCompatDuxo.this;
                Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = currencyPairV2Store.streamCurrencyPairFlow(((InitArgs) cryptoHistoricalChartCompatDuxo.getArgs(cryptoHistoricalChartCompatDuxo.getSavedStateHandle())).getCurrencyPairId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHistoricalChartCompatDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCurrencyPairFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHistoricalChartCompatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onCreate$1$1", m3645f = "CryptoHistoricalChartCompatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHistoricalChartCompatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHistoricalChartCompatDuxo cryptoHistoricalChartCompatDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHistoricalChartCompatDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHistoricalChartCompatDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onCreate$1$1$1", m3645f = "CryptoHistoricalChartCompatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498101 extends ContinuationImpl7 implements Function2<CryptoHistoricalChartCompatDataState, Continuation<? super CryptoHistoricalChartCompatDataState>, Object> {
                final /* synthetic */ UiCurrencyPair $currencyPair;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498101(UiCurrencyPair uiCurrencyPair, Continuation<? super C498101> continuation) {
                    super(2, continuation);
                    this.$currencyPair = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498101 c498101 = new C498101(this.$currencyPair, continuation);
                    c498101.L$0 = obj;
                    return c498101;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHistoricalChartCompatDataState cryptoHistoricalChartCompatDataState, Continuation<? super CryptoHistoricalChartCompatDataState> continuation) {
                    return ((C498101) create(cryptoHistoricalChartCompatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoHistoricalChartCompatDataState.copy$default((CryptoHistoricalChartCompatDataState) this.L$0, this.$currencyPair, null, null, null, 14, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C498101((UiCurrencyPair) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        Observable<R> observableSwitchMap = this.graphSelectionRelay.switchMap(new Function() { // from class: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo.onResume.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Object> apply(GraphSelection graphSelection) {
                Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
                return CryptoHistoricalChartCompatDuxo.this.cryptoHistoricalStore.poll(CryptoHistoricalChartCompatDuxo.this.currencyPairId, graphSelection);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        Observable<R> observableSwitchMap2 = this.graphSelectionRelay.switchMap(new Function() { // from class: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiCryptoHistorical> apply(GraphSelection graphSelection) {
                Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
                return CryptoHistoricalChartCompatDuxo.this.cryptoHistoricalStore.streamCryptoHistorical(CryptoHistoricalChartCompatDuxo.this.currencyPairId, graphSelection);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHistoricalChartCompatDuxo.onResume$lambda$0(this.f$0, (UiCryptoHistorical) obj);
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C135554(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(CryptoHistoricalChartCompatDuxo cryptoHistoricalChartCompatDuxo, UiCryptoHistorical uiCryptoHistorical) {
        cryptoHistoricalChartCompatDuxo.applyMutation(new CryptoHistoricalChartCompatDuxo2(uiCryptoHistorical, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoHistoricalChartCompatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onResume$4", m3645f = "CryptoHistoricalChartCompatDuxo.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onResume$4 */
    static final class C135554 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C135554(Continuation<? super C135554> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHistoricalChartCompatDuxo.this.new C135554(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C135554) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CryptoQuote> flowAsFlow = CryptoHistoricalChartCompatDuxo.this.cryptoQuoteStore.getPollCryptoQuote().asFlow(new CryptoQuoteStore.CryptoQuoteArgs(CryptoHistoricalChartCompatDuxo.this.currencyPairId, null, null, 6, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHistoricalChartCompatDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHistoricalChartCompatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptoQuote", "Lcom/robinhood/models/crypto/db/CryptoQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onResume$4$1", m3645f = "CryptoHistoricalChartCompatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onResume$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoQuote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHistoricalChartCompatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHistoricalChartCompatDuxo cryptoHistoricalChartCompatDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHistoricalChartCompatDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoQuote cryptoQuote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoQuote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHistoricalChartCompatDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onResume$4$1$1", m3645f = "CryptoHistoricalChartCompatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$onResume$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498111 extends ContinuationImpl7 implements Function2<CryptoHistoricalChartCompatDataState, Continuation<? super CryptoHistoricalChartCompatDataState>, Object> {
                final /* synthetic */ CryptoQuote $cryptoQuote;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498111(CryptoQuote cryptoQuote, Continuation<? super C498111> continuation) {
                    super(2, continuation);
                    this.$cryptoQuote = cryptoQuote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498111 c498111 = new C498111(this.$cryptoQuote, continuation);
                    c498111.L$0 = obj;
                    return c498111;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHistoricalChartCompatDataState cryptoHistoricalChartCompatDataState, Continuation<? super CryptoHistoricalChartCompatDataState> continuation) {
                    return ((C498111) create(cryptoHistoricalChartCompatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoHistoricalChartCompatDataState.copy$default((CryptoHistoricalChartCompatDataState) this.L$0, null, this.$cryptoQuote, null, null, 13, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C498111((CryptoQuote) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoHistoricalChartCompatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$setGraphSelection$1", m3645f = "CryptoHistoricalChartCompatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo$setGraphSelection$1 */
    static final class C135561 extends ContinuationImpl7 implements Function2<CryptoHistoricalChartCompatDataState, Continuation<? super CryptoHistoricalChartCompatDataState>, Object> {
        final /* synthetic */ GraphSelection $graphSelection;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C135561(GraphSelection graphSelection, Continuation<? super C135561> continuation) {
            super(2, continuation);
            this.$graphSelection = graphSelection;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C135561 c135561 = new C135561(this.$graphSelection, continuation);
            c135561.L$0 = obj;
            return c135561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoHistoricalChartCompatDataState cryptoHistoricalChartCompatDataState, Continuation<? super CryptoHistoricalChartCompatDataState> continuation) {
            return ((C135561) create(cryptoHistoricalChartCompatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoHistoricalChartCompatDataState.copy$default((CryptoHistoricalChartCompatDataState) this.L$0, null, null, null, this.$graphSelection, 3, null);
        }
    }

    public final void setGraphSelection(GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        applyMutation(new C135561(graphSelection, null));
        this.graphSelectionRelay.accept(graphSelection);
    }

    /* compiled from: CryptoHistoricalChartCompatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatDuxo$InitArgs;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final UUID currencyPairId;

        /* compiled from: CryptoHistoricalChartCompatDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = initArgs.currencyPairId;
            }
            return initArgs.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final InitArgs copy(UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new InitArgs(currencyPairId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitArgs) && Intrinsics.areEqual(this.currencyPairId, ((InitArgs) other).currencyPairId);
        }

        public int hashCode() {
            return this.currencyPairId.hashCode();
        }

        public String toString() {
            return "InitArgs(currencyPairId=" + this.currencyPairId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
        }

        public InitArgs(UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.currencyPairId = currencyPairId;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }
    }
}
