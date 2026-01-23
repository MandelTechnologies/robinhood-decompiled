package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverResponse;
import com.robinhood.android.models.retirement.p194db.Retirement401kRolloverViewModel;
import com.robinhood.android.models.retirement.p194db.Retirement401kRolloverViewModel2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: Retirement401kRolloverStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel;", "hidePromo", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore$retirement401kRolloverEndpoint$1", m3645f = "Retirement401kRolloverStore.kt", m3646l = {52}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class Retirement401kRolloverStore$retirement401kRolloverEndpoint$1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Retirement401kRolloverViewModel>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ Retirement401kRolloverStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Retirement401kRolloverStore$retirement401kRolloverEndpoint$1(Retirement401kRolloverStore retirement401kRolloverStore, Continuation<? super Retirement401kRolloverStore$retirement401kRolloverEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = retirement401kRolloverStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Retirement401kRolloverStore$retirement401kRolloverEndpoint$1 retirement401kRolloverStore$retirement401kRolloverEndpoint$1 = new Retirement401kRolloverStore$retirement401kRolloverEndpoint$1(this.this$0, continuation);
        retirement401kRolloverStore$retirement401kRolloverEndpoint$1.Z$0 = ((Boolean) obj).booleanValue();
        return retirement401kRolloverStore$retirement401kRolloverEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Retirement401kRolloverViewModel> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    public final Object invoke(boolean z, Continuation<? super Retirement401kRolloverViewModel> continuation) {
        return ((Retirement401kRolloverStore$retirement401kRolloverEndpoint$1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z = this.Z$0;
            RetirementApi retirementApi = this.this$0.retirementApi;
            this.label = 1;
            obj = retirementApi.get401kRolloverInfo(z, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Retirement401kRolloverViewModel2.toDbModel((ApiRetirement401kRolloverResponse) obj);
    }
}
