package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CreateTransferV2Duxos.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u0001*\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt$streamOutgoingWireDetails$3$1", m3645f = "CreateTransferV2Duxos.kt", m3646l = {30}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt$streamOutgoingWireDetails$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateTransferV2Duxos2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Tuples2>, Continuation<? super Unit>, Object> {
    final /* synthetic */ TransferAccount $toAccount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferV2Duxos2(TransferAccount transferAccount, Continuation<? super CreateTransferV2Duxos2> continuation) {
        super(2, continuation);
        this.$toAccount = transferAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateTransferV2Duxos2 createTransferV2Duxos2 = new CreateTransferV2Duxos2(this.$toAccount, continuation);
        createTransferV2Duxos2.L$0 = obj;
        return createTransferV2Duxos2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Tuples2> flowCollector, Continuation<? super Unit> continuation) {
        return ((CreateTransferV2Duxos2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2M3642to = Tuples4.m3642to(null, this.$toAccount);
            this.label = 1;
            if (flowCollector.emit(tuples2M3642to, this) == coroutine_suspended) {
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
