package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.questionnaire.api.ApiQuestionnaireCompletedResponse;
import com.robinhood.api.questionnaire.QuestionnaireApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentProfileStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\f\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireCompletedResponse;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/librobinhood/data/store/identi/Context;", "Lcom/robinhood/librobinhood/data/store/identi/AccountNumber;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$questionnaireCompletedEndpoint$1", m3645f = "InvestmentProfileStore.kt", m3646l = {91}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$questionnaireCompletedEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InvestmentProfileStore4 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends String>, Continuation<? super ApiQuestionnaireCompletedResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InvestmentProfileStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestmentProfileStore4(InvestmentProfileStore investmentProfileStore, Continuation<? super InvestmentProfileStore4> continuation) {
        super(2, continuation);
        this.this$0 = investmentProfileStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestmentProfileStore4 investmentProfileStore4 = new InvestmentProfileStore4(this.this$0, continuation);
        investmentProfileStore4.L$0 = obj;
        return investmentProfileStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends String> tuples2, Continuation<? super ApiQuestionnaireCompletedResponse> continuation) {
        return invoke2((Tuples2<String, String>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, String> tuples2, Continuation<? super ApiQuestionnaireCompletedResponse> continuation) {
        return ((InvestmentProfileStore4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        QuestionnaireApi questionnaireApi = this.this$0.questionnaireApi;
        this.label = 1;
        Object questionnaireCompleted = questionnaireApi.getQuestionnaireCompleted(str, str2, this);
        return questionnaireCompleted == coroutine_suspended ? coroutine_suspended : questionnaireCompleted;
    }
}
