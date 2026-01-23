package com.robinhood.store.supportchat;

import com.robinhood.android.api.supportchat.SupportChatApi;
import com.robinhood.models.api.pathfinder.messaging.ApiSupportChat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SupportChatStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/pathfinder/messaging/ApiSupportChat;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$postSupportChatEndpoint$1", m3645f = "SupportChatStore.kt", m3646l = {94}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SupportChatStore$postSupportChatEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiSupportChat>, Object> {
    int label;
    final /* synthetic */ SupportChatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportChatStore$postSupportChatEndpoint$1(SupportChatStore supportChatStore, Continuation<? super SupportChatStore$postSupportChatEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = supportChatStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportChatStore$postSupportChatEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiSupportChat> continuation) {
        return ((SupportChatStore$postSupportChatEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        SupportChatApi supportChatApi = this.this$0.supportChatApi;
        this.label = 1;
        Object objCreateSupportChat = supportChatApi.createSupportChat(this);
        return objCreateSupportChat == coroutine_suspended ? coroutine_suspended : objCreateSupportChat;
    }
}
