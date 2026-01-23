package com.robinhood.android.supportchat.thread;

import com.robinhood.android.supportchat.thread.CxChatDataState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CxChatDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$fetchSupportChatInternal$result$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$fetchSupportChatInternal$result$1, reason: use source file name */
/* loaded from: classes9.dex */
final class CxChatDuxo2 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    CxChatDuxo2(Continuation<? super CxChatDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CxChatDuxo2 cxChatDuxo2 = new CxChatDuxo2(continuation);
        cxChatDuxo2.L$0 = obj;
        return cxChatDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
        return ((CxChatDuxo2) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CxChatDataState.copy$default((CxChatDataState) this.L$0, CxChatDataState.InitialStatus.Loading.INSTANCE, null, null, null, false, null, null, null, null, null, 1022, null);
    }
}
