package com.robinhood.android.margin.p174ui.limit;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.lib.p166fx.provider.FxRatesProvider;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.margin.p174ui.limit.MarginLimitEvent;
import com.robinhood.android.margin.p174ui.limit.MarginLimitFragment;
import com.robinhood.android.regiongate.McwCurrencySwitcherRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.tickerinputview.keyevent.DollarInputConsumer;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MarginLimitDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\"BQ\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitDataState;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitViewState;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "stateProvider", "Lcom/robinhood/android/margin/ui/limit/MarginLimitStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/margin/ui/limit/MarginLimitStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onFocusChange", "consumeKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginLimitDuxo extends BaseDuxo3<MarginLimitDataState, MarginLimitViewState, MarginLimitEvent> implements HasSavedState {
    private final BalancesStore balancesStore;
    private final FxRatesProvider fxRatesProvider;
    private final LeveredMarginSettingsStore leveredMarginSettingsStore;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final UnifiedAccountStore unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MarginLimitDuxo(BalancesStore balancesStore, UnifiedAccountStore unifiedAccountStore, MarginSubscriptionStore marginSubscriptionStore, LeveredMarginSettingsStore leveredMarginSettingsStore, FxRatesProvider fxRatesProvider, RegionGateProvider regionGateProvider, MarginLimitStateProvider stateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
        Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new MarginLimitDataState(null, null, null, null, null, ((MarginLimitFragment.Args) companion.getArgs(savedStateHandle)).getMarginInvestingInfo(), null, null, null, false, ((MarginLimitFragment.Args) companion.getArgs(savedStateHandle)).getUserLocale(), null, 3039, null), stateProvider, duxoBundle);
        this.balancesStore = balancesStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.leveredMarginSettingsStore = leveredMarginSettingsStore;
        this.fxRatesProvider = fxRatesProvider;
        this.regionGateProvider = regionGateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C210861(null));
        String accountNumber = ((MarginLimitFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getMarginInvestingInfo().getAccountNumber();
        UnifiedAccountStore.refresh$default(this.unifiedAccountStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.unifiedAccountStore.streamAccount(accountNumber), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginLimitDuxo.onCreate$lambda$0(this.f$0, (Optional) obj);
            }
        });
        BalancesStore.refreshAccount$default(this.balancesStore, accountNumber, false, 2, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.toOptionals(asObservable(this.balancesStore.streamUnifiedBalances(accountNumber))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginLimitDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
        this.marginSubscriptionStore.refreshCurrentMarginSubscription(false);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(this.marginSubscriptionStore.getCurrentMarginSubscriptionOptional()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginLimitDuxo.onCreate$lambda$2(this.f$0, (MarginSubscription) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.toOptionals(this.leveredMarginSettingsStore.streamMarginSettings(accountNumber)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginLimitDuxo.onCreate$lambda$3(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: MarginLimitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1", m3645f = "MarginLimitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1 */
    static final class C210861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C210861(Continuation<? super C210861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C210861 c210861 = MarginLimitDuxo.this.new C210861(continuation);
            c210861.L$0 = obj;
            return c210861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C210861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MarginLimitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$1", m3645f = "MarginLimitDuxo.kt", m3646l = {63}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MarginLimitDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MarginLimitDuxo marginLimitDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = marginLimitDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, McwCurrencySwitcherRegionGate.INSTANCE, false, 2, null);
                    final MarginLimitDuxo marginLimitDuxo = this.this$0;
                    Flow flowTransformLatest = FlowKt.transformLatest(new Flow<Boolean>() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$1$invokeSuspend$$inlined$filter$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$1$invokeSuspend$$inlined$filter$1$2 */
                        public static final class C210832<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ MarginLimitDuxo this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$1$invokeSuspend$$inlined$filter$1$2", m3645f = "MarginLimitDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C210832.this.emit(null, this);
                                }
                            }

                            public C210832(FlowCollector flowCollector, MarginLimitDuxo marginLimitDuxo) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = marginLimitDuxo;
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
                                    if (!((Boolean) obj).booleanValue() && Intrinsics.areEqual(((MarginLimitFragment.Args) MarginLimitDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getUserLocale(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
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
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamRegionGateStateFlow$default.collect(new C210832(flowCollector, marginLimitDuxo), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }, new C21084xc34ea7fa(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: MarginLimitDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/fx/api/ApiFxQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$1$3", m3645f = "MarginLimitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<ApiFxQuote, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ MarginLimitDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(MarginLimitDuxo marginLimitDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = marginLimitDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ApiFxQuote apiFxQuote, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(apiFxQuote, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: MarginLimitDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/ui/limit/MarginLimitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$1$3$1", m3645f = "MarginLimitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$1$3$1, reason: invalid class name and collision with other inner class name */
                static final class C502671 extends ContinuationImpl7 implements Function2<MarginLimitDataState, Continuation<? super MarginLimitDataState>, Object> {
                    final /* synthetic */ ApiFxQuote $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502671(ApiFxQuote apiFxQuote, Continuation<? super C502671> continuation) {
                        super(2, continuation);
                        this.$it = apiFxQuote;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502671 c502671 = new C502671(this.$it, continuation);
                        c502671.L$0 = obj;
                        return c502671;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(MarginLimitDataState marginLimitDataState, Continuation<? super MarginLimitDataState> continuation) {
                        return ((C502671) create(marginLimitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return MarginLimitDataState.copy$default((MarginLimitDataState) this.L$0, null, null, null, null, null, null, null, null, this.$it, false, null, null, 3839, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C502671((ApiFxQuote) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(MarginLimitDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(MarginLimitDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: MarginLimitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$2", m3645f = "MarginLimitDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MarginLimitDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MarginLimitDuxo marginLimitDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = marginLimitDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, McwCurrencySwitcherRegionGate.INSTANCE, false, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: MarginLimitDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$2$1", m3645f = "MarginLimitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ MarginLimitDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MarginLimitDuxo marginLimitDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = marginLimitDuxo;
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

                /* compiled from: MarginLimitDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/ui/limit/MarginLimitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$2$1$1", m3645f = "MarginLimitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C502681 extends ContinuationImpl7 implements Function2<MarginLimitDataState, Continuation<? super MarginLimitDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502681(boolean z, Continuation<? super C502681> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502681 c502681 = new C502681(this.$it, continuation);
                        c502681.L$0 = obj;
                        return c502681;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(MarginLimitDataState marginLimitDataState, Continuation<? super MarginLimitDataState> continuation) {
                        return ((C502681) create(marginLimitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return MarginLimitDataState.copy$default((MarginLimitDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, null, boxing.boxBoolean(this.$it), 2047, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C502681(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(MarginLimitDuxo marginLimitDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        marginLimitDuxo.applyMutation(new MarginLimitDuxo2((UnifiedAccountV2) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(MarginLimitDuxo marginLimitDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        marginLimitDuxo.applyMutation(new MarginLimitDuxo3((UnifiedBalances) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(MarginLimitDuxo marginLimitDuxo, MarginSubscription subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        marginLimitDuxo.applyMutation(new MarginLimitDuxo4(subscription, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(MarginLimitDuxo marginLimitDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        marginLimitDuxo.applyMutation(new MarginLimitDuxo5((MarginSettings) optional.component1(), null));
        return Unit.INSTANCE;
    }

    public final void onFocusChange() {
        withDataState(new Function1() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginLimitDuxo.onFocusChange$lambda$4(this.f$0, (MarginLimitDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFocusChange$lambda$4(MarginLimitDuxo marginLimitDuxo, MarginLimitDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (!ds.getHasNegativeBuyingPower()) {
            marginLimitDuxo.submit(MarginLimitEvent.RequestFocusForMarginLimitInput.INSTANCE);
        } else {
            marginLimitDuxo.submit(MarginLimitEvent.RemoveFocusForMarginLimitInput.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: MarginLimitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/ui/limit/MarginLimitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitDuxo$consumeKeyEvent$1", m3645f = "MarginLimitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$consumeKeyEvent$1 */
    static final class C210851 extends ContinuationImpl7 implements Function2<MarginLimitDataState, Continuation<? super MarginLimitDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C210851(KeyEvent keyEvent, Continuation<? super C210851> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C210851 c210851 = new C210851(this.$keyEvent, continuation);
            c210851.L$0 = obj;
            return c210851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MarginLimitDataState marginLimitDataState, Continuation<? super MarginLimitDataState> continuation) {
            return ((C210851) create(marginLimitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            BigDecimal prefillMarginLimit;
            String inputChars;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MarginLimitDataState marginLimitDataState = (MarginLimitDataState) this.L$0;
            boolean z = marginLimitDataState.getAnimateInput() || marginLimitDataState.getPrefillMarginLimit() == null || Intrinsics.areEqual(marginLimitDataState.getPrefillMarginLimit(), BigDecimal.ZERO);
            DollarInputConsumer dollarInputConsumer = new DollarInputConsumer(new BigDecimal(InvestFlowConstants.MAX_ONE_TIME_AMOUNT), true);
            if (z) {
                prefillMarginLimit = marginLimitDataState.getUserInputAmount();
            } else {
                prefillMarginLimit = marginLimitDataState.getPrefillMarginLimit();
                if (prefillMarginLimit == null) {
                    prefillMarginLimit = BigDecimal.ZERO;
                }
            }
            if (z) {
                inputChars = marginLimitDataState.getInputChars();
            } else {
                NumberFormatter currencyFormatNoDecimals = Formats.getCurrencyFormatNoDecimals();
                BigDecimal prefillMarginLimit2 = marginLimitDataState.getPrefillMarginLimit();
                if (prefillMarginLimit2 == null) {
                    prefillMarginLimit2 = BigDecimal.ZERO;
                }
                Intrinsics.checkNotNull(prefillMarginLimit2);
                inputChars = currencyFormatNoDecimals.format(prefillMarginLimit2);
            }
            char[] charArray = inputChars.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            InputKeyEventConsumer.InputState<BigDecimal> inputStateConsume = dollarInputConsumer.consume(new InputKeyEventConsumer.InputState(prefillMarginLimit, charArray), this.$keyEvent);
            BigDecimal bigDecimalComponent1 = inputStateConsume.component1();
            return MarginLimitDataState.copy$default(marginLimitDataState, null, null, null, null, Money3.toMoney$default(bigDecimalComponent1, null, 1, null), null, new String(inputStateConsume.getInput()), bigDecimalComponent1, null, true, null, null, 3375, null);
        }
    }

    public final void consumeKeyEvent(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C210851(keyEvent, null));
    }

    /* compiled from: MarginLimitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitDuxo;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitFragment$Args;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MarginLimitDuxo, MarginLimitFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginLimitFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MarginLimitFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginLimitFragment.Args getArgs(MarginLimitDuxo marginLimitDuxo) {
            return (MarginLimitFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, marginLimitDuxo);
        }
    }
}
