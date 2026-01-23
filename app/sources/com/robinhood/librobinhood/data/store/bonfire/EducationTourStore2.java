package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.education.EducationApi;
import com.robinhood.shared.models.api.bonfire.education.tour.ApiEducationTourResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EducationTourStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/models/api/bonfire/education/tour/ApiEducationTourResult;", "<destruct>", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationTourStore$endpoint$1", m3645f = "EducationTourStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationTourStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class EducationTourStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends String>, Continuation<? super ApiEducationTourResult>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EducationTourStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EducationTourStore2(EducationTourStore educationTourStore, Continuation<? super EducationTourStore2> continuation) {
        super(2, continuation);
        this.this$0 = educationTourStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EducationTourStore2 educationTourStore2 = new EducationTourStore2(this.this$0, continuation);
        educationTourStore2.L$0 = obj;
        return educationTourStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends String> tuples2, Continuation<? super ApiEducationTourResult> continuation) {
        return invoke2((Tuples2<String, String>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, String> tuples2, Continuation<? super ApiEducationTourResult> continuation) {
        return ((EducationTourStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        String str = (String) tuples2.component1();
        String str2 = (String) tuples2.component2();
        EducationApi educationApi = this.this$0.educationApi;
        this.label = 1;
        Object educationTour = educationApi.getEducationTour(str, str2, this);
        return educationTour == coroutine_suspended ? coroutine_suspended : educationTour;
    }
}
