package com.robinhood.android.matcha.p177ui.instantwithdrawal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InstantWithdrawalIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroDuxo$onCreate$1$3$1", m3645f = "InstantWithdrawalIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroDuxo$onCreate$1$3$1, reason: use source file name */
/* loaded from: classes8.dex */
final class InstantWithdrawalIntroDuxo3 extends ContinuationImpl7 implements Function2<InstantWithdrawalIntroDataState, Continuation<? super InstantWithdrawalIntroDataState>, Object> {
    final /* synthetic */ Throwable $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstantWithdrawalIntroDuxo3(Throwable th, Continuation<? super InstantWithdrawalIntroDuxo3> continuation) {
        super(2, continuation);
        this.$it = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstantWithdrawalIntroDuxo3 instantWithdrawalIntroDuxo3 = new InstantWithdrawalIntroDuxo3(this.$it, continuation);
        instantWithdrawalIntroDuxo3.L$0 = obj;
        return instantWithdrawalIntroDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InstantWithdrawalIntroDataState instantWithdrawalIntroDataState, Continuation<? super InstantWithdrawalIntroDataState> continuation) {
        return ((InstantWithdrawalIntroDuxo3) create(instantWithdrawalIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InstantWithdrawalIntroDataState.copy$default((InstantWithdrawalIntroDataState) this.L$0, null, null, this.$it, 3, null);
    }
}
