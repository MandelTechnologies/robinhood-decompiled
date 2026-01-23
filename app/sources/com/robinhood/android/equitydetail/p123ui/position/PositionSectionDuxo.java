package com.robinhood.android.equitydetail.p123ui.position;

import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.portfolio.pnl.ProfitAndLossAverageCostRetirementExperiment;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossData;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossStore;
import com.robinhood.android.portfolio.pnl.prefs.ShowAverageCostRetirementTooltipPref;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SubzeroRegionGate;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: PositionSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B[\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDataState;", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionViewState;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "unrealizedProfitAndLossStore", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "showAverageCostRetirementTooltipPrefs", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equitydetail/ui/position/PositionSectionStateProvider;)V", "bind", "Lkotlinx/coroutines/Job;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "disableAverageCostTooltip", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class PositionSectionDuxo extends BaseDuxo<PositionSectionDataState, PositionSectionViewState> {
    public static final int $stable = 8;
    private final ExperimentsStore experimentStore;
    private final InstrumentStore instrumentStore;
    private final PositionStore positionStore;
    private final QuoteStore quoteStore;
    private final RegionGateProvider regionGateProvider;
    private final BooleanPreference showAverageCostRetirementTooltipPrefs;
    private final UnifiedAccountStore unifiedAccountStore;
    private final UnrealizedProfitAndLossStore unrealizedProfitAndLossStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionSectionDuxo(UnifiedAccountStore unifiedAccountStore, InstrumentStore instrumentStore, PositionStore positionStore, QuoteStore quoteStore, ExperimentsStore experimentStore, UnrealizedProfitAndLossStore unrealizedProfitAndLossStore, RegionGateProvider regionGateProvider, @ShowAverageCostRetirementTooltipPref BooleanPreference showAverageCostRetirementTooltipPrefs, DuxoBundle duxoBundle, PositionSectionStateProvider stateProvider) {
        super(new PositionSectionDataState(null, null, null, null, null, null, false, false, null, false, 1023, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "unrealizedProfitAndLossStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(showAverageCostRetirementTooltipPrefs, "showAverageCostRetirementTooltipPrefs");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.unifiedAccountStore = unifiedAccountStore;
        this.instrumentStore = instrumentStore;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.experimentStore = experimentStore;
        this.unrealizedProfitAndLossStore = unrealizedProfitAndLossStore;
        this.regionGateProvider = regionGateProvider;
        this.showAverageCostRetirementTooltipPrefs = showAverageCostRetirementTooltipPrefs;
    }

    /* compiled from: PositionSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$1 */
    static final class C155451 extends ContinuationImpl7 implements Function2<PositionSectionDataState, Continuation<? super PositionSectionDataState>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C155451(String str, Continuation<? super C155451> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C155451 c155451 = new C155451(this.$accountNumber, continuation);
            c155451.L$0 = obj;
            return c155451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PositionSectionDataState positionSectionDataState, Continuation<? super PositionSectionDataState> continuation) {
            return ((C155451) create(positionSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PositionSectionDataState.copy$default((PositionSectionDataState) this.L$0, null, this.$accountNumber, null, null, null, null, false, false, null, false, 1021, null);
        }
    }

    public final Job bind(String accountNumber, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        applyMutation(new C155451(accountNumber, null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C155462(instrumentId, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C155473(accountNumber, instrumentId, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C155484(instrumentId, accountNumber, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C155495(instrumentId, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C155506(accountNumber, instrumentId, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C155517(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C155528(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C155539(null), 2, null);
        return completableJobSupervisorJob$default;
    }

    /* compiled from: PositionSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$2", m3645f = "PositionSectionDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$2 */
    static final class C155462 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C155462(UUID uuid, Continuation<? super C155462> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionSectionDuxo.this.new C155462(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C155462) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PositionSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$2$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PositionSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PositionSectionDuxo positionSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = positionSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Instrument instrument, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instrument, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PositionSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$2$1$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499551 extends ContinuationImpl7 implements Function2<PositionSectionDataState, Continuation<? super PositionSectionDataState>, Object> {
                final /* synthetic */ Instrument $instrument;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499551(Instrument instrument, Continuation<? super C499551> continuation) {
                    super(2, continuation);
                    this.$instrument = instrument;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499551 c499551 = new C499551(this.$instrument, continuation);
                    c499551.L$0 = obj;
                    return c499551;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PositionSectionDataState positionSectionDataState, Continuation<? super PositionSectionDataState> continuation) {
                    return ((C499551) create(positionSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PositionSectionDataState.copy$default((PositionSectionDataState) this.L$0, this.$instrument, null, null, null, null, null, false, false, null, false, 1022, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499551((Instrument) this.L$0, null));
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
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(PositionSectionDuxo.this.instrumentStore.getInstrument(this.$instrumentId)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PositionSectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: PositionSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$3", m3645f = "PositionSectionDuxo.kt", m3646l = {63}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$3 */
    static final class C155473 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C155473(String str, UUID uuid, Continuation<? super C155473> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionSectionDuxo.this.new C155473(this.$accountNumber, this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C155473) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PositionSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "unifiedAccountV2", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$3$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends UnifiedAccountV2>, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PositionSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PositionSectionDuxo positionSectionDuxo, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = positionSectionDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$instrumentId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<UnifiedAccountV2> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends UnifiedAccountV2> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<UnifiedAccountV2>) optional, continuation);
            }

            /* compiled from: PositionSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$3$1$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499561 extends ContinuationImpl7 implements Function2<PositionSectionDataState, Continuation<? super PositionSectionDataState>, Object> {
                final /* synthetic */ UUID $instrumentId;
                final /* synthetic */ Optional<UnifiedAccountV2> $unifiedAccountV2;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499561(Optional<UnifiedAccountV2> optional, UUID uuid, Continuation<? super C499561> continuation) {
                    super(2, continuation);
                    this.$unifiedAccountV2 = optional;
                    this.$instrumentId = uuid;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499561 c499561 = new C499561(this.$unifiedAccountV2, this.$instrumentId, continuation);
                    c499561.L$0 = obj;
                    return c499561;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PositionSectionDataState positionSectionDataState, Continuation<? super PositionSectionDataState> continuation) {
                    return ((C499561) create(positionSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PositionSectionDataState.copy$default((PositionSectionDataState) this.L$0, null, null, this.$unifiedAccountV2.getOrNull(), null, null, this.$instrumentId, false, false, null, false, 987, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499561((Optional) this.L$0, this.$instrumentId, null));
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
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(PositionSectionDuxo.this.unifiedAccountStore.streamAccount(this.$accountNumber)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PositionSectionDuxo.this, this.$instrumentId, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: PositionSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$4", m3645f = "PositionSectionDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$4 */
    static final class C155484 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C155484(UUID uuid, String str, Continuation<? super C155484> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionSectionDuxo.this.new C155484(this.$instrumentId, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C155484) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(PositionStore.getPositionForAccountOptional$default(PositionSectionDuxo.this.positionStore, this.$instrumentId, this.$accountNumber, false, 4, null)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PositionSectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PositionSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "position", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Position;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$4$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends Position>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PositionSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PositionSectionDuxo positionSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = positionSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<Position> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Position> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<Position>) optional, continuation);
            }

            /* compiled from: PositionSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$4$1$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499571 extends ContinuationImpl7 implements Function2<PositionSectionDataState, Continuation<? super PositionSectionDataState>, Object> {
                final /* synthetic */ Optional<Position> $position;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499571(Optional<Position> optional, Continuation<? super C499571> continuation) {
                    super(2, continuation);
                    this.$position = optional;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499571 c499571 = new C499571(this.$position, continuation);
                    c499571.L$0 = obj;
                    return c499571;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PositionSectionDataState positionSectionDataState, Continuation<? super PositionSectionDataState> continuation) {
                    return ((C499571) create(positionSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PositionSectionDataState.copy$default((PositionSectionDataState) this.L$0, null, null, null, this.$position.getOrNull(), null, null, false, false, null, false, 1015, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499571((Optional) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: PositionSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$5", m3645f = "PositionSectionDuxo.kt", m3646l = {83}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$5 */
    static final class C155495 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C155495(UUID uuid, Continuation<? super C155495> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionSectionDuxo.this.new C155495(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C155495) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PositionSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/models/db/Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$5$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Quote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PositionSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PositionSectionDuxo positionSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = positionSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Quote quote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(quote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PositionSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$5$1$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499581 extends ContinuationImpl7 implements Function2<PositionSectionDataState, Continuation<? super PositionSectionDataState>, Object> {
                final /* synthetic */ Quote $quote;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499581(Quote quote, Continuation<? super C499581> continuation) {
                    super(2, continuation);
                    this.$quote = quote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499581 c499581 = new C499581(this.$quote, continuation);
                    c499581.L$0 = obj;
                    return c499581;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PositionSectionDataState positionSectionDataState, Continuation<? super PositionSectionDataState> continuation) {
                    return ((C499581) create(positionSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PositionSectionDataState.copy$default((PositionSectionDataState) this.L$0, null, null, null, null, this.$quote, null, false, false, null, false, ErrorCodes.IO_EXCEPTION, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499581((Quote) this.L$0, null));
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
                Flow<Quote> flowAsFlow = PositionSectionDuxo.this.quoteStore.getStreamQuote().asFlow(this.$instrumentId);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PositionSectionDuxo.this, null);
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
    }

    /* compiled from: PositionSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$6", m3645f = "PositionSectionDuxo.kt", m3646l = {94}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$6 */
    static final class C155506 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C155506(String str, UUID uuid, Continuation<? super C155506> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionSectionDuxo.this.new C155506(this.$accountNumber, this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C155506) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<UnrealizedProfitAndLossData> unrealizedProfitAndLossDataForInstrument = PositionSectionDuxo.this.unrealizedProfitAndLossStore.getUnrealizedProfitAndLossDataForInstrument(this.$accountNumber, this.$instrumentId);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PositionSectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(unrealizedProfitAndLossDataForInstrument, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PositionSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "profitAndLossData", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$6$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UnrealizedProfitAndLossData, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PositionSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PositionSectionDuxo positionSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = positionSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UnrealizedProfitAndLossData unrealizedProfitAndLossData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(unrealizedProfitAndLossData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PositionSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$6$1$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499591 extends ContinuationImpl7 implements Function2<PositionSectionDataState, Continuation<? super PositionSectionDataState>, Object> {
                final /* synthetic */ UnrealizedProfitAndLossData $profitAndLossData;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499591(UnrealizedProfitAndLossData unrealizedProfitAndLossData, Continuation<? super C499591> continuation) {
                    super(2, continuation);
                    this.$profitAndLossData = unrealizedProfitAndLossData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499591 c499591 = new C499591(this.$profitAndLossData, continuation);
                    c499591.L$0 = obj;
                    return c499591;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PositionSectionDataState positionSectionDataState, Continuation<? super PositionSectionDataState> continuation) {
                    return ((C499591) create(positionSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PositionSectionDataState.copy$default((PositionSectionDataState) this.L$0, null, null, null, null, null, null, false, false, this.$profitAndLossData, false, 767, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499591((UnrealizedProfitAndLossData) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: PositionSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$7", m3645f = "PositionSectionDuxo.kt", m3646l = {104}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$7 */
    static final class C155517 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C155517(Continuation<? super C155517> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionSectionDuxo.this.new C155517(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C155517) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(PositionSectionDuxo.this.experimentStore, new Experiment[]{ProfitAndLossAverageCostRetirementExperiment.INSTANCE}, false, null, 6, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PositionSectionDuxo.this, null);
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

        /* compiled from: PositionSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$7$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PositionSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PositionSectionDuxo positionSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = positionSectionDuxo;
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

            /* compiled from: PositionSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$7$1$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$7$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499601 extends ContinuationImpl7 implements Function2<PositionSectionDataState, Continuation<? super PositionSectionDataState>, Object> {
                final /* synthetic */ boolean $state;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499601(boolean z, Continuation<? super C499601> continuation) {
                    super(2, continuation);
                    this.$state = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499601 c499601 = new C499601(this.$state, continuation);
                    c499601.L$0 = obj;
                    return c499601;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PositionSectionDataState positionSectionDataState, Continuation<? super PositionSectionDataState> continuation) {
                    return ((C499601) create(positionSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PositionSectionDataState.copy$default((PositionSectionDataState) this.L$0, null, null, null, null, null, null, this.$state, false, null, false, 959, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499601(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: PositionSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$8", m3645f = "PositionSectionDuxo.kt", m3646l = {113}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$8 */
    static final class C155528 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C155528(Continuation<? super C155528> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionSectionDuxo.this.new C155528(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C155528) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PositionSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "show", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$8$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PositionSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PositionSectionDuxo positionSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = positionSectionDuxo;
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

            /* compiled from: PositionSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$8$1$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$8$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499611 extends ContinuationImpl7 implements Function2<PositionSectionDataState, Continuation<? super PositionSectionDataState>, Object> {
                final /* synthetic */ boolean $show;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499611(boolean z, Continuation<? super C499611> continuation) {
                    super(2, continuation);
                    this.$show = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499611 c499611 = new C499611(this.$show, continuation);
                    c499611.L$0 = obj;
                    return c499611;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PositionSectionDataState positionSectionDataState, Continuation<? super PositionSectionDataState> continuation) {
                    return ((C499611) create(positionSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PositionSectionDataState.copy$default((PositionSectionDataState) this.L$0, null, null, null, null, null, null, false, this.$show, null, false, 895, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499611(this.Z$0, null));
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
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(PositionSectionDuxo.this.showAverageCostRetirementTooltipPrefs.getChanges()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PositionSectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: PositionSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$9", m3645f = "PositionSectionDuxo.kt", m3646l = {131}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$9 */
    static final class C155539 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C155539(Continuation<? super C155539> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionSectionDuxo.this.new C155539(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C155539) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(ExperimentsKt.streamWithExperiment(PositionSectionDuxo.this.regionGateProvider, PositionSectionDuxo.this.experimentStore, SubzeroRegionGate.INSTANCE, EquitiesSubzero.INSTANCE, true)), Integer.MAX_VALUE, null, 2, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PositionSectionDuxo.this, null);
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

        /* compiled from: PositionSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$9$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PositionSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PositionSectionDuxo positionSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = positionSectionDuxo;
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

            /* compiled from: PositionSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/position/PositionSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$9$1$1", m3645f = "PositionSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.position.PositionSectionDuxo$bind$9$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499621 extends ContinuationImpl7 implements Function2<PositionSectionDataState, Continuation<? super PositionSectionDataState>, Object> {
                final /* synthetic */ boolean $isEnabled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499621(boolean z, Continuation<? super C499621> continuation) {
                    super(2, continuation);
                    this.$isEnabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499621 c499621 = new C499621(this.$isEnabled, continuation);
                    c499621.L$0 = obj;
                    return c499621;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PositionSectionDataState positionSectionDataState, Continuation<? super PositionSectionDataState> continuation) {
                    return ((C499621) create(positionSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PositionSectionDataState.copy$default((PositionSectionDataState) this.L$0, null, null, null, null, null, null, false, false, null, this.$isEnabled, 511, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499621(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void disableAverageCostTooltip() {
        BrokerageAccountType brokerageAccountType;
        UnifiedAccountV2 unifiedAccountV2 = getStateFlow().getValue().getUnifiedAccountV2();
        if (unifiedAccountV2 == null || (brokerageAccountType = unifiedAccountV2.getBrokerageAccountType()) == null || !brokerageAccountType.isRetirement()) {
            return;
        }
        this.showAverageCostRetirementTooltipPrefs.set(false);
    }
}
