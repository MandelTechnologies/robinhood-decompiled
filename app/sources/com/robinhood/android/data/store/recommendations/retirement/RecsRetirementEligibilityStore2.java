package com.robinhood.android.data.store.recommendations.retirement;

import com.robinhood.api.retrofit.RecsRetirementApi;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementEligibility;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: RecsRetirementEligibilityStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.data.store.recommendations.retirement.RecsRetirementEligibilityStore$endpoint$1", m3645f = "RecsRetirementEligibilityStore.kt", m3646l = {20}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.data.store.recommendations.retirement.RecsRetirementEligibilityStore$endpoint$1, reason: use source file name */
/* loaded from: classes2.dex */
final class RecsRetirementEligibilityStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecsRetirementEligibilityStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecsRetirementEligibilityStore2(RecsRetirementEligibilityStore recsRetirementEligibilityStore, Continuation<? super RecsRetirementEligibilityStore2> continuation) {
        super(2, continuation);
        this.this$0 = recsRetirementEligibilityStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecsRetirementEligibilityStore2 recsRetirementEligibilityStore2 = new RecsRetirementEligibilityStore2(this.this$0, continuation);
        recsRetirementEligibilityStore2.L$0 = obj;
        return recsRetirementEligibilityStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Boolean> continuation) {
        return ((RecsRetirementEligibilityStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
            obj = recsRetirementApi.getEligibility(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxBoolean(((ApiRecsRetirementEligibility) obj).getEligible());
    }
}
