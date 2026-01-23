package com.robinhood.store.supportchat;

import com.robinhood.android.api.supportchat.SupportChatApi;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.api.pathfinder.messaging.ApiSupportChat;
import com.robinhood.models.api.pathfinder.messaging.CreateSupportChatRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SupportChatStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/pathfinder/messaging/ApiSupportChat;", CarResultComposable2.BODY, "Lcom/robinhood/models/api/pathfinder/messaging/CreateSupportChatRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$postSupportChatChatbotEndpoint$1", m3645f = "SupportChatStore.kt", m3646l = {105}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SupportChatStore$postSupportChatChatbotEndpoint$1 extends ContinuationImpl7 implements Function2<CreateSupportChatRequest, Continuation<? super ApiSupportChat>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportChatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportChatStore$postSupportChatChatbotEndpoint$1(SupportChatStore supportChatStore, Continuation<? super SupportChatStore$postSupportChatChatbotEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = supportChatStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportChatStore$postSupportChatChatbotEndpoint$1 supportChatStore$postSupportChatChatbotEndpoint$1 = new SupportChatStore$postSupportChatChatbotEndpoint$1(this.this$0, continuation);
        supportChatStore$postSupportChatChatbotEndpoint$1.L$0 = obj;
        return supportChatStore$postSupportChatChatbotEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateSupportChatRequest createSupportChatRequest, Continuation<? super ApiSupportChat> continuation) {
        return ((SupportChatStore$postSupportChatChatbotEndpoint$1) create(createSupportChatRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CreateSupportChatRequest createSupportChatRequest = (CreateSupportChatRequest) this.L$0;
        SupportChatApi supportChatApi = this.this$0.supportChatApi;
        this.label = 1;
        Object objCreateSupportChat = supportChatApi.createSupportChat(createSupportChatRequest, this);
        return objCreateSupportChat == coroutine_suspended ? coroutine_suspended : objCreateSupportChat;
    }
}
