package com.robinhood.store.supportchat;

import com.robinhood.android.api.supportchat.SupportChatApi;
import com.robinhood.models.api.pathfinder.messaging.ApiSupportChat;
import com.robinhood.models.api.pathfinder.messaging.SupportChatUpdateRequest;
import com.robinhood.store.supportchat.SupportChatStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: SupportChatStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/pathfinder/messaging/ApiSupportChat;", "param", "Lcom/robinhood/store/supportchat/SupportChatStore$SupportChatPostParam;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$supportChatPostEndpoint$1", m3645f = "SupportChatStore.kt", m3646l = {155}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SupportChatStore$supportChatPostEndpoint$1 extends ContinuationImpl7 implements Function2<SupportChatStore.SupportChatPostParam, Continuation<? super Response<ApiSupportChat>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportChatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportChatStore$supportChatPostEndpoint$1(SupportChatStore supportChatStore, Continuation<? super SupportChatStore$supportChatPostEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = supportChatStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportChatStore$supportChatPostEndpoint$1 supportChatStore$supportChatPostEndpoint$1 = new SupportChatStore$supportChatPostEndpoint$1(this.this$0, continuation);
        supportChatStore$supportChatPostEndpoint$1.L$0 = obj;
        return supportChatStore$supportChatPostEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SupportChatStore.SupportChatPostParam supportChatPostParam, Continuation<? super Response<ApiSupportChat>> continuation) {
        return ((SupportChatStore$supportChatPostEndpoint$1) create(supportChatPostParam, continuation)).invokeSuspend(Unit.INSTANCE);
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
        SupportChatStore.SupportChatPostParam supportChatPostParam = (SupportChatStore.SupportChatPostParam) this.L$0;
        SupportChatApi supportChatApi = this.this$0.supportChatApi;
        UUID inquiryId = supportChatPostParam.getInquiryId();
        SupportChatUpdateRequest supportChatUpdateRequest = new SupportChatUpdateRequest(supportChatPostParam.getOperationType());
        this.label = 1;
        Object objUpdateSupportChat = supportChatApi.updateSupportChat(inquiryId, supportChatUpdateRequest, this);
        return objUpdateSupportChat == coroutine_suspended ? coroutine_suspended : objUpdateSupportChat;
    }
}
