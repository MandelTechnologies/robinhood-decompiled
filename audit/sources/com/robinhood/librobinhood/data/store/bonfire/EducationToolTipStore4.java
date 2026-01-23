package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.education.EducationApi;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationToolTipRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EducationToolTipStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationToolTipRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationToolTipStore$postToolTipEndpoint$1", m3645f = "EducationToolTipStore.kt", m3646l = {51}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationToolTipStore$postToolTipEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class EducationToolTipStore4 extends ContinuationImpl7 implements Function2<ApiEducationToolTipRequest, Continuation<? super Unit>, Object> {
    final /* synthetic */ EducationApi $educationApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EducationToolTipStore4(EducationApi educationApi, Continuation<? super EducationToolTipStore4> continuation) {
        super(2, continuation);
        this.$educationApi = educationApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EducationToolTipStore4 educationToolTipStore4 = new EducationToolTipStore4(this.$educationApi, continuation);
        educationToolTipStore4.L$0 = obj;
        return educationToolTipStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiEducationToolTipRequest apiEducationToolTipRequest, Continuation<? super Unit> continuation) {
        return ((EducationToolTipStore4) create(apiEducationToolTipRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiEducationToolTipRequest apiEducationToolTipRequest = (ApiEducationToolTipRequest) this.L$0;
            EducationApi educationApi = this.$educationApi;
            this.label = 1;
            if (educationApi.markToolTipSeen(apiEducationToolTipRequest, this) == coroutine_suspended) {
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
