package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.item;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.charts.FuturesChartResult;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.indexes.models.api.ApiIndexCloseDetailRequest;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposable2;
import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorAsset;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import com.robinhood.store.futures.ChartType;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import dispatch.core.Launch;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: InvestingMonitorAssetDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemViewState;", "equityQuoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "bind", "Lkotlinx/coroutines/CompletableJob;", "asset", "Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorAsset;", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingMonitorAssetDuxo extends BaseDuxo4<InvestingMonitorAssetItemViewState> {
    public static final int $stable = 8;
    private final AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final QuoteStore equityQuoteStore;
    private final FuturesChartsServiceManager futuresChartsServiceManager;
    private final FuturesMarketDataStore futuresMarketDataStore;
    private final FuturesQuoteStore futuresQuoteStore;
    private final IndexStore indexStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestingMonitorAssetDuxo(QuoteStore equityQuoteStore, CryptoQuoteStore cryptoQuoteStore, FuturesQuoteStore futuresQuoteStore, FuturesMarketDataStore futuresMarketDataStore, FuturesChartsServiceManager futuresChartsServiceManager, IndexStore indexStore, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, DuxoBundle duxoBundle) {
        super(new InvestingMonitorAssetItemViewState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.equityQuoteStore = equityQuoteStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.futuresQuoteStore = futuresQuoteStore;
        this.futuresMarketDataStore = futuresMarketDataStore;
        this.futuresChartsServiceManager = futuresChartsServiceManager;
        this.indexStore = indexStore;
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
    }

    public final CompletableJob bind(InvestingMonitorAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        Launch.launchDefault$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C265491(asset, this, null), 2, null);
        return completableJobSupervisorJob$default;
    }

    /* compiled from: InvestingMonitorAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {60, 74, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 150}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1 */
    static final class C265491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InvestingMonitorAsset $asset;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InvestingMonitorAssetDuxo this$0;

        /* compiled from: InvestingMonitorAssetDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InstrumentType.values().length];
                try {
                    iArr[InstrumentType.EQUITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InstrumentType.CRYPTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InstrumentType.FUTURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InstrumentType.INDEX.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InstrumentType.OPTION_STRATEGY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C265491(InvestingMonitorAsset investingMonitorAsset, InvestingMonitorAssetDuxo investingMonitorAssetDuxo, Continuation<? super C265491> continuation) {
            super(2, continuation);
            this.$asset = investingMonitorAsset;
            this.this$0 = investingMonitorAssetDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C265491 c265491 = new C265491(this.$asset, this.this$0, continuation);
            c265491.L$0 = obj;
            return c265491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C265491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r13, r3, r12) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r13, r2, r12) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0136, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r13, r2, r12) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x015f, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r2, r13, r12) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0161, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.$asset.getInstrumentType().ordinal()];
                if (i2 == 1) {
                    final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.equityQuoteStore.streamQuote(this.$asset.getMetadataId()));
                    Flow<AssetQuote.Equity> flow = new Flow<AssetQuote.Equity>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$invokeSuspend$$inlined$map$1$2", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            /* JADX WARN: Type inference failed for: r2v4 */
                            /* JADX WARN: Type inference failed for: r2v5 */
                            /* JADX WARN: Type inference failed for: r2v6 */
                            /* JADX WARN: Type inference failed for: r2v7 */
                            /* JADX WARN: Type inference failed for: r4v0, types: [com.robinhood.android.redesign.model.AssetQuote$Equity] */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Quote quote = (Quote) obj;
                                    T equity = null;
                                    ?? r2 = 0;
                                    ?? r22 = 0;
                                    if (quote != null) {
                                        equity = new AssetQuote.Equity(quote, r22 == true ? 1 : 0, 2, r2 == true ? 1 : 0);
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(equity, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AssetQuote.Equity> flowCollector, Continuation continuation) {
                            Object objCollect = flowDistinctUntilChanged.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                } else if (i2 == 2) {
                    final Flow<CryptoQuote> flowAsFlow = this.this$0.cryptoQuoteStore.getStreamCryptoQuote().asFlow(new CryptoQuoteStore.CryptoQuoteArgs(this.$asset.getMetadataId(), null, null, 6, null));
                    Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(new Flow<AssetQuote.Crypto>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$invokeSuspend$$inlined$map$2

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$invokeSuspend$$inlined$map$2$2", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    AssetQuote.Crypto crypto2 = new AssetQuote.Crypto((CryptoQuote) obj, null, null, 6, null);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(crypto2, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AssetQuote.Crypto> flowCollector, Continuation continuation) {
                            Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    });
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.label = 2;
                } else if (i2 == 3) {
                    Launch.launchDefault$default(coroutineScope, null, null, new AnonymousClass5(this.this$0, this.$asset, null), 3, null);
                    Launch.launchDefault$default(coroutineScope, null, null, new AnonymousClass6(this.this$0, this.$asset, null), 3, null);
                } else if (i2 == 4) {
                    Flow flowDistinctUntilChanged3 = FlowKt.distinctUntilChanged(FlowKt.combine(this.this$0.indexStore.streamIndexValue(new ApiIndexValueDetailRequest.ApiIndexValueRequestById(this.$asset.getMetadataId())), this.this$0.indexStore.streamIndexCloseValue(new ApiIndexCloseDetailRequest.ApiIndexCloseRequestById(this.$asset.getMetadataId())), new AnonymousClass7(null)));
                    AnonymousClass8 anonymousClass8 = new AnonymousClass8(this.this$0, null);
                    this.label = 3;
                } else if (i2 == 5) {
                    UiOptionStrategyInfo uiStrategyInfo = this.$asset.getUiStrategyInfo();
                    if (uiStrategyInfo == null) {
                        return Unit.INSTANCE;
                    }
                    final Flow<AggregateOptionStrategyQuote> flowStreamAndPollQuote = this.this$0.aggregateOptionStrategyQuoteStore.streamAndPollQuote(uiStrategyInfo.getOptionStrategyInfo());
                    final InvestingMonitorAsset investingMonitorAsset = this.$asset;
                    Flow flowDistinctUntilChanged4 = FlowKt.distinctUntilChanged(new Flow<AssetQuote.Option>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$invokeSuspend$$inlined$map$3
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AssetQuote.Option> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamAndPollQuote.collect(new AnonymousClass2(flowCollector, investingMonitorAsset), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$invokeSuspend$$inlined$map$3$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ InvestingMonitorAsset $asset$inlined;
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$invokeSuspend$$inlined$map$3$2", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$invokeSuspend$$inlined$map$3$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, InvestingMonitorAsset investingMonitorAsset) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$asset$inlined = investingMonitorAsset;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    AssetQuote.Option option = new AssetQuote.Option(this.$asset$inlined.getUiStrategyInfo(), (AggregateOptionStrategyQuote) obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(option, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    AnonymousClass10 anonymousClass10 = new AnonymousClass10(this.this$0, null);
                    this.label = 4;
                } else {
                    Timber.INSTANCE.mo3350d("Unsupported instrument " + this.$asset.getInstrumentType() + ".", new Object[0]);
                }
            } else {
                if (i != 1 && i != 2 && i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: InvestingMonitorAssetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "assetQuote", "Lcom/robinhood/android/redesign/model/AssetQuote$Equity;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$2", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AssetQuote.Equity, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InvestingMonitorAssetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InvestingMonitorAssetDuxo investingMonitorAssetDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = investingMonitorAssetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AssetQuote.Equity equity, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(equity, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InvestingMonitorAssetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$2$1", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InvestingMonitorAssetItemViewState, Continuation<? super InvestingMonitorAssetItemViewState>, Object> {
                final /* synthetic */ AssetQuote.Equity $assetQuote;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AssetQuote.Equity equity, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$assetQuote = equity;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$assetQuote, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InvestingMonitorAssetItemViewState investingMonitorAssetItemViewState, Continuation<? super InvestingMonitorAssetItemViewState> continuation) {
                    return ((AnonymousClass1) create(investingMonitorAssetItemViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new InvestingMonitorAssetItemViewState(this.$assetQuote, null, 2, 0 == true ? 1 : 0);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((AssetQuote.Equity) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: InvestingMonitorAssetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/redesign/model/AssetQuote$Crypto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$4", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<AssetQuote.Crypto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InvestingMonitorAssetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(InvestingMonitorAssetDuxo investingMonitorAssetDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = investingMonitorAssetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AssetQuote.Crypto crypto2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(crypto2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InvestingMonitorAssetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$4$1", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InvestingMonitorAssetItemViewState, Continuation<? super InvestingMonitorAssetItemViewState>, Object> {
                final /* synthetic */ AssetQuote.Crypto $it;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AssetQuote.Crypto crypto2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = crypto2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InvestingMonitorAssetItemViewState investingMonitorAssetItemViewState, Continuation<? super InvestingMonitorAssetItemViewState> continuation) {
                    return ((AnonymousClass1) create(investingMonitorAssetItemViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new InvestingMonitorAssetItemViewState(this.$it, null, 2, 0 == true ? 1 : 0);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((AssetQuote.Crypto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: InvestingMonitorAssetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$5", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {92}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ InvestingMonitorAsset $asset;
            int label;
            final /* synthetic */ InvestingMonitorAssetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(InvestingMonitorAssetDuxo investingMonitorAssetDuxo, InvestingMonitorAsset investingMonitorAsset, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = investingMonitorAssetDuxo;
                this.$asset = investingMonitorAsset;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, this.$asset, continuation);
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(FlowKt.distinctUntilChanged(FuturesQuoteStore.getQuote$default(this.this$0.futuresQuoteStore, this.$asset.getMetadataId(), null, 2, null)), FlowKt.distinctUntilChanged(this.this$0.futuresMarketDataStore.getClosePrices(this.$asset.getMetadataId())), new AnonymousClass1(this.$asset, null)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: InvestingMonitorAssetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesign/model/AssetQuote$Future;", "quote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", PnlTradeDetailComposable2.TEST_TAG_CLOSE_PRICE, "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$5$1", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<FuturesQuote, FuturesClosePrices, Continuation<? super AssetQuote.Future>, Object> {
                final /* synthetic */ InvestingMonitorAsset $asset;
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InvestingMonitorAsset investingMonitorAsset, Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                    this.$asset = investingMonitorAsset;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FuturesQuote futuresQuote, FuturesClosePrices futuresClosePrices, Continuation<? super AssetQuote.Future> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$asset, continuation);
                    anonymousClass1.L$0 = futuresQuote;
                    anonymousClass1.L$1 = futuresClosePrices;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new AssetQuote.Future(this.$asset.getMetadataId(), (FuturesQuote) this.L$0, (FuturesClosePrices) this.L$1);
                }
            }

            /* compiled from: InvestingMonitorAssetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/android/redesign/model/AssetQuote$Future;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$5$2", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$5$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AssetQuote.Future, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InvestingMonitorAssetDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(InvestingMonitorAssetDuxo investingMonitorAssetDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = investingMonitorAssetDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AssetQuote.Future future, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(future, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InvestingMonitorAssetDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$5$2$1", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$5$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InvestingMonitorAssetItemViewState, Continuation<? super InvestingMonitorAssetItemViewState>, Object> {
                    final /* synthetic */ AssetQuote.Future $quote;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AssetQuote.Future future, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$quote = future;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$quote, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InvestingMonitorAssetItemViewState investingMonitorAssetItemViewState, Continuation<? super InvestingMonitorAssetItemViewState> continuation) {
                        return ((AnonymousClass1) create(investingMonitorAssetItemViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InvestingMonitorAssetItemViewState.copy$default((InvestingMonitorAssetItemViewState) this.L$0, this.$quote, null, 2, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((AssetQuote.Future) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InvestingMonitorAssetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$6", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {103, 111}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ InvestingMonitorAsset $asset;
            int label;
            final /* synthetic */ InvestingMonitorAssetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(InvestingMonitorAssetDuxo investingMonitorAssetDuxo, InvestingMonitorAsset investingMonitorAsset, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = investingMonitorAssetDuxo;
                this.$asset = investingMonitorAsset;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, this.$asset, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(r12, r1, r11) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AnonymousClass6 anonymousClass6;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FuturesChartsServiceManager futuresChartsServiceManager = this.this$0.futuresChartsServiceManager;
                    UUID metadataId = this.$asset.getMetadataId();
                    DisplaySpan displaySpan = DisplaySpan.DAY;
                    ChartType chartType = ChartType.LINE;
                    this.label = 1;
                    anonymousClass6 = this;
                    obj = futuresChartsServiceManager.streamFuturesChartResult(metadataId, displaySpan, chartType, false, true, anonymousClass6);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                anonymousClass6 = this;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged((Flow) obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(anonymousClass6.this$0, null);
                anonymousClass6.label = 2;
            }

            /* compiled from: InvestingMonitorAssetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartResult", "Lkotlin/Result;", "Lcom/robinhood/android/futures/charts/FuturesChartResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$6$1", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Result<? extends FuturesChartResult>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InvestingMonitorAssetDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InvestingMonitorAssetDuxo investingMonitorAssetDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = investingMonitorAssetDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Result<? extends FuturesChartResult> result, Continuation<? super Unit> continuation) {
                    return invoke(result.getValue(), continuation);
                }

                public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Result.m28549boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InvestingMonitorAssetDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$6$1$1", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C504971 extends ContinuationImpl7 implements Function2<InvestingMonitorAssetItemViewState, Continuation<? super InvestingMonitorAssetItemViewState>, Object> {
                    final /* synthetic */ Object $chartResult;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504971(Object obj, Continuation<? super C504971> continuation) {
                        super(2, continuation);
                        this.$chartResult = obj;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C504971 c504971 = new C504971(this.$chartResult, continuation);
                        c504971.L$0 = obj;
                        return c504971;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InvestingMonitorAssetItemViewState investingMonitorAssetItemViewState, Continuation<? super InvestingMonitorAssetItemViewState> continuation) {
                        return ((C504971) create(investingMonitorAssetItemViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        InvestingMonitorAssetItemViewState investingMonitorAssetItemViewState = (InvestingMonitorAssetItemViewState) this.L$0;
                        Object obj2 = this.$chartResult;
                        if (Result.m28555isFailureimpl(obj2)) {
                            obj2 = null;
                        }
                        FuturesChartResult futuresChartResult = (FuturesChartResult) obj2;
                        return InvestingMonitorAssetItemViewState.copy$default(investingMonitorAssetItemViewState, null, futuresChartResult != null ? futuresChartResult.getChart() : null, 1, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C504971(((Result) this.L$0).getValue(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InvestingMonitorAssetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesign/model/AssetQuote$Index;", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "indexCloseValue", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$7", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function3<IndexValue, IndexCloseValue, Continuation<? super AssetQuote.Index>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(IndexValue indexValue, IndexCloseValue indexCloseValue, Continuation<? super AssetQuote.Index> continuation) {
                AnonymousClass7 anonymousClass7 = new AnonymousClass7(continuation);
                anonymousClass7.L$0 = indexValue;
                anonymousClass7.L$1 = indexCloseValue;
                return anonymousClass7.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new AssetQuote.Index((IndexValue) this.L$0, (IndexCloseValue) this.L$1);
            }
        }

        /* compiled from: InvestingMonitorAssetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/redesign/model/AssetQuote$Index;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$8", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<AssetQuote.Index, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InvestingMonitorAssetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(InvestingMonitorAssetDuxo investingMonitorAssetDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.this$0 = investingMonitorAssetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass8 anonymousClass8 = new AnonymousClass8(this.this$0, continuation);
                anonymousClass8.L$0 = obj;
                return anonymousClass8;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AssetQuote.Index index, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(index, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InvestingMonitorAssetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$8$1", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InvestingMonitorAssetItemViewState, Continuation<? super InvestingMonitorAssetItemViewState>, Object> {
                final /* synthetic */ AssetQuote.Index $it;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AssetQuote.Index index, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = index;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InvestingMonitorAssetItemViewState investingMonitorAssetItemViewState, Continuation<? super InvestingMonitorAssetItemViewState> continuation) {
                    return ((AnonymousClass1) create(investingMonitorAssetItemViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new InvestingMonitorAssetItemViewState(this.$it, null, 2, 0 == true ? 1 : 0);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((AssetQuote.Index) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: InvestingMonitorAssetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/redesign/model/AssetQuote$Option;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$10", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<AssetQuote.Option, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InvestingMonitorAssetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(InvestingMonitorAssetDuxo investingMonitorAssetDuxo, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.this$0 = investingMonitorAssetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass10 anonymousClass10 = new AnonymousClass10(this.this$0, continuation);
                anonymousClass10.L$0 = obj;
                return anonymousClass10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AssetQuote.Option option, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(option, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InvestingMonitorAssetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$10$1", m3645f = "InvestingMonitorAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.InvestingMonitorAssetItemDuxo$bind$1$10$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InvestingMonitorAssetItemViewState, Continuation<? super InvestingMonitorAssetItemViewState>, Object> {
                final /* synthetic */ AssetQuote.Option $it;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AssetQuote.Option option, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = option;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InvestingMonitorAssetItemViewState investingMonitorAssetItemViewState, Continuation<? super InvestingMonitorAssetItemViewState> continuation) {
                    return ((AnonymousClass1) create(investingMonitorAssetItemViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new InvestingMonitorAssetItemViewState(this.$it, null, 2, 0 == true ? 1 : 0);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((AssetQuote.Option) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
