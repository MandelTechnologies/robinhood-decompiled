package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiIssue;
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

/* compiled from: SupportPhoneIssueStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIssue;", "id", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$issueEndpoint$1", m3645f = "SupportPhoneIssueStore.kt", m3646l = {60}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$issueEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SupportPhoneIssueStore4 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Response<ApiIssue>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportPhoneIssueStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportPhoneIssueStore4(SupportPhoneIssueStore supportPhoneIssueStore, Continuation<? super SupportPhoneIssueStore4> continuation) {
        super(2, continuation);
        this.this$0 = supportPhoneIssueStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportPhoneIssueStore4 supportPhoneIssueStore4 = new SupportPhoneIssueStore4(this.this$0, continuation);
        supportPhoneIssueStore4.L$0 = obj;
        return supportPhoneIssueStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super Response<ApiIssue>> continuation) {
        return ((SupportPhoneIssueStore4) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        SupportIssueStore supportIssueStore = this.this$0.supportIssueStore;
        this.label = 1;
        Object phoneIssue = supportIssueStore.getPhoneIssue(uuid, this);
        return phoneIssue == coroutine_suspended ? coroutine_suspended : phoneIssue;
    }
}
