package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.charts.ChartsBonfireApi;
import com.robinhood.android.charts.models.api.ApiOptionHistoricalChart;
import com.robinhood.android.charts.models.dao.OptionHistoricalChartDao;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartModel;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.librobinhood.data.store.OptionHistoricalChartStore;
import com.robinhood.librobinhood.p297ui.OptionChartNormalizer;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: OptionHistoricalChartStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;", "Lcom/robinhood/store/Store;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "chartDao", "Lcom/robinhood/android/charts/models/dao/OptionHistoricalChartDao;", "chartsBonfireApi", "Lcom/robinhood/android/api/charts/ChartsBonfireApi;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;Lcom/robinhood/android/charts/models/dao/OptionHistoricalChartDao;Lcom/robinhood/android/api/charts/ChartsBonfireApi;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore$Request;", "Lretrofit2/Response;", "Lcom/robinhood/android/charts/models/api/ApiOptionHistoricalChart;", "optionHistoricalChartBackendPollQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;", "streamNormalizedHistoricalChartWithQuote", "Lkotlinx/coroutines/flow/Flow;", "request", "Request", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionHistoricalChartStore extends Store {
    private static final long DEFAULT_BACKEND_POLL_INTERVAL_MINUTES = 5;
    private final AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore;
    private final OptionHistoricalChartDao chartDao;
    private final ChartsBonfireApi chartsBonfireApi;
    private final Endpoint<Request, Response<ApiOptionHistoricalChart>> endpoint;
    private final Query<Request, OptionHistoricalChartModel> optionHistoricalChartBackendPollQuery;
    private final OptionStrategyInfoStore optionStrategyInfoStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionHistoricalChartStore(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, OptionHistoricalChartDao chartDao, ChartsBonfireApi chartsBonfireApi, OptionStrategyInfoStore optionStrategyInfoStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
        Intrinsics.checkNotNullParameter(chartDao, "chartDao");
        Intrinsics.checkNotNullParameter(chartsBonfireApi, "chartsBonfireApi");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
        this.chartDao = chartDao;
        this.chartsBonfireApi = chartsBonfireApi;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new OptionHistoricalChartStore2(this, null), getLogoutKillswitch(), new OptionHistoricalChartStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.optionHistoricalChartBackendPollQuery = Store.create$default(this, Query.INSTANCE, "optionHistoricalChartBackendPollQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionHistoricalChartStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionHistoricalChartStore.optionHistoricalChartBackendPollQuery$lambda$0(this.f$0, (OptionHistoricalChartStore.Request) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionHistoricalChartStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionHistoricalChartStore.optionHistoricalChartBackendPollQuery$lambda$1(this.f$0, (OptionHistoricalChartStore.Request) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: OptionHistoricalChartStore.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003JL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006'"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore$Request;", "", "strategyCode", "", "displaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "showCandlesticks", "", "lateEtfBoundsEnabled", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "hideExtendedHours", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Ljava/lang/Boolean;ZLcom/robinhood/models/db/OptionChain$UnderlyingType;Z)V", "getStrategyCode", "()Ljava/lang/String;", "getDisplaySpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getShowCandlesticks", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLateEtfBoundsEnabled", "()Z", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getHideExtendedHours", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Ljava/lang/Boolean;ZLcom/robinhood/models/db/OptionChain$UnderlyingType;Z)Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore$Request;", "equals", "other", "hashCode", "", "toString", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Request {
        private final DisplaySpan displaySpan;
        private final boolean hideExtendedHours;
        private final boolean lateEtfBoundsEnabled;
        private final Boolean showCandlesticks;
        private final String strategyCode;
        private final OptionChain.UnderlyingType underlyingType;

        public static /* synthetic */ Request copy$default(Request request, String str, DisplaySpan displaySpan, Boolean bool, boolean z, OptionChain.UnderlyingType underlyingType, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.strategyCode;
            }
            if ((i & 2) != 0) {
                displaySpan = request.displaySpan;
            }
            if ((i & 4) != 0) {
                bool = request.showCandlesticks;
            }
            if ((i & 8) != 0) {
                z = request.lateEtfBoundsEnabled;
            }
            if ((i & 16) != 0) {
                underlyingType = request.underlyingType;
            }
            if ((i & 32) != 0) {
                z2 = request.hideExtendedHours;
            }
            OptionChain.UnderlyingType underlyingType2 = underlyingType;
            boolean z3 = z2;
            return request.copy(str, displaySpan, bool, z, underlyingType2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getStrategyCode() {
            return this.strategyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final DisplaySpan getDisplaySpan() {
            return this.displaySpan;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getShowCandlesticks() {
            return this.showCandlesticks;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getLateEtfBoundsEnabled() {
            return this.lateEtfBoundsEnabled;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHideExtendedHours() {
            return this.hideExtendedHours;
        }

        public final Request copy(String strategyCode, DisplaySpan displaySpan, Boolean showCandlesticks, boolean lateEtfBoundsEnabled, OptionChain.UnderlyingType underlyingType, boolean hideExtendedHours) {
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
            Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
            return new Request(strategyCode, displaySpan, showCandlesticks, lateEtfBoundsEnabled, underlyingType, hideExtendedHours);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.strategyCode, request.strategyCode) && this.displaySpan == request.displaySpan && Intrinsics.areEqual(this.showCandlesticks, request.showCandlesticks) && this.lateEtfBoundsEnabled == request.lateEtfBoundsEnabled && this.underlyingType == request.underlyingType && this.hideExtendedHours == request.hideExtendedHours;
        }

        public int hashCode() {
            int iHashCode = ((this.strategyCode.hashCode() * 31) + this.displaySpan.hashCode()) * 31;
            Boolean bool = this.showCandlesticks;
            return ((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.lateEtfBoundsEnabled)) * 31) + this.underlyingType.hashCode()) * 31) + Boolean.hashCode(this.hideExtendedHours);
        }

        public String toString() {
            return "Request(strategyCode=" + this.strategyCode + ", displaySpan=" + this.displaySpan + ", showCandlesticks=" + this.showCandlesticks + ", lateEtfBoundsEnabled=" + this.lateEtfBoundsEnabled + ", underlyingType=" + this.underlyingType + ", hideExtendedHours=" + this.hideExtendedHours + ")";
        }

        public Request(String strategyCode, DisplaySpan displaySpan, Boolean bool, boolean z, OptionChain.UnderlyingType underlyingType, boolean z2) {
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
            Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
            this.strategyCode = strategyCode;
            this.displaySpan = displaySpan;
            this.showCandlesticks = bool;
            this.lateEtfBoundsEnabled = z;
            this.underlyingType = underlyingType;
            this.hideExtendedHours = z2;
        }

        public final String getStrategyCode() {
            return this.strategyCode;
        }

        public final DisplaySpan getDisplaySpan() {
            return this.displaySpan;
        }

        public final Boolean getShowCandlesticks() {
            return this.showCandlesticks;
        }

        public final boolean getLateEtfBoundsEnabled() {
            return this.lateEtfBoundsEnabled;
        }

        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        public final boolean getHideExtendedHours() {
            return this.hideExtendedHours;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow optionHistoricalChartBackendPollQuery$lambda$0(OptionHistoricalChartStore optionHistoricalChartStore, Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Endpoint<Request, Response<ApiOptionHistoricalChart>> endpoint = optionHistoricalChartStore.endpoint;
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint8.backendPoll$default(endpoint, request, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow optionHistoricalChartBackendPollQuery$lambda$1(OptionHistoricalChartStore optionHistoricalChartStore, Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        OptionHistoricalChartDao optionHistoricalChartDao = optionHistoricalChartStore.chartDao;
        String strategyCode = request.getStrategyCode();
        DisplaySpan displaySpan = request.getDisplaySpan();
        Boolean showCandlesticks = request.getShowCandlesticks();
        return optionHistoricalChartDao.getOptionHistoricalChartModel(strategyCode, displaySpan, showCandlesticks != null ? showCandlesticks.booleanValue() : false);
    }

    public final Flow<OptionHistoricalChartModel> streamNormalizedHistoricalChartWithQuote(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        OptionStrategyInfoStore.refresh$default(this.optionStrategyInfoStore, CollectionsKt.listOf(request.getStrategyCode()), false, 2, null);
        final Flow flowCombine = Operators.combine(this.optionHistoricalChartBackendPollQuery.asFlow(request), FlowKt.transformLatest(FlowKt.distinctUntilChanged(this.optionStrategyInfoStore.streamUiStrategyInfo(request.getStrategyCode())), new C34031xb7644a63(null, this)));
        return new Flow<OptionHistoricalChartModel>() { // from class: com.robinhood.librobinhood.data.store.OptionHistoricalChartStore$streamNormalizedHistoricalChartWithQuote$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OptionHistoricalChartModel> flowCollector, Continuation continuation) {
                Object objCollect = flowCombine.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionHistoricalChartStore$streamNormalizedHistoricalChartWithQuote$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionHistoricalChartStore$streamNormalizedHistoricalChartWithQuote$$inlined$map$1$2", m3645f = "OptionHistoricalChartStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionHistoricalChartStore$streamNormalizedHistoricalChartWithQuote$$inlined$map$1$2$1, reason: invalid class name */
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
                        Tuples2 tuples2 = (Tuples2) obj;
                        OptionHistoricalChartModel optionHistoricalChartModelNormalize$default = OptionChartNormalizer.normalize$default((OptionHistoricalChartModel) tuples2.component1(), (AggregateOptionStrategyQuote) tuples2.component2(), null, 2, null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionHistoricalChartModelNormalize$default, anonymousClass1) == coroutine_suspended) {
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
        };
    }
}
