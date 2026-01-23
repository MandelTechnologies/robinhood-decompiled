package com.robinhood.android.equities.taxlots;

import androidx.compose.p011ui.state.ToggleableState;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.taxlots.SelectLotsEvent;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethod;
import com.robinhood.android.equities.taxlots.table.SelectableTaxLot;
import com.robinhood.android.equity.TaxLotsM1Experiment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.utils.math.BigDecimals7;
import equity_trading_tax_lots.proto.p460v1.AvailableSelectionStrategyOption;
import equity_trading_tax_lots.proto.p460v1.SelectionAction;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategySummary;
import equity_trading_tax_lots.proto.p460v1.StreamSelectedTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategyResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategySummaryResponse;
import equity_trading_tax_lots.proto.p460v1.TaxLotInformation;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import equity_trading_tax_lots.proto.p460v1.TaxLotStatus;
import equity_trading_tax_lots.proto.p460v1.Warnings;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.contracts.equity_order_context.proto.p487v1.EquityOrderContextService;
import microgram.contracts.equity_order_context.proto.p487v1.StreamOrderContextRequestDto;
import microgram.contracts.equity_order_context.proto.p487v1.StreamOrderContextResponse;
import microgram.contracts.equity_order_context.proto.p487v1.StreamOrderContextResponseDto;

