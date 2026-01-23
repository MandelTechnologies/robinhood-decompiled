package com.robinhood.ccpa;

import com.robinhood.api.retrofit.Identi;
import com.robinhood.models.api.identi.ApiOptOutConsentStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.HttpException;

/* compiled from: CcpaStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/identi/ApiOptOutConsentStatus;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.ccpa.CcpaStore$endpoint$1", m3645f = "CcpaStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.ccpa.CcpaStore$endpoint$1, reason: use source file name */
/* loaded from: classes3.dex */
final class CcpaStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiOptOutConsentStatus>, Object> {
    int label;
    final /* synthetic */ CcpaStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CcpaStore2(CcpaStore ccpaStore, Continuation<? super CcpaStore2> continuation) {
        super(2, continuation);
        this.this$0 = ccpaStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CcpaStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiOptOutConsentStatus> continuation) {
        return ((CcpaStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Identi identi2 = this.this$0.identi;
                this.label = 1;
                obj = identi2.getCcpaMarketingOptOutStatus(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (ApiOptOutConsentStatus) obj;
        } catch (HttpException e) {
            if (e.code() == 404) {
                return CcpaStore.STUBBED_CCPA_OPT_OUT_STATUS;
            }
            throw e;
        }
    }
}
