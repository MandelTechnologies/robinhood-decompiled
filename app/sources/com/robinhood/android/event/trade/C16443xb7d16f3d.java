package com.robinhood.android.event.trade;

import androidx.compose.p011ui.text.input.TextFieldValue;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.trade.EventOrderFormDuxo;
import com.robinhood.android.event.trade.EventOrderFormFragment;
import com.robinhood.android.event.trade.EventOrderFormViewState;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase2;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase4;
import com.robinhood.android.models.event.p186db.order.OrderFormOrderType;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.store.futures.marketdata.MarketdataPollLocation;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "EventOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C16443xb7d16f3d extends ContinuationImpl7 implements Function3<FlowCollector<? super StreamComboQuoteUseCase3>, Boolean, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EventOrderFormDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16443xb7d16f3d(Continuation continuation, EventOrderFormDuxo eventOrderFormDuxo) {
        super(3, continuation);
        this.this$0 = eventOrderFormDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super StreamComboQuoteUseCase3> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        C16443xb7d16f3d c16443xb7d16f3d = new C16443xb7d16f3d(continuation, this.this$0);
        c16443xb7d16f3d.L$0 = flowCollector;
        c16443xb7d16f3d.L$1 = bool;
        return c16443xb7d16f3d.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow flowInvoke$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (!((Boolean) this.L$1).booleanValue()) {
                StreamComboQuoteUseCase streamComboQuoteUseCase = this.this$0.streamComboQuoteUseCase;
                EventOrderFormDuxo.Companion companion = EventOrderFormDuxo.INSTANCE;
                flowInvoke$default = StreamComboQuoteUseCase.invoke$default(streamComboQuoteUseCase, new StreamComboQuoteUseCase2.Selections(CollectionsKt.listOf(new ContractIdWithSide(((EventOrderFormFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getEventContractId(), ((EventOrderFormFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getContractSide()))), MarketdataPollLocation.ORDER_FORM, null, new StreamComboQuoteUseCase4.NotionalBased(null, 1, null), 4, null);
            } else {
                final StateFlow<EventOrderFormViewState> stateFlow = this.this$0.getStateFlow();
                flowInvoke$default = FlowKt.transformLatest(FlowKt.debounce(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<StreamComboQuoteUseCase4>() { // from class: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$invokeSuspend$lambda$3$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StreamComboQuoteUseCase4> flowCollector2, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector2), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$invokeSuspend$lambda$3$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$invokeSuspend$lambda$3$$inlined$mapNotNull$1$2", m3645f = "EventOrderFormDuxo.kt", m3646l = {83}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.event.trade.EventOrderFormDuxo$onCreate$1$9$invokeSuspend$lambda$3$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                            TextFieldValue quantityText;
                            String text;
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
                                EventOrderFormViewState eventOrderFormViewState = (EventOrderFormViewState) obj;
                                OrderFormOrderType orderType = eventOrderFormViewState.getOrderType();
                                StreamComboQuoteUseCase4 notionalBased = null;
                                if (orderType != null) {
                                    EventOrderFormViewState.OrderFormContentData.NotionalBasedData notionalBasedData = eventOrderFormViewState.getOrderFormContentData().getNotionalBasedData();
                                    BigDecimal dollarInputAmount = notionalBasedData != null ? notionalBasedData.getDollarInputAmount() : null;
                                    EventOrderFormViewState.OrderFormContentData.QuantityBasedData quantityBasedData = eventOrderFormViewState.getOrderFormContentData().getQuantityBasedData();
                                    BigDecimal bigDecimalOrNull = (quantityBasedData == null || (quantityText = quantityBasedData.getQuantityText()) == null || (text = quantityText.getText()) == null) ? null : StringsKt.toBigDecimalOrNull(text);
                                    int i3 = EventOrderFormDuxo.C164511.AnonymousClass9.WhenMappings.$EnumSwitchMapping$0[orderType.ordinal()];
                                    if (i3 != 1) {
                                        if (i3 != 2 && i3 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (bigDecimalOrNull != null && !BigDecimals7.isZero(bigDecimalOrNull)) {
                                            notionalBased = new StreamComboQuoteUseCase4.QuantityBased(bigDecimalOrNull);
                                        } else {
                                            notionalBased = StreamComboQuoteUseCase4.Default.INSTANCE;
                                        }
                                    } else if (dollarInputAmount != null) {
                                        if (BigDecimals7.isZero(dollarInputAmount)) {
                                            notionalBased = StreamComboQuoteUseCase4.Default.INSTANCE;
                                        } else {
                                            notionalBased = new StreamComboQuoteUseCase4.NotionalBased(dollarInputAmount);
                                        }
                                    }
                                }
                                if (notionalBased != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(notionalBased, anonymousClass1) == coroutine_suspended) {
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
                }), new EventOrderFormDuxo2(this.this$0, null)), 300L), new C16445x154972e5(null, this.this$0));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowInvoke$default, this) == coroutine_suspended) {
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