/* compiled from: SelectLotsDuxo.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 E2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001EBA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\u000e\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u001dJ\u0016\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020$J\u0006\u00101\u001a\u00020$J\u0018\u00102\u001a\u00020$2\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010,J\u0006\u00106\u001a\u00020$J\u0006\u00107\u001a\u00020$J$\u00108\u001a\u0002092\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;2\u0006\u0010>\u001a\u00020?H\u0002J\u001e\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020*0DH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\u001a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001c0\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;", "Lcom/robinhood/android/equities/taxlots/SelectLotsViewState;", "Lcom/robinhood/android/equities/taxlots/SelectLotsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "stateProvider", "Lcom/robinhood/android/equities/taxlots/SelectLotsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/android/equities/taxlots/SelectLotsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "requestNextPageJob", "Lkotlinx/coroutines/Job;", "tableSortState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Pair;", "Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "getTableSortState$annotations", "()V", "getTableSortState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "onCreate", "", "onStart", "onHeaderSelected", AnalyticsStrings.BUTTON_LIST_SORT, "updateTaxLotNumberOfShares", "selectableTaxLot", "Lcom/robinhood/android/equities/taxlots/table/SelectableTaxLot;", "numberOfShares", "Ljava/math/BigDecimal;", "setKeyboardVisible", "visible", "", "requestNextPage", "resetToInitialSelection", "setSelectionStrategy", "selectionStrategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "quantity", "clearSelectionStrategyFailure", "clearNotEnoughSharesAlert", "getSelectedState", "Landroidx/compose/ui/state/ToggleableState;", "selectedTaxLots", "", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "information", "Lequity_trading_tax_lots/proto/v1/TaxLotInformation;", "editSelectedTaxLots", "action", "Lequity_trading_tax_lots/proto/v1/SelectionAction;", "taxLots", "", "Companion", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SelectLotsDuxo extends BaseDuxo3<SelectLotsDataState, SelectLotsViewState, SelectLotsEvent> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final InstrumentStore instrumentStore;
    private final PositionStore positionStore;
    private Job requestNextPageJob;
    private final SavedStateHandle savedStateHandle;
    private final StateFlow2<Tuples2<TaxLotSort, TaxLotSortDirection>> tableSortState;
    private final TaxLotsCachedService taxLotsCachedService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getTableSortState$annotations() {
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SelectLotsDuxo(TaxLotsCachedService taxLotsCachedService, InstrumentStore instrumentStore, ExperimentsStore experimentsStore, PositionStore positionStore, SelectLotsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new SelectLotsDataState(((SelectLotsKey) companion.getArgs(savedStateHandle)).getAccountNumber(), ((SelectLotsKey) companion.getArgs(savedStateHandle)).getOrderId(), ((SelectLotsKey) companion.getArgs(savedStateHandle)).getInstrumentId(), null, ((SelectLotsKey) companion.getArgs(savedStateHandle)).getReadOnly(), null, null, null, false, null, 0, null, null, null, null, null, false, false, null, null, false, null, null, null, ((SelectLotsKey) companion.getArgs(savedStateHandle)).getNumberOfShares(), null, null, 0, 251658216, null), stateProvider, duxoBundle);
        this.taxLotsCachedService = taxLotsCachedService;
        this.instrumentStore = instrumentStore;
        this.experimentsStore = experimentsStore;
        this.positionStore = positionStore;
        this.savedStateHandle = savedStateHandle;
        this.tableSortState = StateFlow4.MutableStateFlow(Tuples4.m3642to(null, null));
        applyMutation(new C148291(null));
    }

    public final StateFlow2<Tuples2<TaxLotSort, TaxLotSortDirection>> getTableSortState() {
        return this.tableSortState;
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$1 */
    static final class C148291 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C148291(Continuation<? super C148291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148291 c148291 = SelectLotsDuxo.this.new C148291(continuation);
            c148291.L$0 = obj;
            return c148291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
            return ((C148291) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, new AnonymousClass1(SelectLotsDuxo.this), 0, null, null, new AnonymousClass2(SelectLotsDuxo.this), null, null, false, false, null, null, false, null, null, null, null, null, null, 0, 268426751, null);
        }

        /* compiled from: SelectLotsDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<SelectableTaxLot, BigDecimal, Unit> {
            AnonymousClass1(Object obj) {
                super(2, obj, SelectLotsDuxo.class, "updateTaxLotNumberOfShares", "updateTaxLotNumberOfShares(Lcom/robinhood/android/equities/taxlots/table/SelectableTaxLot;Ljava/math/BigDecimal;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(SelectableTaxLot selectableTaxLot, BigDecimal bigDecimal) {
                invoke2(selectableTaxLot, bigDecimal);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SelectableTaxLot p0, BigDecimal p1) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                ((SelectLotsDuxo) this.receiver).updateTaxLotNumberOfShares(p0, p1);
            }
        }

        /* compiled from: SelectLotsDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<TaxLotSort, Unit> {
            AnonymousClass2(Object obj) {
                super(1, obj, SelectLotsDuxo.class, "onHeaderSelected", "onHeaderSelected(Lequity_trading_tax_lots/proto/v1/TaxLotSort;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TaxLotSort taxLotSort) {
                invoke2(taxLotSort);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TaxLotSort p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((SelectLotsDuxo) this.receiver).onHeaderSelected(p0);
            }
        }
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onCreate$1", m3645f = "SelectLotsDuxo.kt", m3646l = {89, 91}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onCreate$1 */
    static final class C148331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C148331(Continuation<? super C148331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelectLotsDuxo.this.new C148331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C148331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C148331 c148331;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TaxLotsCachedService taxLotsCachedService = SelectLotsDuxo.this.taxLotsCachedService;
                Companion companion = SelectLotsDuxo.INSTANCE;
                String accountNumber = ((SelectLotsKey) companion.getArgs((HasSavedState) SelectLotsDuxo.this)).getAccountNumber();
                UUID orderId = ((SelectLotsKey) companion.getArgs((HasSavedState) SelectLotsDuxo.this)).getOrderId();
                UUID instrumentId = ((SelectLotsKey) companion.getArgs((HasSavedState) SelectLotsDuxo.this)).getInstrumentId();
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                this.label = 1;
                c148331 = this;
                obj = taxLotsCachedService.streamTaxLotsSelectionStrategySummary(accountNumber, orderId, instrumentId, ZERO, c148331);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c148331 = this;
                StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse = (StreamTaxLotsSelectionStrategySummaryResponse) obj;
                Integer intOrNull = StringsKt.toIntOrNull(streamTaxLotsSelectionStrategySummaryResponse.getMaximum_number_of_lots());
                if (intOrNull != null) {
                    SelectLotsDuxo.this.applyMutation(new SelectLotsDuxo2(intOrNull.intValue(), null));
                }
                List<SelectionStrategySummary> selection_strategies = streamTaxLotsSelectionStrategySummaryResponse.getSelection_strategies();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = selection_strategies.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, ((SelectionStrategySummary) it.next()).getWarnings());
                }
                if (arrayList.contains(Warnings.OPEN_LOT_NOT_SELECTABLE_INTRADAY)) {
                    SelectLotsDuxo.this.submit(SelectLotsEvent.ShowIntraDayLotsOrderAlert.INSTANCE);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            c148331 = this;
            c148331.label = 2;
            obj = FlowKt.first((Flow) obj, this);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C148331(null));
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1 */
    static final class C148351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C148351(Continuation<? super C148351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148351 c148351 = SelectLotsDuxo.this.new C148351(continuation);
            c148351.L$0 = obj;
            return c148351;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C148351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SelectLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$1", m3645f = "SelectLotsDuxo.kt", m3646l = {110}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SelectLotsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SelectLotsDuxo selectLotsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = selectLotsDuxo;
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
                    PositionStore positionStore = this.this$0.positionStore;
                    Companion companion = SelectLotsDuxo.INSTANCE;
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(PositionStore.getPositionForAccount$default(positionStore, ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId(), ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber(), false, 4, null)), Integer.MAX_VALUE, null, 2, null);
                    final SelectLotsDuxo selectLotsDuxo = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo.onStart.1.1.1

                        /* compiled from: SelectLotsDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$1$1$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C498701 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
                            final /* synthetic */ Position $position;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C498701(Position position, Continuation<? super C498701> continuation) {
                                super(2, continuation);
                                this.$position = position;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C498701 c498701 = new C498701(this.$position, continuation);
                                c498701.L$0 = obj;
                                return c498701;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
                                return ((C498701) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, false, null, null, false, null, null, null, null, this.$position, null, 0, 234881023, null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Position) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Position position, Continuation<? super Unit> continuation) {
                            selectLotsDuxo.applyMutation(new C498701(position, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowBuffer$default.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(SelectLotsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SelectLotsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(SelectLotsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(SelectLotsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(SelectLotsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(SelectLotsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(SelectLotsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(SelectLotsDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: SelectLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$2", m3645f = "SelectLotsDuxo.kt", m3646l = {120, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, 123}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ SelectLotsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SelectLotsDuxo selectLotsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = selectLotsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
            
                if (r9.collect(r3, r8) != r0) goto L21;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                final List list;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TaxLotsCachedService taxLotsCachedService = this.this$0.taxLotsCachedService;
                    this.label = 1;
                    obj = taxLotsCachedService.getSelectionStrategyOptions(this);
                    if (obj != coroutine_suspended) {
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
                        return Unit.INSTANCE;
                    }
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged((Flow) obj);
                    final SelectLotsDuxo selectLotsDuxo = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo.onStart.1.2.1

                        /* compiled from: SelectLotsDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$2$1$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$2$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C498711 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
                            final /* synthetic */ List<AvailableSelectionStrategyOption> $availableSelectionStrategyOptions;
                            final /* synthetic */ StreamTaxLotsSelectionStrategyResponse $response;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C498711(StreamTaxLotsSelectionStrategyResponse streamTaxLotsSelectionStrategyResponse, List<AvailableSelectionStrategyOption> list, Continuation<? super C498711> continuation) {
                                super(2, continuation);
                                this.$response = streamTaxLotsSelectionStrategyResponse;
                                this.$availableSelectionStrategyOptions = list;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C498711 c498711 = new C498711(this.$response, this.$availableSelectionStrategyOptions, continuation);
                                c498711.L$0 = obj;
                                return c498711;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
                                return ((C498711) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                SelectLotsDataState selectLotsDataState = (SelectLotsDataState) this.L$0;
                                SelectionStrategy selection_strategy = this.$response.getSelection_strategy();
                                List<AvailableSelectionStrategyOption> list = this.$availableSelectionStrategyOptions;
                                StreamTaxLotsSelectionStrategyResponse streamTaxLotsSelectionStrategyResponse = this.$response;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                for (AvailableSelectionStrategyOption availableSelectionStrategyOption : list) {
                                    arrayList.add(new TaxLotSelectionMethod(availableSelectionStrategyOption, availableSelectionStrategyOption.getSelection_strategy() == streamTaxLotsSelectionStrategyResponse.getSelection_strategy()));
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (T t : arrayList) {
                                    if (((TaxLotSelectionMethod) t).getSelectionStrategy().getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_CUSTOM) {
                                        arrayList2.add(t);
                                    }
                                }
                                return SelectLotsDataState.copy$default(selectLotsDataState, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, false, null, null, false, extensions2.toPersistentList(arrayList2), selection_strategy, null, null, null, null, 0, 262143999, null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((StreamTaxLotsSelectionStrategyResponse) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(StreamTaxLotsSelectionStrategyResponse streamTaxLotsSelectionStrategyResponse, Continuation<? super Unit> continuation) {
                            selectLotsDuxo.applyMutation(new C498711(streamTaxLotsSelectionStrategyResponse, list, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 3;
                }
                list = (List) obj;
                TaxLotsCachedService taxLotsCachedService2 = this.this$0.taxLotsCachedService;
                Companion companion = SelectLotsDuxo.INSTANCE;
                String accountNumber = ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                UUID orderId = ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getOrderId();
                UUID instrumentId = ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId();
                this.L$0 = list;
                this.label = 2;
                obj = taxLotsCachedService2.streamTaxLotsSelectionStrategy(accountNumber, orderId, instrumentId, this);
                if (obj != coroutine_suspended) {
                    Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged((Flow) obj);
                    final SelectLotsDuxo selectLotsDuxo2 = this.this$0;
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo.onStart.1.2.1

                        /* compiled from: SelectLotsDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$2$1$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$2$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C498711 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
                            final /* synthetic */ List<AvailableSelectionStrategyOption> $availableSelectionStrategyOptions;
                            final /* synthetic */ StreamTaxLotsSelectionStrategyResponse $response;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C498711(StreamTaxLotsSelectionStrategyResponse streamTaxLotsSelectionStrategyResponse, List<AvailableSelectionStrategyOption> list, Continuation<? super C498711> continuation) {
                                super(2, continuation);
                                this.$response = streamTaxLotsSelectionStrategyResponse;
                                this.$availableSelectionStrategyOptions = list;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C498711 c498711 = new C498711(this.$response, this.$availableSelectionStrategyOptions, continuation);
                                c498711.L$0 = obj;
                                return c498711;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
                                return ((C498711) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                SelectLotsDataState selectLotsDataState = (SelectLotsDataState) this.L$0;
                                SelectionStrategy selection_strategy = this.$response.getSelection_strategy();
                                List<AvailableSelectionStrategyOption> list = this.$availableSelectionStrategyOptions;
                                StreamTaxLotsSelectionStrategyResponse streamTaxLotsSelectionStrategyResponse = this.$response;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                for (AvailableSelectionStrategyOption availableSelectionStrategyOption : list) {
                                    arrayList.add(new TaxLotSelectionMethod(availableSelectionStrategyOption, availableSelectionStrategyOption.getSelection_strategy() == streamTaxLotsSelectionStrategyResponse.getSelection_strategy()));
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (T t : arrayList) {
                                    if (((TaxLotSelectionMethod) t).getSelectionStrategy().getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_CUSTOM) {
                                        arrayList2.add(t);
                                    }
                                }
                                return SelectLotsDataState.copy$default(selectLotsDataState, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, false, null, null, false, extensions2.toPersistentList(arrayList2), selection_strategy, null, null, null, null, 0, 262143999, null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((StreamTaxLotsSelectionStrategyResponse) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(StreamTaxLotsSelectionStrategyResponse streamTaxLotsSelectionStrategyResponse, Continuation<? super Unit> continuation) {
                            selectLotsDuxo2.applyMutation(new C498711(streamTaxLotsSelectionStrategyResponse, list, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 3;
                }
                return coroutine_suspended;
            }
        }

        /* compiled from: SelectLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$3", m3645f = "SelectLotsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SelectLotsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SelectLotsDuxo selectLotsDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = selectLotsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EquityOrderContextService equityOrderContextService = this.this$0.taxLotsCachedService.getEquityOrderContextService();
                    String string2 = ((SelectLotsKey) SelectLotsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getOrderId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    final Flow<StreamOrderContextResponseDto> flowStreamOrderContext = equityOrderContextService.StreamOrderContext(new StreamOrderContextRequestDto(string2));
                    Flow<StreamOrderContextResponse> flow = new Flow<StreamOrderContextResponse>() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$3$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super StreamOrderContextResponse> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamOrderContext.collect(new C148252(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2 */
                        public static final class C148252<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2", m3645f = "SelectLotsDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C148252.this.emit(null, this);
                                }
                            }

                            public C148252(FlowCollector flowCollector) {
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
                                    StreamOrderContextResponse proto = ((StreamOrderContextResponseDto) obj).toProto();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(proto, anonymousClass1) == coroutine_suspended) {
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
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: SelectLotsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "orderContext", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$3$2", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<StreamOrderContextResponse, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SelectLotsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(SelectLotsDuxo selectLotsDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = selectLotsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(StreamOrderContextResponse streamOrderContextResponse, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(streamOrderContextResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: SelectLotsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$3$2$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$3$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
                    final /* synthetic */ StreamOrderContextResponse $orderContext;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(StreamOrderContextResponse streamOrderContextResponse, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$orderContext = streamOrderContextResponse;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$orderContext, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
                        return ((AnonymousClass1) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, this.$orderContext.getOrder_type(), false, false, null, null, false, null, null, null, null, null, null, 0, 268402687, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((StreamOrderContextResponse) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: SelectLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$4", m3645f = "SelectLotsDuxo.kt", m3646l = {167}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SelectLotsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SelectLotsDuxo selectLotsDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = selectLotsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TaxLotsCachedService taxLotsCachedService = this.this$0.taxLotsCachedService;
                    Companion companion = SelectLotsDuxo.INSTANCE;
                    final Flow flowStreamTaxLots$default = TaxLotsCachedService.DefaultImpls.streamTaxLots$default(taxLotsCachedService, ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber(), ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getOrderId(), ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId(), null, null, null, 32, null);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends TaxLotSort, ? extends TaxLotSortDirection>>() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$4$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends TaxLotSort, ? extends TaxLotSortDirection>> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamTaxLots$default.collect(new C148262(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$4$invokeSuspend$$inlined$map$1$2 */
                        public static final class C148262<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$4$invokeSuspend$$inlined$map$1$2", m3645f = "SelectLotsDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C148262.this.emit(null, this);
                                }
                            }

                            public C148262(FlowCollector flowCollector) {
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
                                    StreamTaxLotsResponse streamTaxLotsResponse = (StreamTaxLotsResponse) obj;
                                    Tuples2 tuples2M3642to = Tuples4.m3642to(streamTaxLotsResponse.getSort(), streamTaxLotsResponse.getSort_direction());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                    final SelectLotsDuxo selectLotsDuxo = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo.onStart.1.4.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Tuples2<? extends TaxLotSort, ? extends TaxLotSortDirection>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        /* compiled from: SelectLotsDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$4$2$2", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$4$2$2, reason: invalid class name and collision with other inner class name */
                        static final class C498722 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
                            final /* synthetic */ Tuples2<TaxLotSort, TaxLotSortDirection> $sortState;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C498722(Tuples2<? extends TaxLotSort, ? extends TaxLotSortDirection> tuples2, Continuation<? super C498722> continuation) {
                                super(2, continuation);
                                this.$sortState = tuples2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C498722 c498722 = new C498722(this.$sortState, continuation);
                                c498722.L$0 = obj;
                                return c498722;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
                                return ((C498722) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, 0, this.$sortState.getFirst(), this.$sortState.getSecond(), null, null, null, false, false, null, null, false, null, null, null, null, null, null, 0, 268429311, null);
                            }
                        }

                        public final Object emit(Tuples2<? extends TaxLotSort, ? extends TaxLotSortDirection> tuples2, Continuation<? super Unit> continuation) {
                            StateFlow2<Tuples2<TaxLotSort, TaxLotSortDirection>> tableSortState = selectLotsDuxo.getTableSortState();
                            while (!tableSortState.compareAndSet(tableSortState.getValue(), tuples2)) {
                            }
                            selectLotsDuxo.applyMutation(new C498722(tuples2, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: SelectLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u00003\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003JF\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"com/robinhood/android/equities/taxlots/SelectLotsDuxo$onStart$1$TaxLotUpdate", "", "selectableTaxLots", "", "Lcom/robinhood/android/equities/taxlots/table/SelectableTaxLot;", "selectedTaxLots", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "maxGainAndLoss", "", "maxCostPerShare", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getSelectableTaxLots", "()Ljava/util/List;", "getSelectedTaxLots", "getMaxGainAndLoss", "()Ljava/lang/String;", "getMaxCostPerShare", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/android/equities/taxlots/SelectLotsDuxo$onStart$1$TaxLotUpdate;", "equals", "", "other", "hashCode", "", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$TaxLotUpdate, reason: from toString */
        public static final /* data */ class TaxLotUpdate {
            private final String maxCostPerShare;
            private final String maxGainAndLoss;
            private final List<SelectableTaxLot> selectableTaxLots;
            private final List<TaxLotSelection> selectedTaxLots;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TaxLotUpdate copy$default(TaxLotUpdate taxLotUpdate, List list, List list2, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = taxLotUpdate.selectableTaxLots;
                }
                if ((i & 2) != 0) {
                    list2 = taxLotUpdate.selectedTaxLots;
                }
                if ((i & 4) != 0) {
                    str = taxLotUpdate.maxGainAndLoss;
                }
                if ((i & 8) != 0) {
                    str2 = taxLotUpdate.maxCostPerShare;
                }
                return taxLotUpdate.copy(list, list2, str, str2);
            }

            public final List<SelectableTaxLot> component1() {
                return this.selectableTaxLots;
            }

            public final List<TaxLotSelection> component2() {
                return this.selectedTaxLots;
            }

            /* renamed from: component3, reason: from getter */
            public final String getMaxGainAndLoss() {
                return this.maxGainAndLoss;
            }

            /* renamed from: component4, reason: from getter */
            public final String getMaxCostPerShare() {
                return this.maxCostPerShare;
            }

            public final TaxLotUpdate copy(List<SelectableTaxLot> selectableTaxLots, List<TaxLotSelection> selectedTaxLots, String maxGainAndLoss, String maxCostPerShare) {
                Intrinsics.checkNotNullParameter(selectableTaxLots, "selectableTaxLots");
                Intrinsics.checkNotNullParameter(selectedTaxLots, "selectedTaxLots");
                return new TaxLotUpdate(selectableTaxLots, selectedTaxLots, maxGainAndLoss, maxCostPerShare);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TaxLotUpdate)) {
                    return false;
                }
                TaxLotUpdate taxLotUpdate = (TaxLotUpdate) other;
                return Intrinsics.areEqual(this.selectableTaxLots, taxLotUpdate.selectableTaxLots) && Intrinsics.areEqual(this.selectedTaxLots, taxLotUpdate.selectedTaxLots) && Intrinsics.areEqual(this.maxGainAndLoss, taxLotUpdate.maxGainAndLoss) && Intrinsics.areEqual(this.maxCostPerShare, taxLotUpdate.maxCostPerShare);
            }

            public int hashCode() {
                int iHashCode = ((this.selectableTaxLots.hashCode() * 31) + this.selectedTaxLots.hashCode()) * 31;
                String str = this.maxGainAndLoss;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.maxCostPerShare;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "TaxLotUpdate(selectableTaxLots=" + this.selectableTaxLots + ", selectedTaxLots=" + this.selectedTaxLots + ", maxGainAndLoss=" + this.maxGainAndLoss + ", maxCostPerShare=" + this.maxCostPerShare + ")";
            }

            public TaxLotUpdate(List<SelectableTaxLot> selectableTaxLots, List<TaxLotSelection> selectedTaxLots, String str, String str2) {
                Intrinsics.checkNotNullParameter(selectableTaxLots, "selectableTaxLots");
                Intrinsics.checkNotNullParameter(selectedTaxLots, "selectedTaxLots");
                this.selectableTaxLots = selectableTaxLots;
                this.selectedTaxLots = selectedTaxLots;
                this.maxGainAndLoss = str;
                this.maxCostPerShare = str2;
            }

            public final List<SelectableTaxLot> getSelectableTaxLots() {
                return this.selectableTaxLots;
            }

            public final List<TaxLotSelection> getSelectedTaxLots() {
                return this.selectedTaxLots;
            }

            public final String getMaxGainAndLoss() {
                return this.maxGainAndLoss;
            }

            public final String getMaxCostPerShare() {
                return this.maxCostPerShare;
            }
        }

        /* compiled from: SelectLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5", m3645f = "SelectLotsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ SelectLotsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(SelectLotsDuxo selectLotsDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = selectLotsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x01a8, code lost:
            
                if (r12.collect(r1, r11) != r0) goto L37;
             */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00f8 A[LOOP:0: B:27:0x00f2->B:29:0x00f8, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0183  */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objFirst;
                final SelectionStrategy selectionStrategy;
                final Map map;
                Flow<Map<String, ? extends TaxLotSelection>> flow;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TaxLotsCachedService taxLotsCachedService = this.this$0.taxLotsCachedService;
                    Companion companion = SelectLotsDuxo.INSTANCE;
                    String accountNumber = ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                    UUID orderId = ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getOrderId();
                    UUID instrumentId = ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId();
                    this.label = 1;
                    obj = taxLotsCachedService.streamTaxLotsSelectionStrategy(accountNumber, orderId, instrumentId, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        SelectionStrategy selection_strategy = ((StreamTaxLotsSelectionStrategyResponse) obj).getSelection_strategy();
                        TaxLotsCachedService taxLotsCachedService2 = this.this$0.taxLotsCachedService;
                        Companion companion2 = SelectLotsDuxo.INSTANCE;
                        Flow<StreamSelectedTaxLotsResponse> flowStreamSelectedTaxLots = taxLotsCachedService2.streamSelectedTaxLots(((SelectLotsKey) companion2.getArgs((HasSavedState) this.this$0)).getAccountNumber(), ((SelectLotsKey) companion2.getArgs((HasSavedState) this.this$0)).getOrderId(), ((SelectLotsKey) companion2.getArgs((HasSavedState) this.this$0)).getInstrumentId());
                        this.L$0 = selection_strategy;
                        this.label = 3;
                        objFirst = FlowKt.first(flowStreamSelectedTaxLots, this);
                        if (objFirst != coroutine_suspended) {
                            selectionStrategy = selection_strategy;
                            obj = objFirst;
                            List<TaxLotSelection> lots = ((StreamSelectedTaxLotsResponse) obj).getLots();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(lots, 10)), 16));
                            while (r12.hasNext()) {
                            }
                            this.this$0.applyMutation(new AnonymousClass1(selectionStrategy, linkedHashMap, null));
                            TaxLotsCachedService taxLotsCachedService3 = this.this$0.taxLotsCachedService;
                            Companion companion3 = SelectLotsDuxo.INSTANCE;
                            final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(taxLotsCachedService3.streamSelectedTaxLots(((SelectLotsKey) companion3.getArgs((HasSavedState) this.this$0)).getAccountNumber(), ((SelectLotsKey) companion3.getArgs((HasSavedState) this.this$0)).getOrderId(), ((SelectLotsKey) companion3.getArgs((HasSavedState) this.this$0)).getInstrumentId()));
                            Flow<Map<String, ? extends TaxLotSelection>> flow2 = new Flow<Map<String, ? extends TaxLotSelection>>() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$1
                                @Override // kotlinx.coroutines.flow.Flow
                                public Object collect(FlowCollector<? super Map<String, ? extends TaxLotSelection>> flowCollector, Continuation continuation) {
                                    Object objCollect = flowDistinctUntilChanged.collect(new C148272(flowCollector), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }

                                /* compiled from: Emitters.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$1$2 */
                                public static final class C148272<T> implements FlowCollector {
                                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$1$2", m3645f = "SelectLotsDuxo.kt", m3646l = {50}, m3647m = "emit")
                                    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                            return C148272.this.emit(null, this);
                                        }
                                    }

                                    public C148272(FlowCollector flowCollector) {
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
                                            List<TaxLotSelection> lots = ((StreamSelectedTaxLotsResponse) obj).getLots();
                                            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(lots, 10)), 16));
                                            for (T t : lots) {
                                                linkedHashMap.put(((TaxLotSelection) t).getId(), t);
                                            }
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
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
                            TaxLotsCachedService taxLotsCachedService4 = this.this$0.taxLotsCachedService;
                            String accountNumber2 = ((SelectLotsKey) companion3.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                            UUID orderId2 = ((SelectLotsKey) companion3.getArgs((HasSavedState) this.this$0)).getOrderId();
                            UUID instrumentId2 = ((SelectLotsKey) companion3.getArgs((HasSavedState) this.this$0)).getInstrumentId();
                            this.L$0 = selectionStrategy;
                            this.L$1 = linkedHashMap;
                            this.L$2 = flow2;
                            this.label = 4;
                            obj = taxLotsCachedService4.streamTaxLotsSelectionStrategy(accountNumber2, orderId2, instrumentId2, this);
                            if (obj != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i == 3) {
                        SelectionStrategy selectionStrategy2 = (SelectionStrategy) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        selectionStrategy = selectionStrategy2;
                        List<TaxLotSelection> lots2 = ((StreamSelectedTaxLotsResponse) obj).getLots();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(lots2, 10)), 16));
                        for (Object obj2 : lots2) {
                            linkedHashMap2.put(((TaxLotSelection) obj2).getId(), obj2);
                        }
                        this.this$0.applyMutation(new AnonymousClass1(selectionStrategy, linkedHashMap2, null));
                        TaxLotsCachedService taxLotsCachedService32 = this.this$0.taxLotsCachedService;
                        Companion companion32 = SelectLotsDuxo.INSTANCE;
                        final Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(taxLotsCachedService32.streamSelectedTaxLots(((SelectLotsKey) companion32.getArgs((HasSavedState) this.this$0)).getAccountNumber(), ((SelectLotsKey) companion32.getArgs((HasSavedState) this.this$0)).getOrderId(), ((SelectLotsKey) companion32.getArgs((HasSavedState) this.this$0)).getInstrumentId()));
                        Flow<Map<String, ? extends TaxLotSelection>> flow22 = new Flow<Map<String, ? extends TaxLotSelection>>() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super Map<String, ? extends TaxLotSelection>> flowCollector, Continuation continuation) {
                                Object objCollect = flowDistinctUntilChanged2.collect(new C148272(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$1$2 */
                            public static final class C148272<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$1$2", m3645f = "SelectLotsDuxo.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                        return C148272.this.emit(null, this);
                                    }
                                }

                                public C148272(FlowCollector flowCollector) {
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
                                        List<TaxLotSelection> lots = ((StreamSelectedTaxLotsResponse) obj).getLots();
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(lots, 10)), 16));
                                        for (T t : lots) {
                                            linkedHashMap.put(((TaxLotSelection) t).getId(), t);
                                        }
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
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
                        TaxLotsCachedService taxLotsCachedService42 = this.this$0.taxLotsCachedService;
                        String accountNumber22 = ((SelectLotsKey) companion32.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                        UUID orderId22 = ((SelectLotsKey) companion32.getArgs((HasSavedState) this.this$0)).getOrderId();
                        UUID instrumentId22 = ((SelectLotsKey) companion32.getArgs((HasSavedState) this.this$0)).getInstrumentId();
                        this.L$0 = selectionStrategy;
                        this.L$1 = linkedHashMap2;
                        this.L$2 = flow22;
                        this.label = 4;
                        obj = taxLotsCachedService42.streamTaxLotsSelectionStrategy(accountNumber22, orderId22, instrumentId22, this);
                        if (obj != coroutine_suspended) {
                            map = linkedHashMap2;
                            flow = flow22;
                            final Flow flow3 = (Flow) obj;
                            Flow flowCombine = FlowKt.combine(flow, new Flow<SelectionStrategy>() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$2
                                @Override // kotlinx.coroutines.flow.Flow
                                public Object collect(FlowCollector<? super SelectionStrategy> flowCollector, Continuation continuation) {
                                    Object objCollect = flow3.collect(new C148282(flowCollector), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }

                                /* compiled from: Emitters.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$2$2 */
                                public static final class C148282<T> implements FlowCollector {
                                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$2$2", m3645f = "SelectLotsDuxo.kt", m3646l = {50}, m3647m = "emit")
                                    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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
                                            return C148282.this.emit(null, this);
                                        }
                                    }

                                    public C148282(FlowCollector flowCollector) {
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
                                            SelectionStrategy selection_strategy = ((StreamTaxLotsSelectionStrategyResponse) obj).getSelection_strategy();
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(selection_strategy, anonymousClass1) == coroutine_suspended) {
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
                            }, new AnonymousClass4(null));
                            final SelectLotsDuxo selectLotsDuxo = this.this$0;
                            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo.onStart.1.5.5

                                /* compiled from: SelectLotsDuxo.kt */
                                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$5$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                                /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$5$1, reason: invalid class name */
                                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
                                    final /* synthetic */ Map<String, TaxLotSelection> $currentSelectedTaxLots;
                                    final /* synthetic */ SelectionStrategy $currentSelectionStrategy;
                                    final /* synthetic */ Map<String, TaxLotSelection> $initialSelectedTaxLots;
                                    final /* synthetic */ SelectionStrategy $initialSelectionStrategy;
                                    private /* synthetic */ Object L$0;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(Map<String, TaxLotSelection> map, Map<String, TaxLotSelection> map2, SelectionStrategy selectionStrategy, SelectionStrategy selectionStrategy2, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$currentSelectedTaxLots = map;
                                        this.$initialSelectedTaxLots = map2;
                                        this.$currentSelectionStrategy = selectionStrategy;
                                        this.$initialSelectionStrategy = selectionStrategy2;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentSelectedTaxLots, this.$initialSelectedTaxLots, this.$currentSelectionStrategy, this.$initialSelectionStrategy, continuation);
                                        anonymousClass1.L$0 = obj;
                                        return anonymousClass1;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
                                        return ((AnonymousClass1) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        if (this.label != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                        return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, !Intrinsics.areEqual(this.$currentSelectedTaxLots, this.$initialSelectedTaxLots), this.$currentSelectionStrategy != this.$initialSelectionStrategy, null, null, false, null, null, null, null, null, null, 0, 268238847, null);
                                    }
                                }

                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                                    return emit((Tuples2<? extends Map<String, TaxLotSelection>, ? extends SelectionStrategy>) obj3, (Continuation<? super Unit>) continuation);
                                }

                                public final Object emit(Tuples2<? extends Map<String, TaxLotSelection>, ? extends SelectionStrategy> tuples2, Continuation<? super Unit> continuation) {
                                    selectLotsDuxo.applyMutation(new AnonymousClass1(tuples2.component1(), map, tuples2.component2(), selectionStrategy, null));
                                    return Unit.INSTANCE;
                                }
                            };
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    flow = (Flow) this.L$2;
                    map = (Map) this.L$1;
                    selectionStrategy = (SelectionStrategy) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    final Flow flow32 = (Flow) obj;
                    Flow flowCombine2 = FlowKt.combine(flow, new Flow<SelectionStrategy>() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$2
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super SelectionStrategy> flowCollector2, Continuation continuation) {
                            Object objCollect = flow32.collect(new C148282(flowCollector2), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$2$2 */
                        public static final class C148282<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$2$2", m3645f = "SelectLotsDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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
                                    return C148282.this.emit(null, this);
                                }
                            }

                            public C148282(FlowCollector flowCollector) {
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
                                    SelectionStrategy selection_strategy = ((StreamTaxLotsSelectionStrategyResponse) obj).getSelection_strategy();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(selection_strategy, anonymousClass1) == coroutine_suspended) {
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
                    }, new AnonymousClass4(null));
                    final SelectLotsDuxo selectLotsDuxo2 = this.this$0;
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo.onStart.1.5.5

                        /* compiled from: SelectLotsDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$5$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$5$1, reason: invalid class name */
                        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
                            final /* synthetic */ Map<String, TaxLotSelection> $currentSelectedTaxLots;
                            final /* synthetic */ SelectionStrategy $currentSelectionStrategy;
                            final /* synthetic */ Map<String, TaxLotSelection> $initialSelectedTaxLots;
                            final /* synthetic */ SelectionStrategy $initialSelectionStrategy;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(Map<String, TaxLotSelection> map, Map<String, TaxLotSelection> map2, SelectionStrategy selectionStrategy, SelectionStrategy selectionStrategy2, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$currentSelectedTaxLots = map;
                                this.$initialSelectedTaxLots = map2;
                                this.$currentSelectionStrategy = selectionStrategy;
                                this.$initialSelectionStrategy = selectionStrategy2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentSelectedTaxLots, this.$initialSelectedTaxLots, this.$currentSelectionStrategy, this.$initialSelectionStrategy, continuation);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
                                return ((AnonymousClass1) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, !Intrinsics.areEqual(this.$currentSelectedTaxLots, this.$initialSelectedTaxLots), this.$currentSelectionStrategy != this.$initialSelectionStrategy, null, null, false, null, null, null, null, null, null, 0, 268238847, null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit((Tuples2<? extends Map<String, TaxLotSelection>, ? extends SelectionStrategy>) obj3, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Tuples2<? extends Map<String, TaxLotSelection>, ? extends SelectionStrategy> tuples2, Continuation<? super Unit> continuation) {
                            selectLotsDuxo2.applyMutation(new AnonymousClass1(tuples2.component1(), map, tuples2.component2(), selectionStrategy, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                }
                this.label = 2;
                obj = FlowKt.first((Flow) obj, this);
                if (obj != coroutine_suspended) {
                    SelectionStrategy selection_strategy2 = ((StreamTaxLotsSelectionStrategyResponse) obj).getSelection_strategy();
                    TaxLotsCachedService taxLotsCachedService22 = this.this$0.taxLotsCachedService;
                    Companion companion22 = SelectLotsDuxo.INSTANCE;
                    Flow<StreamSelectedTaxLotsResponse> flowStreamSelectedTaxLots2 = taxLotsCachedService22.streamSelectedTaxLots(((SelectLotsKey) companion22.getArgs((HasSavedState) this.this$0)).getAccountNumber(), ((SelectLotsKey) companion22.getArgs((HasSavedState) this.this$0)).getOrderId(), ((SelectLotsKey) companion22.getArgs((HasSavedState) this.this$0)).getInstrumentId());
                    this.L$0 = selection_strategy2;
                    this.label = 3;
                    objFirst = FlowKt.first(flowStreamSelectedTaxLots2, this);
                    if (objFirst != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }

            /* compiled from: SelectLotsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
                final /* synthetic */ Map<String, TaxLotSelection> $initialSelectedTaxLots;
                final /* synthetic */ SelectionStrategy $initialSelectionStrategy;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SelectionStrategy selectionStrategy, Map<String, TaxLotSelection> map, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$initialSelectionStrategy = selectionStrategy;
                    this.$initialSelectedTaxLots = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$initialSelectionStrategy, this.$initialSelectedTaxLots, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
                    return ((AnonymousClass1) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, this.$initialSelectionStrategy, this.$initialSelectedTaxLots, false, null, 0, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, 0, 268435263, null);
                }
            }

            /* compiled from: SelectLotsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "currentSelectedTaxLots", "currentSelectionStrategy"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$4", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$5$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function3<Map<String, ? extends TaxLotSelection>, SelectionStrategy, Continuation<? super Tuples2<? extends Map<String, ? extends TaxLotSelection>, ? extends SelectionStrategy>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends TaxLotSelection> map, SelectionStrategy selectionStrategy, Continuation<? super Tuples2<? extends Map<String, ? extends TaxLotSelection>, ? extends SelectionStrategy>> continuation) {
                    return invoke2((Map<String, TaxLotSelection>) map, selectionStrategy, (Continuation<? super Tuples2<? extends Map<String, TaxLotSelection>, ? extends SelectionStrategy>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<String, TaxLotSelection> map, SelectionStrategy selectionStrategy, Continuation<? super Tuples2<? extends Map<String, TaxLotSelection>, ? extends SelectionStrategy>> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                    anonymousClass4.L$0 = map;
                    anonymousClass4.L$1 = selectionStrategy;
                    return anonymousClass4.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Tuples4.m3642to((Map) this.L$0, (SelectionStrategy) this.L$1);
                }
            }
        }

        /* compiled from: SelectLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$6", m3645f = "SelectLotsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SelectLotsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(SelectLotsDuxo selectLotsDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = selectLotsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SelectLotsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$6$1", m3645f = "SelectLotsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends TaxLotSort, ? extends TaxLotSortDirection>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SelectLotsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SelectLotsDuxo selectLotsDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = selectLotsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Tuples2<? extends TaxLotSort, ? extends TaxLotSortDirection> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        TaxLotSort taxLotSort = (TaxLotSort) tuples2.component1();
                        TaxLotSortDirection taxLotSortDirection = (TaxLotSortDirection) tuples2.component2();
                        TaxLotsCachedService taxLotsCachedService = this.this$0.taxLotsCachedService;
                        Companion companion = SelectLotsDuxo.INSTANCE;
                        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(taxLotsCachedService.streamTaxLots(((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber(), ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getOrderId(), ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId(), taxLotSort, taxLotSortDirection, TaxLotStatus.OPEN), this.this$0.taxLotsCachedService.streamSelectedTaxLots(((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber(), ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getOrderId(), ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId()), new C498741(this.this$0, null)));
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

                /* compiled from: SelectLotsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0013\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002*\u0001\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "com/robinhood/android/equities/taxlots/SelectLotsDuxo$onStart$1$TaxLotUpdate", "taxLotResponse", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponse;", "selectedTaxLotResponse", "Lequity_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$6$1$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498741 extends ContinuationImpl7 implements Function3<StreamTaxLotsResponse, StreamSelectedTaxLotsResponse, Continuation<? super TaxLotUpdate>, Object> {
                    /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;
                    final /* synthetic */ SelectLotsDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498741(SelectLotsDuxo selectLotsDuxo, Continuation<? super C498741> continuation) {
                        super(3, continuation);
                        this.this$0 = selectLotsDuxo;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(StreamTaxLotsResponse streamTaxLotsResponse, StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse, Continuation<? super TaxLotUpdate> continuation) {
                        C498741 c498741 = new C498741(this.this$0, continuation);
                        c498741.L$0 = streamTaxLotsResponse;
                        c498741.L$1 = streamSelectedTaxLotsResponse;
                        return c498741.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        BigDecimal bigDecimal;
                        String shares;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        StreamTaxLotsResponse streamTaxLotsResponse = (StreamTaxLotsResponse) this.L$0;
                        StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse = (StreamSelectedTaxLotsResponse) this.L$1;
                        List<TaxLotSelection> lots = streamSelectedTaxLotsResponse.getLots();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(lots, 10)), 16));
                        for (Object obj2 : lots) {
                            linkedHashMap.put(((TaxLotSelection) obj2).getId(), obj2);
                        }
                        List<TaxLotInformation> lots2 = streamTaxLotsResponse.getLots();
                        SelectLotsDuxo selectLotsDuxo = this.this$0;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lots2, 10));
                        for (TaxLotInformation taxLotInformation : lots2) {
                            TaxLotSelection taxLotSelection = (TaxLotSelection) linkedHashMap.get(taxLotInformation.getId());
                            if (taxLotSelection == null || (shares = taxLotSelection.getShares()) == null || (bigDecimal = BigDecimals7.toBigDecimalOrNull(shares)) == null) {
                                bigDecimal = new BigDecimal(taxLotInformation.getAvailable_shares());
                            }
                            arrayList.add(new SelectableTaxLot(taxLotInformation, bigDecimal, selectLotsDuxo.getSelectedState(linkedHashMap, taxLotInformation)));
                        }
                        return new TaxLotUpdate(arrayList, streamSelectedTaxLotsResponse.getLots(), streamTaxLotsResponse.getMax_gain_loss(), streamTaxLotsResponse.getMax_cost_per_share());
                    }
                }

                /* compiled from: SelectLotsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0000*\u0001\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "selectableTaxLotsUpdate", "com/robinhood/android/equities/taxlots/SelectLotsDuxo$onStart$1$TaxLotUpdate"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$6$1$2", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$6$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<TaxLotUpdate, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ SelectLotsDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(SelectLotsDuxo selectLotsDuxo, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = selectLotsDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TaxLotUpdate taxLotUpdate, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(taxLotUpdate, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: SelectLotsDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$6$1$2$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$6$1$2$1, reason: invalid class name and collision with other inner class name */
                    static final class C498751 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
                        final /* synthetic */ TaxLotUpdate $selectableTaxLotsUpdate;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C498751(TaxLotUpdate taxLotUpdate, Continuation<? super C498751> continuation) {
                            super(2, continuation);
                            this.$selectableTaxLotsUpdate = taxLotUpdate;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C498751 c498751 = new C498751(this.$selectableTaxLotsUpdate, continuation);
                            c498751.L$0 = obj;
                            return c498751;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
                            return ((C498751) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, extensions2.toImmutableList(this.$selectableTaxLotsUpdate.getSelectableTaxLots()), null, null, false, null, 0, null, null, null, this.$selectableTaxLotsUpdate.getSelectedTaxLots(), null, false, false, this.$selectableTaxLotsUpdate.getMaxGainAndLoss(), this.$selectableTaxLotsUpdate.getMaxCostPerShare(), false, null, null, null, null, null, null, 0, 267632607, null);
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.applyMutation(new C498751((TaxLotUpdate) this.L$0, null));
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow2<Tuples2<TaxLotSort, TaxLotSortDirection>> tableSortState = this.this$0.getTableSortState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(tableSortState, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: SelectLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$7", m3645f = "SelectLotsDuxo.kt", m3646l = {280}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SelectLotsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(SelectLotsDuxo selectLotsDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = selectLotsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.instrumentStore.getInstrument(((SelectLotsKey) SelectLotsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getInstrumentId())), Integer.MAX_VALUE, null, 2, null);
                    final SelectLotsDuxo selectLotsDuxo = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo.onStart.1.7.1

                        /* compiled from: SelectLotsDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$7$1$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$7$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C498761 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
                            final /* synthetic */ Instrument $instrument;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C498761(Instrument instrument, Continuation<? super C498761> continuation) {
                                super(2, continuation);
                                this.$instrument = instrument;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C498761 c498761 = new C498761(this.$instrument, continuation);
                                c498761.L$0 = obj;
                                return c498761;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
                                return ((C498761) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, this.$instrument, false, null, null, null, false, null, 0, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, 0, 268435447, null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Instrument) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Instrument instrument, Continuation<? super Unit> continuation) {
                            selectLotsDuxo.applyMutation(new C498761(instrument, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowBuffer$default.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: SelectLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$8", m3645f = "SelectLotsDuxo.kt", m3646l = {288}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SelectLotsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(SelectLotsDuxo selectLotsDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.this$0 = selectLotsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{TaxLotsM1Experiment.INSTANCE}, false, null, 6, null);
                    final SelectLotsDuxo selectLotsDuxo = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo.onStart.1.8.1

                        /* compiled from: SelectLotsDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$8$1$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onStart$1$8$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C498771 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
                            final /* synthetic */ boolean $m1Member;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C498771(boolean z, Continuation<? super C498771> continuation) {
                                super(2, continuation);
                                this.$m1Member = z;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C498771 c498771 = new C498771(this.$m1Member, continuation);
                                c498771.L$0 = obj;
                                return c498771;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
                                return ((C498771) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, false, null, null, this.$m1Member, null, null, null, null, null, null, 0, 267386879, null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                            selectLotsDuxo.applyMutation(new C498771(z, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowStreamStateFlow$default.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C148351(null));
    }

    public final void onHeaderSelected(TaxLotSort sort) {
        Tuples2<TaxLotSort, TaxLotSortDirection> value;
        Tuples2<TaxLotSort, TaxLotSortDirection> tuples2M3642to;
        Intrinsics.checkNotNullParameter(sort, "sort");
        StateFlow2<Tuples2<TaxLotSort, TaxLotSortDirection>> stateFlow2 = this.tableSortState;
        do {
            value = stateFlow2.getValue();
            Tuples2<TaxLotSort, TaxLotSortDirection> tuples2 = value;
            if (tuples2.getFirst() == sort) {
                TaxLotSortDirection second = tuples2.getSecond();
                TaxLotSortDirection taxLotSortDirection = TaxLotSortDirection.ACCENDING;
                if (second == taxLotSortDirection) {
                    taxLotSortDirection = TaxLotSortDirection.DESCENDING;
                }
                tuples2M3642to = Tuples2.copy$default(tuples2, null, taxLotSortDirection, 1, null);
            } else {
                tuples2M3642to = Tuples4.m3642to(sort, TaxLotSortDirection.DESCENDING);
            }
        } while (!stateFlow2.compareAndSet(value, tuples2M3642to));
        applyMutation(new C148342(null));
        submit(SelectLotsEvent.ScrollToTop.INSTANCE);
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onHeaderSelected$2", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onHeaderSelected$2 */
    static final class C148342 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C148342(Continuation<? super C148342> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148342 c148342 = new C148342(continuation);
            c148342.L$0 = obj;
            return c148342;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
            return ((C148342) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, 50, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, 0, 268434431, null);
        }
    }

    public final void updateTaxLotNumberOfShares(SelectableTaxLot selectableTaxLot, BigDecimal numberOfShares) {
        Intrinsics.checkNotNullParameter(selectableTaxLot, "selectableTaxLot");
        Intrinsics.checkNotNullParameter(numberOfShares, "numberOfShares");
        if (selectableTaxLot.isSelected() && Intrinsics.areEqual(selectableTaxLot.getNumberOfShares(), numberOfShares)) {
            return;
        }
        if (selectableTaxLot.isSelected() || !BigDecimals7.isZero(numberOfShares)) {
            applyMutation(new C148401(null));
            if (numberOfShares.compareTo(new BigDecimal(selectableTaxLot.getTaxLot().getAvailable_shares())) <= 0 && !BigDecimals7.isZero(numberOfShares)) {
                editSelectedTaxLots(SelectionAction.SELECT, CollectionsKt.listOf(SelectableTaxLot.copy$default(selectableTaxLot, null, numberOfShares, null, 5, null)));
            } else {
                editSelectedTaxLots(SelectionAction.DESELECT, CollectionsKt.listOf(selectableTaxLot));
            }
        }
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$updateTaxLotNumberOfShares$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$updateTaxLotNumberOfShares$1 */
    static final class C148401 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C148401(Continuation<? super C148401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148401 c148401 = new C148401(continuation);
            c148401.L$0 = obj;
            return c148401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
            return ((C148401) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, 0, 251658239, null);
        }
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$setKeyboardVisible$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$setKeyboardVisible$1 */
    static final class C148371 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
        final /* synthetic */ boolean $visible;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148371(boolean z, Continuation<? super C148371> continuation) {
            super(2, continuation);
            this.$visible = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148371 c148371 = new C148371(this.$visible, continuation);
            c148371.L$0 = obj;
            return c148371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
            return ((C148371) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, this.$visible, null, 0, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, 0, 268435199, null);
        }
    }

    public final void setKeyboardVisible(boolean visible) {
        applyMutation(new C148371(visible, null));
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$requestNextPage$1", m3645f = "SelectLotsDuxo.kt", m3646l = {356}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$requestNextPage$1 */
    static final class C148361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C148361(Continuation<? super C148361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelectLotsDuxo.this.new C148361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C148361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TaxLotsCachedService taxLotsCachedService = SelectLotsDuxo.this.taxLotsCachedService;
                Companion companion = SelectLotsDuxo.INSTANCE;
                String accountNumber = ((SelectLotsKey) companion.getArgs((HasSavedState) SelectLotsDuxo.this)).getAccountNumber();
                UUID orderId = ((SelectLotsKey) companion.getArgs((HasSavedState) SelectLotsDuxo.this)).getOrderId();
                UUID instrumentId = ((SelectLotsKey) companion.getArgs((HasSavedState) SelectLotsDuxo.this)).getInstrumentId();
                this.label = 1;
                if (taxLotsCachedService.requestNextPage(accountNumber, orderId, instrumentId, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SelectLotsDuxo.this.applyMutation(new AnonymousClass1(null));
            SelectLotsDuxo.this.requestNextPageJob = null;
            return Unit.INSTANCE;
        }

        /* compiled from: SelectLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$requestNextPage$1$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$requestNextPage$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
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
            public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
                return ((AnonymousClass1) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SelectLotsDataState selectLotsDataState = (SelectLotsDataState) this.L$0;
                return SelectLotsDataState.copy$default(selectLotsDataState, null, null, null, null, false, null, null, null, false, null, selectLotsDataState.getNextPageRequestSize() + 50, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, 0, 268434431, null);
            }
        }
    }

    public final void requestNextPage() {
        if (this.requestNextPageJob != null) {
            return;
        }
        this.requestNextPageJob = BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C148361(null), 3, null);
    }

    public final void resetToInitialSelection() {
        withDataState(new Function1() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectLotsDuxo.resetToInitialSelection$lambda$2(this.f$0, (SelectLotsDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetToInitialSelection$lambda$2(SelectLotsDuxo selectLotsDuxo, SelectLotsDataState ds) {
        List listEmptyList;
        BigDecimal ZERO;
        Collection<TaxLotSelection> collectionValues;
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (!ds.getLotSelectionHasChanged() && !ds.getStrategySelectionHasChanged()) {
            return Unit.INSTANCE;
        }
        Map<String, TaxLotSelection> initialSelectedTaxLots = ds.getInitialSelectedTaxLots();
        if (initialSelectedTaxLots == null || (collectionValues = initialSelectedTaxLots.values()) == null || (listEmptyList = CollectionsKt.toList(collectionValues)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal bigDecimalAdd = bigDecimal;
        for (Object obj : list) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            String shares = ((TaxLotSelection) obj).getShares();
            if (shares == null || (ZERO = BigDecimals7.toBigDecimalOrNull(shares)) == null) {
                ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            }
            bigDecimalAdd = bigDecimalAdd.add(ZERO);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        Intrinsics.checkNotNull(bigDecimalAdd);
        BuildersKt__Builders_commonKt.launch$default(selectLotsDuxo.getLifecycleScope(), null, null, new SelectLotsDuxo3(selectLotsDuxo, list, ds, bigDecimalAdd, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void setSelectionStrategy(final SelectionStrategy selectionStrategy, final BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
        withDataState(new Function1() { // from class: com.robinhood.android.equities.taxlots.SelectLotsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectLotsDuxo.setSelectionStrategy$lambda$3(this.f$0, quantity, selectionStrategy, (SelectLotsDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSelectionStrategy$lambda$3(SelectLotsDuxo selectLotsDuxo, BigDecimal bigDecimal, SelectionStrategy selectionStrategy, SelectLotsDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        BuildersKt__Builders_commonKt.launch$default(selectLotsDuxo.getLifecycleScope(), null, null, new SelectLotsDuxo4(ds, bigDecimal, selectLotsDuxo, selectionStrategy, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$clearSelectionStrategyFailure$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$clearSelectionStrategyFailure$1 */
    static final class C148311 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C148311(Continuation<? super C148311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148311 c148311 = new C148311(continuation);
            c148311.L$0 = obj;
            return c148311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
            return ((C148311) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, 0, 260046847, null);
        }
    }

    public final void clearSelectionStrategyFailure() {
        applyMutation(new C148311(null));
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$clearNotEnoughSharesAlert$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$clearNotEnoughSharesAlert$1 */
    static final class C148301 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C148301(Continuation<? super C148301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148301 c148301 = new C148301(continuation);
            c148301.L$0 = obj;
            return c148301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
            return ((C148301) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, 0, 201326591, null);
        }
    }

    public final void clearNotEnoughSharesAlert() {
        applyMutation(new C148301(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ToggleableState getSelectedState(Map<String, TaxLotSelection> selectedTaxLots, TaxLotInformation information) {
        String shares;
        String id = information.getId();
        if (!selectedTaxLots.containsKey(id)) {
            return ToggleableState.Off;
        }
        BigDecimal bigDecimal = new BigDecimal(information.getAvailable_shares());
        TaxLotSelection taxLotSelection = selectedTaxLots.get(id);
        BigDecimal bigDecimalOrNull = (taxLotSelection == null || (shares = taxLotSelection.getShares()) == null) ? null : BigDecimals7.toBigDecimalOrNull(shares);
        return Intrinsics.areEqual(bigDecimalOrNull, bigDecimal) ? ToggleableState.f174On : Intrinsics.areEqual(bigDecimalOrNull, BigDecimal.ZERO) ? ToggleableState.Off : !Intrinsics.areEqual(bigDecimalOrNull, bigDecimal) ? ToggleableState.Indeterminate : ToggleableState.Off;
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$editSelectedTaxLots$1", m3645f = "SelectLotsDuxo.kt", m3646l = {514}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$editSelectedTaxLots$1 */
    static final class C148321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SelectionAction $action;
        final /* synthetic */ List<SelectableTaxLot> $taxLots;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148321(List<SelectableTaxLot> list, SelectionAction selectionAction, Continuation<? super C148321> continuation) {
            super(2, continuation);
            this.$taxLots = list;
            this.$action = selectionAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelectLotsDuxo.this.new C148321(this.$taxLots, this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C148321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TaxLotsCachedService taxLotsCachedService = SelectLotsDuxo.this.taxLotsCachedService;
                Companion companion = SelectLotsDuxo.INSTANCE;
                String accountNumber = ((SelectLotsKey) companion.getArgs((HasSavedState) SelectLotsDuxo.this)).getAccountNumber();
                UUID orderId = ((SelectLotsKey) companion.getArgs((HasSavedState) SelectLotsDuxo.this)).getOrderId();
                UUID instrumentId = ((SelectLotsKey) companion.getArgs((HasSavedState) SelectLotsDuxo.this)).getInstrumentId();
                List<SelectableTaxLot> list = this.$taxLots;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (SelectableTaxLot selectableTaxLot : list) {
                    arrayList.add(new TaxLotSelection(selectableTaxLot.getId(), selectableTaxLot.getNumberOfShares().toString(), selectableTaxLot.getTaxLot().getTerm(), null, 8, null));
                }
                SelectionAction selectionAction = this.$action;
                this.label = 1;
                if (taxLotsCachedService.editSelectedTaxLots(accountNumber, orderId, instrumentId, arrayList, selectionAction, this) == coroutine_suspended) {
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

    private final void editSelectedTaxLots(SelectionAction action, List<SelectableTaxLot> taxLots) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C148321(taxLots, action, null), 3, null);
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equities/taxlots/SelectLotsDuxo;", "Lcom/robinhood/android/equities/taxlots/SelectLotsKey;", "<init>", "()V", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SelectLotsDuxo, SelectLotsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SelectLotsKey getArgs(SavedStateHandle savedStateHandle) {
            return (SelectLotsKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SelectLotsKey getArgs(SelectLotsDuxo selectLotsDuxo) {
            return (SelectLotsKey) DuxoCompanion.DefaultImpls.getArgs(this, selectLotsDuxo);
        }
    }
}
