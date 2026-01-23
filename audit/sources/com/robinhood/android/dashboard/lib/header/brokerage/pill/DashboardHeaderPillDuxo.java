package com.robinhood.android.dashboard.lib.header.brokerage.pill;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.dashboard.lib.header.brokerage.pill.NuxPillVisibilityExperiment;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.dashboardpill.DashboardPillData3;
import com.robinhood.android.dashboardpill.DashboardPillManager;
import com.robinhood.android.engagement.crypto.impression.HasCryptoImpressionPref;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.regiongate.FirstTradeUpsellRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.logging.TimberLogger;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.Share3;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import p479j$.time.Clock;

/* compiled from: DashboardHeaderPillDuxo.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BK\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDataState;", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillViewState;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/dashboardpill/DashboardPillManager;", "dashboardPillManager", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "homeDashboardStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sortingHatStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "hasCryptoImpressionPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/dashboardpill/DashboardPillManager;Lcom/robinhood/android/dashboard/store/HomeDashboardStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/BooleanPreference;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;)V", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "currentDashboardType", "", "initializeV1", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;)V", "initializeV2", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/NuxPillVisibilityExperiment$Variant;", "showPillInNuxVariant", "initialize", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/NuxPillVisibilityExperiment$Variant;)V", "", "pillIdentifier", "onNotificationDotCleared", "(Ljava/lang/String;)V", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/android/dashboardpill/DashboardPillManager;", "getDashboardPillManager", "()Lcom/robinhood/android/dashboardpill/DashboardPillManager;", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/prefs/BooleanPreference;", "getHasCryptoImpressionPref", "()Lcom/robinhood/prefs/BooleanPreference;", "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DashboardHeaderPillDuxo extends BaseDuxo<DashboardHeaderPillDataState, DashboardHeaderPillViewState> {
    public static final int $stable = 8;
    private final Clock clock;
    private final DashboardPillManager dashboardPillManager;
    private final ExperimentsStore experimentsStore;
    private final BooleanPreference hasCryptoImpressionPref;
    private final HomeDashboardStore homeDashboardStore;
    private final RegionGateProvider regionGateProvider;
    private final BaseSortingHatStore sortingHatStore;

    public final DashboardPillManager getDashboardPillManager() {
        return this.dashboardPillManager;
    }

    public final BooleanPreference getHasCryptoImpressionPref() {
        return this.hasCryptoImpressionPref;
    }

    public final Clock getClock() {
        return this.clock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardHeaderPillDuxo(ExperimentsStore experimentsStore, DashboardPillManager dashboardPillManager, HomeDashboardStore homeDashboardStore, BaseSortingHatStore sortingHatStore, RegionGateProvider regionGateProvider, @HasCryptoImpressionPref BooleanPreference hasCryptoImpressionPref, Clock clock, DuxoBundle duxoBundle) {
        super(new DashboardHeaderPillDataState(null, null, null, false, 15, null), DashboardHeaderPillDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(dashboardPillManager, "dashboardPillManager");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.dashboardPillManager = dashboardPillManager;
        this.homeDashboardStore = homeDashboardStore;
        this.sortingHatStore = sortingHatStore;
        this.regionGateProvider = regionGateProvider;
        this.hasCryptoImpressionPref = hasCryptoImpressionPref;
        this.clock = clock;
    }

    public final void initialize(HomeDashboardType currentDashboardType, NuxPillVisibilityExperiment.Variant showPillInNuxVariant) {
        Intrinsics.checkNotNullParameter(currentDashboardType, "currentDashboardType");
        if (showPillInNuxVariant == NuxPillVisibilityExperiment.Variant.CONTROL) {
            initializeV1(currentDashboardType);
        } else {
            initializeV2(currentDashboardType);
        }
    }

    private final void initializeV1(HomeDashboardType currentDashboardType) {
        Flow flowFlowOf = FlowKt.flowOf(currentDashboardType);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C137531(Share3.shareIn$default(FlowKt.transformLatest(flowFlowOf, new DashboardHeaderPillDuxo$initializeV1$$inlined$flatMapLatest$1(null, this)), getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 0, 4, null), this, null), 3, null);
        getLifecycleScope().launchWhenStarted(new C137542(flowFlowOf, this, null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C137553(null));
        LifecycleHost.DefaultImpls.bind$default(this, this.homeDashboardStore.streamHomeAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DashboardHeaderPillDuxo.initializeV1$lambda$1(this.f$0, (List) obj);
            }
        });
    }

    /* compiled from: DashboardHeaderPillDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$1", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$1 */
    static final class C137531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SharedFlow<DashboardPillData3> $dashboardPillStream;
        int label;
        final /* synthetic */ DashboardHeaderPillDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C137531(SharedFlow<? extends DashboardPillData3> sharedFlow, DashboardHeaderPillDuxo dashboardHeaderPillDuxo, Continuation<? super C137531> continuation) {
            super(2, continuation);
            this.$dashboardPillStream = sharedFlow;
            this.this$0 = dashboardHeaderPillDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C137531(this.$dashboardPillStream, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DashboardHeaderPillDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/dashboardpill/DashboardPillState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$1$1", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardPillData3, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DashboardHeaderPillDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DashboardHeaderPillDuxo dashboardHeaderPillDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = dashboardHeaderPillDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DashboardPillData3 dashboardPillData3, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(dashboardPillData3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DashboardHeaderPillDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$1$1$1", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498431 extends ContinuationImpl7 implements Function2<DashboardHeaderPillDataState, Continuation<? super DashboardHeaderPillDataState>, Object> {
                final /* synthetic */ DashboardPillData3 $state;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498431(DashboardPillData3 dashboardPillData3, Continuation<? super C498431> continuation) {
                    super(2, continuation);
                    this.$state = dashboardPillData3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498431 c498431 = new C498431(this.$state, continuation);
                    c498431.L$0 = obj;
                    return c498431;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardHeaderPillDataState dashboardHeaderPillDataState, Continuation<? super DashboardHeaderPillDataState> continuation) {
                    return ((C498431) create(dashboardHeaderPillDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DashboardHeaderPillDataState dashboardHeaderPillDataState = (DashboardHeaderPillDataState) this.L$0;
                    DashboardPillData3 dashboardPillData3 = this.$state;
                    return DashboardHeaderPillDataState.copy$default(dashboardHeaderPillDataState, null, null, dashboardPillData3 instanceof DashboardPillData3.Visible ? ((DashboardPillData3.Visible) dashboardPillData3).getData() : null, false, 11, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C498431((DashboardPillData3) this.L$0, null));
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
                SharedFlow<DashboardPillData3> sharedFlow = this.$dashboardPillStream;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: DashboardHeaderPillDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$2", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$2 */
    static final class C137542 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<HomeDashboardType> $dashboardTypeStream;
        int label;
        final /* synthetic */ DashboardHeaderPillDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C137542(Flow<? extends HomeDashboardType> flow, DashboardHeaderPillDuxo dashboardHeaderPillDuxo, Continuation<? super C137542> continuation) {
            super(2, continuation);
            this.$dashboardTypeStream = flow;
            this.this$0 = dashboardHeaderPillDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C137542(this.$dashboardTypeStream, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137542) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<HomeDashboardType> flow = this.$dashboardTypeStream;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: DashboardHeaderPillDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$2$1", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HomeDashboardType, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DashboardHeaderPillDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DashboardHeaderPillDuxo dashboardHeaderPillDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = dashboardHeaderPillDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HomeDashboardType homeDashboardType, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(homeDashboardType, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DashboardHeaderPillDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$2$1$1", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498441 extends ContinuationImpl7 implements Function2<DashboardHeaderPillDataState, Continuation<? super DashboardHeaderPillDataState>, Object> {
                final /* synthetic */ HomeDashboardType $dashboardType;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498441(HomeDashboardType homeDashboardType, Continuation<? super C498441> continuation) {
                    super(2, continuation);
                    this.$dashboardType = homeDashboardType;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498441 c498441 = new C498441(this.$dashboardType, continuation);
                    c498441.L$0 = obj;
                    return c498441;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardHeaderPillDataState dashboardHeaderPillDataState, Continuation<? super DashboardHeaderPillDataState> continuation) {
                    return ((C498441) create(dashboardHeaderPillDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DashboardHeaderPillDataState.copy$default((DashboardHeaderPillDataState) this.L$0, this.$dashboardType, null, null, false, 14, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C498441((HomeDashboardType) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: DashboardHeaderPillDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$3", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {117}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$3 */
    static final class C137553 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137553(Continuation<? super C137553> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardHeaderPillDuxo.this.new C137553(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137553) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(DashboardHeaderPillDuxo.this.regionGateProvider, FirstTradeUpsellRegionGate.INSTANCE, false, 2, null), new C13749xb5b75662(null, DashboardHeaderPillDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(DashboardHeaderPillDuxo.this, null);
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

        /* compiled from: DashboardHeaderPillDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "eligible", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$3$2", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ DashboardHeaderPillDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DashboardHeaderPillDuxo dashboardHeaderPillDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = dashboardHeaderPillDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DashboardHeaderPillDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$3$2$1", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardHeaderPillDataState, Continuation<? super DashboardHeaderPillDataState>, Object> {
                final /* synthetic */ boolean $eligible;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$eligible = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$eligible, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardHeaderPillDataState dashboardHeaderPillDataState, Continuation<? super DashboardHeaderPillDataState> continuation) {
                    return ((AnonymousClass1) create(dashboardHeaderPillDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DashboardHeaderPillDataState.copy$default((DashboardHeaderPillDataState) this.L$0, null, null, null, this.$eligible, 7, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeV1$lambda$1(DashboardHeaderPillDuxo dashboardHeaderPillDuxo, List accounts2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        dashboardHeaderPillDuxo.applyMutation(new DashboardHeaderPillDuxo2(accounts2, null));
        return Unit.INSTANCE;
    }

    private final void initializeV2(HomeDashboardType currentDashboardType) {
        Flow flow = FlowKt.flow(new DashboardHeaderPillDuxo5(currentDashboardType, this, null));
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C137561(FlowKt.shareIn(FlowKt.transformLatest(FlowKt.transformLatest(FlowKt.shareIn(flow, lifecycleScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1), new DashboardHeaderPillDuxo$initializeV2$$inlined$flatMapLatest$1(null, this)), new DashboardHeaderPillDuxo$initializeV2$$inlined$flatMapLatest$2(null, this, currentDashboardType)), getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1), this, null), 3, null);
        applyMutation(new C137572(currentDashboardType, null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C137583(null));
        LifecycleHost.DefaultImpls.bind$default(this, this.homeDashboardStore.streamHomeAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DashboardHeaderPillDuxo.initializeV2$lambda$4(this.f$0, (List) obj);
            }
        });
    }

    /* compiled from: DashboardHeaderPillDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$1", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$1 */
    static final class C137561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SharedFlow<DashboardPillData3> $dashboardPillStream;
        int label;
        final /* synthetic */ DashboardHeaderPillDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C137561(SharedFlow<? extends DashboardPillData3> sharedFlow, DashboardHeaderPillDuxo dashboardHeaderPillDuxo, Continuation<? super C137561> continuation) {
            super(2, continuation);
            this.$dashboardPillStream = sharedFlow;
            this.this$0 = dashboardHeaderPillDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C137561(this.$dashboardPillStream, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DashboardHeaderPillDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/dashboardpill/DashboardPillState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$1$1", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardPillData3, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DashboardHeaderPillDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DashboardHeaderPillDuxo dashboardHeaderPillDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = dashboardHeaderPillDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DashboardPillData3 dashboardPillData3, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(dashboardPillData3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DashboardPillData3 dashboardPillData3 = (DashboardPillData3) this.L$0;
                TimberLogger.INSTANCE.mo1679d("DashboardHeaderPillDuxo | dashboardPillStream state: " + dashboardPillData3, new Object[0]);
                this.this$0.applyMutation(new C498451(dashboardPillData3, null));
                return Unit.INSTANCE;
            }

            /* compiled from: DashboardHeaderPillDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$1$1$1", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498451 extends ContinuationImpl7 implements Function2<DashboardHeaderPillDataState, Continuation<? super DashboardHeaderPillDataState>, Object> {
                final /* synthetic */ DashboardPillData3 $state;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498451(DashboardPillData3 dashboardPillData3, Continuation<? super C498451> continuation) {
                    super(2, continuation);
                    this.$state = dashboardPillData3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498451 c498451 = new C498451(this.$state, continuation);
                    c498451.L$0 = obj;
                    return c498451;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardHeaderPillDataState dashboardHeaderPillDataState, Continuation<? super DashboardHeaderPillDataState> continuation) {
                    return ((C498451) create(dashboardHeaderPillDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DashboardHeaderPillDataState dashboardHeaderPillDataState = (DashboardHeaderPillDataState) this.L$0;
                    DashboardPillData3 dashboardPillData3 = this.$state;
                    return DashboardHeaderPillDataState.copy$default(dashboardHeaderPillDataState, null, null, dashboardPillData3 instanceof DashboardPillData3.Visible ? ((DashboardPillData3.Visible) dashboardPillData3).getData() : null, false, 11, null);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<DashboardPillData3> sharedFlow = this.$dashboardPillStream;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: DashboardHeaderPillDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$2", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$2 */
    static final class C137572 extends ContinuationImpl7 implements Function2<DashboardHeaderPillDataState, Continuation<? super DashboardHeaderPillDataState>, Object> {
        final /* synthetic */ HomeDashboardType $currentDashboardType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C137572(HomeDashboardType homeDashboardType, Continuation<? super C137572> continuation) {
            super(2, continuation);
            this.$currentDashboardType = homeDashboardType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C137572 c137572 = new C137572(this.$currentDashboardType, continuation);
            c137572.L$0 = obj;
            return c137572;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DashboardHeaderPillDataState dashboardHeaderPillDataState, Continuation<? super DashboardHeaderPillDataState> continuation) {
            return ((C137572) create(dashboardHeaderPillDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DashboardHeaderPillDataState.copy$default((DashboardHeaderPillDataState) this.L$0, this.$currentDashboardType, null, null, false, 14, null);
        }
    }

    /* compiled from: DashboardHeaderPillDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$3", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$3 */
    static final class C137583 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137583(Continuation<? super C137583> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardHeaderPillDuxo.this.new C137583(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137583) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(DashboardHeaderPillDuxo.this.regionGateProvider, FirstTradeUpsellRegionGate.INSTANCE, false, 2, null), new C13751xbd1c8b81(null, DashboardHeaderPillDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(DashboardHeaderPillDuxo.this, null);
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

        /* compiled from: DashboardHeaderPillDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$3$2", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ DashboardHeaderPillDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DashboardHeaderPillDuxo dashboardHeaderPillDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = dashboardHeaderPillDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DashboardHeaderPillDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$3$2$1", m3645f = "DashboardHeaderPillDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.DashboardHeaderPillDuxo$initializeV2$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardHeaderPillDataState, Continuation<? super DashboardHeaderPillDataState>, Object> {
                final /* synthetic */ boolean $inExperiment;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$inExperiment = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inExperiment, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardHeaderPillDataState dashboardHeaderPillDataState, Continuation<? super DashboardHeaderPillDataState> continuation) {
                    return ((AnonymousClass1) create(dashboardHeaderPillDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DashboardHeaderPillDataState.copy$default((DashboardHeaderPillDataState) this.L$0, null, null, null, this.$inExperiment, 7, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeV2$lambda$4(DashboardHeaderPillDuxo dashboardHeaderPillDuxo, List accounts2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        dashboardHeaderPillDuxo.applyMutation(new DashboardHeaderPillDuxo3(accounts2, null));
        return Unit.INSTANCE;
    }

    public final void onNotificationDotCleared(String pillIdentifier) {
        Intrinsics.checkNotNullParameter(pillIdentifier, "pillIdentifier");
        this.dashboardPillManager.onNotificationDotCleared(pillIdentifier);
    }
}
