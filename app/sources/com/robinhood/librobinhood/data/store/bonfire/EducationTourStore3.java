package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.shared.models.api.bonfire.education.tour.ApiEducationTourResult;
import com.robinhood.shared.models.dao.EducationTourDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: EducationTourStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "Lkotlin/Pair;", "", "result", "Lcom/robinhood/shared/models/api/bonfire/education/tour/ApiEducationTourResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationTourStore$endpoint$2", m3645f = "EducationTourStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationTourStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class EducationTourStore3 extends ContinuationImpl7 implements Function3<Tuples2<? extends String, ? extends String>, ApiEducationTourResult, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EducationTourStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EducationTourStore3(EducationTourStore educationTourStore, Continuation<? super EducationTourStore3> continuation) {
        super(3, continuation);
        this.this$0 = educationTourStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends String> tuples2, ApiEducationTourResult apiEducationTourResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<String, String>) tuples2, apiEducationTourResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, String> tuples2, ApiEducationTourResult apiEducationTourResult, Continuation<? super Unit> continuation) {
        EducationTourStore3 educationTourStore3 = new EducationTourStore3(this.this$0, continuation);
        educationTourStore3.L$0 = tuples2;
        educationTourStore3.L$1 = apiEducationTourResult;
        return educationTourStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            ApiEducationTourResult apiEducationTourResult = (ApiEducationTourResult) this.L$1;
            EducationTourDao educationTourDao = this.this$0.dao;
            String str = (String) tuples2.getFirst();
            String str2 = (String) tuples2.getSecond();
            if (str2 == null) {
                str2 = "";
            }
            educationTourDao.insert(str, str2, apiEducationTourResult);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
