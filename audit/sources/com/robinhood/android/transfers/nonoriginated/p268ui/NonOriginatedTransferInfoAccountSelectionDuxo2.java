package com.robinhood.android.transfers.nonoriginated.p268ui;

import com.robinhood.models.p320db.Account;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonOriginatedTransferInfoAccountSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionDuxo$onCreate$1$1", m3645f = "NonOriginatedTransferInfoAccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class NonOriginatedTransferInfoAccountSelectionDuxo2 extends ContinuationImpl7 implements Function2<NonOriginatedTransferInfoAccountSelectionDataState, Continuation<? super NonOriginatedTransferInfoAccountSelectionDataState>, Object> {
    final /* synthetic */ List<Account> $accounts;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NonOriginatedTransferInfoAccountSelectionDuxo2(List<Account> list, Continuation<? super NonOriginatedTransferInfoAccountSelectionDuxo2> continuation) {
        super(2, continuation);
        this.$accounts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NonOriginatedTransferInfoAccountSelectionDuxo2 nonOriginatedTransferInfoAccountSelectionDuxo2 = new NonOriginatedTransferInfoAccountSelectionDuxo2(this.$accounts, continuation);
        nonOriginatedTransferInfoAccountSelectionDuxo2.L$0 = obj;
        return nonOriginatedTransferInfoAccountSelectionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NonOriginatedTransferInfoAccountSelectionDataState nonOriginatedTransferInfoAccountSelectionDataState, Continuation<? super NonOriginatedTransferInfoAccountSelectionDataState> continuation) {
        return ((NonOriginatedTransferInfoAccountSelectionDuxo2) create(nonOriginatedTransferInfoAccountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        NonOriginatedTransferInfoAccountSelectionDataState nonOriginatedTransferInfoAccountSelectionDataState = (NonOriginatedTransferInfoAccountSelectionDataState) this.L$0;
        List<Account> list = this.$accounts;
        Intrinsics.checkNotNull(list);
        return NonOriginatedTransferInfoAccountSelectionDataState.copy$default(nonOriginatedTransferInfoAccountSelectionDataState, list, null, null, 6, null);
    }
}
