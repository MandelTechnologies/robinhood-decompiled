package com.robinhood.librobinhood.util;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.ResponseBody;

/* compiled from: PersistentCacheManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.util.PersistentCacheManager$transfersDynamicPillAmountResponse$1", m3645f = "PersistentCacheManager.kt", m3646l = {118}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PersistentCacheManager$transfersDynamicPillAmountResponse$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ PersistentCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersistentCacheManager$transfersDynamicPillAmountResponse$1(PersistentCacheManager persistentCacheManager, Continuation<? super PersistentCacheManager$transfersDynamicPillAmountResponse$1> continuation) {
        super(2, continuation);
        this.this$0 = persistentCacheManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PersistentCacheManager$transfersDynamicPillAmountResponse$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((PersistentCacheManager$transfersDynamicPillAmountResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransfersBonfireApi transfersBonfireApi = this.this$0.getTransfersBonfireApi();
            this.label = 1;
            obj = transfersBonfireApi.getDynamicPillAmounts(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ResponseBody) obj).string();
    }
}
