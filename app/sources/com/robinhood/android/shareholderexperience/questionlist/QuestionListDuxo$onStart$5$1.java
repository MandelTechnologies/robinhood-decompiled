package com.robinhood.android.shareholderexperience.questionlist;

import com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: QuestionListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$onStart$5$1", m3645f = "QuestionListDuxo.kt", m3646l = {155}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class QuestionListDuxo$onStart$5$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sayReferenceId;
    int label;
    final /* synthetic */ QuestionListDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuestionListDuxo$onStart$5$1(QuestionListDuxo questionListDuxo, String str, Continuation<? super QuestionListDuxo$onStart$5$1> continuation) {
        super(2, continuation);
        this.this$0 = questionListDuxo;
        this.$sayReferenceId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuestionListDuxo$onStart$5$1(this.this$0, this.$sayReferenceId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((QuestionListDuxo$onStart$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ShareholderExperienceStore shareholderExperienceStore = this.this$0.shareholderExperienceStore;
            String str = this.$sayReferenceId;
            this.label = 1;
            if (shareholderExperienceStore.associateSayReferenceId(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
