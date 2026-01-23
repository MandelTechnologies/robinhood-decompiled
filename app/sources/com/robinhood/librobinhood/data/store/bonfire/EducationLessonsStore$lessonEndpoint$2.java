package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.shared.models.api.bonfire.education.lesson.ApiEducationLesson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: EducationLessonsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "params", "Lcom/robinhood/librobinhood/data/store/bonfire/LessonParams;", "result", "Lcom/robinhood/shared/models/api/bonfire/education/lesson/ApiEducationLesson;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$lessonEndpoint$2", m3645f = "EducationLessonsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class EducationLessonsStore$lessonEndpoint$2 extends ContinuationImpl7 implements Function3<LessonParams, ApiEducationLesson, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EducationLessonsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EducationLessonsStore$lessonEndpoint$2(EducationLessonsStore educationLessonsStore, Continuation<? super EducationLessonsStore$lessonEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = educationLessonsStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(LessonParams lessonParams, ApiEducationLesson apiEducationLesson, Continuation<? super Unit> continuation) {
        EducationLessonsStore$lessonEndpoint$2 educationLessonsStore$lessonEndpoint$2 = new EducationLessonsStore$lessonEndpoint$2(this.this$0, continuation);
        educationLessonsStore$lessonEndpoint$2.L$0 = lessonParams;
        educationLessonsStore$lessonEndpoint$2.L$1 = apiEducationLesson;
        return educationLessonsStore$lessonEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            LessonParams lessonParams = (LessonParams) this.L$0;
            this.this$0.lessonDao.insert(((ApiEducationLesson) this.L$1).toDbModel(lessonParams.getSource()));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
