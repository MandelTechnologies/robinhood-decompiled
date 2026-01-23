package com.robinhood.android.support.call;

import com.robinhood.models.p355ui.identi.UiProfileInfo;
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
@DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo$onPhoneNumberChangedInIdenti$1$1", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$onPhoneNumberChangedInIdenti$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class ReviewCallDetailsDuxo3 extends ContinuationImpl7 implements Function2<ReviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState>, Object> {
    final /* synthetic */ UiProfileInfo $profileInfo;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewCallDetailsDuxo3(UiProfileInfo uiProfileInfo, Continuation<? super ReviewCallDetailsDuxo3> continuation) {
        super(2, continuation);
        this.$profileInfo = uiProfileInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReviewCallDetailsDuxo3 reviewCallDetailsDuxo3 = new ReviewCallDetailsDuxo3(this.$profileInfo, continuation);
        reviewCallDetailsDuxo3.L$0 = obj;
        return reviewCallDetailsDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReviewCallDetailsDataState reviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState> continuation) {
        return ((ReviewCallDetailsDuxo3) create(reviewCallDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ReviewCallDetailsDataState.copy$default((ReviewCallDetailsDataState) this.L$0, null, null, false, this.$profileInfo.getPhoneNumber(), null, 23, null);
    }
}
