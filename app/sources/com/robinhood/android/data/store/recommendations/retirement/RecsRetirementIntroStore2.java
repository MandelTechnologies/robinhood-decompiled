package com.robinhood.android.data.store.recommendations.retirement;

import com.robinhood.api.retrofit.RecsRetirementApi;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementIntro;
import com.robinhood.recommendations.retirement.models.p364ui.UiRecsRetirementIntro;
import com.robinhood.recommendations.retirement.models.p364ui.UiRecsRetirementIntro2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecsRetirementIntroStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/retirement/models/ui/UiRecsRetirementIntro;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.data.store.recommendations.retirement.RecsRetirementIntroStore$endpoint$1", m3645f = "RecsRetirementIntroStore.kt", m3646l = {21}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.data.store.recommendations.retirement.RecsRetirementIntroStore$endpoint$1, reason: use source file name */
/* loaded from: classes2.dex */
final class RecsRetirementIntroStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super UiRecsRetirementIntro>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecsRetirementIntroStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecsRetirementIntroStore2(RecsRetirementIntroStore recsRetirementIntroStore, Continuation<? super RecsRetirementIntroStore2> continuation) {
        super(2, continuation);
        this.this$0 = recsRetirementIntroStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecsRetirementIntroStore2 recsRetirementIntroStore2 = new RecsRetirementIntroStore2(this.this$0, continuation);
        recsRetirementIntroStore2.L$0 = obj;
        return recsRetirementIntroStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super UiRecsRetirementIntro> continuation) {
        return ((RecsRetirementIntroStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            RecsRetirementApi recsRetirementApi = this.this$0.recsRetirementApi;
            this.label = 1;
            obj = recsRetirementApi.getIntro(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return UiRecsRetirementIntro2.toUiModel((ApiRecsRetirementIntro) obj);
    }
}
