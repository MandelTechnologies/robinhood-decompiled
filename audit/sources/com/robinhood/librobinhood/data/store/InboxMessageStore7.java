package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.ApiMessage;
import com.robinhood.models.api.ApiSubmitMessageRequest;
import com.robinhood.models.p320db.InboxMessageType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InboxMessageStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiMessage;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InboxMessageStore$submitMessageInternal$obs$1", m3645f = "InboxMessageStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.InboxMessageStore$submitMessageInternal$obs$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InboxMessageStore7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMessage>, Object> {
    final /* synthetic */ InboxMessageType.LocalMessage.RequestData.Text $requestData;
    final /* synthetic */ String $threadId;
    int label;
    final /* synthetic */ InboxMessageStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InboxMessageStore7(InboxMessageStore inboxMessageStore, String str, InboxMessageType.LocalMessage.RequestData.Text text, Continuation<? super InboxMessageStore7> continuation) {
        super(2, continuation);
        this.this$0 = inboxMessageStore;
        this.$threadId = str;
        this.$requestData = text;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InboxMessageStore7(this.this$0, this.$threadId, this.$requestData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMessage> continuation) {
        return ((InboxMessageStore7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String text = this.$requestData.getText();
        UUID mediaId = this.$requestData.getMediaId();
        ApiSubmitMessageRequest apiSubmitMessageRequest = new ApiSubmitMessageRequest(text, mediaId != null ? CollectionsKt.listOf(mediaId) : null);
        this.label = 1;
        Object objSubmitMessage = brokeback.submitMessage(str, apiSubmitMessageRequest, this);
        return objSubmitMessage == coroutine_suspended ? coroutine_suspended : objSubmitMessage;
    }
}
