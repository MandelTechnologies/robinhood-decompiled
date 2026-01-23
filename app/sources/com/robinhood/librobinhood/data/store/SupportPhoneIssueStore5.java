package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiIssue;
import com.robinhood.models.p355ui.Issue;
import com.robinhood.models.p355ui.Issue2;
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
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIssue;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$issueEndpoint$2", m3645f = "SupportPhoneIssueStore.kt", m3646l = {64}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$issueEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SupportPhoneIssueStore5 extends ContinuationImpl7 implements Function2<Response<ApiIssue>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportPhoneIssueStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportPhoneIssueStore5(SupportPhoneIssueStore supportPhoneIssueStore, Continuation<? super SupportPhoneIssueStore5> continuation) {
        super(2, continuation);
        this.this$0 = supportPhoneIssueStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportPhoneIssueStore5 supportPhoneIssueStore5 = new SupportPhoneIssueStore5(this.this$0, continuation);
        supportPhoneIssueStore5.L$0 = obj;
        return supportPhoneIssueStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<ApiIssue> response, Continuation<? super Unit> continuation) {
        return ((SupportPhoneIssueStore5) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiIssue apiIssue = (ApiIssue) ((Response) this.L$0).body();
            if (apiIssue != null) {
                SupportPhoneIssueStore supportPhoneIssueStore = this.this$0;
                Issue uiModel = Issue2.toUiModel(apiIssue);
                this.label = 1;
                if (supportPhoneIssueStore.updateIssueRelay(uiModel, this) == coroutine_suspended) {
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
