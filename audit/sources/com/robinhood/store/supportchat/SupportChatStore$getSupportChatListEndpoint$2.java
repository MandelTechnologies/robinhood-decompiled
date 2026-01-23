package com.robinhood.store.supportchat;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.pathfinder.messaging.ApiSupportChat;
import com.robinhood.models.api.pathfinder.messaging.ApiSupportChatList;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat2;
import com.robinhood.utils.http.Polling3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: SupportChatStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/api/pathfinder/messaging/ApiSupportChatList;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$getSupportChatListEndpoint$2", m3645f = "SupportChatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class SupportChatStore$getSupportChatListEndpoint$2 extends ContinuationImpl7 implements Function3<Unit, Response<ApiSupportChatList>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportChatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportChatStore$getSupportChatListEndpoint$2(SupportChatStore supportChatStore, Continuation<? super SupportChatStore$getSupportChatListEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = supportChatStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Unit unit, Response<ApiSupportChatList> response, Continuation<? super Unit> continuation) {
        SupportChatStore$getSupportChatListEndpoint$2 supportChatStore$getSupportChatListEndpoint$2 = new SupportChatStore$getSupportChatListEndpoint$2(this.this$0, continuation);
        supportChatStore$getSupportChatListEndpoint$2.L$0 = response;
        return supportChatStore$getSupportChatListEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Response response = (Response) this.L$0;
            ApiSupportChatList apiSupportChatList = (ApiSupportChatList) response.body();
            if (apiSupportChatList != null) {
                SupportChatStore supportChatStore = this.this$0;
                List<ApiSupportChat> chats = apiSupportChatList.getChats();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(chats, 10));
                Iterator<T> it = chats.iterator();
                while (it.hasNext()) {
                    arrayList.add(SupportChat2.toUiModel((ApiSupportChat) it.next()));
                }
                Duration pollInterval = Polling3.getPollInterval(response);
                Long lBoxLong = pollInterval != null ? boxing.boxLong(pollInterval.toMillis()) : null;
                this.label = 1;
                if (supportChatStore.saveSupportChats(arrayList, lBoxLong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
