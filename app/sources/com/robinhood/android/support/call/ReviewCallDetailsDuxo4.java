package com.robinhood.android.support.call;

import com.robinhood.android.support.call.ReviewCallDetailsDataState;
import com.robinhood.models.p355ui.IssueDetail;
import com.robinhood.staticcontent.model.p402cx.CxVoiceContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ReviewCallDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo$setIssueDetailAndContent$2", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$setIssueDetailAndContent$2, reason: use source file name */
/* loaded from: classes9.dex */
final class ReviewCallDetailsDuxo4 extends ContinuationImpl7 implements Function2<ReviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState>, Object> {
    final /* synthetic */ CxVoiceContent $content;
    final /* synthetic */ IssueDetail.Phone $issueDetails;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewCallDetailsDuxo4(IssueDetail.Phone phone, CxVoiceContent cxVoiceContent, Continuation<? super ReviewCallDetailsDuxo4> continuation) {
        super(2, continuation);
        this.$issueDetails = phone;
        this.$content = cxVoiceContent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReviewCallDetailsDuxo4 reviewCallDetailsDuxo4 = new ReviewCallDetailsDuxo4(this.$issueDetails, this.$content, continuation);
        reviewCallDetailsDuxo4.L$0 = obj;
        return reviewCallDetailsDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReviewCallDetailsDataState reviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState> continuation) {
        return ((ReviewCallDetailsDuxo4) create(reviewCallDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ReviewCallDetailsDataState.copy$default((ReviewCallDetailsDataState) this.L$0, new ReviewCallDetailsDataState.IssueDetailLoadState.Success(this.$issueDetails, this.$content), null, false, null, null, 30, null);
    }
}
