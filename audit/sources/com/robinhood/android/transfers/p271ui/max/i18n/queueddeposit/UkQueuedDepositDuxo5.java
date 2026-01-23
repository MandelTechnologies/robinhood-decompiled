package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: UkQueuedDepositDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$setPendingPostTransferPage$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$setPendingPostTransferPage$1, reason: use source file name */
/* loaded from: classes9.dex */
final class UkQueuedDepositDuxo5 extends ContinuationImpl7 implements Function2<UkQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState>, Object> {
    final /* synthetic */ UiPostTransferPage.UkQueuedDeposit $data;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UkQueuedDepositDuxo5(UiPostTransferPage.UkQueuedDeposit ukQueuedDeposit, Continuation<? super UkQueuedDepositDuxo5> continuation) {
        super(2, continuation);
        this.$data = ukQueuedDeposit;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UkQueuedDepositDuxo5 ukQueuedDepositDuxo5 = new UkQueuedDepositDuxo5(this.$data, continuation);
        ukQueuedDepositDuxo5.L$0 = obj;
        return ukQueuedDepositDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState> continuation) {
        return ((UkQueuedDepositDuxo5) create(ukQueuedDepositDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return UkQueuedDepositDataState.copy$default((UkQueuedDepositDataState) this.L$0, null, null, null, false, null, null, null, false, false, this.$data, null, false, 3583, null);
    }
}
