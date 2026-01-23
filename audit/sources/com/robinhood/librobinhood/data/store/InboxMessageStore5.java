package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.ApiMessageResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: InboxMessageStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiMessageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InboxMessageStore$fetchMessagesResponse$obs$1", m3645f = "InboxMessageStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.InboxMessageStore$fetchMessagesResponse$obs$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InboxMessageStore5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response<ApiMessageResult>>, Object> {
    final /* synthetic */ String $afterMessageId;
    final /* synthetic */ String $beforeMessageId;
    final /* synthetic */ String $threadId;
    int label;
    final /* synthetic */ InboxMessageStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InboxMessageStore5(InboxMessageStore inboxMessageStore, String str, String str2, String str3, Continuation<? super InboxMessageStore5> continuation) {
        super(2, continuation);
        this.this$0 = inboxMessageStore;
        this.$threadId = str;
        this.$beforeMessageId = str2;
        this.$afterMessageId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InboxMessageStore5(this.this$0, this.$threadId, this.$beforeMessageId, this.$afterMessageId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<ApiMessageResult>> continuation) {
        return ((InboxMessageStore5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str2 = this.$beforeMessageId;
        String str3 = this.$afterMessageId;
        this.label = 1;
        Object threadMessages = brokeback.getThreadMessages(str, str2, str3, this);
        return threadMessages == coroutine_suspended ? coroutine_suspended : threadMessages;
    }
}
