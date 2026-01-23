package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.ApiMessage;
import com.robinhood.models.api.ApiSubmitResponseRequest;
import com.robinhood.models.p320db.InboxMessageType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InboxMessageStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiMessage;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InboxMessageStore$submitResponseInternal$obs$1", m3645f = "InboxMessageStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.InboxMessageStore$submitResponseInternal$obs$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InboxMessageStore8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMessage>, Object> {
    final /* synthetic */ InboxMessageType.LocalMessage.RequestData.Response $requestData;
    final /* synthetic */ String $threadId;
    int label;
    final /* synthetic */ InboxMessageStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InboxMessageStore8(InboxMessageStore inboxMessageStore, String str, InboxMessageType.LocalMessage.RequestData.Response response, Continuation<? super InboxMessageStore8> continuation) {
        super(2, continuation);
        this.this$0 = inboxMessageStore;
        this.$threadId = str;
        this.$requestData = response;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InboxMessageStore8(this.this$0, this.$threadId, this.$requestData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMessage> continuation) {
        return ((InboxMessageStore8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Brokeback brokeback = this.this$0.brokeback;
        String str = this.$threadId;
        String messageId = this.$requestData.getMessageId();
        ApiSubmitResponseRequest apiSubmitResponseRequest = new ApiSubmitResponseRequest(this.$requestData.getAnswer(), this.$requestData.getText());
        this.label = 1;
        Object objSubmitResponse = brokeback.submitResponse(str, messageId, apiSubmitResponseRequest, this);
        return objSubmitResponse == coroutine_suspended ? coroutine_suspended : objSubmitResponse;
    }
}
