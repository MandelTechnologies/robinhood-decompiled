package com.robinhood.store.supportchat;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.supportchat.SupportChatApi;
import com.robinhood.models.api.pathfinder.messaging.ApiSupportChatList;
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
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/pathfinder/messaging/ApiSupportChatList;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$getSupportChatListEndpoint$1", m3645f = "SupportChatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SupportChatStore$getSupportChatListEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Response<ApiSupportChatList>>, Object> {
    int label;
    final /* synthetic */ SupportChatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportChatStore$getSupportChatListEndpoint$1(SupportChatStore supportChatStore, Continuation<? super SupportChatStore$getSupportChatListEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = supportChatStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportChatStore$getSupportChatListEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Response<ApiSupportChatList>> continuation) {
        return ((SupportChatStore$getSupportChatListEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Object supportChats = supportChatApi.getSupportChats(this);
        return supportChats == coroutine_suspended ? coroutine_suspended : supportChats;
    }
}
