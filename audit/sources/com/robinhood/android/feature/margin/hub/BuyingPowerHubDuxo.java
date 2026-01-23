package com.robinhood.android.feature.margin.hub;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.feature.margin.hub.BuyingPowerHubEvent;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.hub.MarginHubStore;
import com.robinhood.android.lib.margin.hub.api.models.ApiBuyingPowerHubOnboardingAlert;
import com.robinhood.android.lib.margin.hub.p168db.models.BuyingPowerHubView;
import com.robinhood.android.lib.margin.hub.store.BuyingPowerHubOnboardingAlertStore;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs3;
import com.robinhood.android.margin.contracts.BuyingPowerHubFragmentKey;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.prefs.IntPreference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BuyingPowerHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001fBK\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDataState;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "marginHubStore", "Lcom/robinhood/android/lib/margin/hub/MarginHubStore;", "buyingPowerHubOnboardingAlertStore", "Lcom/robinhood/android/lib/margin/hub/store/BuyingPowerHubOnboardingAlertStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "displayCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "stateProvider", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/margin/hub/MarginHubStore;Lcom/robinhood/android/lib/margin/hub/store/BuyingPowerHubOnboardingAlertStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onResume", "launchOnboardingAlert", "Lkotlinx/coroutines/Job;", "Companion", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class BuyingPowerHubDuxo extends BaseDuxo3<BuyingPowerHubDataState, BuyingPowerHubState3, BuyingPowerHubEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final BuyingPowerHubOnboardingAlertStore buyingPowerHubOnboardingAlertStore;
    private final IntPreference displayCurrencyPref;
    private final MarginHubStore marginHubStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyingPowerHubDuxo(MarginHubStore marginHubStore, BuyingPowerHubOnboardingAlertStore buyingPowerHubOnboardingAlertStore, AccountProvider accountProvider, RegionGateProvider regionGateProvider, @DisplayCurrencySelectionPrefs3 IntPreference displayCurrencyPref, BuyingPowerHubState2 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new BuyingPowerHubDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(marginHubStore, "marginHubStore");
        Intrinsics.checkNotNullParameter(buyingPowerHubOnboardingAlertStore, "buyingPowerHubOnboardingAlertStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.marginHubStore = marginHubStore;
        this.buyingPowerHubOnboardingAlertStore = buyingPowerHubOnboardingAlertStore;
        this.accountProvider = accountProvider;
        this.regionGateProvider = regionGateProvider;
        this.displayCurrencyPref = displayCurrencyPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C168121(null));
    }

    /* compiled from: BuyingPowerHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$onCreate$1", m3645f = "BuyingPowerHubDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$onCreate$1 */
    static final class C168121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C168121(Continuation<? super C168121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BuyingPowerHubDuxo.this.new C168121(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C168121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(BuyingPowerHubDuxo.this.regionGateProvider, McwRegionGate.INSTANCE, false, 2, null);
                final BuyingPowerHubDuxo buyingPowerHubDuxo = BuyingPowerHubDuxo.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo.onCreate.1.1

                    /* compiled from: BuyingPowerHubDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$onCreate$1$1$1", m3645f = "BuyingPowerHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C500831 extends ContinuationImpl7 implements Function2<BuyingPowerHubDataState, Continuation<? super BuyingPowerHubDataState>, Object> {
                        final /* synthetic */ boolean $isInMcwRegionGate;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C500831(boolean z, Continuation<? super C500831> continuation) {
                            super(2, continuation);
                            this.$isInMcwRegionGate = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C500831 c500831 = new C500831(this.$isInMcwRegionGate, continuation);
                            c500831.L$0 = obj;
                            return c500831;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(BuyingPowerHubDataState buyingPowerHubDataState, Continuation<? super BuyingPowerHubDataState> continuation) {
                            return ((C500831) create(buyingPowerHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return BuyingPowerHubDataState.copy$default((BuyingPowerHubDataState) this.L$0, null, null, boxing.boxBoolean(this.$isInMcwRegionGate), 3, null);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        buyingPowerHubDuxo.applyMutation(new C500831(z, null));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowStreamRegionGateStateFlow$default.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        launchOnboardingAlert();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C168131(null), 3, null);
    }

    /* compiled from: BuyingPowerHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$onResume$1", m3645f = "BuyingPowerHubDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$onResume$1 */
    static final class C168131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C168131(Continuation<? super C168131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BuyingPowerHubDuxo.this.new C168131(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C168131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.transformLatest(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(BuyingPowerHubDuxo.this.regionGateProvider, McwRegionGate.INSTANCE, false, 2, null), new C16809xa2f2a515(null, BuyingPowerHubDuxo.this)), new C16810xa2f2a516(null, BuyingPowerHubDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(BuyingPowerHubDuxo.this, null);
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

        /* compiled from: BuyingPowerHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "buyingPowerHubResponse", "Lcom/robinhood/android/lib/margin/hub/db/models/BuyingPowerHubView;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$onResume$1$3", m3645f = "BuyingPowerHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$onResume$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<BuyingPowerHubView, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BuyingPowerHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(BuyingPowerHubDuxo buyingPowerHubDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = buyingPowerHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BuyingPowerHubView buyingPowerHubView, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(buyingPowerHubView, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BuyingPowerHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$onResume$1$3$1", m3645f = "BuyingPowerHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$onResume$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BuyingPowerHubDataState, Continuation<? super BuyingPowerHubDataState>, Object> {
                final /* synthetic */ BuyingPowerHubView $buyingPowerHubResponse;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(BuyingPowerHubView buyingPowerHubView, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$buyingPowerHubResponse = buyingPowerHubView;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$buyingPowerHubResponse, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BuyingPowerHubDataState buyingPowerHubDataState, Continuation<? super BuyingPowerHubDataState> continuation) {
                    return ((AnonymousClass1) create(buyingPowerHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return BuyingPowerHubDataState.copy$default((BuyingPowerHubDataState) this.L$0, this.$buyingPowerHubResponse, null, null, 6, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((BuyingPowerHubView) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: BuyingPowerHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$launchOnboardingAlert$1", m3645f = "BuyingPowerHubDuxo.kt", m3646l = {84}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubDuxo$launchOnboardingAlert$1 */
    static final class C168111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C168111(Continuation<? super C168111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BuyingPowerHubDuxo.this.new C168111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C168111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BuyingPowerHubOnboardingAlertStore buyingPowerHubOnboardingAlertStore = BuyingPowerHubDuxo.this.buyingPowerHubOnboardingAlertStore;
                String accountNumber = ((BuyingPowerHubFragmentKey) BuyingPowerHubDuxo.INSTANCE.getArgs((HasSavedState) BuyingPowerHubDuxo.this)).getAccountNumber();
                this.label = 1;
                obj = buyingPowerHubOnboardingAlertStore.getOnboardingAlert(accountNumber, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiBuyingPowerHubOnboardingAlert apiBuyingPowerHubOnboardingAlert = (ApiBuyingPowerHubOnboardingAlert) obj;
            AlertAction<GenericAction> content = apiBuyingPowerHubOnboardingAlert != null ? apiBuyingPowerHubOnboardingAlert.getContent() : null;
            if (content != null) {
                BuyingPowerHubDuxo.this.submit(new BuyingPowerHubEvent.ShowOnboardingAlert(content));
            }
            return Unit.INSTANCE;
        }
    }

    private final Job launchOnboardingAlert() {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C168111(null), 3, null);
    }

    /* compiled from: BuyingPowerHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDuxo;", "Lcom/robinhood/android/margin/contracts/BuyingPowerHubFragmentKey;", "<init>", "()V", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BuyingPowerHubDuxo, BuyingPowerHubFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BuyingPowerHubFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (BuyingPowerHubFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BuyingPowerHubFragmentKey getArgs(BuyingPowerHubDuxo buyingPowerHubDuxo) {
            return (BuyingPowerHubFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, buyingPowerHubDuxo);
        }
    }
}
