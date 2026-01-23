package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.shared.models.api.bonfire.education.EducationUserProgressRequest;
import com.robinhood.shared.models.dao.EducationUserProgressDao;
import com.robinhood.shared.models.p387db.bonfire.education.EducationUserProgress;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EducationUserProgressStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/shared/models/api/bonfire/education/EducationUserProgressRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$userProgressEndpoint$2", m3645f = "EducationUserProgressStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore$userProgressEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class EducationUserProgressStore4 extends ContinuationImpl7 implements Function2<EducationUserProgressRequest, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EducationUserProgressStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EducationUserProgressStore4(EducationUserProgressStore educationUserProgressStore, Continuation<? super EducationUserProgressStore4> continuation) {
        super(2, continuation);
        this.this$0 = educationUserProgressStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EducationUserProgressStore4 educationUserProgressStore4 = new EducationUserProgressStore4(this.this$0, continuation);
        educationUserProgressStore4.L$0 = obj;
        return educationUserProgressStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EducationUserProgressRequest educationUserProgressRequest, Continuation<? super Unit> continuation) {
        return ((EducationUserProgressStore4) create(educationUserProgressRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<EducationUserProgress> user_progress = ((EducationUserProgressRequest) this.L$0).getUser_progress();
        EducationUserProgressDao educationUserProgressDao = this.this$0.userProgressDao;
        Iterator<T> it = user_progress.iterator();
        while (it.hasNext()) {
            educationUserProgressDao.insert((EducationUserProgress) it.next());
        }
        return Unit.INSTANCE;
    }
}
