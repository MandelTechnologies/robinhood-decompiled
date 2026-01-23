package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.education.EducationApi;
import com.robinhood.shared.models.api.bonfire.education.EducationUserProgressRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EducationUserProgressStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/models/api/bonfire/education/EducationUserProgressRequest;", "params", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$userProgressEndpoint$1", m3645f = "EducationUserProgressStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$userProgressEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class EducationUserProgressStore3 extends ContinuationImpl7 implements Function2<EducationUserProgressParams, Continuation<? super EducationUserProgressRequest>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EducationUserProgressStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EducationUserProgressStore3(EducationUserProgressStore educationUserProgressStore, Continuation<? super EducationUserProgressStore3> continuation) {
        super(2, continuation);
        this.this$0 = educationUserProgressStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EducationUserProgressStore3 educationUserProgressStore3 = new EducationUserProgressStore3(this.this$0, continuation);
        educationUserProgressStore3.L$0 = obj;
        return educationUserProgressStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EducationUserProgressParams educationUserProgressParams, Continuation<? super EducationUserProgressRequest> continuation) {
        return ((EducationUserProgressStore3) create(educationUserProgressParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        EducationUserProgressParams educationUserProgressParams = (EducationUserProgressParams) this.L$0;
        EducationApi educationApi = this.this$0.educationApi;
        String trackingId = educationUserProgressParams.getTrackingId();
        Integer statusType = educationUserProgressParams.getStatusType();
        Integer contentType = educationUserProgressParams.getContentType();
        this.label = 1;
        Object educationUserProgress = educationApi.getEducationUserProgress(trackingId, statusType, contentType, this);
        return educationUserProgress == coroutine_suspended ? coroutine_suspended : educationUserProgress;
    }
}
