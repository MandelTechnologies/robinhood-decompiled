package com.robinhood.store.supportchat;

import com.robinhood.models.api.pathfinder.messaging.ApiSupportChat;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat2;
import com.robinhood.utils.http.Polling3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: SupportChatStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "inquiryId", "Ljava/util/UUID;", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/api/pathfinder/messaging/ApiSupportChat;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$getSupportChatEndpoint$2", m3645f = "SupportChatStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SupportChatStore$getSupportChatEndpoint$2 extends ContinuationImpl7 implements Function3<UUID, Response<ApiSupportChat>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ SupportChatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportChatStore$getSupportChatEndpoint$2(SupportChatStore supportChatStore, Continuation<? super SupportChatStore$getSupportChatEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = supportChatStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(UUID uuid, Response<ApiSupportChat> response, Continuation<? super Unit> continuation) {
        SupportChatStore$getSupportChatEndpoint$2 supportChatStore$getSupportChatEndpoint$2 = new SupportChatStore$getSupportChatEndpoint$2(this.this$0, continuation);
        supportChatStore$getSupportChatEndpoint$2.L$0 = uuid;
        supportChatStore$getSupportChatEndpoint$2.L$1 = response;
        return supportChatStore$getSupportChatEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UUID uuid = (UUID) this.L$0;
        Response response = (Response) this.L$1;
        ApiSupportChat apiSupportChat = (ApiSupportChat) response.body();
        if (apiSupportChat != null) {
            SupportChatStore supportChatStore = this.this$0;
            SupportChat uiModel = SupportChat2.toUiModel(apiSupportChat);
            Duration pollInterval = Polling3.getPollInterval(response);
            supportChatStore.saveSupportChat(uuid, uiModel, pollInterval != null ? boxing.boxLong(pollInterval.toMillis()) : null);
        }
        return Unit.INSTANCE;
    }
}
