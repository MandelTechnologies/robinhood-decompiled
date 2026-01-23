package com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip;

import com.plaid.internal.EnumC7081g;
import com.robinhood.librobinhood.data.store.TaxLotEligibilityStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.TaxLotEligibility;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$11$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "EquityOrderTypeTooltipDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$11$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes9.dex */
public final class C29508x8833a011 extends ContinuationImpl7 implements Function3<FlowCollector<? super Optional<? extends TaxLotEligibility>>, Tuples2<? extends Account, ? extends UUID>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EquityOrderTypeTooltipDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29508x8833a011(Continuation continuation, EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo) {
        super(3, continuation);
        this.this$0 = equityOrderTypeTooltipDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Optional<? extends TaxLotEligibility>> flowCollector, Tuples2<? extends Account, ? extends UUID> tuples2, Continuation<? super Unit> continuation) {
        C29508x8833a011 c29508x8833a011 = new C29508x8833a011(continuation, this.this$0);
        c29508x8833a011.L$0 = flowCollector;
        c29508x8833a011.L$1 = tuples2;
        return c29508x8833a011.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, (kotlinx.coroutines.flow.Flow) r7, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            Account account = (Account) tuples2.component1();
            UUID uuid = (UUID) tuples2.component2();
            TaxLotEligibilityStore taxLotEligibilityStore = this.this$0.taxLotEligibilityStore;
            Intrinsics.checkNotNull(uuid);
            String accountNumber = account.getAccountNumber();
            this.L$0 = flowCollector;
            this.label = 1;
            obj = taxLotEligibilityStore.getTaxLotPositionEligibility(uuid, accountNumber, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = null;
        this.label = 2;
    }
}
