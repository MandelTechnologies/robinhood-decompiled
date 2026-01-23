package com.robinhood.android.trade.options.profitloss;

import android.view.View;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.trade.options.profitloss.ChartParams;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionsProfitLossChartStore;
import com.robinhood.models.api.ApiOptionsProfitLossChart;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;

/* compiled from: OptionsProfitLossChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J&\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0010J\u0015\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "optionsProfitLossChartStore", "Lcom/robinhood/librobinhood/data/store/OptionsProfitLossChartStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "hostView", "Landroid/view/View;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/librobinhood/data/store/OptionsProfitLossChartStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Landroid/view/View;)V", "requestParamsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "canvasLeftXRelay", "", "canvasRightXRelay", "canvasTopYRelay", "canvasBottomYRelay", "onCreate", "", "onResume", "onStop", "submitChartCanvasBounds", "canvasLeftX", "canvasRightX", "canvasTopY", "canvasBottomY", "submitNewRequestParams", "requestParams", "submitScrubbedPosition", "scrubbedPosition", "(Ljava/lang/Float;)V", "setPnlRequestThrottleTimeout", "timeoutMillisecond", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionsProfitLossChartDuxo extends ViewDuxo<OptionsProfitLossChartViewState> {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private final BehaviorRelay<Optional<Float>> canvasBottomYRelay;
    private final BehaviorRelay<Optional<Float>> canvasLeftXRelay;
    private final BehaviorRelay<Optional<Float>> canvasRightXRelay;
    private final BehaviorRelay<Optional<Float>> canvasTopYRelay;
    private final OptionsProfitLossChartStore optionsProfitLossChartStore;
    private final PerformanceLogger performanceLogger;
    private final BehaviorRelay<Optional<ApiOptionsProfitLossChartRequestParams>> requestParamsRelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsProfitLossChartDuxo(AnalyticsLogger analytics, OptionsProfitLossChartStore optionsProfitLossChartStore, PerformanceLogger performanceLogger, View hostView) {
        super(hostView, new OptionsProfitLossChartViewState(null, null, null, null, null, null, 0L, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), null, 4, null);
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(optionsProfitLossChartStore, "optionsProfitLossChartStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.analytics = analytics;
        this.optionsProfitLossChartStore = optionsProfitLossChartStore;
        this.performanceLogger = performanceLogger;
        Optional2 optional2 = Optional2.INSTANCE;
        BehaviorRelay<Optional<ApiOptionsProfitLossChartRequestParams>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(optional2);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.requestParamsRelay = behaviorRelayCreateDefault;
        BehaviorRelay<Optional<Float>> behaviorRelayCreateDefault2 = BehaviorRelay.createDefault(optional2);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault2, "createDefault(...)");
        this.canvasLeftXRelay = behaviorRelayCreateDefault2;
        BehaviorRelay<Optional<Float>> behaviorRelayCreateDefault3 = BehaviorRelay.createDefault(optional2);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault3, "createDefault(...)");
        this.canvasRightXRelay = behaviorRelayCreateDefault3;
        BehaviorRelay<Optional<Float>> behaviorRelayCreateDefault4 = BehaviorRelay.createDefault(optional2);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault4, "createDefault(...)");
        this.canvasTopYRelay = behaviorRelayCreateDefault4;
        BehaviorRelay<Optional<Float>> behaviorRelayCreateDefault5 = BehaviorRelay.createDefault(optional2);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault5, "createDefault(...)");
        this.canvasBottomYRelay = behaviorRelayCreateDefault5;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.OPTION_PROFIT_AND_LOSS_CHART, null, null, null, 14, null);
        Observable<OptionsProfitLossChartViewState> observableTake = getStates().filter(new Predicate() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo.onCreate.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionsProfitLossChartViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentChartParams() != null;
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartDuxo.onCreate$lambda$0(this.f$0, (OptionsProfitLossChartViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(OptionsProfitLossChartDuxo optionsProfitLossChartDuxo, OptionsProfitLossChartViewState optionsProfitLossChartViewState) {
        if (optionsProfitLossChartViewState.getCurrentChartParams() != null) {
            PerformanceLogger.DefaultImpls.completeMetric$default(optionsProfitLossChartDuxo.performanceLogger, PerformanceMetricEventData.Name.OPTION_PROFIT_AND_LOSS_CHART, null, 2, null);
            PerformanceLogger.DefaultImpls.completeMetric$default(optionsProfitLossChartDuxo.performanceLogger, PerformanceMetricEventData.Name.OPTION_ORDER, null, 2, null);
            PerformanceLogger.DefaultImpls.completeMetric$default(optionsProfitLossChartDuxo.performanceLogger, PerformanceMetricEventData.Name.OPTION_SHOPPING_CART, null, 2, null);
        } else {
            PerformanceLogger.DefaultImpls.failMetric$default(optionsProfitLossChartDuxo.performanceLogger, PerformanceMetricEventData.Name.OPTION_PROFIT_AND_LOSS_CHART, null, 2, null);
            PerformanceLogger.DefaultImpls.failMetric$default(optionsProfitLossChartDuxo.performanceLogger, PerformanceMetricEventData.Name.OPTION_ORDER, null, 2, null);
            PerformanceLogger.DefaultImpls.failMetric$default(optionsProfitLossChartDuxo.performanceLogger, PerformanceMetricEventData.Name.OPTION_SHOPPING_CART, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(ObservablesKt.filterIsPresent(this.canvasLeftXRelay), ObservablesKt.filterIsPresent(this.canvasRightXRelay), ObservablesKt.filterIsPresent(this.canvasTopYRelay), ObservablesKt.filterIsPresent(this.canvasBottomYRelay), new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$onResume$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                float fFloatValue = ((Number) t4).floatValue();
                float fFloatValue2 = ((Number) t3).floatValue();
                return (R) new ChartCanvasBounds(((Number) t1).floatValue(), ((Number) t2).floatValue(), fFloatValue2, fFloatValue);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        Observable observableDistinctUntilChanged = observableCombineLatest.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartDuxo.onResume$lambda$2(this.f$0, (ChartCanvasBounds) obj);
            }
        });
        final Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(this.requestParamsRelay);
        Observable observableDistinctUntilChanged2 = getStates().map(new Function() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$onResume$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Long.valueOf(((OptionsProfitLossChartViewState) it).getPnlRequestThrottleTimeout());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        Observable observableFlatMapSingle = observableDistinctUntilChanged2.switchMap(new Function() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo.onResume.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiOptionsProfitLossChartRequestParams> apply(Long timeout) {
                Intrinsics.checkNotNullParameter(timeout, "timeout");
                return observableFilterIsPresent.distinctUntilChanged().throttleLatest(timeout.longValue(), TimeUnit.MILLISECONDS, Schedulers.m3346io());
            }
        }).flatMapSingle(new Function() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo.onResume.5

            /* compiled from: OptionsProfitLossChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart;", "Lcom/robinhood/android/trade/options/profitloss/ChartParams;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$onResume$5$1", m3645f = "OptionsProfitLossChartDuxo.kt", m3646l = {110}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$onResume$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends Optional<? extends ApiOptionsProfitLossChart>, ? extends ChartParams>>, Object> {
                final /* synthetic */ ApiOptionsProfitLossChartRequestParams $params;
                int label;
                final /* synthetic */ OptionsProfitLossChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsProfitLossChartDuxo optionsProfitLossChartDuxo, ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsProfitLossChartDuxo;
                    this.$params = apiOptionsProfitLossChartRequestParams;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$params, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends Optional<? extends ApiOptionsProfitLossChart>, ? extends ChartParams>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super Tuples2<? extends Optional<ApiOptionsProfitLossChart>, ? extends ChartParams>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends Optional<ApiOptionsProfitLossChart>, ? extends ChartParams>> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    AnonymousClass1 anonymousClass1;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Endpoint<ApiOptionsProfitLossChartRequestParams, ApiOptionsProfitLossChart> getOptionsProfitLossChart = this.this$0.optionsProfitLossChartStore.getGetOptionsProfitLossChart();
                        ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams = this.$params;
                        Intrinsics.checkNotNull(apiOptionsProfitLossChartRequestParams);
                        this.label = 1;
                        anonymousClass1 = this;
                        obj = Endpoint.DefaultImpls.forceFetch$default(getOptionsProfitLossChart, apiOptionsProfitLossChartRequestParams, null, anonymousClass1, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        anonymousClass1 = this;
                    }
                    ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams2 = anonymousClass1.$params;
                    Intrinsics.checkNotNull(apiOptionsProfitLossChartRequestParams2);
                    return Tuples4.m3642to(Optional3.asOptional((ApiOptionsProfitLossChart) obj), new ChartParams.Loaded(apiOptionsProfitLossChartRequestParams2));
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<Optional<ApiOptionsProfitLossChart>, ChartParams>> apply(final ApiOptionsProfitLossChartRequestParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                OptionsProfitLossChartDuxo optionsProfitLossChartDuxo = OptionsProfitLossChartDuxo.this;
                return RxFactory.DefaultImpls.rxSingle$default(optionsProfitLossChartDuxo, null, new AnonymousClass1(optionsProfitLossChartDuxo, params, null), 1, null).onErrorReturn(new Function() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo.onResume.5.2
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<Optional<ApiOptionsProfitLossChart>, ChartParams> apply(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Optional2 optional2 = Optional2.INSTANCE;
                        ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams = params;
                        Intrinsics.checkNotNull(apiOptionsProfitLossChartRequestParams);
                        return Tuples4.m3642to(optional2, new ChartParams.Failed(apiOptionsProfitLossChartRequestParams, it));
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapSingle, "flatMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartDuxo.onResume$lambda$5(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = getStates().map(new Function() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo.onResume.7
            @Override // io.reactivex.functions.Function
            public final Optional<List<ApiOptionsProfitLossChartRequestParams.Leg>> apply(OptionsProfitLossChartViewState it) {
                ApiOptionsProfitLossChartRequestParams params;
                Intrinsics.checkNotNullParameter(it, "it");
                ChartParams.Loaded currentChartParams = it.getCurrentChartParams();
                return Optional3.asOptional((currentChartParams == null || (params = currentChartParams.getParams()) == null) ? null : params.getLegs());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartDuxo.onResume$lambda$7(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(OptionsProfitLossChartDuxo optionsProfitLossChartDuxo, final ChartCanvasBounds chartCanvasBounds) {
        optionsProfitLossChartDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartDuxo.onResume$lambda$2$lambda$1(chartCanvasBounds, (OptionsProfitLossChartViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsProfitLossChartViewState onResume$lambda$2$lambda$1(ChartCanvasBounds chartCanvasBounds, OptionsProfitLossChartViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsProfitLossChartViewState.copy$default(applyMutation, null, chartCanvasBounds, null, null, null, null, 0L, 125, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(OptionsProfitLossChartDuxo optionsProfitLossChartDuxo, Tuples2 tuples2) {
        Optional optional = (Optional) tuples2.component1();
        final ChartParams chartParams = (ChartParams) tuples2.component2();
        final ApiOptionsProfitLossChart apiOptionsProfitLossChart = (ApiOptionsProfitLossChart) optional.getOrNull();
        optionsProfitLossChartDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartDuxo.onResume$lambda$5$lambda$4(chartParams, apiOptionsProfitLossChart, (OptionsProfitLossChartViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsProfitLossChartViewState onResume$lambda$5$lambda$4(ChartParams chartParams, ApiOptionsProfitLossChart apiOptionsProfitLossChart, OptionsProfitLossChartViewState applyMutation) {
        Instant createdAt;
        ApiOptionsProfitLossChartRequestParams params;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ChartParams.Loaded currentChartParams = applyMutation.getCurrentChartParams();
        if (currentChartParams == null || (params = currentChartParams.getParams()) == null || (createdAt = params.getCreatedAt()) == null) {
            createdAt = Instant.MIN;
        }
        if (chartParams.getParams().getCreatedAt().compareTo(createdAt) <= 0) {
            return OptionsProfitLossChartViewState.copy$default(applyMutation, null, null, null, null, null, null, 0L, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
        if (apiOptionsProfitLossChart != null && (chartParams instanceof ChartParams.Loaded)) {
            return OptionsProfitLossChartViewState.copy$default(applyMutation, apiOptionsProfitLossChart, null, (ChartParams.Loaded) chartParams, chartParams, null, null, 0L, 114, null);
        }
        return OptionsProfitLossChartViewState.copy$default(applyMutation, null, null, null, chartParams, null, null, 0L, 119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(OptionsProfitLossChartDuxo optionsProfitLossChartDuxo, Optional optional) {
        optionsProfitLossChartDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartDuxo.onResume$lambda$7$lambda$6((OptionsProfitLossChartViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsProfitLossChartViewState onResume$lambda$7$lambda$6(OptionsProfitLossChartViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsProfitLossChartViewState.copy$default(applyMutation, null, null, null, null, null, new UiEvent(Unit.INSTANCE), 0L, 95, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStop() {
        super.onStop();
        this.performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTION_PROFIT_AND_LOSS_CHART, null);
    }

    public final void submitChartCanvasBounds(float canvasLeftX, float canvasRightX, float canvasTopY, float canvasBottomY) {
        this.canvasLeftXRelay.accept(Optional3.asOptional(Float.valueOf(canvasLeftX)));
        this.canvasRightXRelay.accept(Optional3.asOptional(Float.valueOf(canvasRightX)));
        this.canvasTopYRelay.accept(Optional3.asOptional(Float.valueOf(canvasTopY)));
        this.canvasBottomYRelay.accept(Optional3.asOptional(Float.valueOf(canvasBottomY)));
    }

    public final void submitNewRequestParams(ApiOptionsProfitLossChartRequestParams requestParams) {
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        this.requestParamsRelay.accept(Optional3.asOptional(requestParams));
    }

    public final void submitScrubbedPosition(final Float scrubbedPosition) {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartDuxo.submitScrubbedPosition$lambda$8(this.f$0, scrubbedPosition, (OptionsProfitLossChartViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsProfitLossChartViewState submitScrubbedPosition$lambda$8(OptionsProfitLossChartDuxo optionsProfitLossChartDuxo, Float f, OptionsProfitLossChartViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        UiEvent<Unit> strategyChangedEvent = applyMutation.getStrategyChangedEvent();
        if ((strategyChangedEvent != null ? strategyChangedEvent.consume() : null) != null) {
            OptionsProfitLossAnalytics.logOptionsProfitLossChartFirstScrub(optionsProfitLossChartDuxo.analytics);
        }
        return OptionsProfitLossChartViewState.copy$default(applyMutation, null, null, null, null, f, null, 0L, 111, null);
    }

    public final void setPnlRequestThrottleTimeout(final long timeoutMillisecond) {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartDuxo.setPnlRequestThrottleTimeout$lambda$9(timeoutMillisecond, (OptionsProfitLossChartViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsProfitLossChartViewState setPnlRequestThrottleTimeout$lambda$9(long j, OptionsProfitLossChartViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsProfitLossChartViewState.copy$default(applyMutation, null, null, null, null, null, null, j, 63, null);
    }
}
