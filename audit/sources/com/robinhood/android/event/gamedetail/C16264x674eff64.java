package com.robinhood.android.event.gamedetail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.gamedetail.combostates.ContractSelection;
import com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionState;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.android.models.event.p186db.predictionmarkets.StrikeContract;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.Combine;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamStrikeContractsForSelections$$inlined$flatMapLatest$1", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamStrikeContractsForSelections$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C16264x674eff64 extends ContinuationImpl7 implements Function3<FlowCollector<? super Map<ContractIdWithSide, ? extends StrikeContract>>, GameDetailSelectionState, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $eventId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GameDetailDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16264x674eff64(Continuation continuation, GameDetailDuxo gameDetailDuxo, UUID uuid) {
        super(3, continuation);
        this.this$0 = gameDetailDuxo;
        this.$eventId$inlined = uuid;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Map<ContractIdWithSide, ? extends StrikeContract>> flowCollector, GameDetailSelectionState gameDetailSelectionState, Continuation<? super Unit> continuation) {
        C16264x674eff64 c16264x674eff64 = new C16264x674eff64(continuation, this.this$0, this.$eventId$inlined);
        c16264x674eff64.L$0 = flowCollector;
        c16264x674eff64.L$1 = gameDetailSelectionState;
        return c16264x674eff64.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<Map<ContractIdWithSide, ? extends StrikeContract>> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            GameDetailSelectionState gameDetailSelectionState = (GameDetailSelectionState) this.L$1;
            if (gameDetailSelectionState instanceof GameDetailSelectionState.ContractSideSelections) {
                List<ContractSelection> selections = ((GameDetailSelectionState.ContractSideSelections) gameDetailSelectionState).getSelections();
                ArrayList<ContractSelection> arrayList = new ArrayList();
                for (Object obj2 : selections) {
                    if (((ContractSelection) obj2).getContractColumnType() == ContractGroup3.CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    flowFlowOf = FlowKt.flowOf(MapsKt.emptyMap());
                } else {
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    for (final ContractSelection contractSelection : arrayList) {
                        final Flow<StrikeContract> flowStreamListStrikeContracts = this.this$0.strikeContractStore.streamListStrikeContracts(contractSelection.getKey().getContractId(), this.$eventId$inlined, contractSelection.getKey().getSide());
                        arrayList2.add(new Flow<Map<ContractIdWithSide, ? extends StrikeContract>>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamStrikeContractsForSelections$lambda$18$lambda$15$$inlined$map$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super Map<ContractIdWithSide, ? extends StrikeContract>> flowCollector2, Continuation continuation) {
                                Object objCollect = flowStreamListStrikeContracts.collect(new AnonymousClass2(flowCollector2, contractSelection), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamStrikeContractsForSelections$lambda$18$lambda$15$$inlined$map$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ ContractSelection $selection$inlined;
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamStrikeContractsForSelections$lambda$18$lambda$15$$inlined$map$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamStrikeContractsForSelections$lambda$18$lambda$15$$inlined$map$1$2$1, reason: invalid class name */
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

                                public AnonymousClass2(FlowCollector flowCollector, ContractSelection contractSelection) {
                                    this.$this_unsafeFlow = flowCollector;
                                    this.$selection$inlined = contractSelection;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    Map mapMapOf;
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
                                        StrikeContract strikeContract = (StrikeContract) obj;
                                        if (strikeContract == null) {
                                            mapMapOf = MapsKt.emptyMap();
                                        } else {
                                            mapMapOf = MapsKt.mapOf(Tuples4.m3642to(this.$selection$inlined.getKey(), strikeContract));
                                        }
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(mapMapOf, anonymousClass1) == coroutine_suspended) {
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
                    }
                    if (arrayList2.isEmpty()) {
                        flowFlowOf = FlowKt.flowOf(MapsKt.emptyMap());
                    } else {
                        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
                        flowFlowOf = new Flow<Map<ContractIdWithSide, ? extends StrikeContract>>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamStrikeContractsForSelections$lambda$18$$inlined$combine$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super Map<ContractIdWithSide, ? extends StrikeContract>> flowCollector2, Continuation continuation) {
                                final Flow[] flowArr2 = flowArr;
                                Object objCombineInternal = Combine.combineInternal(flowCollector2, flowArr2, new Function0<Map<ContractIdWithSide, ? extends StrikeContract>[]>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamStrikeContractsForSelections$lambda$18$$inlined$combine$1.2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Map<ContractIdWithSide, ? extends StrikeContract>[] invoke() {
                                        return new Map[flowArr2.length];
                                    }
                                }, new AnonymousClass3(null), continuation);
                                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                            }

                            /* compiled from: Zip.kt */
                            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
                            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamStrikeContractsForSelections$lambda$18$$inlined$combine$1$3", m3645f = "GameDetailDuxo.kt", m3646l = {288}, m3647m = "invokeSuspend")
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamStrikeContractsForSelections$lambda$18$$inlined$combine$1$3, reason: invalid class name */
                            public static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super Map<ContractIdWithSide, ? extends StrikeContract>>, Map<ContractIdWithSide, ? extends StrikeContract>[], Continuation<? super Unit>, Object> {
                                private /* synthetic */ Object L$0;
                                /* synthetic */ Object L$1;
                                int label;

                                public AnonymousClass3(Continuation continuation) {
                                    super(3, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(FlowCollector<? super Map<ContractIdWithSide, ? extends StrikeContract>> flowCollector, Map<ContractIdWithSide, ? extends StrikeContract>[] mapArr, Continuation<? super Unit> continuation) {
                                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                                    anonymousClass3.L$0 = flowCollector;
                                    anonymousClass3.L$1 = mapArr;
                                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                                        Map[] mapArr = (Map[]) ((Object[]) this.L$1);
                                        Map mapEmptyMap = MapsKt.emptyMap();
                                        for (Map map : mapArr) {
                                            mapEmptyMap = MapsKt.plus(mapEmptyMap, map);
                                        }
                                        this.label = 1;
                                        if (flowCollector.emit(mapEmptyMap, this) == coroutine_suspended) {
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
                        };
                    }
                }
            } else {
                if (!(gameDetailSelectionState instanceof GameDetailSelectionState.Empty) && !(gameDetailSelectionState instanceof GameDetailSelectionState.Position)) {
                    throw new NoWhenBranchMatchedException();
                }
                flowFlowOf = FlowKt.flowOf(MapsKt.emptyMap());
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
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
