package com.robinhood.android.event.gamedetail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.gamedetail.combostates.ContractSelection;
import com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionState;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase2;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase4;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C16246x3c51cea8 extends ContinuationImpl7 implements Function3<FlowCollector<? super StreamComboQuoteUseCase3>, GameDetailSelectionState, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $allContractsFlow$inlined;
    final /* synthetic */ Flow $contractIdToPositionsForGameFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GameDetailDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16246x3c51cea8(Continuation continuation, GameDetailDuxo gameDetailDuxo, Flow flow, Flow flow2) {
        super(3, continuation);
        this.this$0 = gameDetailDuxo;
        this.$allContractsFlow$inlined = flow;
        this.$contractIdToPositionsForGameFlow$inlined = flow2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super StreamComboQuoteUseCase3> flowCollector, GameDetailSelectionState gameDetailSelectionState, Continuation<? super Unit> continuation) {
        C16246x3c51cea8 c16246x3c51cea8 = new C16246x3c51cea8(continuation, this.this$0, this.$allContractsFlow$inlined, this.$contractIdToPositionsForGameFlow$inlined);
        c16246x3c51cea8.L$0 = flowCollector;
        c16246x3c51cea8.L$1 = gameDetailSelectionState;
        return c16246x3c51cea8.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow flowTransformLatest;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final GameDetailSelectionState gameDetailSelectionState = (GameDetailSelectionState) this.L$1;
            if (gameDetailSelectionState instanceof GameDetailSelectionState.ContractSideSelections) {
                StreamComboQuoteUseCase streamComboQuoteUseCase = this.this$0.streamComboQuoteUseCase;
                List<ContractSelection> selections = ((GameDetailSelectionState.ContractSideSelections) gameDetailSelectionState).getSelections();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selections, 10));
                Iterator<T> it = selections.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ContractSelection) it.next()).getCurrentContractIdWithSide());
                }
                flowTransformLatest = StreamComboQuoteUseCase.invoke$default(streamComboQuoteUseCase, new StreamComboQuoteUseCase2.Selections(arrayList), null, null, StreamComboQuoteUseCase4.Default.INSTANCE, 6, null);
            } else if (gameDetailSelectionState instanceof GameDetailSelectionState.Empty) {
                flowTransformLatest = FlowKt.emptyFlow();
            } else {
                if (!(gameDetailSelectionState instanceof GameDetailSelectionState.Position)) {
                    throw new NoWhenBranchMatchedException();
                }
                final Flow flow = this.$allContractsFlow$inlined;
                Flow<EventContract> flow2 = new Flow<EventContract>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$invokeSuspend$lambda$4$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EventContract> flowCollector2, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector2, gameDetailSelectionState), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$invokeSuspend$lambda$4$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ GameDetailSelectionState $state$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$invokeSuspend$lambda$4$$inlined$map$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$invokeSuspend$lambda$4$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, GameDetailSelectionState gameDetailSelectionState) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$state$inlined = gameDetailSelectionState;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
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
                                Object obj3 = ((Map) obj).get(((GameDetailSelectionState.Position) this.$state$inlined).getContractId());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
                final Flow flow3 = this.$contractIdToPositionsForGameFlow$inlined;
                flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.combine(flow2, new Flow<UiEventContractPosition>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$invokeSuspend$lambda$4$$inlined$map$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super UiEventContractPosition> flowCollector2, Continuation continuation) {
                        Object objCollect = flow3.collect(new AnonymousClass2(flowCollector2, gameDetailSelectionState), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$invokeSuspend$lambda$4$$inlined$map$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ GameDetailSelectionState $state$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$invokeSuspend$lambda$4$$inlined$map$2$2", m3645f = "GameDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$invokeSuspend$lambda$4$$inlined$map$2$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, GameDetailSelectionState gameDetailSelectionState) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$state$inlined = gameDetailSelectionState;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
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
                                Object obj3 = ((Map) obj).get(((GameDetailSelectionState.Position) this.$state$inlined).getContractId());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
                }, new GameDetailDuxo$streamComboRelatedStates$2$4$2$2(null))), new C16247xfe4f8ef9(null, this.this$0, gameDetailSelectionState));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowTransformLatest, this) == coroutine_suspended) {
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
