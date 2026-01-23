package com.robinhood.store.supportchat;

import com.robinhood.models.api.pathfinder.messaging.ApiSupportChat;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SupportChatStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/api/pathfinder/messaging/ApiSupportChat;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$postSupportChatChatbotEndpoint$2", m3645f = "SupportChatStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SupportChatStore$postSupportChatChatbotEndpoint$2 extends ContinuationImpl7 implements Function2<ApiSupportChat, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportChatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportChatStore$postSupportChatChatbotEndpoint$2(SupportChatStore supportChatStore, Continuation<? super SupportChatStore$postSupportChatChatbotEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = supportChatStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportChatStore$postSupportChatChatbotEndpoint$2 supportChatStore$postSupportChatChatbotEndpoint$2 = new SupportChatStore$postSupportChatChatbotEndpoint$2(this.this$0, continuation);
        supportChatStore$postSupportChatChatbotEndpoint$2.L$0 = obj;
        return supportChatStore$postSupportChatChatbotEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiSupportChat apiSupportChat, Continuation<? super Unit> continuation) {
        return ((SupportChatStore$postSupportChatChatbotEndpoint$2) create(apiSupportChat, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiSupportChat apiSupportChat = (ApiSupportChat) this.L$0;
        SupportChatStore.saveSupportChat$default(this.this$0, apiSupportChat.getInquiryId(), SupportChat2.toUiModel(apiSupportChat), null, 4, null);
        return Unit.INSTANCE;
    }
}
