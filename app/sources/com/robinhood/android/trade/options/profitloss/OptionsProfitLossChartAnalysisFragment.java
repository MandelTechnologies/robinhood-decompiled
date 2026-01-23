package com.robinhood.android.trade.options.profitloss;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.extensions.Analytics3;
import com.robinhood.android.common.options.order.OptionOrderContext;
import com.robinhood.android.common.options.order.OptionOrderContextFactory;
import com.robinhood.android.common.options.order.OptionOrderUserInputPrices2;
import com.robinhood.android.common.options.upsell.plchart.ProfitAndLossChartEducationFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.options.contracts.OptionsProfitLossChartAnalysisFragmentKey;
import com.robinhood.android.optionsplchart.C24771R;
import com.robinhood.android.optionsplchart.databinding.FragmentOptionsProfitLossChartAnalysisBinding;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OptionsProfitLossChartAnalysisFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020.H\u0016J\"\u00104\u001a\b\u0012\u0004\u0012\u000206052\u0012\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090805H\u0002J\t\u0010>\u001a\u00020?H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010:\u001a\u00020;X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AX\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartAnalysisFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "optionOrderContextFactory", "Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;", "getOptionOrderContextFactory", "()Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;", "setOptionOrderContextFactory", "(Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;)V", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "getQuoteStore", "()Lcom/robinhood/librobinhood/data/store/QuoteStore;", "setQuoteStore", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;)V", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "getIndexStore", "()Lcom/robinhood/android/indexes/store/IndexStore;", "setIndexStore", "(Lcom/robinhood/android/indexes/store/IndexStore;)V", "binding", "Lcom/robinhood/android/optionsplchart/databinding/FragmentOptionsProfitLossChartAnalysisBinding;", "getBinding", "()Lcom/robinhood/android/optionsplchart/databinding/FragmentOptionsProfitLossChartAnalysisBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "getUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "getRequestParams", "Lio/reactivex/Observable;", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "underlyingQuoteObs", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UnderlyingQuote;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionsProfitLossChartAnalysisFragment extends BaseFragment implements RegionGated {
    private static final String SCREEN_NAME = "options_pl_small_screen";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AccountProvider accountProvider;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public IndexStore indexStore;
    public OptionOrderContextFactory optionOrderContextFactory;
    public QuoteStore quoteStore;
    private final String screenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionsProfitLossChartAnalysisFragment.class, "binding", "getBinding()Lcom/robinhood/android/optionsplchart/databinding/FragmentOptionsProfitLossChartAnalysisBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionsProfitLossChartAnalysisFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionsProfitLossChartAnalysisFragment() {
        super(C24771R.layout.fragment_options_profit_loss_chart_analysis);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, OptionsProfitLossChartAnalysisFragment2.INSTANCE);
        this.screenName = SCREEN_NAME;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final OptionOrderContextFactory getOptionOrderContextFactory() {
        OptionOrderContextFactory optionOrderContextFactory = this.optionOrderContextFactory;
        if (optionOrderContextFactory != null) {
            return optionOrderContextFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionOrderContextFactory");
        return null;
    }

    public final void setOptionOrderContextFactory(OptionOrderContextFactory optionOrderContextFactory) {
        Intrinsics.checkNotNullParameter(optionOrderContextFactory, "<set-?>");
        this.optionOrderContextFactory = optionOrderContextFactory;
    }

    public final QuoteStore getQuoteStore() {
        QuoteStore quoteStore = this.quoteStore;
        if (quoteStore != null) {
            return quoteStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quoteStore");
        return null;
    }

    public final void setQuoteStore(QuoteStore quoteStore) {
        Intrinsics.checkNotNullParameter(quoteStore, "<set-?>");
        this.quoteStore = quoteStore;
    }

    public final IndexStore getIndexStore() {
        IndexStore indexStore = this.indexStore;
        if (indexStore != null) {
            return indexStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("indexStore");
        return null;
    }

    public final void setIndexStore(IndexStore indexStore) {
        Intrinsics.checkNotNullParameter(indexStore, "<set-?>");
        this.indexStore = indexStore;
    }

    private final FragmentOptionsProfitLossChartAnalysisBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionsProfitLossChartAnalysisBinding) value;
    }

    public final UiOptionChain getUiOptionChain() {
        return ((OptionsProfitLossChartAnalysisFragmentKey) INSTANCE.getArgs((Fragment) this)).getOptionOrderBundle().getOptionChainBundle().getUiOptionChain();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        Analytics3.logScreenAppear$default(getAnalytics(), getScreenName(), null, 2, null);
        getBinding().loadingView.show();
        RdsButton optionsProfitLossChartAnalysisDone = getBinding().optionsProfitLossChartAnalysisDone;
        Intrinsics.checkNotNullExpressionValue(optionsProfitLossChartAnalysisDone, "optionsProfitLossChartAnalysisDone");
        OnClickListeners.onClick(optionsProfitLossChartAnalysisDone, new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossChartAnalysisFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton optionsProfitLossChartAnalysisLearnMore = getBinding().optionsProfitLossChartAnalysisLearnMore;
        Intrinsics.checkNotNullExpressionValue(optionsProfitLossChartAnalysisLearnMore, "optionsProfitLossChartAnalysisLearnMore");
        OnClickListeners.onClick(optionsProfitLossChartAnalysisLearnMore, new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossChartAnalysisFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment) {
        optionsProfitLossChartAnalysisFragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment) {
        OptionsProfitLossAnalytics.logOptionsProfitLossLearnMoreTap(optionsProfitLossChartAnalysisFragment.getAnalytics());
        ProfitAndLossChartEducationFragment.Companion companion = ProfitAndLossChartEducationFragment.INSTANCE;
        Context contextRequireContext = optionsProfitLossChartAnalysisFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        optionsProfitLossChartAnalysisFragment.startActivity(companion.getIntent(contextRequireContext, optionsProfitLossChartAnalysisFragment.getNavigator()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        Observable map;
        super.onResume();
        OptionsProfitLossChartView optionsProfitLossChartAnalysisChart = getBinding().optionsProfitLossChartAnalysisChart;
        Intrinsics.checkNotNullExpressionValue(optionsProfitLossChartAnalysisChart, "optionsProfitLossChartAnalysisChart");
        int i = WhenMappings.$EnumSwitchMapping$0[getUiOptionChain().getUnderlyingType().ordinal()];
        if (i == 1) {
            UUID equityInstrumentId = ((OptionsProfitLossChartAnalysisFragmentKey) INSTANCE.getArgs((Fragment) this)).getOptionOrderBundle().getOptionChainBundle().getEquityInstrumentId();
            if (equityInstrumentId == null) {
                map = Observable.empty();
                Intrinsics.checkNotNullExpressionValue(map, "empty(...)");
            } else {
                getQuoteStore().refresh(false, equityInstrumentId);
                map = getQuoteStore().getStreamQuote().asObservable(equityInstrumentId).map(new Function() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$onResume$underlyingQuoteObs$1$1
                    @Override // io.reactivex.functions.Function
                    public final Optional<UnderlyingQuote> apply(Quote quote) {
                        Intrinsics.checkNotNullParameter(quote, "quote");
                        return Optional3.asOptional(UnderlyingQuote.INSTANCE.getUnderlyingQuote(quote, null));
                    }
                });
                Intrinsics.checkNotNull(map);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            UUID indexUnderlyingId = getUiOptionChain().getIndexUnderlyingId();
            if (indexUnderlyingId == null) {
                map = Observable.empty();
                Intrinsics.checkNotNullExpressionValue(map, "empty(...)");
            } else {
                final Flow<IndexValue> flowStreamIndexValue = getIndexStore().streamIndexValue(new ApiIndexValueDetailRequest.ApiIndexValueRequestById(indexUnderlyingId));
                map = asObservable(new Flow<Optional<? extends UnderlyingQuote>>() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$onResume$lambda$3$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$onResume$lambda$3$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$onResume$lambda$3$$inlined$map$1$2", m3645f = "OptionsProfitLossChartAnalysisFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$onResume$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
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
                                Optional optionalAsOptional = Optional3.asOptional(UnderlyingQuote.INSTANCE.getUnderlyingQuote(null, (IndexValue) obj));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super Optional<? extends UnderlyingQuote>> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamIndexValue.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
            }
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getRequestParams(map)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C298591(optionsProfitLossChartAnalysisChart));
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(optionsProfitLossChartAnalysisChart.getProfitLossAdditionalInfoObs()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartAnalysisFragment.onResume$lambda$5(this.f$0, (ProfitLossAdditionalInfo) obj);
            }
        });
    }

    /* compiled from: OptionsProfitLossChartAnalysisFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$onResume$1 */
    /* synthetic */ class C298591 extends FunctionReferenceImpl implements Function1<ApiOptionsProfitLossChartRequestParams, Unit> {
        C298591(Object obj) {
            super(1, obj, OptionsProfitLossChartView.class, "updateRequestParams", "updateRequestParams(Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams) {
            invoke2(apiOptionsProfitLossChartRequestParams);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ApiOptionsProfitLossChartRequestParams p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionsProfitLossChartView) this.receiver).updateRequestParams(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment, ProfitLossAdditionalInfo additionalInfo) throws Resources.NotFoundException {
        CharSequence string2;
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        optionsProfitLossChartAnalysisFragment.getBinding().loadingView.hide();
        CurrentProfitLoss currentProfitLoss = additionalInfo.getCurrentProfitLoss();
        if (currentProfitLoss == null || (string2 = currentProfitLoss.getProfitLossString()) == null) {
            string2 = optionsProfitLossChartAnalysisFragment.getResources().getString(C11048R.string.general_label_n_a_short);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        optionsProfitLossChartAnalysisFragment.getBinding().optionsProfitLossChartAnalysisExpectedProfitLoss.setText(string2);
        InfoBarValues infoBarValues = additionalInfo.getInfoBarValues();
        if (infoBarValues != null) {
            optionsProfitLossChartAnalysisFragment.getBinding().optionsProfitLossChartAnalysisProfitRow.setValueText(infoBarValues.getMaxProfit());
            optionsProfitLossChartAnalysisFragment.getBinding().optionsProfitLossChartAnalysisLossRow.setValueText(infoBarValues.getMaxLoss());
            optionsProfitLossChartAnalysisFragment.getBinding().optionsProfitLossChartAnalysisBreakevenRow.setValueText(infoBarValues.getBreakevenPoints());
        }
        return Unit.INSTANCE;
    }

    private final Observable<ApiOptionsProfitLossChartRequestParams> getRequestParams(Observable<Optional<UnderlyingQuote>> underlyingQuoteObs) {
        Observable map = getAccountProvider().streamIndividualAccountNumber().switchMap(new OptionsProfitLossChartAnalysisFragment3(this)).map(new Function() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$getRequestParams$optionQuoteObs$1
            @Override // io.reactivex.functions.Function
            public final Optional<BigDecimal> apply(List<OptionOrderContext.LegContext> legContexts) {
                Intrinsics.checkNotNullParameter(legContexts, "legContexts");
                OptionOrderContext.Prices.Companion companion = OptionOrderContext.Prices.INSTANCE;
                OptionsProfitLossChartAnalysisFragment.Companion companion2 = OptionsProfitLossChartAnalysisFragment.INSTANCE;
                return Optional3.asOptional(companion.from(((OptionsProfitLossChartAnalysisFragmentKey) companion2.getArgs((Fragment) this.this$0)).getOverrideDirection(), ((OptionsProfitLossChartAnalysisFragmentKey) companion2.getArgs((Fragment) this.this$0)).getPreserveUserInput(), legContexts, OptionOrderUserInputPrices2.getDefaultOptionOrderUserInputPrices(), ((OptionsProfitLossChartAnalysisFragmentKey) companion2.getArgs((Fragment) this.this$0)).getDefaultPricingType()).getValidDefaultPrice());
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(underlyingQuoteObs);
        Intrinsics.checkNotNull(map);
        Observable<ApiOptionsProfitLossChartRequestParams> map2 = observables.combineLatest(observableFilterIsPresent, ObservablesKt.filterIsPresent(map)).map(new Function() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment.getRequestParams.1
            @Override // io.reactivex.functions.Function
            public final ApiOptionsProfitLossChartRequestParams apply(Tuples2<? extends UnderlyingQuote, ? extends BigDecimal> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                UnderlyingQuote underlyingQuoteComponent1 = tuples2.component1();
                BigDecimal bigDecimalComponent2 = tuples2.component2();
                Companion companion = OptionsProfitLossChartAnalysisFragment.INSTANCE;
                OptionOrderBundle optionOrderBundle = ((OptionsProfitLossChartAnalysisFragmentKey) companion.getArgs((Fragment) OptionsProfitLossChartAnalysisFragment.this)).getOptionOrderBundle();
                int contractQuantity = ((OptionsProfitLossChartAnalysisFragmentKey) companion.getArgs((Fragment) OptionsProfitLossChartAnalysisFragment.this)).getContractQuantity();
                BigDecimal permanentLimitPrice = ((OptionsProfitLossChartAnalysisFragmentKey) companion.getArgs((Fragment) OptionsProfitLossChartAnalysisFragment.this)).getPermanentLimitPrice();
                return new ApiOptionsProfitLossChartRequestParams(optionOrderBundle, contractQuantity, permanentLimitPrice != null ? Money3.toMoney$default(permanentLimitPrice, null, 1, null) : null, Money3.toMoney$default(bigDecimalComponent2, null, 1, null), underlyingQuoteComponent1);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    /* compiled from: OptionsProfitLossChartAnalysisFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartAnalysisFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartAnalysisFragment;", "Lcom/robinhood/android/options/contracts/OptionsProfitLossChartAnalysisFragmentKey;", "<init>", "()V", "SCREEN_NAME", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionsProfitLossChartAnalysisFragment, OptionsProfitLossChartAnalysisFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(OptionsProfitLossChartAnalysisFragmentKey optionsProfitLossChartAnalysisFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, optionsProfitLossChartAnalysisFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionsProfitLossChartAnalysisFragmentKey getArgs(OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment) {
            return (OptionsProfitLossChartAnalysisFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionsProfitLossChartAnalysisFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionsProfitLossChartAnalysisFragment newInstance(OptionsProfitLossChartAnalysisFragmentKey optionsProfitLossChartAnalysisFragmentKey) {
            return (OptionsProfitLossChartAnalysisFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionsProfitLossChartAnalysisFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment, OptionsProfitLossChartAnalysisFragmentKey optionsProfitLossChartAnalysisFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionsProfitLossChartAnalysisFragment, optionsProfitLossChartAnalysisFragmentKey);
        }
    }
}
