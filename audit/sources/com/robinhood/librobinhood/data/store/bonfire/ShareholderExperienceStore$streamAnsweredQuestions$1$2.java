package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.shareholderx.models.p401db.ShareholderQuestionsResponse;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: ShareholderExperienceStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestionsResponse$Answered;", "existing", "latest"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore$streamAnsweredQuestions$1$2", m3645f = "ShareholderExperienceStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ShareholderExperienceStore$streamAnsweredQuestions$1$2 extends ContinuationImpl7 implements Function3<ShareholderQuestionsResponse.Answered, ShareholderQuestionsResponse.Answered, Continuation<? super ShareholderQuestionsResponse.Answered>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    ShareholderExperienceStore$streamAnsweredQuestions$1$2(Continuation<? super ShareholderExperienceStore$streamAnsweredQuestions$1$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(ShareholderQuestionsResponse.Answered answered, ShareholderQuestionsResponse.Answered answered2, Continuation<? super ShareholderQuestionsResponse.Answered> continuation) {
        ShareholderExperienceStore$streamAnsweredQuestions$1$2 shareholderExperienceStore$streamAnsweredQuestions$1$2 = new ShareholderExperienceStore$streamAnsweredQuestions$1$2(continuation);
        shareholderExperienceStore$streamAnsweredQuestions$1$2.L$0 = answered;
        shareholderExperienceStore$streamAnsweredQuestions$1$2.L$1 = answered2;
        return shareholderExperienceStore$streamAnsweredQuestions$1$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ShareholderQuestionsResponse.Answered answered = (ShareholderQuestionsResponse.Answered) this.L$0;
        ShareholderQuestionsResponse.Answered answered2 = (ShareholderQuestionsResponse.Answered) this.L$1;
        return ShareholderQuestionsResponse.Answered.copy$default(answered2, null, CollectionsKt.plus((Collection) answered.getQuestions(), (Iterable) answered2.getQuestions()), null, null, 13, null);
    }
}
