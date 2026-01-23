package com.robinhood.android.equities.taxlots;

import com.robinhood.android.equities.taxlots.SelectLotsDuxo;
import com.robinhood.android.equities.taxlots.SelectLotsEvent;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equities.taxlots.table.SelectableTaxLot;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.p320db.Position;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategySummary;
import equity_trading_tax_lots.proto.p460v1.SetTaxLotsSelectionMethodResponse;
import equity_trading_tax_lots.proto.p460v1.StreamSelectedTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategySummaryResponse;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SelectLotsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$setSelectionStrategy$1$1", m3645f = "SelectLotsDuxo.kt", m3646l = {427, 435, 441, 466}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$setSelectionStrategy$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class SelectLotsDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelectLotsDataState $ds;
    final /* synthetic */ BigDecimal $quantity;
    final /* synthetic */ SelectionStrategy $selectionStrategy;
    Object L$0;
    int label;
    final /* synthetic */ SelectLotsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectLotsDuxo4(SelectLotsDataState selectLotsDataState, BigDecimal bigDecimal, SelectLotsDuxo selectLotsDuxo, SelectionStrategy selectionStrategy, Continuation<? super SelectLotsDuxo4> continuation) {
        super(2, continuation);
        this.$ds = selectLotsDataState;
        this.$quantity = bigDecimal;
        this.this$0 = selectLotsDuxo;
        this.$selectionStrategy = selectionStrategy;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectLotsDuxo4(this.$ds, this.$quantity, this.this$0, this.$selectionStrategy, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectLotsDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x013c, code lost:
    
        if (r0 != r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01fa, code lost:
    
        if (r1 == r7) goto L63;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object taxLotsSelectionMethod;
        SetTaxLotsSelectionMethodResponse setTaxLotsSelectionMethodResponse;
        Map mapEmptyMap;
        Object objFirst;
        Object objStreamTaxLotsSelectionStrategySummary;
        Object objFirst2;
        Object next;
        SelectLotsDuxo4 selectLotsDuxo4 = this;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = selectLotsDuxo4.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BigDecimal orderFormNumberOfShares = (selectLotsDuxo4.$ds.getOrderFormNumberOfShares() != null && selectLotsDuxo4.$quantity == null && selectLotsDuxo4.$ds.getSelectedTaxLots().isEmpty()) ? selectLotsDuxo4.$ds.getOrderFormNumberOfShares() : selectLotsDuxo4.$quantity;
            Position position = selectLotsDuxo4.$ds.getPosition();
            if ((position != null ? position.getSharesAvailableForSellsTaxLots() : null) != null && orderFormNumberOfShares != null && orderFormNumberOfShares.compareTo(selectLotsDuxo4.$ds.getPosition().getSharesAvailableForSellsTaxLots()) > 0) {
                selectLotsDuxo4.this$0.applyMutation(new C148381(selectLotsDuxo4.$ds, null));
                return Unit.INSTANCE;
            }
            TaxLotsCachedService taxLotsCachedService = selectLotsDuxo4.this$0.taxLotsCachedService;
            SelectLotsDuxo.Companion companion = SelectLotsDuxo.INSTANCE;
            String accountNumber = ((SelectLotsKey) companion.getArgs((HasSavedState) selectLotsDuxo4.this$0)).getAccountNumber();
            UUID orderId = ((SelectLotsKey) companion.getArgs((HasSavedState) selectLotsDuxo4.this$0)).getOrderId();
            UUID instrumentId = ((SelectLotsKey) companion.getArgs((HasSavedState) selectLotsDuxo4.this$0)).getInstrumentId();
            SelectionStrategy selectionStrategy = selectLotsDuxo4.$selectionStrategy;
            selectLotsDuxo4.label = 1;
            taxLotsSelectionMethod = taxLotsCachedService.setTaxLotsSelectionMethod(accountNumber, orderId, instrumentId, selectionStrategy, orderFormNumberOfShares, selectLotsDuxo4);
            selectLotsDuxo4 = selectLotsDuxo4;
            if (taxLotsSelectionMethod != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            taxLotsSelectionMethod = obj;
        } else {
            if (i != 2) {
                if (i == 3) {
                    SetTaxLotsSelectionMethodResponse setTaxLotsSelectionMethodResponse2 = (SetTaxLotsSelectionMethodResponse) selectLotsDuxo4.L$0;
                    ResultKt.throwOnFailure(obj);
                    setTaxLotsSelectionMethodResponse = setTaxLotsSelectionMethodResponse2;
                    objFirst2 = obj;
                    Iterator<T> it = ((StreamTaxLotsSelectionStrategySummaryResponse) objFirst2).getSelection_strategies().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((SelectionStrategySummary) next).getSelection_strategy() == setTaxLotsSelectionMethodResponse.getSelection_strategy()) {
                            break;
                        }
                    }
                    SelectionStrategySummary selectionStrategySummary = (SelectionStrategySummary) next;
                    if (selectionStrategySummary != null) {
                        selectLotsDuxo4.this$0.applyMutation(new SelectLotsDuxo5(setTaxLotsSelectionMethodResponse, selectionStrategySummary, null));
                    }
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mapEmptyMap = (Map) selectLotsDuxo4.L$0;
                ResultKt.throwOnFailure(obj);
                objFirst = obj;
                List<TaxLotSelection> lots = ((StreamSelectedTaxLotsResponse) objFirst).getLots();
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(lots, 10)), 16));
                for (TaxLotSelection taxLotSelection : lots) {
                    String id = taxLotSelection.getId();
                    String shares = taxLotSelection.getShares();
                    if (shares == null) {
                        shares = "";
                    }
                    Tuples2 tuples2M3642to = Tuples4.m3642to(id, shares);
                    linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                }
                selectLotsDuxo4.this$0.submit(new SelectLotsEvent.SelectionStrategyChange(MapsKt.plus(mapEmptyMap, linkedHashMap)));
                selectLotsDuxo4.this$0.clearSelectionStrategyFailure();
                return Unit.INSTANCE;
            }
            SetTaxLotsSelectionMethodResponse setTaxLotsSelectionMethodResponse3 = (SetTaxLotsSelectionMethodResponse) selectLotsDuxo4.L$0;
            ResultKt.throwOnFailure(obj);
            setTaxLotsSelectionMethodResponse = setTaxLotsSelectionMethodResponse3;
            objStreamTaxLotsSelectionStrategySummary = obj;
            selectLotsDuxo4.L$0 = setTaxLotsSelectionMethodResponse;
            selectLotsDuxo4.label = 3;
            objFirst2 = FlowKt.first((Flow) objStreamTaxLotsSelectionStrategySummary, selectLotsDuxo4);
        }
        setTaxLotsSelectionMethodResponse = (SetTaxLotsSelectionMethodResponse) taxLotsSelectionMethod;
        if (setTaxLotsSelectionMethodResponse.getFailure_reason() != null) {
            TaxLotsCachedService taxLotsCachedService2 = selectLotsDuxo4.this$0.taxLotsCachedService;
            SelectLotsDuxo.Companion companion2 = SelectLotsDuxo.INSTANCE;
            String accountNumber2 = ((SelectLotsKey) companion2.getArgs((HasSavedState) selectLotsDuxo4.this$0)).getAccountNumber();
            UUID orderId2 = ((SelectLotsKey) companion2.getArgs((HasSavedState) selectLotsDuxo4.this$0)).getOrderId();
            UUID instrumentId2 = ((SelectLotsKey) companion2.getArgs((HasSavedState) selectLotsDuxo4.this$0)).getInstrumentId();
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            selectLotsDuxo4.L$0 = setTaxLotsSelectionMethodResponse;
            selectLotsDuxo4.label = 2;
            objStreamTaxLotsSelectionStrategySummary = taxLotsCachedService2.streamTaxLotsSelectionStrategySummary(accountNumber2, orderId2, instrumentId2, ZERO, selectLotsDuxo4);
            if (objStreamTaxLotsSelectionStrategySummary != coroutine_suspended) {
                selectLotsDuxo4.L$0 = setTaxLotsSelectionMethodResponse;
                selectLotsDuxo4.label = 3;
                objFirst2 = FlowKt.first((Flow) objStreamTaxLotsSelectionStrategySummary, selectLotsDuxo4);
            }
        } else {
            selectLotsDuxo4.this$0.applyMutation(new C148394(null));
            ImmutableList<SelectableTaxLot> selectableTaxLots = selectLotsDuxo4.$ds.getSelectableTaxLots();
            if (selectableTaxLots != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(selectableTaxLots, 10)), 16));
                Iterator<SelectableTaxLot> it2 = selectableTaxLots.iterator();
                while (it2.hasNext()) {
                    Tuples2 tuples2M3642to2 = Tuples4.m3642to(it2.next().getId(), "");
                    linkedHashMap2.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
                }
                mapEmptyMap = linkedHashMap2;
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            TaxLotsCachedService taxLotsCachedService3 = selectLotsDuxo4.this$0.taxLotsCachedService;
            SelectLotsDuxo.Companion companion3 = SelectLotsDuxo.INSTANCE;
            Flow<StreamSelectedTaxLotsResponse> flowStreamSelectedTaxLots = taxLotsCachedService3.streamSelectedTaxLots(((SelectLotsKey) companion3.getArgs((HasSavedState) selectLotsDuxo4.this$0)).getAccountNumber(), ((SelectLotsKey) companion3.getArgs((HasSavedState) selectLotsDuxo4.this$0)).getOrderId(), ((SelectLotsKey) companion3.getArgs((HasSavedState) selectLotsDuxo4.this$0)).getInstrumentId());
            selectLotsDuxo4.L$0 = mapEmptyMap;
            selectLotsDuxo4.label = 4;
            objFirst = FlowKt.first(flowStreamSelectedTaxLots, selectLotsDuxo4);
        }
        return coroutine_suspended;
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$setSelectionStrategy$1$1$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$setSelectionStrategy$1$1$1 */
    static final class C148381 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
        final /* synthetic */ SelectLotsDataState $ds;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148381(SelectLotsDataState selectLotsDataState, Continuation<? super C148381> continuation) {
            super(2, continuation);
            this.$ds = selectLotsDataState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148381 c148381 = new C148381(this.$ds, continuation);
            c148381.L$0 = obj;
            return c148381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
            return ((C148381) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, this.$ds.getPosition(), 0, 201326591, null);
        }
    }

    /* compiled from: SelectLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$setSelectionStrategy$1$1$4", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$setSelectionStrategy$1$1$4 */
    static final class C148394 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C148394(Continuation<? super C148394> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148394 c148394 = new C148394(continuation);
            c148394.L$0 = obj;
            return c148394;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
            return ((C148394) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
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
}
