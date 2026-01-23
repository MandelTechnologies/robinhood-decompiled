package com.robinhood.android.directdeposit.p101ui.intro;

import com.robinhood.models.p320db.sheriff.User;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DirectDepositBranchV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.intro.DirectDepositBranchV2Duxo$onStart$2$1", m3645f = "DirectDepositBranchV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.directdeposit.ui.intro.DirectDepositBranchV2Duxo$onStart$2$1, reason: use source file name */
/* loaded from: classes27.dex */
final class DirectDepositBranchV2Duxo4 extends ContinuationImpl7 implements Function2<DirectDepositBranchV2DataState, Continuation<? super DirectDepositBranchV2DataState>, Object> {
    final /* synthetic */ User $user;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositBranchV2Duxo4(User user, Continuation<? super DirectDepositBranchV2Duxo4> continuation) {
        super(2, continuation);
        this.$user = user;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DirectDepositBranchV2Duxo4 directDepositBranchV2Duxo4 = new DirectDepositBranchV2Duxo4(this.$user, continuation);
        directDepositBranchV2Duxo4.L$0 = obj;
        return directDepositBranchV2Duxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DirectDepositBranchV2DataState directDepositBranchV2DataState, Continuation<? super DirectDepositBranchV2DataState> continuation) {
        return ((DirectDepositBranchV2Duxo4) create(directDepositBranchV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DirectDepositBranchV2DataState.copy$default((DirectDepositBranchV2DataState) this.L$0, null, null, this.$user.getEmail(), 3, null);
    }
}
