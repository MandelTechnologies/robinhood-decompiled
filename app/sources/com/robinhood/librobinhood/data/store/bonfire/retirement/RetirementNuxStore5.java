package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRetirementUninvestedViewModel;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementNuxStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$uninvestedEndpoint$1", m3645f = "RetirementNuxStore.kt", m3646l = {65}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$uninvestedEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RetirementNuxStore5 extends ContinuationImpl7 implements Function2<String, Continuation<? super RetirementUninvestedViewModel>, Object> {
    final /* synthetic */ RetirementApi $retirementApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementNuxStore5(RetirementApi retirementApi, Continuation<? super RetirementNuxStore5> continuation) {
        super(2, continuation);
        this.$retirementApi = retirementApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementNuxStore5 retirementNuxStore5 = new RetirementNuxStore5(this.$retirementApi, continuation);
        retirementNuxStore5.L$0 = obj;
        return retirementNuxStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super RetirementUninvestedViewModel> continuation) {
        return ((RetirementNuxStore5) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            RetirementApi retirementApi = this.$retirementApi;
            this.label = 1;
            obj = retirementApi.getRetirementUninvestedViewModel(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return RetirementUninvestedViewModel2.toDbModel((ApiRetirementUninvestedViewModel) obj);
    }
}
