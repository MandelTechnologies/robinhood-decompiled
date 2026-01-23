package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.education.EducationApi;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationEarnability;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EducationLessonsStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationEarnability;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$fetchLessonEarnability$1$1", m3645f = "EducationLessonsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class EducationLessonsStore$fetchLessonEarnability$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiEducationEarnability>, Object> {
    final /* synthetic */ String $lessonId;
    int label;
    final /* synthetic */ EducationLessonsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EducationLessonsStore$fetchLessonEarnability$1$1(EducationLessonsStore educationLessonsStore, String str, Continuation<? super EducationLessonsStore$fetchLessonEarnability$1$1> continuation) {
        super(2, continuation);
        this.this$0 = educationLessonsStore;
        this.$lessonId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EducationLessonsStore$fetchLessonEarnability$1$1(this.this$0, this.$lessonId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiEducationEarnability> continuation) {
        return ((EducationLessonsStore$fetchLessonEarnability$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        EducationApi educationApi = this.this$0.educationApi;
        String str = this.$lessonId;
        this.label = 1;
        Object learnAndEarnEarnability = educationApi.getLearnAndEarnEarnability(null, str, this);
        return learnAndEarnEarnability == coroutine_suspended ? coroutine_suspended : learnAndEarnEarnability;
    }
}
