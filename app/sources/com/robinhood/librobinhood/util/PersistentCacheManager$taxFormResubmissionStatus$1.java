package com.robinhood.librobinhood.util;

import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.api.bonfire.ApiTaxFormResubmissionStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PersistentCacheManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiTaxFormResubmissionStatus;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.util.PersistentCacheManager$taxFormResubmissionStatus$1", m3645f = "PersistentCacheManager.kt", m3646l = {100}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PersistentCacheManager$taxFormResubmissionStatus$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiTaxFormResubmissionStatus>, Object> {
    int label;
    final /* synthetic */ PersistentCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersistentCacheManager$taxFormResubmissionStatus$1(PersistentCacheManager persistentCacheManager, Continuation<? super PersistentCacheManager$taxFormResubmissionStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = persistentCacheManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PersistentCacheManager$taxFormResubmissionStatus$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiTaxFormResubmissionStatus> continuation) {
        return ((PersistentCacheManager$taxFormResubmissionStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        BonfireApi bonfireApi = this.this$0.getBonfireApi();
        this.label = 1;
        Object taxFormResubmissionStatus = bonfireApi.getTaxFormResubmissionStatus(this);
        return taxFormResubmissionStatus == coroutine_suspended ? coroutine_suspended : taxFormResubmissionStatus;
    }
}
