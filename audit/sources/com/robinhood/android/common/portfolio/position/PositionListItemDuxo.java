package com.robinhood.android.common.portfolio.position;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.portfolio.position.PositionItemState;
import com.robinhood.android.equities.store.swipetotrade.EquitiesSwipeToTradeExperiment;
import com.robinhood.android.equities.store.swipetotrade.EquitySwipeNuxStore;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs3;
import com.robinhood.android.models.portfolio.PositionDetails;
import com.robinhood.android.models.portfolio.PositionSwipeBehavior;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.regiongate.McwCurrencySwitcherRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.iac.alertsheet.IacAlertSheetStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore;
import com.robinhood.models.api.ApiIacAlertSheetDismissRequest;
import com.robinhood.models.api.IacAlertSheetDismissMethod;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.portfolio.listsswipenux.FuturesSwipeExperiment;
import com.robinhood.shared.portfolio.listsswipenux.SwipeContext;
import com.robinhood.shared.portfolio.listsswipenux.SwipeContextKey;
import com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: PositionListItemComposable.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BU\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J$\u0010\"\u001a\u00020#*\u00020$2\u0006\u0010 \u001a\u00020!2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u001dJ\u0006\u0010(\u001a\u00020#J\u0006\u0010)\u001a\u00020#J\u000e\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/position/PositionListItemDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/portfolio/position/PositionItemDataState;", "Lcom/robinhood/android/common/portfolio/position/PositionItemState;", "stateProvider", "Lcom/robinhood/android/common/portfolio/position/PositionItemStateProvider;", "positionDetailsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore;", "iacAlertSheetStore", "Lcom/robinhood/iac/alertsheet/IacAlertSheetStore;", "equitySwipeNuxStore", "Lcom/robinhood/android/equities/store/swipetotrade/EquitySwipeNuxStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "futuresSwipeNuxProvider", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "displayCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/common/portfolio/position/PositionItemStateProvider;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore;Lcom/robinhood/iac/alertsheet/IacAlertSheetStore;Lcom/robinhood/android/equities/store/swipetotrade/EquitySwipeNuxStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "bind", "Lkotlinx/coroutines/Job;", "position", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "displayType", "", "location", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "setupSwipeToTradeNux", "", "Lkotlinx/coroutines/CoroutineScope;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onAlertWithReceiptDismissed", "alertId", "onEquitySwipeTooltipShown", "onEquitySwipeTooltipClick", "onSwipe", "instrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PositionListItemDuxo extends BaseDuxo<PositionItemDataState, PositionItemState> {
    public static final int $stable = 8;
    private final IntPreference displayCurrencyPref;
    private final EquitySwipeNuxStore equitySwipeNuxStore;
    private final ExperimentsStore experimentsStore;
    private final SwipeNuxProvider futuresSwipeNuxProvider;
    private final IacAlertSheetStore iacAlertSheetStore;
    private final PositionDetailsStore positionDetailsStore;
    private final RegionGateProvider regionGateProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionListItemDuxo(PositionItemStateProvider stateProvider, PositionDetailsStore positionDetailsStore, IacAlertSheetStore iacAlertSheetStore, EquitySwipeNuxStore equitySwipeNuxStore, ExperimentsStore experimentsStore, @SwipeContextKey(context = SwipeContext.FUTURES_POSITIONS) SwipeNuxProvider futuresSwipeNuxProvider, @DisplayCurrencySelectionPrefs3 IntPreference displayCurrencyPref, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle) {
        super(new PositionItemDataState(null, false, null, false, null, null, 63, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(positionDetailsStore, "positionDetailsStore");
        Intrinsics.checkNotNullParameter(iacAlertSheetStore, "iacAlertSheetStore");
        Intrinsics.checkNotNullParameter(equitySwipeNuxStore, "equitySwipeNuxStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(futuresSwipeNuxProvider, "futuresSwipeNuxProvider");
        Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.positionDetailsStore = positionDetailsStore;
        this.iacAlertSheetStore = iacAlertSheetStore;
        this.equitySwipeNuxStore = equitySwipeNuxStore;
        this.experimentsStore = experimentsStore;
        this.futuresSwipeNuxProvider = futuresSwipeNuxProvider;
        this.displayCurrencyPref = displayCurrencyPref;
        this.regionGateProvider = regionGateProvider;
    }

    /* compiled from: PositionListItemComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1 */
    static final class C115571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $displayType;
        final /* synthetic */ int $index;
        final /* synthetic */ PositionsLocation $location;
        final /* synthetic */ PositionsV2.PositionListItemV2 $position;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C115571(PositionsV2.PositionListItemV2 positionListItemV2, int i, PositionsLocation positionsLocation, String str, Continuation<? super C115571> continuation) {
            super(2, continuation);
            this.$position = positionListItemV2;
            this.$index = i;
            this.$location = positionsLocation;
            this.$displayType = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115571 c115571 = PositionListItemDuxo.this.new C115571(this.$position, this.$index, this.$location, this.$displayType, continuation);
            c115571.L$0 = obj;
            return c115571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C115571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PositionListItemComposable.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/position/PositionItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1$1", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PositionItemDataState, Continuation<? super PositionItemDataState>, Object> {
            final /* synthetic */ PositionsLocation $location;
            final /* synthetic */ PositionsV2.PositionListItemV2 $position;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PositionsLocation positionsLocation, PositionsV2.PositionListItemV2 positionListItemV2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$location = positionsLocation;
                this.$position = positionListItemV2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$location, this.$position, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PositionItemDataState positionItemDataState, Continuation<? super PositionItemDataState> continuation) {
                return ((AnonymousClass1) create(positionItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PositionItemDataState.copy$default((PositionItemDataState) this.L$0, null, this.$location != PositionsLocation.UNKNOWN, this.$position.getSwipingBehaviors(), false, null, null, 57, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PositionListItemDuxo.this.applyMutation(new AnonymousClass1(this.$location, this.$position, null));
                FlowKt.launchIn(FlowKt.onEach(FlowKt.transformLatest(FlowKt.transformLatest(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(PositionListItemDuxo.this.regionGateProvider, McwCurrencySwitcherRegionGate.INSTANCE, false, 2, null), new C11552xead28712(null, PositionListItemDuxo.this)), new C11553xead28713(null, PositionListItemDuxo.this, this.$position, this.$displayType, this.$location)), new AnonymousClass4(PositionListItemDuxo.this, null)), coroutineScope);
                if (PositionListItemComposableKt.isEquitiesForSwipingBehaviors(this.$position.getInstrumentType())) {
                    FlowKt.launchIn(FlowKt.onEach(Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(PositionListItemDuxo.this.experimentsStore, new Experiment[]{EquitiesSwipeToTradeExperiment.INSTANCE}, false, null, 4, null)), Integer.MAX_VALUE, null, 2, null), new AnonymousClass5(PositionListItemDuxo.this, null)), coroutineScope);
                }
                PositionListItemDuxo.this.setupSwipeToTradeNux(coroutineScope, this.$index, this.$position, this.$location);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: PositionListItemComposable.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/portfolio/PositionDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1$4", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<PositionDetails, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PositionListItemDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(PositionListItemDuxo positionListItemDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = positionListItemDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PositionDetails positionDetails, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(positionDetails, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PositionListItemComposable.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/position/PositionItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1$4$1", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PositionItemDataState, Continuation<? super PositionItemDataState>, Object> {
                final /* synthetic */ PositionDetails $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PositionDetails positionDetails, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = positionDetails;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PositionItemDataState positionItemDataState, Continuation<? super PositionItemDataState> continuation) {
                    return ((AnonymousClass1) create(positionItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PositionItemDataState.copy$default((PositionItemDataState) this.L$0, this.$it, false, null, false, null, null, 62, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((PositionDetails) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: PositionListItemComposable.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1$5", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PositionListItemDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(PositionListItemDuxo positionListItemDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = positionListItemDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                anonymousClass5.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PositionListItemComposable.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/position/PositionItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1$5$1", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PositionItemDataState, Continuation<? super PositionItemDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PositionItemDataState positionItemDataState, Continuation<? super PositionItemDataState> continuation) {
                    return ((AnonymousClass1) create(positionItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PositionItemDataState.copy$default((PositionItemDataState) this.L$0, null, false, null, this.$it, null, null, 55, null);
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

    public final Job bind(PositionsV2.PositionListItemV2 position, String displayType, PositionsLocation location, int index) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(location, "location");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C115571(position, index, location, displayType, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupSwipeToTradeNux(CoroutineScope coroutineScope, int i, PositionsV2.PositionListItemV2 positionListItemV2, PositionsLocation positionsLocation) {
        if (i == 0 && positionsLocation == PositionsLocation.HOME_TAB) {
            if (PositionListItemComposableKt.isEquitiesForSwipingBehaviors(positionListItemV2.getInstrumentType())) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C115621(null), 3, null);
            } else if (positionListItemV2.getInstrumentType() == PositionInstrumentType.FUTURES) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C115632(null), 3, null);
            }
        }
    }

    /* compiled from: PositionListItemComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$1", m3645f = "PositionListItemComposable.kt", m3646l = {188, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 192, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, 204, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$1 */
    static final class C115621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C115621(Continuation<? super C115621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionListItemDuxo.this.new C115621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C115621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
        
            if (r13 == r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[PHI: r13
          0x009c: PHI (r13v17 java.lang.Object) = (r13v16 java.lang.Object), (r13v0 java.lang.Object) binds: [B:22:0x0099, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            StateFlow<PositionItemState> stateFlow;
            AnonymousClass1 anonymousClass1;
            Flow flowBuffer$default;
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    Duration.Companion companion = Duration.INSTANCE;
                    long duration = Duration3.toDuration(2, DurationUnitJvm.SECONDS);
                    this.label = 1;
                    if (DelayKt.m28786delayVtjQ1oo(duration, this) != coroutine_suspended) {
                        stateFlow = PositionListItemDuxo.this.getStateFlow();
                        anonymousClass1 = new AnonymousClass1(null);
                        this.label = 2;
                        if (FlowKt.first(stateFlow, anonymousClass1, this) != coroutine_suspended) {
                            flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(PositionListItemDuxo.this.experimentsStore, new Experiment[]{EquitiesSwipeToTradeExperiment.INSTANCE}, true, null, 4, null)), Integer.MAX_VALUE, null, 2, null);
                            anonymousClass2 = new AnonymousClass2(null);
                            this.label = 3;
                            if (FlowKt.first(flowBuffer$default, anonymousClass2, this) != coroutine_suspended) {
                                Flow<Boolean> flowShowPeek = PositionListItemDuxo.this.equitySwipeNuxStore.showPeek();
                                this.label = 4;
                                obj = FlowKt.first(flowShowPeek, this);
                                if (obj != coroutine_suspended) {
                                    if (((Boolean) obj).booleanValue()) {
                                        PositionListItemDuxo.this.applyMutation(new AnonymousClass3(null));
                                        PositionListItemDuxo.this.equitySwipeNuxStore.onPeekShown();
                                        Duration.Companion companion2 = Duration.INSTANCE;
                                        long duration2 = Duration3.toDuration(3, DurationUnitJvm.SECONDS);
                                        this.label = 5;
                                        if (DelayKt.m28786delayVtjQ1oo(duration2, this) != coroutine_suspended) {
                                        }
                                    }
                                    Flow flowFilterNotNull = FlowKt.filterNotNull(PositionListItemDuxo.this.equitySwipeNuxStore.tooltip());
                                    this.label = 6;
                                    obj = FlowKt.first(flowFilterNotNull, this);
                                    break;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    stateFlow = PositionListItemDuxo.this.getStateFlow();
                    anonymousClass1 = new AnonymousClass1(null);
                    this.label = 2;
                    if (FlowKt.first(stateFlow, anonymousClass1, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(PositionListItemDuxo.this.experimentsStore, new Experiment[]{EquitiesSwipeToTradeExperiment.INSTANCE}, true, null, 4, null)), Integer.MAX_VALUE, null, 2, null);
                    anonymousClass2 = new AnonymousClass2(null);
                    this.label = 3;
                    if (FlowKt.first(flowBuffer$default, anonymousClass2, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flowShowPeek2 = PositionListItemDuxo.this.equitySwipeNuxStore.showPeek();
                    this.label = 4;
                    obj = FlowKt.first(flowShowPeek2, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                    }
                    Flow flowFilterNotNull2 = FlowKt.filterNotNull(PositionListItemDuxo.this.equitySwipeNuxStore.tooltip());
                    this.label = 6;
                    obj = FlowKt.first(flowFilterNotNull2, this);
                    break;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull22 = FlowKt.filterNotNull(PositionListItemDuxo.this.equitySwipeNuxStore.tooltip());
                    this.label = 6;
                    obj = FlowKt.first(flowFilterNotNull22, this);
                    break;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    PositionListItemDuxo.this.applyMutation(new AnonymousClass4((StringResource) obj, null));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: PositionListItemComposable.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/common/portfolio/position/PositionItemState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$1$1", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PositionItemState, Continuation<? super Boolean>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PositionItemState positionItemState, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass1) create(positionItemState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                ImmutableList<PositionSwipeBehavior> swipingBehaviors;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PositionItemState positionItemState = (PositionItemState) this.L$0;
                PositionItemState.Loaded loaded = positionItemState instanceof PositionItemState.Loaded ? (PositionItemState.Loaded) positionItemState : null;
                boolean z = false;
                if (loaded != null && (swipingBehaviors = loaded.getSwipingBehaviors()) != null && (!swipingBehaviors.isEmpty())) {
                    z = true;
                }
                return boxing.boxBoolean(z);
            }
        }

        /* compiled from: PositionListItemComposable.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$1$2", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(this.Z$0);
            }
        }

        /* compiled from: PositionListItemComposable.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/position/PositionItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$1$3", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<PositionItemDataState, Continuation<? super PositionItemDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PositionItemDataState positionItemDataState, Continuation<? super PositionItemDataState> continuation) {
                return ((AnonymousClass3) create(positionItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PositionItemDataState.copy$default((PositionItemDataState) this.L$0, null, false, null, false, null, new SwipeAnimationPreview(new UiEvent(Unit.INSTANCE), new Function0() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }), 31, null);
            }
        }

        /* compiled from: PositionListItemComposable.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/position/PositionItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$1$4", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<PositionItemDataState, Continuation<? super PositionItemDataState>, Object> {
            final /* synthetic */ StringResource $tooltip;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(StringResource stringResource, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$tooltip = stringResource;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$tooltip, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PositionItemDataState positionItemDataState, Continuation<? super PositionItemDataState> continuation) {
                return ((AnonymousClass4) create(positionItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PositionItemDataState.copy$default((PositionItemDataState) this.L$0, null, false, null, false, this.$tooltip, null, 47, null);
            }
        }
    }

    /* compiled from: PositionListItemComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$2", m3645f = "PositionListItemComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$2 */
    static final class C115632 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C115632(Continuation<? super C115632> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionListItemDuxo.this.new C115632(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C115632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        
            if (r8 == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PositionItemState.Loaded loaded;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(2, DurationUnitJvm.SECONDS);
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Boolean bool = (Boolean) obj;
                    if (bool != null ? bool.booleanValue() : false) {
                        PositionListItemDuxo.this.applyMutation(new AnonymousClass1(null));
                        PositionListItemDuxo.this.futuresSwipeNuxProvider.onPeekShown();
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                loaded = (PositionItemState.Loaded) obj;
                if (loaded != null) {
                    return Unit.INSTANCE;
                }
                PositionListItemDuxo.this.experimentsStore.logExposure(FuturesSwipeExperiment.INSTANCE);
                if (!loaded.getSwipingBehaviors().isEmpty()) {
                    Flow<Boolean> flowShowPeek = PositionListItemDuxo.this.futuresSwipeNuxProvider.showPeek();
                    this.label = 3;
                    obj = FlowKt.firstOrNull(flowShowPeek, this);
                } else {
                    return Unit.INSTANCE;
                }
            }
            final StateFlow<PositionItemState> stateFlow = PositionListItemDuxo.this.getStateFlow();
            Flow<Object> flow = new Flow<Object>() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$2$invokeSuspend$$inlined$filterIsInstance$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$2$invokeSuspend$$inlined$filterIsInstance$1$2", m3645f = "PositionListItemComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                            if (obj instanceof PositionItemState.Loaded) {
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
            };
            this.label = 2;
            obj = FlowKt.firstOrNull(flow, this);
            if (obj != coroutine_suspended) {
                loaded = (PositionItemState.Loaded) obj;
                if (loaded != null) {
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: PositionListItemComposable.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/position/PositionItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$2$1", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PositionItemDataState, Continuation<? super PositionItemDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PositionItemDataState positionItemDataState, Continuation<? super PositionItemDataState> continuation) {
                return ((AnonymousClass1) create(positionItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PositionItemDataState.copy$default((PositionItemDataState) this.L$0, null, false, null, false, null, new SwipeAnimationPreview(new UiEvent(Unit.INSTANCE), new Function0() { // from class: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$setupSwipeToTradeNux$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }), 31, null);
            }
        }
    }

    /* compiled from: PositionListItemComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$onAlertWithReceiptDismissed$1", m3645f = "PositionListItemComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$onAlertWithReceiptDismissed$1 */
    static final class C115581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $alertId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C115581(String str, Continuation<? super C115581> continuation) {
            super(2, continuation);
            this.$alertId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionListItemDuxo.this.new C115581(this.$alertId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C115581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IacAlertSheetStore iacAlertSheetStore = PositionListItemDuxo.this.iacAlertSheetStore;
                UUID uuidFromString = UUID.fromString(this.$alertId);
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                ApiIacAlertSheetDismissRequest apiIacAlertSheetDismissRequest = new ApiIacAlertSheetDismissRequest(uuidFromString, IacAlertSheetDismissMethod.PASSIVE);
                this.label = 1;
                if (iacAlertSheetStore.postItemDismissed(apiIacAlertSheetDismissRequest, this) == coroutine_suspended) {
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

    public final void onAlertWithReceiptDismissed(String alertId) {
        Intrinsics.checkNotNullParameter(alertId, "alertId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C115581(alertId, null), 3, null);
    }

    /* compiled from: PositionListItemComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$onEquitySwipeTooltipShown$1", m3645f = "PositionListItemComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$onEquitySwipeTooltipShown$1 */
    static final class C115601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C115601(Continuation<? super C115601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionListItemDuxo.this.new C115601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C115601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PositionListItemDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: PositionListItemComposable.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/position/PositionItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$onEquitySwipeTooltipShown$1$1", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$onEquitySwipeTooltipShown$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PositionItemDataState, Continuation<? super PositionItemDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PositionItemDataState positionItemDataState, Continuation<? super PositionItemDataState> continuation) {
                return ((AnonymousClass1) create(positionItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PositionItemDataState.copy$default((PositionItemDataState) this.L$0, null, false, null, false, null, null, 47, null);
            }
        }
    }

    public final void onEquitySwipeTooltipShown() {
        this.equitySwipeNuxStore.onTooltipShown();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C115601(null), 3, null);
    }

    /* compiled from: PositionListItemComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/position/PositionItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$onEquitySwipeTooltipClick$1", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$onEquitySwipeTooltipClick$1 */
    static final class C115591 extends ContinuationImpl7 implements Function2<PositionItemDataState, Continuation<? super PositionItemDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C115591(Continuation<? super C115591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115591 c115591 = new C115591(continuation);
            c115591.L$0 = obj;
            return c115591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PositionItemDataState positionItemDataState, Continuation<? super PositionItemDataState> continuation) {
            return ((C115591) create(positionItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PositionItemDataState.copy$default((PositionItemDataState) this.L$0, null, false, null, false, null, null, 47, null);
        }
    }

    public final void onEquitySwipeTooltipClick() {
        applyMutation(new C115591(null));
    }

    public final void onSwipe(PositionInstrumentType instrumentType) {
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        if (PositionListItemComposableKt.isEquitiesForSwipingBehaviors(instrumentType)) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C115611(null), 3, null);
            this.equitySwipeNuxStore.onSwipe();
        } else if (instrumentType == PositionInstrumentType.FUTURES) {
            this.experimentsStore.logExposure(FuturesSwipeExperiment.INSTANCE);
            this.futuresSwipeNuxProvider.onSwipe();
        }
    }

    /* compiled from: PositionListItemComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$onSwipe$1", m3645f = "PositionListItemComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$onSwipe$1 */
    static final class C115611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C115611(Continuation<? super C115611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionListItemDuxo.this.new C115611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C115611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(PositionListItemDuxo.this.experimentsStore, new Experiment[]{EquitiesSwipeToTradeExperiment.INSTANCE}, true, null, 4, null)), Integer.MAX_VALUE, null, 2, null);
                this.label = 1;
                if (FlowKt.first(flowBuffer$default, this) == coroutine_suspended) {
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
}
