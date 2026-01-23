package com.robinhood.android.matcha.p177ui.search.confirm;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ConfirmContactDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$onVerificationResult$1$3$1", m3645f = "ConfirmContactDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$onVerificationResult$1$3$1, reason: use source file name */
/* loaded from: classes8.dex */
final class ConfirmContactDuxo2 extends ContinuationImpl7 implements Function2<ConfirmContactDataState, Continuation<? super ConfirmContactDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    ConfirmContactDuxo2(Continuation<? super ConfirmContactDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConfirmContactDuxo2 confirmContactDuxo2 = new ConfirmContactDuxo2(continuation);
        confirmContactDuxo2.L$0 = obj;
        return confirmContactDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ConfirmContactDataState confirmContactDataState, Continuation<? super ConfirmContactDataState> continuation) {
        return ((ConfirmContactDuxo2) create(confirmContactDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ConfirmContactDataState.copy$default((ConfirmContactDataState) this.L$0, null, null, null, null, false, null, null, null, 239, null);
    }
}
