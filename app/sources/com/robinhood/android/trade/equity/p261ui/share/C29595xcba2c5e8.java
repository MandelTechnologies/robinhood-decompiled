package com.robinhood.android.trade.equity.p261ui.share;

import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.librobinhood.data.store.CollateralStore;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Emitters.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$invokeSuspend$$inlined$transform$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {36}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$invokeSuspend$$inlined$transform$1 */
/* loaded from: classes9.dex */
public final class C29595xcba2c5e8 extends ContinuationImpl7 implements Function2<FlowCollector<? super ApiCollateral>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityShareOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29595xcba2c5e8(Flow flow, Continuation continuation, EquityShareOrderDuxo equityShareOrderDuxo) {
        super(2, continuation);
        this.$this_transform = flow;
        this.this$0 = equityShareOrderDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C29595xcba2c5e8 c29595xcba2c5e8 = new C29595xcba2c5e8(this.$this_transform, continuation, this.this$0);
        c29595xcba2c5e8.L$0 = obj;
        return c29595xcba2c5e8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super ApiCollateral> flowCollector, Continuation<? super Unit> continuation) {
        return ((C29595xcba2c5e8) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: Emitters.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<ApiCollateral> $$this$flow;
        final /* synthetic */ EquityShareOrderDuxo this$0;

        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$invokeSuspend$$inlined$transform$1$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {39, 41, 40}, m3647m = "emit")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C505791 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C505791(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, EquityShareOrderDuxo equityShareOrderDuxo) {
            this.this$0 = equityShareOrderDuxo;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        
            if (r10.emit(r11, r6) != r0) goto L29;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C505791 c505791;
            EquityOrderContext equityOrderContext;
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            if (continuation instanceof C505791) {
                c505791 = (C505791) continuation;
                int i = c505791.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c505791.label = i - Integer.MIN_VALUE;
                } else {
                    c505791 = new C505791(continuation);
                }
            }
            C505791 c5057912 = c505791;
            Object equityOrderCollateral = c5057912.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c5057912.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(equityOrderCollateral);
                FlowCollector flowCollector3 = this.$$this$flow;
                equityOrderContext = (EquityOrderContext) t;
                c5057912.L$0 = equityOrderContext;
                c5057912.L$1 = flowCollector3;
                c5057912.label = 1;
                if (flowCollector3.emit(null, c5057912) != coroutine_suspended) {
                    flowCollector = flowCollector3;
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                FlowCollector flowCollector4 = (FlowCollector) c5057912.L$1;
                equityOrderContext = (EquityOrderContext) c5057912.L$0;
                ResultKt.throwOnFailure(equityOrderCollateral);
                flowCollector = flowCollector4;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(equityOrderCollateral);
                    return Unit.INSTANCE;
                }
                FlowCollector flowCollector5 = (FlowCollector) c5057912.L$0;
                ResultKt.throwOnFailure(equityOrderCollateral);
                flowCollector2 = flowCollector5;
                c5057912.L$0 = null;
                c5057912.label = 3;
            }
            CollateralStore collateralStore = this.this$0.collateralStore;
            String accountNumber = equityOrderContext.getAccountNumber();
            UUID id = equityOrderContext.getInstrument().getId();
            EquityOrderSide side = equityOrderContext.getSide();
            BigDecimal bigDecimalOrZero = BigDecimals7.orZero(equityOrderContext.getQuantity());
            c5057912.L$0 = flowCollector;
            c5057912.L$1 = null;
            c5057912.label = 2;
            equityOrderCollateral = collateralStore.getEquityOrderCollateral(accountNumber, id, side, bigDecimalOrZero, c5057912);
            flowCollector2 = flowCollector;
            if (equityOrderCollateral != coroutine_suspended) {
                c5057912.L$0 = null;
                c5057912.label = 3;
            }
            return coroutine_suspended;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector, this.this$0);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
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
