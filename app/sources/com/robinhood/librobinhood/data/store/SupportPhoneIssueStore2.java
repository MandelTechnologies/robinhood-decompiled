package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.ApiSimpleIssue;
import java.util.List;
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
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "", "Lcom/robinhood/models/api/ApiSimpleIssue;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$activeIssuesEndpoint$1", m3645f = "SupportPhoneIssueStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$activeIssuesEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SupportPhoneIssueStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Response<List<? extends ApiSimpleIssue>>>, Object> {
    int label;
    final /* synthetic */ SupportPhoneIssueStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportPhoneIssueStore2(SupportPhoneIssueStore supportPhoneIssueStore, Continuation<? super SupportPhoneIssueStore2> continuation) {
        super(2, continuation);
        this.this$0 = supportPhoneIssueStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportPhoneIssueStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Response<List<? extends ApiSimpleIssue>>> continuation) {
        return invoke2(unit, (Continuation<? super Response<List<ApiSimpleIssue>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super Response<List<ApiSimpleIssue>>> continuation) {
        return ((SupportPhoneIssueStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        SupportIssueStore supportIssueStore = this.this$0.supportIssueStore;
        this.label = 1;
        Object activePhoneIssues = supportIssueStore.getActivePhoneIssues(this);
        return activePhoneIssues == coroutine_suspended ? coroutine_suspended : activePhoneIssues;
    }
}
