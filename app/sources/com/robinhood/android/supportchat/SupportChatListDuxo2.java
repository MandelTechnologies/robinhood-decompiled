package com.robinhood.android.supportchat;

import com.robinhood.android.supportchat.SupportChatListDataState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SupportChatListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/SupportChatListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$initializeSupportChatListStreams$initialized$1", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$initializeSupportChatListStreams$initialized$1, reason: use source file name */
/* loaded from: classes9.dex */
final class SupportChatListDuxo2 extends ContinuationImpl7 implements Function2<SupportChatListDataState, Continuation<? super SupportChatListDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    SupportChatListDuxo2(Continuation<? super SupportChatListDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportChatListDuxo2 supportChatListDuxo2 = new SupportChatListDuxo2(continuation);
        supportChatListDuxo2.L$0 = obj;
        return supportChatListDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SupportChatListDataState supportChatListDataState, Continuation<? super SupportChatListDataState> continuation) {
        return ((SupportChatListDuxo2) create(supportChatListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SupportChatListDataState.copy$default((SupportChatListDataState) this.L$0, SupportChatListDataState.SupportChatListLoadStatus.Failed.INSTANCE, null, null, false, false, 30, null);
    }
}
