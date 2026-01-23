package com.robinhood.android.transfers.p271ui.p272v2;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.models.api.bonfire.transfer.wires.ApiOutgoingWireDetails;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt$streamOutgoingWireDetails$$inlined$flatMapLatest$1", m3645f = "CreateTransferV2Duxos.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt$streamOutgoingWireDetails$$inlined$flatMapLatest$1 */
/* loaded from: classes9.dex */
public final class C31189x9747d040 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends ApiOutgoingWireDetails, ? extends TransferAccount>>, TransferAccount, Continuation<? super Unit>, Object> {
    final /* synthetic */ TransferConfiguration.OutgoingWire $outgoingWireConfig$inlined;
    final /* synthetic */ CreateTransferV2Duxo $this_streamOutgoingWireDetails$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31189x9747d040(Continuation continuation, TransferConfiguration.OutgoingWire outgoingWire, CreateTransferV2Duxo createTransferV2Duxo) {
        super(3, continuation);
        this.$outgoingWireConfig$inlined = outgoingWire;
        this.$this_streamOutgoingWireDetails$inlined = createTransferV2Duxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Tuples2<? extends ApiOutgoingWireDetails, ? extends TransferAccount>> flowCollector, TransferAccount transferAccount, Continuation<? super Unit> continuation) {
        C31189x9747d040 c31189x9747d040 = new C31189x9747d040(continuation, this.$outgoingWireConfig$inlined, this.$this_streamOutgoingWireDetails$inlined);
        c31189x9747d040.L$0 = flowCollector;
        c31189x9747d040.L$1 = transferAccount;
        return c31189x9747d040.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            TransferAccount transferAccount = (TransferAccount) this.L$1;
            if (transferAccount == null) {
                flow = FlowKt.flow(new CreateTransferV2Duxos2(transferAccount, null));
            } else {
                flow = FlowKt.flow(new CreateTransferV2Duxos3(transferAccount, this.$outgoingWireConfig$inlined, this.$this_streamOutgoingWireDetails$inlined, null));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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
