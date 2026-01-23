package com.robinhood.android.matcha.p177ui.sourceoffunds;

import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SourceOfFundsBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheetDuxo$onStart$1$1", m3645f = "SourceOfFundsBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheetDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SourceOfFundsBottomSheetDuxo2 extends ContinuationImpl7 implements Function2<SourceOfFundsDataState, Continuation<? super SourceOfFundsDataState>, Object> {
    final /* synthetic */ List<TransferAccount> $accounts;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SourceOfFundsBottomSheetDuxo2(List<TransferAccount> list, Continuation<? super SourceOfFundsBottomSheetDuxo2> continuation) {
        super(2, continuation);
        this.$accounts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SourceOfFundsBottomSheetDuxo2 sourceOfFundsBottomSheetDuxo2 = new SourceOfFundsBottomSheetDuxo2(this.$accounts, continuation);
        sourceOfFundsBottomSheetDuxo2.L$0 = obj;
        return sourceOfFundsBottomSheetDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SourceOfFundsDataState sourceOfFundsDataState, Continuation<? super SourceOfFundsDataState> continuation) {
        return ((SourceOfFundsBottomSheetDuxo2) create(sourceOfFundsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object next;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SourceOfFundsDataState sourceOfFundsDataState = (SourceOfFundsDataState) this.L$0;
        List<TransferAccount> list = this.$accounts;
        String selectedAccountId = sourceOfFundsDataState.getSelectedAccountId();
        if (selectedAccountId == null) {
            Iterator<T> it = this.$accounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((TransferAccount) next).getType() == TransferAccounts3.getDefaultSourceOfFundsType()) {
                    break;
                }
            }
            TransferAccount transferAccount = (TransferAccount) next;
            if (transferAccount != null) {
                selectedAccountId = transferAccount.getAccountId();
                str = selectedAccountId;
            } else {
                str = null;
            }
        } else {
            str = selectedAccountId;
        }
        return SourceOfFundsDataState.copy$default(sourceOfFundsDataState, list, str, null, null, null, 28, null);
    }
}
