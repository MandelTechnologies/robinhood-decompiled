package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.android.transfers.p271ui.common.TransferAmountEntryLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InternationalTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$onBackClick$1$1", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class InternationalTransferV2Duxo$onBackClick$1$1 extends ContinuationImpl7 implements Function2<InternationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    InternationalTransferV2Duxo$onBackClick$1$1(Continuation<? super InternationalTransferV2Duxo$onBackClick$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternationalTransferV2Duxo$onBackClick$1$1 internationalTransferV2Duxo$onBackClick$1$1 = new InternationalTransferV2Duxo$onBackClick$1$1(continuation);
        internationalTransferV2Duxo$onBackClick$1$1.L$0 = obj;
        return internationalTransferV2Duxo$onBackClick$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InternationalTransferV2DataState internationalTransferV2DataState, Continuation<? super InternationalTransferV2DataState> continuation) {
        return ((InternationalTransferV2Duxo$onBackClick$1$1) create(internationalTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InternationalTransferV2DataState.copy$default((InternationalTransferV2DataState) this.L$0, null, null, TransferAmountEntryLayout.INPUT, null, null, null, null, null, false, null, null, false, null, 8187, null);
    }
}
