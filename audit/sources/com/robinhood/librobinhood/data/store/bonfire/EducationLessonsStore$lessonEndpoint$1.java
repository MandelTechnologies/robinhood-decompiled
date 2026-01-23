package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.education.EducationApi;
import com.robinhood.shared.models.api.bonfire.education.lesson.ApiEducationLesson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EducationLessonsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/models/api/bonfire/education/lesson/ApiEducationLesson;", "params", "Lcom/robinhood/librobinhood/data/store/bonfire/LessonParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$lessonEndpoint$1", m3645f = "EducationLessonsStore.kt", m3646l = {81}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class EducationLessonsStore$lessonEndpoint$1 extends ContinuationImpl7 implements Function2<LessonParams, Continuation<? super ApiEducationLesson>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EducationLessonsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EducationLessonsStore$lessonEndpoint$1(EducationLessonsStore educationLessonsStore, Continuation<? super EducationLessonsStore$lessonEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = educationLessonsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EducationLessonsStore$lessonEndpoint$1 educationLessonsStore$lessonEndpoint$1 = new EducationLessonsStore$lessonEndpoint$1(this.this$0, continuation);
        educationLessonsStore$lessonEndpoint$1.L$0 = obj;
        return educationLessonsStore$lessonEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LessonParams lessonParams, Continuation<? super ApiEducationLesson> continuation) {
        return ((EducationLessonsStore$lessonEndpoint$1) create(lessonParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        LessonParams lessonParams = (LessonParams) this.L$0;
        EducationApi educationApi = this.this$0.educationApi;
        String lessonId = lessonParams.getLessonId();
        String source = lessonParams.getSource();
        this.label = 1;
        Object educationLesson = educationApi.getEducationLesson(lessonId, source, this);
        return educationLesson == coroutine_suspended ? coroutine_suspended : educationLesson;
    }
}
