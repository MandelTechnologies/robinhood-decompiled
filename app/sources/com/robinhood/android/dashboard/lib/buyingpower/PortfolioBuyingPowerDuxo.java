package com.robinhood.android.dashboard.lib.buyingpower;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.api.futures.FuturesBrokebackApi;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencyExtensions;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs3;
import com.robinhood.android.lib.p166fx.provider.McwFxRatesProvider;
import com.robinhood.android.models.futures.api.margin.ApiFuturesMarginCallResolution;
import com.robinhood.android.portfolio.privacy.PortfolioPrivacyPref;
import com.robinhood.android.regiongate.McwCurrencySwitcherRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.EducationToolTipStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationToolTipResponse;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: PortfolioBuyingPowerDuxo.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Be\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u000e\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001eJ\u000e\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDataState;", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerViewState;", "educationToolTipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationToolTipStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "portfolioBuyingPowerNavigationDestinationProvider", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestinationProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "futuresBrokebackApi", "Lcom/robinhood/android/lib/api/futures/FuturesBrokebackApi;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "displayCurrencySelectionPref", "Lcom/robinhood/prefs/IntPreference;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/EducationToolTipStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestinationProvider;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/lib/api/futures/FuturesBrokebackApi;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "accountNumberFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onCreate", "", "onStart", "setData", "accountNumber", "markTooltipSeen", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PortfolioBuyingPowerDuxo extends BaseDuxo<PortfolioBuyingPowerDataState, PortfolioBuyingPowerViewState> {
    public static final int $stable = 8;
    private final StateFlow2<String> accountNumberFlow;
    private final AccountProvider accountProvider;
    private final IntPreference displayCurrencySelectionPref;
    private final EducationToolTipStore educationToolTipStore;
    private final FuturesBrokebackApi futuresBrokebackApi;
    private final McwFxRatesProvider fxRatesProvider;
    private final GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore;
    private final PortfolioBuyingPowerNavigationDestinationProvider portfolioBuyingPowerNavigationDestinationProvider;
    private final BooleanPreference portfolioPrivacyPref;
    private final RegionGateProvider regionGateProvider;
    private final UnifiedAccountStore unifiedAccountStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioBuyingPowerDuxo(EducationToolTipStore educationToolTipStore, UnifiedAccountStore unifiedAccountStore, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, PortfolioBuyingPowerNavigationDestinationProvider portfolioBuyingPowerNavigationDestinationProvider, AccountProvider accountProvider, FuturesBrokebackApi futuresBrokebackApi, @PortfolioPrivacyPref BooleanPreference portfolioPrivacyPref, @DisplayCurrencySelectionPrefs3 IntPreference displayCurrencySelectionPref, McwFxRatesProvider fxRatesProvider, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle) {
        super(new PortfolioBuyingPowerDataState(null, null, null, null, false, false, DisplayCurrencyExtensions.toRosettaCurrency(displayCurrencySelectionPref), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null), PortfolioBuyingPowerDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(educationToolTipStore, "educationToolTipStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
        Intrinsics.checkNotNullParameter(portfolioBuyingPowerNavigationDestinationProvider, "portfolioBuyingPowerNavigationDestinationProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(futuresBrokebackApi, "futuresBrokebackApi");
        Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
        Intrinsics.checkNotNullParameter(displayCurrencySelectionPref, "displayCurrencySelectionPref");
        Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.educationToolTipStore = educationToolTipStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.goldDepositBoostMaxAwarenessStore = goldDepositBoostMaxAwarenessStore;
        this.portfolioBuyingPowerNavigationDestinationProvider = portfolioBuyingPowerNavigationDestinationProvider;
        this.accountProvider = accountProvider;
        this.futuresBrokebackApi = futuresBrokebackApi;
        this.portfolioPrivacyPref = portfolioPrivacyPref;
        this.displayCurrencySelectionPref = displayCurrencySelectionPref;
        this.fxRatesProvider = fxRatesProvider;
        this.regionGateProvider = regionGateProvider;
        this.accountNumberFlow = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C137151(null));
    }

    /* compiled from: PortfolioBuyingPowerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onCreate$1", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {76}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onCreate$1 */
    static final class C137151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137151(Continuation<? super C137151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PortfolioBuyingPowerDuxo.this.new C137151(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowTransformLatest = FlowKt.transformLatest(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(PortfolioBuyingPowerDuxo.this.regionGateProvider, McwCurrencySwitcherRegionGate.INSTANCE, false, 2, null), new C13707x4924f65b(null, PortfolioBuyingPowerDuxo.this));
                Flow flowTransformLatest2 = FlowKt.transformLatest(new Flow<Currency>() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C137092<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C137092.this.emit(null, this);
                            }
                        }

                        public C137092(FlowCollector flowCollector) {
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
                                Currency currencyFromValue = Currency.INSTANCE.fromValue(((Number) obj).intValue());
                                if (currencyFromValue == null) {
                                    currencyFromValue = Currency.USD;
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(currencyFromValue, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super Currency> flowCollector, Continuation continuation) {
                        Object objCollect = flowTransformLatest.collect(new C137092(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new C13708x4924f65c(null, PortfolioBuyingPowerDuxo.this));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(PortfolioBuyingPowerDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest2, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: PortfolioBuyingPowerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/rosetta/common/Currency;", "Lcom/robinhood/models/fx/db/McwFxRate;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onCreate$1$4", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<Tuples2<? extends Currency, ? extends McwFxRate>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PortfolioBuyingPowerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(PortfolioBuyingPowerDuxo portfolioBuyingPowerDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = portfolioBuyingPowerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Currency, ? extends McwFxRate> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends Currency, McwFxRate>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends Currency, McwFxRate> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PortfolioBuyingPowerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onCreate$1$4$1", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PortfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState>, Object> {
                final /* synthetic */ Currency $currency;
                final /* synthetic */ McwFxRate $fxRate;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Currency currency, McwFxRate mcwFxRate, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$currency = currency;
                    this.$fxRate = mcwFxRate;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currency, this.$fxRate, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PortfolioBuyingPowerDataState portfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState> continuation) {
                    return ((AnonymousClass1) create(portfolioBuyingPowerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PortfolioBuyingPowerDataState portfolioBuyingPowerDataState = (PortfolioBuyingPowerDataState) this.L$0;
                    Currency currency = this.$currency;
                    McwFxRate mcwFxRate = this.$fxRate;
                    return PortfolioBuyingPowerDataState.copy$default(portfolioBuyingPowerDataState, null, null, null, null, false, false, currency, mcwFxRate != null ? mcwFxRate.getMarkPrice() : null, 63, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1((Currency) tuples2.component1(), (McwFxRate) tuples2.component2(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.unifiedAccountStore.poll(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
        getLifecycleScope().launchWhenStarted(new C137161(null));
        getLifecycleScope().launchWhenStarted(new C137172(null));
        getLifecycleScope().launchWhenStarted(new C137183(null));
        getLifecycleScope().launchWhenStarted(new C137194(null));
        getLifecycleScope().launchWhenStarted(new C137205(null));
        getLifecycleScope().launchWhenStarted(new C137216(null));
    }

    /* compiled from: PortfolioBuyingPowerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$1", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {98}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$1 */
    static final class C137161 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137161(Continuation<? super C137161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PortfolioBuyingPowerDuxo.this.new C137161(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.filterNotNull(PortfolioBuyingPowerDuxo.this.accountNumberFlow), new C13711x8479a9a9(null, PortfolioBuyingPowerDuxo.this)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PortfolioBuyingPowerDuxo.this, null);
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

        /* compiled from: PortfolioBuyingPowerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$1$2", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Optional<? extends UnifiedAccountV2>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PortfolioBuyingPowerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PortfolioBuyingPowerDuxo portfolioBuyingPowerDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = portfolioBuyingPowerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<UnifiedAccountV2> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends UnifiedAccountV2> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<UnifiedAccountV2>) optional, continuation);
            }

            /* compiled from: PortfolioBuyingPowerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$1$2$1", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PortfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState>, Object> {
                final /* synthetic */ UnifiedAccountV2 $account;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(UnifiedAccountV2 unifiedAccountV2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$account = unifiedAccountV2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$account, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PortfolioBuyingPowerDataState portfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState> continuation) {
                    return ((AnonymousClass1) create(portfolioBuyingPowerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PortfolioBuyingPowerDataState.copy$default((PortfolioBuyingPowerDataState) this.L$0, this.$account, null, null, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((UnifiedAccountV2) ((Optional) this.L$0).component1(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: PortfolioBuyingPowerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$2", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {108}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$2 */
    static final class C137172 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137172(Continuation<? super C137172> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PortfolioBuyingPowerDuxo.this.new C137172(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137172) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PortfolioBuyingPowerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "privacyEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$2$1", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PortfolioBuyingPowerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PortfolioBuyingPowerDuxo portfolioBuyingPowerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = portfolioBuyingPowerDuxo;
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

            /* compiled from: PortfolioBuyingPowerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$2$1$1", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498321 extends ContinuationImpl7 implements Function2<PortfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState>, Object> {
                final /* synthetic */ boolean $privacyEnabled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498321(boolean z, Continuation<? super C498321> continuation) {
                    super(2, continuation);
                    this.$privacyEnabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498321 c498321 = new C498321(this.$privacyEnabled, continuation);
                    c498321.L$0 = obj;
                    return c498321;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PortfolioBuyingPowerDataState portfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState> continuation) {
                    return ((C498321) create(portfolioBuyingPowerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PortfolioBuyingPowerDataState.copy$default((PortfolioBuyingPowerDataState) this.L$0, null, null, null, null, false, this.$privacyEnabled, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C498321(this.Z$0, null));
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
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(PortfolioBuyingPowerDuxo.this.portfolioPrivacyPref.getChanges()), Integer.MAX_VALUE, null, 2, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PortfolioBuyingPowerDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: PortfolioBuyingPowerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$3", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$3 */
    static final class C137183 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137183(Continuation<? super C137183> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PortfolioBuyingPowerDuxo.this.new C137183(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137183) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(PortfolioBuyingPowerDuxo.this.accountNumberFlow, new C13712x32b58b67(null, PortfolioBuyingPowerDuxo.this)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PortfolioBuyingPowerDuxo.this, null);
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

        /* compiled from: PortfolioBuyingPowerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "onboardingTooltip", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationToolTipResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$3$2", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ApiEducationToolTipResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PortfolioBuyingPowerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PortfolioBuyingPowerDuxo portfolioBuyingPowerDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = portfolioBuyingPowerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiEducationToolTipResponse apiEducationToolTipResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(apiEducationToolTipResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PortfolioBuyingPowerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$3$2$1", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PortfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState>, Object> {
                final /* synthetic */ ApiEducationToolTipResponse $onboardingTooltip;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ApiEducationToolTipResponse apiEducationToolTipResponse, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$onboardingTooltip = apiEducationToolTipResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onboardingTooltip, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PortfolioBuyingPowerDataState portfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState> continuation) {
                    return ((AnonymousClass1) create(portfolioBuyingPowerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PortfolioBuyingPowerDataState.copy$default((PortfolioBuyingPowerDataState) this.L$0, null, this.$onboardingTooltip.getMarkdown(), null, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((ApiEducationToolTipResponse) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: PortfolioBuyingPowerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$4", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$4 */
    static final class C137194 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137194(Continuation<? super C137194> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PortfolioBuyingPowerDuxo.this.new C137194(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137194) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.filterNotNull(PortfolioBuyingPowerDuxo.this.accountNumberFlow)), new C13713x89d37c46(null, PortfolioBuyingPowerDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PortfolioBuyingPowerDuxo.this, null);
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

        /* compiled from: PortfolioBuyingPowerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "navigationDestination", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestination;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$4$2", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PortfolioBuyingPowerNavigationDestinationProvider2, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PortfolioBuyingPowerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PortfolioBuyingPowerDuxo portfolioBuyingPowerDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = portfolioBuyingPowerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PortfolioBuyingPowerNavigationDestinationProvider2 portfolioBuyingPowerNavigationDestinationProvider2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(portfolioBuyingPowerNavigationDestinationProvider2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PortfolioBuyingPowerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$4$2$1", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$4$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PortfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState>, Object> {
                final /* synthetic */ PortfolioBuyingPowerNavigationDestinationProvider2 $navigationDestination;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PortfolioBuyingPowerNavigationDestinationProvider2 portfolioBuyingPowerNavigationDestinationProvider2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$navigationDestination = portfolioBuyingPowerNavigationDestinationProvider2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$navigationDestination, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PortfolioBuyingPowerDataState portfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState> continuation) {
                    return ((AnonymousClass1) create(portfolioBuyingPowerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PortfolioBuyingPowerDataState.copy$default((PortfolioBuyingPowerDataState) this.L$0, null, null, this.$navigationDestination, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((PortfolioBuyingPowerNavigationDestinationProvider2) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: PortfolioBuyingPowerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$5", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {155}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$5 */
    static final class C137205 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137205(Continuation<? super C137205> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PortfolioBuyingPowerDuxo.this.new C137205(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137205) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(PortfolioBuyingPowerDuxo.this.goldDepositBoostMaxAwarenessStore.streamGoldDepositBoostMaxAwareness()), Integer.MAX_VALUE, null, 2, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PortfolioBuyingPowerDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PortfolioBuyingPowerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$5$1", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PortfolioBuyingPowerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PortfolioBuyingPowerDuxo portfolioBuyingPowerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = portfolioBuyingPowerDuxo;
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

            /* compiled from: PortfolioBuyingPowerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$5$1$1", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498331 extends ContinuationImpl7 implements Function2<PortfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498331(boolean z, Continuation<? super C498331> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498331 c498331 = new C498331(this.$it, continuation);
                    c498331.L$0 = obj;
                    return c498331;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PortfolioBuyingPowerDataState portfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState> continuation) {
                    return ((C498331) create(portfolioBuyingPowerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PortfolioBuyingPowerDataState.copy$default((PortfolioBuyingPowerDataState) this.L$0, null, null, null, boxing.boxBoolean(this.$it), false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C498331(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: PortfolioBuyingPowerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$6", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$6 */
    static final class C137216 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137216(Continuation<? super C137216> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PortfolioBuyingPowerDuxo.this.new C137216(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137216) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.filterNotNull(PortfolioBuyingPowerDuxo.this.accountNumberFlow)), new C13714x380f5e04(null, PortfolioBuyingPowerDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PortfolioBuyingPowerDuxo.this, null);
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

        /* compiled from: PortfolioBuyingPowerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$6$2", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$6$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends Boolean>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PortfolioBuyingPowerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PortfolioBuyingPowerDuxo portfolioBuyingPowerDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = portfolioBuyingPowerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends Boolean> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<String, Boolean>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<String, Boolean> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                boolean no_futures_holdings = true;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    String str = (String) tuples2.component1();
                    if (((Boolean) tuples2.component2()).booleanValue()) {
                        FuturesBrokebackApi futuresBrokebackApi = this.this$0.futuresBrokebackApi;
                        this.label = 1;
                        obj = futuresBrokebackApi.getFuturesMarginCallResolution(str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    this.this$0.applyMutation(new AnonymousClass1(no_futures_holdings, null));
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                no_futures_holdings = ((ApiFuturesMarginCallResolution) obj).getNo_futures_holdings();
                this.this$0.applyMutation(new AnonymousClass1(no_futures_holdings, null));
                return Unit.INSTANCE;
            }

            /* compiled from: PortfolioBuyingPowerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$6$2$1", m3645f = "PortfolioBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerDuxo$onStart$6$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PortfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState>, Object> {
                final /* synthetic */ boolean $noFuturesHoldings;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$noFuturesHoldings = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$noFuturesHoldings, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PortfolioBuyingPowerDataState portfolioBuyingPowerDataState, Continuation<? super PortfolioBuyingPowerDataState> continuation) {
                    return ((AnonymousClass1) create(portfolioBuyingPowerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PortfolioBuyingPowerDataState.copy$default((PortfolioBuyingPowerDataState) this.L$0, null, null, null, null, this.$noFuturesHoldings, false, null, null, 239, null);
                }
            }
        }
    }

    public final void setData(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumberFlow.setValue(accountNumber);
    }

    public final void markTooltipSeen(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.educationToolTipStore.markToolTipSeen(PortfolioBuyingPower5.MarginHubOnboardingTooltipId, accountNumber);
    }
}
