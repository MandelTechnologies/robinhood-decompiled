package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.api.bonfire.transfer.ApiSuggestedAmountsResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: SuggestedAmountsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/api/bonfire/transfer/ApiSuggestedAmountsResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore$endpoint$2", m3645f = "SuggestedAmountsStore.kt", m3646l = {120}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SuggestedAmountsStore3 extends ContinuationImpl7 implements Function2<ApiSuggestedAmountsResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SuggestedAmountsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuggestedAmountsStore3(SuggestedAmountsStore suggestedAmountsStore, Continuation<? super SuggestedAmountsStore3> continuation) {
        super(2, continuation);
        this.this$0 = suggestedAmountsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SuggestedAmountsStore3 suggestedAmountsStore3 = new SuggestedAmountsStore3(this.this$0, continuation);
        suggestedAmountsStore3.L$0 = obj;
        return suggestedAmountsStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiSuggestedAmountsResponse apiSuggestedAmountsResponse, Continuation<? super Unit> continuation) {
        return ((SuggestedAmountsStore3) create(apiSuggestedAmountsResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        ApiSuggestedAmountsResponse apiSuggestedAmountsResponse;
        SuggestedAmountsStore suggestedAmountsStore;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiSuggestedAmountsResponse apiSuggestedAmountsResponse2 = (ApiSuggestedAmountsResponse) this.L$0;
            mutex = this.this$0.mutex;
            SuggestedAmountsStore suggestedAmountsStore2 = this.this$0;
            this.L$0 = apiSuggestedAmountsResponse2;
            this.L$1 = mutex;
            this.L$2 = suggestedAmountsStore2;
            this.label = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiSuggestedAmountsResponse = apiSuggestedAmountsResponse2;
            suggestedAmountsStore = suggestedAmountsStore2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            suggestedAmountsStore = (SuggestedAmountsStore) this.L$2;
            mutex = (Mutex) this.L$1;
            apiSuggestedAmountsResponse = (ApiSuggestedAmountsResponse) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            suggestedAmountsStore.transferBannerChannel.tryEmit(apiSuggestedAmountsResponse);
            suggestedAmountsStore.suggestedAmountsPreference.set(suggestedAmountsStore.getAdapter().toJson(apiSuggestedAmountsResponse));
            suggestedAmountsStore.lastUpdatedAtPreference.set(System.currentTimeMillis());
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
