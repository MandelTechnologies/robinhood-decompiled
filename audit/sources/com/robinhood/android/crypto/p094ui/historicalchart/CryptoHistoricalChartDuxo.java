package com.robinhood.android.crypto.p094ui.historicalchart;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.regiongate.CryptoBitstampUkUpsellRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoHistoricalChartStore;
import com.robinhood.librobinhood.data.store.CryptoRewardsStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.prefs.ShowCandlestickSduiChartPref;
import com.robinhood.models.crypto.p314db.CryptoHistoricalChart;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.charts.p374ui.HistoricalChartComposable;
import contracts.crypto.rewards.proto.p430v1.GetCryptoDetailRewardButtonResponseDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CryptoHistoricalChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BS\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u001f\u001a\u00020 H\u0016J\u0015\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001cH\u0000¢\u0006\u0002\b#J\u0017\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0002\b'J\u0015\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u001aH\u0000¢\u0006\u0002\b*J\u000e\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010-\u001a\u00020.*\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDataState;", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartStateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoHistoricalChartStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalChartStore;", "cryptoRewardsStore", "Lcom/robinhood/librobinhood/data/store/CryptoRewardsStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartStateProvider;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoHistoricalChartStore;Lcom/robinhood/librobinhood/data/store/CryptoRewardsStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/BooleanPreference;)V", "displaySpanFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "currencyPairIdFlow", "Ljava/util/UUID;", "chartModeFlow", "Lcom/robinhood/shared/crypto/charts/ui/ChartMode;", "onCreate", "", "setArgs", "currencyPairId", "setArgs$feature_crypto_externalDebug", "onScrub", "scrubPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "onScrub$feature_crypto_externalDebug", "onSpanSelected", "span", "onSpanSelected$feature_crypto_externalDebug", "toggleChartMode", "currentChartMode", "showCandleSticks", "", "getShowCandleSticks", "(Lcom/robinhood/shared/crypto/charts/ui/ChartMode;)Z", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoHistoricalChartDuxo extends BaseDuxo<CryptoHistoricalChartDataState, CryptoHistoricalChartViewState> {
    public static final int $stable = 8;
    private final AppType appType;
    private final StateFlow2<HistoricalChartComposable> chartModeFlow;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoHistoricalChartStore cryptoHistoricalChartStore;
    private final CryptoRewardsStore cryptoRewardsStore;
    private final StateFlow2<UUID> currencyPairIdFlow;
    private final CurrencyPairV2Store currencyPairStore;
    private final StateFlow2<DisplaySpan> displaySpanFlow;
    private final RegionGateProvider regionGateProvider;
    private final BooleanPreference showCandlestickChartPref;

    /* compiled from: CryptoHistoricalChartDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HistoricalChartComposable.values().length];
            try {
                iArr[HistoricalChartComposable.CANDLE_STICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HistoricalChartComposable.LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoHistoricalChartDuxo(DuxoBundle duxoBundle, CryptoHistoricalChartStateProvider stateProvider, AppType appType, CryptoExperimentsStore cryptoExperimentsStore, CryptoHistoricalChartStore cryptoHistoricalChartStore, CryptoRewardsStore cryptoRewardsStore, CurrencyPairV2Store currencyPairStore, RegionGateProvider regionGateProvider, @ShowCandlestickSduiChartPref BooleanPreference showCandlestickChartPref) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoHistoricalChartStore, "cryptoHistoricalChartStore");
        Intrinsics.checkNotNullParameter(cryptoRewardsStore, "cryptoRewardsStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
        DisplaySpan displaySpan = DisplaySpan.DAY;
        super(new CryptoHistoricalChartDataState(null, displaySpan, null, null, CryptoHistoricalChartDuxo6.getChartModeFromPreference(showCandlestickChartPref), null, false, 96, null), stateProvider, duxoBundle);
        this.appType = appType;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoHistoricalChartStore = cryptoHistoricalChartStore;
        this.cryptoRewardsStore = cryptoRewardsStore;
        this.currencyPairStore = currencyPairStore;
        this.regionGateProvider = regionGateProvider;
        this.showCandlestickChartPref = showCandlestickChartPref;
        this.displaySpanFlow = StateFlow4.MutableStateFlow(displaySpan);
        this.currencyPairIdFlow = StateFlow4.MutableStateFlow(null);
        this.chartModeFlow = StateFlow4.MutableStateFlow(CryptoHistoricalChartDuxo6.getChartModeFromPreference(showCandlestickChartPref));
    }

    /* compiled from: CryptoHistoricalChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1 */
    static final class C135441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C135441(Continuation<? super C135441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C135441 c135441 = CryptoHistoricalChartDuxo.this.new C135441(continuation);
            c135441.L$0 = obj;
            return c135441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C135441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CryptoHistoricalChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CryptoHistoricalChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(CryptoHistoricalChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(CryptoHistoricalChartDuxo.this, null), 3, null);
                if (CryptoHistoricalChartDuxo.this.appType == AppType.RHC) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(CryptoHistoricalChartDuxo.this, null), 3, null);
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(CryptoHistoricalChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(CryptoHistoricalChartDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoHistoricalChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {70}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoHistoricalChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHistoricalChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHistoricalChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/crypto/charts/ui/ChartMode;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$1$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498051 extends ContinuationImpl7 implements Function2<HistoricalChartComposable, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoHistoricalChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498051(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super C498051> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoHistoricalChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498051 c498051 = new C498051(this.this$0, continuation);
                    c498051.L$0 = obj;
                    return c498051;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(HistoricalChartComposable historicalChartComposable, Continuation<? super Unit> continuation) {
                    return ((C498051) create(historicalChartComposable, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoHistoricalChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$1$1$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498061 extends ContinuationImpl7 implements Function2<CryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState>, Object> {
                    final /* synthetic */ HistoricalChartComposable $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498061(HistoricalChartComposable historicalChartComposable, Continuation<? super C498061> continuation) {
                        super(2, continuation);
                        this.$it = historicalChartComposable;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498061 c498061 = new C498061(this.$it, continuation);
                        c498061.L$0 = obj;
                        return c498061;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoHistoricalChartDataState cryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState> continuation) {
                        return ((C498061) create(cryptoHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoHistoricalChartDataState.copy$default((CryptoHistoricalChartDataState) this.L$0, null, null, null, null, this.$it, null, false, 111, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        HistoricalChartComposable historicalChartComposable = (HistoricalChartComposable) this.L$0;
                        this.this$0.applyMutation(new C498061(historicalChartComposable, null));
                        this.this$0.showCandlestickChartPref.set(historicalChartComposable == HistoricalChartComposable.CANDLE_STICK);
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
                    StateFlow2 stateFlow2 = this.this$0.chartModeFlow;
                    C498051 c498051 = new C498051(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow2, c498051, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHistoricalChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$2", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {98}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHistoricalChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHistoricalChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHistoricalChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/shared/crypto/charts/ui/ChartMode;", "currencyPairId", "chartMode"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$2$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<UUID, HistoricalChartComposable, Continuation<? super Tuples2<? extends UUID, ? extends HistoricalChartComposable>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(UUID uuid, HistoricalChartComposable historicalChartComposable, Continuation<? super Tuples2<? extends UUID, ? extends HistoricalChartComposable>> continuation) {
                    return invoke2(uuid, historicalChartComposable, (Continuation<? super Tuples2<UUID, ? extends HistoricalChartComposable>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(UUID uuid, HistoricalChartComposable historicalChartComposable, Continuation<? super Tuples2<UUID, ? extends HistoricalChartComposable>> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = uuid;
                    anonymousClass1.L$1 = historicalChartComposable;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Tuples4.m3642to((UUID) this.L$0, (HistoricalChartComposable) this.L$1);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(FlowKt.filterNotNull(this.this$0.currencyPairIdFlow), this.this$0.chartModeFlow, new AnonymousClass1(null)), new C13540x496a0a5f(null, (CoroutineScope) this.L$0, this.this$0));
                    this.label = 1;
                    if (FlowKt.collect(flowTransformLatest, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHistoricalChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$3", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {115}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoHistoricalChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHistoricalChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(this.this$0.displaySpanFlow, FlowKt.filterNotNull(this.this$0.currencyPairIdFlow), this.this$0.chartModeFlow, new AnonymousClass1(null)), new C13541xa087fb3e(null, this.this$0));
                    C498073 c498073 = new C498073(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c498073, this) == coroutine_suspended) {
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

            /* compiled from: CryptoHistoricalChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Triple;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "Ljava/util/UUID;", "Lcom/robinhood/shared/crypto/charts/ui/ChartMode;", "displaySpan", "currencyPairId", "chartMode"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$3$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function4<DisplaySpan, UUID, HistoricalChartComposable, Continuation<? super Tuples3<? extends DisplaySpan, ? extends UUID, ? extends HistoricalChartComposable>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                /* synthetic */ Object L$2;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(4, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(DisplaySpan displaySpan, UUID uuid, HistoricalChartComposable historicalChartComposable, Continuation<? super Tuples3<? extends DisplaySpan, UUID, ? extends HistoricalChartComposable>> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = displaySpan;
                    anonymousClass1.L$1 = uuid;
                    anonymousClass1.L$2 = historicalChartComposable;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Object invoke(DisplaySpan displaySpan, UUID uuid, HistoricalChartComposable historicalChartComposable, Continuation<? super Tuples3<? extends DisplaySpan, ? extends UUID, ? extends HistoricalChartComposable>> continuation) {
                    return invoke2(displaySpan, uuid, historicalChartComposable, (Continuation<? super Tuples3<? extends DisplaySpan, UUID, ? extends HistoricalChartComposable>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new Tuples3((DisplaySpan) this.L$0, (UUID) this.L$1, (HistoricalChartComposable) this.L$2);
                }
            }

            /* compiled from: CryptoHistoricalChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chart", "Lcom/robinhood/models/crypto/db/CryptoHistoricalChart;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$3$3", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$3$3, reason: invalid class name and collision with other inner class name */
            static final class C498073 extends ContinuationImpl7 implements Function2<CryptoHistoricalChart, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoHistoricalChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498073(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super C498073> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoHistoricalChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498073 c498073 = new C498073(this.this$0, continuation);
                    c498073.L$0 = obj;
                    return c498073;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHistoricalChart cryptoHistoricalChart, Continuation<? super Unit> continuation) {
                    return ((C498073) create(cryptoHistoricalChart, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoHistoricalChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$3$3$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$3$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState>, Object> {
                    final /* synthetic */ CryptoHistoricalChart $chart;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(CryptoHistoricalChart cryptoHistoricalChart, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$chart = cryptoHistoricalChart;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chart, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoHistoricalChartDataState cryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState> continuation) {
                        return ((AnonymousClass1) create(cryptoHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoHistoricalChartDataState.copy$default((CryptoHistoricalChartDataState) this.L$0, this.$chart, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((CryptoHistoricalChart) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CryptoHistoricalChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$4", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {128}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoHistoricalChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHistoricalChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(this.this$0.currencyPairIdFlow), new C13542xf7a5ec1d(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: CryptoHistoricalChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$4$2", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoHistoricalChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoHistoricalChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoHistoricalChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$4$2$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$4$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState>, Object> {
                    final /* synthetic */ UiCurrencyPair $currencyPair;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(UiCurrencyPair uiCurrencyPair, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$currencyPair = uiCurrencyPair;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currencyPair, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoHistoricalChartDataState cryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState> continuation) {
                        return ((AnonymousClass1) create(cryptoHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoHistoricalChartDataState.copy$default((CryptoHistoricalChartDataState) this.L$0, null, null, null, this.$currencyPair, null, null, false, 119, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((UiCurrencyPair) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CryptoHistoricalChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$5", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoHistoricalChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHistoricalChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(this.this$0.currencyPairIdFlow), new C13543x4ec3dcfc(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: CryptoHistoricalChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "button", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$5$2", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$5$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GetCryptoDetailRewardButtonResponseDto, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoHistoricalChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoHistoricalChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GetCryptoDetailRewardButtonResponseDto getCryptoDetailRewardButtonResponseDto, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(getCryptoDetailRewardButtonResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoHistoricalChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$5$2$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$5$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState>, Object> {
                    final /* synthetic */ GetCryptoDetailRewardButtonResponseDto $button;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(GetCryptoDetailRewardButtonResponseDto getCryptoDetailRewardButtonResponseDto, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$button = getCryptoDetailRewardButtonResponseDto;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$button, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoHistoricalChartDataState cryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState> continuation) {
                        return ((AnonymousClass1) create(cryptoHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoHistoricalChartDataState.copy$default((CryptoHistoricalChartDataState) this.L$0, null, null, null, null, null, this.$button, false, 95, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((GetCryptoDetailRewardButtonResponseDto) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CryptoHistoricalChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$6", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {150}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoHistoricalChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHistoricalChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flowStreamCandleStickChartExperiment = this.this$0.cryptoExperimentsStore.streamCandleStickChartExperiment();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamCandleStickChartExperiment, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: CryptoHistoricalChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isCandleStickChartEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$6$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ CryptoHistoricalChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoHistoricalChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoHistoricalChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$6$1$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498081 extends ContinuationImpl7 implements Function2<CryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState>, Object> {
                    final /* synthetic */ boolean $isCandleStickChartEnabled;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498081(boolean z, Continuation<? super C498081> continuation) {
                        super(2, continuation);
                        this.$isCandleStickChartEnabled = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498081 c498081 = new C498081(this.$isCandleStickChartEnabled, continuation);
                        c498081.L$0 = obj;
                        return c498081;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoHistoricalChartDataState cryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState> continuation) {
                        return ((C498081) create(cryptoHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoHistoricalChartDataState.copy$default((CryptoHistoricalChartDataState) this.L$0, null, null, null, null, null, null, this.$isCandleStickChartEnabled, 63, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498081(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CryptoHistoricalChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$7", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoHistoricalChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHistoricalChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTake = FlowKt.take(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, CryptoBitstampUkUpsellRegionGate.INSTANCE, false, 2, null), 1);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTake, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: CryptoHistoricalChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInBitstampUkUpsellRegionGate", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$7$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ CryptoHistoricalChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoHistoricalChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.Z$0) {
                        this.this$0.displaySpanFlow.setValue(DisplaySpan.f93695YEAR);
                        this.this$0.applyMutation(new C498091(null));
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: CryptoHistoricalChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$7$1$1", m3645f = "CryptoHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartDuxo$onCreate$1$7$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498091 extends ContinuationImpl7 implements Function2<CryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    C498091(Continuation<? super C498091> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498091 c498091 = new C498091(continuation);
                        c498091.L$0 = obj;
                        return c498091;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoHistoricalChartDataState cryptoHistoricalChartDataState, Continuation<? super CryptoHistoricalChartDataState> continuation) {
                        return ((C498091) create(cryptoHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoHistoricalChartDataState.copy$default((CryptoHistoricalChartDataState) this.L$0, null, DisplaySpan.f93695YEAR, null, null, null, null, false, 125, null);
                    }
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C135441(null));
    }

    public final void setArgs$feature_crypto_externalDebug(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        StateFlow2<UUID> stateFlow2 = this.currencyPairIdFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), currencyPairId)) {
        }
    }

    public final void onScrub$feature_crypto_externalDebug(Point scrubPoint) {
        applyMutation(new CryptoHistoricalChartDuxo4(scrubPoint, null));
    }

    public final void onSpanSelected$feature_crypto_externalDebug(DisplaySpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        this.displaySpanFlow.setValue(span);
        applyMutation(new CryptoHistoricalChartDuxo5(span, null));
    }

    public final void toggleChartMode(HistoricalChartComposable currentChartMode) {
        HistoricalChartComposable value;
        HistoricalChartComposable historicalChartComposable;
        Intrinsics.checkNotNullParameter(currentChartMode, "currentChartMode");
        StateFlow2<HistoricalChartComposable> stateFlow2 = this.chartModeFlow;
        do {
            value = stateFlow2.getValue();
            int i = WhenMappings.$EnumSwitchMapping$0[currentChartMode.ordinal()];
            if (i == 1) {
                historicalChartComposable = HistoricalChartComposable.LINE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                historicalChartComposable = HistoricalChartComposable.CANDLE_STICK;
            }
        } while (!stateFlow2.compareAndSet(value, historicalChartComposable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShowCandleSticks(HistoricalChartComposable historicalChartComposable) {
        return historicalChartComposable == HistoricalChartComposable.CANDLE_STICK;
    }
}
