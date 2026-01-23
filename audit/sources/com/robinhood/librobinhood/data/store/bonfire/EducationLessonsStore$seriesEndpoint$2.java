package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.shared.models.api.bonfire.education.lesson.ApiEducationSeries;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EducationLessonsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/shared/models/api/bonfire/education/lesson/ApiEducationSeries;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$seriesEndpoint$2", m3645f = "EducationLessonsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class EducationLessonsStore$seriesEndpoint$2 extends ContinuationImpl7 implements Function2<ApiEducationSeries, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EducationLessonsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EducationLessonsStore$seriesEndpoint$2(EducationLessonsStore educationLessonsStore, Continuation<? super EducationLessonsStore$seriesEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = educationLessonsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EducationLessonsStore$seriesEndpoint$2 educationLessonsStore$seriesEndpoint$2 = new EducationLessonsStore$seriesEndpoint$2(this.this$0, continuation);
        educationLessonsStore$seriesEndpoint$2.L$0 = obj;
        return educationLessonsStore$seriesEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiEducationSeries apiEducationSeries, Continuation<? super Unit> continuation) {
        return ((EducationLessonsStore$seriesEndpoint$2) create(apiEducationSeries, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.seriesDao.insert(((ApiEducationSeries) this.L$0).toDbModel(this.this$0.getCompletedLessonIds()));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
